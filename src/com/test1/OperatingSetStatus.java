package com.test1;

public class OperatingSetStatus {
	private Integer setidId;
	private String setidOwner;
	private boolean activeAccount;
	private Integer setidTypeId;
	private String setidType;
	private String setidStatus;
	private Integer setidDescription;
	private Integer customerClass;
	private String effectiveDate;
	private Integer operatingUnitSetid;
	private String customerClassDescription;
	private String status;
	private String remarks;

	private OperatingSetStatus() {

	}

	public OperatingSetStatus(Integer setidId, String setidOwner, boolean activeAccount, Integer setidTypeId,
			String setidType, String setidStatus, Integer setidDescription, Integer customerClass, String effectiveDate,
			Integer operatingUnitSetid, String customerClassDescription, String status, String remarks) {
		super();
		this.setidId = setidId;
		this.setidOwner = setidOwner;
		this.activeAccount = activeAccount;
		this.setidTypeId = setidTypeId;
		this.setidType = setidType;
		this.setidStatus = setidStatus;
		this.setidDescription = setidDescription;
		this.customerClass = customerClass;
		this.effectiveDate = effectiveDate;
		this.operatingUnitSetid = operatingUnitSetid;
		this.customerClassDescription = customerClassDescription;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getSetidId() {
		return setidId;
	}

	public void setSetidId(Integer setidId) {
		this.setidId = setidId;
	}

	public String getSetidOwner() {
		return setidOwner;
	}

	public void setSetidOwner(String setidOwner) {
		this.setidOwner = setidOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getSetidTypeId() {
		return setidTypeId;
	}

	public void setSetidTypeId(Integer setidTypeId) {
		this.setidTypeId = setidTypeId;
	}

	public String getSetidType() {
		return setidType;
	}

	public void setSetidType(String setidType) {
		this.setidType = setidType;
	}

	public String getSetidStatus() {
		return setidStatus;
	}

	public void setSetidStatus(String setidStatus) {
		this.setidStatus = setidStatus;
	}

	public Integer getSetidDescription() {
		return setidDescription;
	}

	public void setSetidDescription(Integer setidDescription) {
		this.setidDescription = setidDescription;
	}

	public Integer getCustomerClass() {
		return customerClass;
	}

	public void setCustomerClass(Integer customerClass) {
		this.customerClass = customerClass;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Integer getOperatingUnitSetid() {
		return operatingUnitSetid;
	}

	public void setOperatingUnitSetid(Integer operatingUnitSetid) {
		this.operatingUnitSetid = operatingUnitSetid;
	}

	public String getCustomerClassDescription() {
		return customerClassDescription;
	}

	public void setCustomerClassDescription(String customerClassDescription) {
		this.customerClassDescription = customerClassDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
