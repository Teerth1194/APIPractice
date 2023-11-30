package api.endpoints;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserEndPoints {

    public static Response postUser(User payload){
        Response response =
                given()
                    .accept(ContentType.JSON)
                    .contentType(ContentType.JSON)
                    .body(payload)
                .when()
                    .post(Routes.post_url);
        return response;
    }

    public static Response getUser(int id){
        Response response =
                given()
                        .accept(ContentType.JSON)
                        .pathParam("id", id)
                        .when()
                        .get(Routes.get_url);
        return response;
    }

    public static Response updateUser(User payload, int id){
        Response response =
                given()
                        .accept(ContentType.JSON)
                        .contentType(ContentType.JSON)
                        .pathParam("id", id)
                        .body(payload)
                        .when()
                        .put(Routes.update_url);
        return response;
    }

    public static Response deleteUser(int id){
        Response response =
                given()
                        .accept(ContentType.JSON)
                        .pathParam("id", id)
                        .when()
                        .delete(Routes.delete_url);
        return response;
    }

}
