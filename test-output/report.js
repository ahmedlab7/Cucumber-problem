$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/TESTING/cucumber/Cucumber-master/src/test/java/features/something.feature");
formatter.feature({
  "line": 1,
  "name": "Sky Blue Background",
  "description": "",
  "id": "sky-blue-background",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6060168100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "users should be able to change background color to sky blue",
  "description": "",
  "id": "sky-blue-background;users-should-be-able-to-change-background-color-to-sky-blue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 199967200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user__clicks_on_the_button()"
});
formatter.result({
  "duration": 5125671200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 16071300,
  "status": "passed"
});
formatter.after({
  "duration": 3316580800,
  "status": "passed"
});
formatter.before({
  "duration": 3244850000,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "users should be able to change background color to white",
  "description": "",
  "id": "sky-blue-background;users-should-be-able-to-change-background-color-to-white",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Set SkyWhite Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user  clicks on the White button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 51900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_the_White_button()"
});
formatter.result({
  "duration": 7121798300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 39000,
  "status": "passed"
});
formatter.after({
  "duration": 3149496000,
  "status": "passed"
});
});