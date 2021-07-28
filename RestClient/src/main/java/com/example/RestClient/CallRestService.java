package com.example.RestClient;

import java.util.Map;
import java.util.Scanner;

import org.json.JSONObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.model.JsonUtil;
import com.example.model.MacAddressDetails;
import com.example.model.ResponseModel;
import com.example.model.VendorDetails;

@Component
public class CallRestService implements CommandLineRunner {

	private static void callRestService() {
		System.out.println("callRestService() method:::");
		System.out.println("Enter the MAC address: ex:44:38:39:ff:ef:57 ");
	
		Scanner sc = new Scanner(System.in); 
		String macAddress = sc.nextLine();
		//macAddress-44:38:39:ff:ef:57
		if(null != macAddress && !macAddress.isEmpty()){
			String apiKey = "at_OP5uu7QjjwtAPz4wt1QwBHpcRqGO0";
			RestTemplate restTemplate = new RestTemplate();
			try {
				ResponseEntity<Object> response = restTemplate.getForEntity("https://api.macaddress.io/v1?apiKey="+apiKey+"&output=json&search="+macAddress 
						, Object.class);

				//System.out.println("Response:"+response.getBody().toString());

				
				JSONObject objJsonObject = new JSONObject((Map)response.getBody());
				//System.out.println("objJsonObject:"+objJsonObject);
				JSONObject vendorDetails = new JSONObject(objJsonObject.get("vendorDetails").toString());
				System.out.println("Given MAC Address::"+macAddress+" Company Name :"+vendorDetails.get("companyName"));

				ResponseModel responseModel = JsonUtil.convertJsonToJava(objJsonObject.toString(), ResponseModel.class);
				//System.out.println("ResponseModel:::"+responseModel.getVendorDetails().getCompanyName());
				
				
			}catch(Exception e) {
				System.out.println("Invalid MAC or OUI address was received.");
			}
		}else {
				System.out.println("Invalid MAC or OUI address was received.ex:44:38:39:ff:ef:57");
			}
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		callRestService();
	}

}
