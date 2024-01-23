

Feature: login to HRMOrange website





  Scenario Outline: login to HRMOrange website with credential
    Given logged to HRMOrange Website
    Then enter username "<userName>" and password "<password>" and submit
    
    Examples:
    |userName|password|
    |admin|admin123|
    |Admin|admin123|
    
