Feature: Login

Scenario: user can successfully login using valid email and password
Given : user launches browser
When  : user opens link "https://www.amazon.ca/"
And   : user clicks HelloSignIn tab
And   : user enters valid email as "string" , clicks continue
And   : user enters valid password as "string", clicks submit
Then  : homepage after sign in is seen with title "Amazon Sign In"
When  : user clicks signOut tab
Then  : previous sign it page is seen "Amazon Sign In"
Then  : browser is closed

Scenario Outline: Login Data Driven
 Given : user launches browser
 When  : user opens link "https://www.amazon.ca/"
 And   : user clicks HelloSignIn tab
 And   : user enters valid email as "email" , clicks continue
 And   : user enters valid password as "password", clicks submit
 When  : user clicks signOut tab
 Then  : previous sign it page is seen "Amazon Sign In"
 Then  : browser is closed

  Examples:
  |email|password|ghosh.p189@gmail.com|Sarit@1983|rosyjames1299@gmail.com|Rosy123$$|
