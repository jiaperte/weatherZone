package com.weatherZone.bean;

public class ResultBean {

	private boolean successState = false;
	private String errMsg = "";
	private Object resObj = null;
	private int rowsTotal;
	private int pagesTotal;
	
	public boolean isSuccessState() {
		return successState;
	}
	public void setSuccessState(boolean successState) {
		this.successState = successState;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public Object getResObj() {
		return resObj;
	}
	public void setResObj(Object resObj) {
		this.resObj = resObj;
	}
	public int getRowsTotal() {
		return rowsTotal;
	}
	public void setRowsTotal(int rowsTotal) {
		this.rowsTotal = rowsTotal;
	}
	public int getPagesTotal() {
		return pagesTotal;
	}
	public void setPagesTotal(int pagesTotal) {
		this.pagesTotal = pagesTotal;
	}

}
