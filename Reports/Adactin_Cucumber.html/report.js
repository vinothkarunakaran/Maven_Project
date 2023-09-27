$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SSD-ADMIN/eclipse-workspace/Maven_Project/src/test/java/com/feature/Orange.feature");
formatter.feature({
  "line": 1,
  "name": "To Add The Employee Detail By Using Orange HRM Application",
  "description": "",
  "id": "to-add-the-employee-detail-by-using-orange-hrm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "to-add-the-employee-detail-by-using-orange-hrm-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User Must Launch The \"chrome\" Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User Must Launch The \"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\" Url",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User Must Enter The Valid User Name In \"Admin\" User Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User Must Enter The Valid password In \"admin123\" password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Must Click The Click Button and Its Navigate To The User Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 22
    }
  ],
  "location": "OrangeStep.user_Must_Launch_The_Browser(String)"
});
formatter.result({
  "duration": 7623205200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",
      "offset": 22
    }
  ],
  "location": "OrangeStep.user_Must_Launch_The_Url(String)"
});
formatter.result({
  "duration": 4883507300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 40
    }
  ],
  "location": "OrangeStep.user_Must_Enter_The_Valid_User_Name_In_User_Name_Field(String)"
});
formatter.result({
  "duration": 1661822600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 39
    }
  ],
  "location": "OrangeStep.user_Must_Enter_The_Valid_password_In_password_Field(String)"
});
formatter.result({
  "duration": 232555600,
  "status": "passed"
});
formatter.match({
  "location": "OrangeStep.user_Must_Click_The_Click_Button_and_Its_Navigate_To_The_User_Page()"
});
formatter.result({
  "duration": 234118200,
  "status": "passed"
});
});