package com.leave.leave.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leave.leave.model.ApprovalInfo;

@Repository
public interface ApprovalRepository extends JpaRepository<ApprovalInfo, Long>{
	public Optional<ApprovalInfo> findByEmployeeName(String employeeName);
}
