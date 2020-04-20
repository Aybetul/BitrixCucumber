$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As user, I want to be able to login with username and password",
  "keyword": "Feature"
});
formatter.background({
  "name": "open login page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Login as help desk and verify that title is Portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@help_desk"
    }
  ]
});
formatter.step({
  "name": "user logs in as a help desk",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should verify that title is a Portal",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "open login page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Login as marketing and verify that title is Portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@marketing"
    }
  ]
});
formatter.step({
  "name": "user logs in as a marketing",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should verify that title is a Portal",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "open login page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Login as a hr and verify title is Portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hr"
    }
  ]
});
formatter.step({
  "name": "user logs in as a hr",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should verify that title is a Portal",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "open login page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Login with parameters",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginWithParams"
    }
  ]
});
formatter.step({
  "name": "user enters \"helpdesk28@cybertekschool.com\" username and \"UserUser\" password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should verify that title is a Portal",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});