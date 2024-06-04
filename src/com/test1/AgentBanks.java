package com.test1;

public class AgentBanks {
	private Integer agentId;
	private String vendor;
	private String agentBankCountry;
	private String agentBank;
	private String emailAddress;
	private Integer locale;
	private String countryCode;
	private String targetBalance;
	private String fundedBy;
	private String entityState;

	public AgentBanks() {

	}

	public AgentBanks(Integer agentId, String vendor, String agentBankCountry, String agentBank, String emailAddress,
			Integer locale, String countryCode, String targetBalance, String fundedBy, String entityState) {
		super();
		this.agentId = agentId;
		this.vendor = vendor;
		this.agentBankCountry = agentBankCountry;
		this.agentBank = agentBank;
		this.emailAddress = emailAddress;
		this.locale = locale;
		this.countryCode = countryCode;
		this.targetBalance = targetBalance;
		this.fundedBy = fundedBy;
		this.entityState = entityState;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getAgentBankCountry() {
		return agentBankCountry;
	}

	public void setAgentBankCountry(String agentBankCountry) {
		this.agentBankCountry = agentBankCountry;
	}

	public String getAgentBank() {
		return agentBank;
	}

	public void setAgentBank(String agentBank) {
		this.agentBank = agentBank;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Integer getLocale() {
		return locale;
	}

	public void setLocale(Integer locale) {
		this.locale = locale;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getTargetBalance() {
		return targetBalance;
	}

	public void setTargetBalance(String targetBalance) {
		this.targetBalance = targetBalance;
	}

	public String getFundedBy() {
		return fundedBy;
	}

	public void setFundedBy(String fundedBy) {
		this.fundedBy = fundedBy;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}