Feature: Login

Scenario: user can successfully login using valid email and password
Given : user launches browser
When  : user opens link "https://www.amazon.ca/"
And   : user clicks HelloSignIn tab
And   : user enters valid email as "string" , clicks continue
And   : user enters valid password as "string", clicks submit
Then  : homepage after sign in is seen with title "Amazon Sign In"
Then  : browser is closed
