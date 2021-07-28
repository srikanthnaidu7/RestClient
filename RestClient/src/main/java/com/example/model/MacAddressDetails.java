package com.example.model;

public class MacAddressDetails {
	
	private String virtualMachine;
	private String searchTerm;
	private String administrationType;
	private String transmissionType;
	private String wiresharkNotes;
	private String isValid;
	private String comment;
	private String[] applications;
	
	

	public String[] getApplications() {
		return applications;
	}

	public void setApplications(String[] applications) {
		this.applications = applications;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public String getWiresharkNotes() {
		return wiresharkNotes;
	}

	public void setWiresharkNotes(String wiresharkNotes) {
		this.wiresharkNotes = wiresharkNotes;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	public String getAdministrationType() {
		return administrationType;
	}

	public void setAdministrationType(String administrationType) {
		this.administrationType = administrationType;
	}


	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	String getVirtualMachine() {
		return virtualMachine;
	}

	public void setVirtualMachine(String virtualMachine) {
		this.virtualMachine = virtualMachine;
	}
	
	
	
	
	
	
	

}
