Feature: Create a new resourse into the data base

@Test
Scenario: Verify user able to register successfully
Given Tap on the Register button
When Enter Username 
And Enter Fullname
And Enter Email id
And Enter your Password
And Re-enter your password
And Tap on Sign up button
Then Tap on OK button

