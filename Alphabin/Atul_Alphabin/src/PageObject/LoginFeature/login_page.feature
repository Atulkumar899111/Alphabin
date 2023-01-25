@Login
Feature: Login Page

Scenario: Login to evernote with valid user 
Given Open evernote
Then Close the banner
Then Open login page
Then Enter login fields userid "atulkumarchaudhary9918910167@gmail.com" and password "Atul@1998"
