package com.leave.leave.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ApprovalInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long requestId;
	private String employeeName;
	private Long sapId;
	private String designation;
	private Date startDate;
	private Date endDate;
	private String leaveType;
	private String reason;
	@OneToOne(fetch=FetchType.LAZY,optional= false)
	@JoinColumn(name="id",nullable=false)
	private User user;
	public ApprovalInfo() {
		super();
	}
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Long getSapId() {
		return sapId;
	}
	public void setSapId(Long sapId) {
		this.sapId = sapId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ApprovalInfo(Long requestId, String employeeName, Long sapId, String designation, Date startDate,
			Date endDate, String leaveType, String reason, User user) {
		super();
		this.requestId = requestId;
		this.employeeName = employeeName;
		this.sapId = sapId;
		this.designation = designation;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveType = leaveType;
		this.reason = reason;
		this.user = user;
	}
	

}
