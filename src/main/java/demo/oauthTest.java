package demo;

import static io.restassured.RestAssured.given;

public class oauthTest {
	
		public static void main(String args[]) {
			
			given()
			.queryParams("code","")
			.queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
			.queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
			
			
			
		String response  = 	given().queryParam("access_token", "")
			.when()
			.get("https://rahulshettyacademy.com/getCourse.php")
			.asString();
		
		System.out.println(response);
		}


}
