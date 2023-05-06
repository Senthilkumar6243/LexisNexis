Feature: Check Lexis Nexis Risk Solution Shows the WebElements are Enabled or Not

Scenario: Check the  Home Page Webelements Are Enabled Or Not
Given User Launch the Browser
When User Enter the Url 
And User Accept All Cookies and close the Popup
And User checks the FinancialServices Webelement is Enabled or Not
And User Checks the Insurance WebElement is Enabled or Not
And User Checks the LifeAndPensions WebElement is Enabled Or Not
And User Checks the CorporationsAndNonProfits WebElement is Enabled or Not
And User Click the ChooseYourIndustry Tab and It Shows the Tab View
And User Click the Financial services
Then Navigates to Financial Services Page

Scenario: Check the Financial Page Webelements are Enabled Or Not
Given User Enter into Financial Services Page
When User Checks the FinancialCrimeCompliance Webelement is Enabled or Not
And User Checks the FraudAndIdentityManagement WebElement Is Enabled or Not
And User Checks The CustomerDataManagement WebElement Is Enabled or Not
And User Checks the CreditRiskAssesment Webelement is Enabled or Not
And User Checks the CollectionsAndRecovery WebElement is Enabled Or Not
And User Checks The TracingAndInvestigations WebElement is Enabled Or Not
Then User Close the Browser