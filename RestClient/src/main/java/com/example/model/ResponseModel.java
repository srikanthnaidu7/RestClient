package com.example.model;

public class ResponseModel {

	private VendorDetails vendorDetails;
	private MacAddressDetails macAddressDetails;
	private BlockDetails blockDetails;

	public MacAddressDetails getMacAddressDetails() {
		return macAddressDetails;
	}

	public void setMacAddressDetails(MacAddressDetails macAddressDetails) {
		this.macAddressDetails = macAddressDetails;
	}

	public BlockDetails getBlockDetails() {
		return blockDetails;
	}

	public void setBlockDetails(BlockDetails blockDetails) {
		this.blockDetails = blockDetails;
	}

	public VendorDetails getVendorDetails() {
		return vendorDetails;
	}

	public void setVendorDetails(VendorDetails vendorDetails) {
		this.vendorDetails = vendorDetails;
	}

	@Override
	public String toString() {
		return "ResponseModel [vendorDetails=" + vendorDetails + ", macAddressDetails=" + macAddressDetails
				+ ", blockDetails=" + blockDetails + "]";
	}
	
}
