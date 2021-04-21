package com.leave.leave.service;

import org.springframework.stereotype.Service;

import com.leave.leave.model.ApprovalInfo;
@Service
public interface ApproverService {
	public ApprovalInfo save(ApprovalInfo approver);
}
