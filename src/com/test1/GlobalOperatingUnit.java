package com.test1;

public class GlobalOperatingUnit {
	private Integer operatingUnit;
	private Integer operatingUnitDescription;
	private String opunitShortDescription;
	private String budgetaryOnly;
	private String nature;
	private String pgcDescription;
	private boolean fileIdentifierPosition;
	private String fileIdentifierLength;
	private String branchIdentifierPosition;
	private String branchIdentifierLength;
	private String fileNationalIdLength;
	private String setidNumberPosition;
	private String setidNumberLength;
	private String fieTotalLength;
	private String pgcEffectiveDate;
	private String pgcStatus;
	private String psglStatus;
	private String entityState;
	private String remarks;

	public GlobalOperatingUnit() {

	}

	public GlobalOperatingUnit(Integer operatingUnit, Integer operatingUnitDescription, String opunitShortDescription,
			String budgetaryOnly, String nature, String pgcDescription, boolean fileIdentifierPosition,
			String fileIdentifierLength, String branchIdentifierPosition, String branchIdentifierLength,
			String fileNationalIdLength, String setidNumberPosition, String setidNumberLength, String fieTotalLength,
			String pgcEffectiveDate, String pgcStatus, String psglStatus, String entityState, String remarks) {
		super();
		this.operatingUnit = operatingUnit;
		this.operatingUnitDescription = operatingUnitDescription;
		this.opunitShortDescription = opunitShortDescription;
		this.budgetaryOnly = budgetaryOnly;
		this.nature = nature;
		this.pgcDescription = pgcDescription;
		this.fileIdentifierPosition = fileIdentifierPosition;
		this.fileIdentifierLength = fileIdentifierLength;
		this.branchIdentifierPosition = branchIdentifierPosition;
		this.branchIdentifierLength = branchIdentifierLength;
		this.fileNationalIdLength = fileNationalIdLength;
		this.setidNumberPosition = setidNumberPosition;
		this.setidNumberLength = setidNumberLength;
		this.fieTotalLength = fieTotalLength;
		this.pgcEffectiveDate = pgcEffectiveDate;
		this.pgcStatus = pgcStatus;
		this.psglStatus = psglStatus;
		this.entityState = entityState;
		this.remarks = remarks;
	}

	public Integer getOperatingUnit() {
		return operatingUnit;
	}

	public void setOperatingUnit(Integer operatingUnit) {
		this.operatingUnit = operatingUnit;
	}

	public Integer getOperatingUnitDescription() {
		return operatingUnitDescription;
	}

	public void setOperatingUnitDescription(Integer operatingUnitDescription) {
		this.operatingUnitDescription = operatingUnitDescription;
	}

	public String getOpunitShortDescription() {
		return opunitShortDescription;
	}

	public void setOpunitShortDescription(String opunitShortDescription) {
		this.opunitShortDescription = opunitShortDescription;
	}

	public String getBudgetaryOnly() {
		return budgetaryOnly;
	}

	public void setBudgetaryOnly(String budgetaryOnly) {
		this.budgetaryOnly = budgetaryOnly;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getPgcDescription() {
		return pgcDescription;
	}

	public void setPgcDescription(String pgcDescription) {
		this.pgcDescription = pgcDescription;
	}

	public boolean isFileIdentifierPosition() {
		return fileIdentifierPosition;
	}

	public void setFileIdentifierPosition(boolean fileIdentifierPosition) {
		this.fileIdentifierPosition = fileIdentifierPosition;
	}

	public String getFileIdentifierLength() {
		return fileIdentifierLength;
	}

	public void setFileIdentifierLength(String fileIdentifierLength) {
		this.fileIdentifierLength = fileIdentifierLength;
	}

	public String getBranchIdentifierPosition() {
		return branchIdentifierPosition;
	}

	public void setBranchIdentifierPosition(String branchIdentifierPosition) {
		this.branchIdentifierPosition = branchIdentifierPosition;
	}

	public String getBranchIdentifierLength() {
		return branchIdentifierLength;
	}

	public void setBranchIdentifierLength(String branchIdentifierLength) {
		this.branchIdentifierLength = branchIdentifierLength;
	}

	public String getFileNationalIdLength() {
		return fileNationalIdLength;
	}

	public void setFileNationalIdLength(String fileNationalIdLength) {
		this.fileNationalIdLength = fileNationalIdLength;
	}

	public String getSetidNumberPosition() {
		return setidNumberPosition;
	}

	public void setSetidNumberPosition(String setidNumberPosition) {
		this.setidNumberPosition = setidNumberPosition;
	}

	public String getSetidNumberLength() {
		return setidNumberLength;
	}

	public void setSetidNumberLength(String setidNumberLength) {
		this.setidNumberLength = setidNumberLength;
	}

	public String getFieTotalLength() {
		return fieTotalLength;
	}

	public void setFieTotalLength(String fieTotalLength) {
		this.fieTotalLength = fieTotalLength;
	}

	public String getPgcEffectiveDate() {
		return pgcEffectiveDate;
	}

	public void setPgcEffectiveDate(String pgcEffectiveDate) {
		this.pgcEffectiveDate = pgcEffectiveDate;
	}

	public String getPgcStatus() {
		return pgcStatus;
	}

	public void setPgcStatus(String pgcStatus) {
		this.pgcStatus = pgcStatus;
	}

	public String getPsglStatus() {
		return psglStatus;
	}

	public void setPsglStatus(String psglStatus) {
		this.psglStatus = psglStatus;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
