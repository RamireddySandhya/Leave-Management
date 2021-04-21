package com.leave.leave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.leave.leave.model.ApprovalInfo;
import com.leave.leave.repositary.ApprovalRepository;


@Service
public class ApproveServiceImpl implements ApproverService{
	
	@Autowired
	private ApprovalRepository repository;
	@Autowired
	private RestTemplate restTemplate;
	@Override
	public ApprovalInfo save(ApprovalInfo approver) {
		ResponseEntity<ApprovalInfo> entity = restTemplate.getForEntity("http://localhost:5050/applyleave",
				ApprovalInfo.class);
		if (entity.getStatusCode() == HttpStatus.OK) 
			
			return repository.save(approver);
		return null;
		

		
	}
		
	

}
