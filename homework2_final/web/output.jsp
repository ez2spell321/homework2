<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/includes/header.html" %>

<h1>Future Value Calculator</h1>

<label>Investment Amount: </label> 
<span>${data.investmentAmount}</span> <br>
<label>Yearly Interest Rate: </label> 
<span>${data.yearlyInterestRate}</span> <br>
<label>Number Of Years: </label>
<span>${data.numberOfYears}</span> <br>
<label>Future Value: </label>
<span>${data.futureValue}</span> <br>

<%@ include file="/includes/footer.html" %>

