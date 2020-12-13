Feature: Application Login

Scenario:  Positive test validation login
Given Initialize the chrome browser
And Navigate to "http://www.qaclickacademy.com/" site
And Click on the login button to land on the secure sign in page
When User enters the credentials as username "shubham15001@gmail.com" and password "Shubh@m123"
Then Varify that user is successfully logged in
And Cards are displayed "true"
