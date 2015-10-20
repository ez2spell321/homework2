/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.data;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

public class Data implements Serializable {
    private double investmentAmount;
    private double yearlyInterestRate;
    private double numberOfYears;
    
  public Data() {

  }
  
  public Data(double investmentAmount, double yearlyInterestRate, double numberOfYears) {
    this.investmentAmount = investmentAmount;
    this.yearlyInterestRate = yearlyInterestRate;
    this.numberOfYears = numberOfYears;
  }

  public String getInvestmentAmount() {
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
    return currencyFormat.format(investmentAmount);
  }

  public double getNumberOfYears() {
    return numberOfYears;
  }

  public double getYearlyInterestRate() {
    return yearlyInterestRate;
  }

  public void setInvestmentAmount(double investmentAmount) {
    this.investmentAmount = investmentAmount;
  }

  public void setNumberOfYears(double numberOfYears) {
    this.numberOfYears = numberOfYears;
  }

  public void setYearlyInterestRate(double yearlyInterestRate) {
    this.yearlyInterestRate = yearlyInterestRate;
  }
  
  public String getFutureValue() {
    double futureValue = investmentAmount * Math.pow((1 + yearlyInterestRate/100), numberOfYears);
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
    return currencyFormat.format(futureValue);    
  }
  


}
