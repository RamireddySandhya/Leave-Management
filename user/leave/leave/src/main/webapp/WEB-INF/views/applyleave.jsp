<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align="center" cellspacing="20px" cellpadding="5px">
			<form:form action="/leavetype" modelAttribute="approval" method="post">
				
				
					<td><form:label path="employeeName" class="field">Employee Name<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input path="employeeName" class="value"
							placeholder="Enter employee name" id="employeeName" required="required" />
					</td>
				</tr>
				<tr>
					<td><form:label path="sapId" class="field">SAP Id<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input path="sapId" class="value"
							placeholder="Enter SAP Id" id="sapId" required="required" />
					</td>
				</tr>
				<tr>
					<td><form:label path="designation" class="field">Designation<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input path="designation" class="value"
							placeholder="Enter Designation" id="designation" required="required" />
					</td>
				</tr>
				
				<tr>
					<td><form:label path="startDate" class="field">Start Date<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input type="date" class="value" path="startDate"
							id="db" required="required" /></td>
				</tr>
				<tr>
					<td><form:label path="endDate" class="field">End Date<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input type="date" class="value" path="endDate"
							id="db" required="required" /></td>
				</tr>
				<tr>
					<td><form:label path="leaveType" class="field">LeaveType<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input path="leaveType" class="value"
							placeholder="Enter leave Type"  required="required" id="leaveType"/>
					</td>
				</tr>
				<tr>
					<td><form:label path="reason" class="field">Reason<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input path="reason" class="value"
							placeholder="Enter Reason" id="reason" required="required" />
					</td>
				</tr>
				
				
				
				
				
				<tr>
					<td><input type="submit" value="Apply" class="btn btn-success"
						name="submit" ></td>
				</tr>
			</form:form>
		</table>

</body>
</html>