//Assessment Assigned
This is a project for Automation Assessment.
(Steps to be followed)
Steps:
Write 4 end to end tests for this website: https://www.evernote.com/

Selenium based web automation framework:
1) POM based
2) Screenshot capture on test failure
3) HTML and JSON reports of all tests
4) Parallel testing functionality
5) Clear documentation (README) about how to setup and run tests sequentially as well as in parallel

Test cases:
1) Register for an account on the Evernote website.
2) Sign in to your Evernote account.
3) Create a task in the Evernote dashboard.
4) In the task note, include a table and an image.
     a. In the table, add two more rows and fill all the fields with dummy data.
     b. Insert any images into the note.

------- Automation using selenium ------- 
//inside package utility
1. Frameworkutility - have functions to set up chrome and to findElement.

2. configfile - contains all the xpath  

3. PageObject - contains all the step defiantion files


---------- To run the Automation ----------
1. For parallel run
    i. Change the testing.xml file add the class as you want to run
    ii. Run the Runner file

2.   For parallel run
    i. Change the testing.xml file consider only one class which should be run
    ii. Run the Runner file
