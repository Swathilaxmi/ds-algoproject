  Feature: register
  
Scenario Outline: The User Launch Chrome browser
When User opens URL "https://dsportalapp.herokuapp.com/"
And Click on Get Started
#Then Page Title should be "NumpyNinja"
When User click on Register link
#Then Page Title should be "Registration"
When User enters Username as "<username>" ,Password as "<password>" and Password confirmation as "<password confirmation>"
When The user clicks on Register button
#Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"     
      
Examples:
|username|password|password confirmation|
|warriors|test@1234|test@1234|  
      


  