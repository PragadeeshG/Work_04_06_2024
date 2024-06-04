package com.test1;

public class GMDerivatives {
	private String gmDerivativeProductCode;
	private String gmDerivativeProductCodeDescription;
	private String gmProductCode;
	private String gmProductCodeDescription;
	private String gmTradeProductCode;
	private String gmTradeProductCodeDescription;
	private String gmUnderlyingAssetCode;
	private String gmUnderlyingAssetCodeDescription;
	private String balanceTypeCode;
	private String balanceTypeCodeDescription;
	private String entityState;

	public GMDerivatives() {

	}

	public GMDerivatives(String gmDerivativeProductCode, String gmDerivativeProductCodeDescription,
			String gmProductCode, String gmProductCodeDescription, String gmTradeProductCode,
			String gmTradeProductCodeDescription, String gmUnderlyingAssetCode, String gmUnderlyingAssetCodeDescription,
			String balanceTypeCode, String balanceTypeCodeDescription, String entityState) {
		super();
		this.gmDerivativeProductCode = gmDerivativeProductCode;
		this.gmDerivativeProductCodeDescription = gmDerivativeProductCodeDescription;
		this.gmProductCode = gmProductCode;
		this.gmProductCodeDescription = gmProductCodeDescription;
		this.gmTradeProductCode = gmTradeProductCode;
		this.gmTradeProductCodeDescription = gmTradeProductCodeDescription;
		this.gmUnderlyingAssetCode = gmUnderlyingAssetCode;
		this.gmUnderlyingAssetCodeDescription = gmUnderlyingAssetCodeDescription;
		this.balanceTypeCode = balanceTypeCode;
		this.balanceTypeCodeDescription = balanceTypeCodeDescription;
		this.entityState = entityState;
	}

	public String getGmDerivativeProductCode() {
		return gmDerivativeProductCode;
	}

	public void setGmDerivativeProductCode(String gmDerivativeProductCode) {
		this.gmDerivativeProductCode = gmDerivativeProductCode;
	}

	public String getGmDerivativeProductCodeDescription() {
		return gmDerivativeProductCodeDescription;
	}

	public void setGmDerivativeProductCodeDescription(String gmDerivativeProductCodeDescription) {
		this.gmDerivativeProductCodeDescription = gmDerivativeProductCodeDescription;
	}

	public String getGmProductCode() {
		return gmProductCode;
	}

	public void setGmProductCode(String gmProductCode) {
		this.gmProductCode = gmProductCode;
	}

	public String getGmProductCodeDescription() {
		return gmProductCodeDescription;
	}

	public void setGmProductCodeDescription(String gmProductCodeDescription) {
		this.gmProductCodeDescription = gmProductCodeDescription;
	}

	public String getGmTradeProductCode() {
		return gmTradeProductCode;
	}

	public void setGmTradeProductCode(String gmTradeProductCode) {
		this.gmTradeProductCode = gmTradeProductCode;
	}

	public String getGmTradeProductCodeDescription() {
		return gmTradeProductCodeDescription;
	}

	public void setGmTradeProductCodeDescription(String gmTradeProductCodeDescription) {
		this.gmTradeProductCodeDescription = gmTradeProductCodeDescription;
	}

	public String getGmUnderlyingAssetCode() {
		return gmUnderlyingAssetCode;
	}

	public void setGmUnderlyingAssetCode(String gmUnderlyingAssetCode) {
		this.gmUnderlyingAssetCode = gmUnderlyingAssetCode;
	}

	public String getGmUnderlyingAssetCodeDescription() {
		return gmUnderlyingAssetCodeDescription;
	}

	public void setGmUnderlyingAssetCodeDescription(String gmUnderlyingAssetCodeDescription) {
		this.gmUnderlyingAssetCodeDescription = gmUnderlyingAssetCodeDescription;
	}

	public String getBalanceTypeCode() {
		return balanceTypeCode;
	}

	public void setBalanceTypeCode(String balanceTypeCode) {
		this.balanceTypeCode = balanceTypeCode;
	}

	public String getBalanceTypeCodeDescription() {
		return balanceTypeCodeDescription;
	}

	public void setBalanceTypeCodeDescription(String balanceTypeCodeDescription) {
		this.balanceTypeCodeDescription = balanceTypeCodeDescription;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
