package api.test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import api.utilities.DataProviders;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import lombok.experimental.StandardException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserTest {
    Faker faker;
    User payload;
    String userId;

//    @BeforeTest
//    public void setUp(){
//        faker = new Faker();
//        payload = new User();
//
//        payload.setName(faker.name().name());
//        payload.setJob(faker.job().field());
//    }

    @Test(priority = 1, dataProvider = "Data", dataProviderClass = DataProviders.class)
    public void createUser(String name, String job){
        payload = new User();
        payload.setName(name);
        payload.setJob(job);

        Response response = UserEndPoints.postUser(this.payload);
        response.then().log().all();
        userId = response.getBody().jsonPath().get("id");
        System.out.println(userId);
        Assert.assertEquals(response.getStatusCode(), 201);
    }

//    @Test(priority = 2)
//    public void readUser(){
//        Response response = UserEndPoints.getUser(2);
//        response.then().log().all();
//        Assert.assertEquals(response.getStatusCode(), 200);
//    }
//
//    @Test
//    public void updateUser(){
//
//        Response response = UserEndPoints.updateUser(this.payload, 2);
//        response.then().log().all();
//        Assert.assertEquals(response.getStatusCode(), 200);
//    }
//
//    @Test
//    public void deleteUser(){
//
//        Response response = UserEndPoints.deleteUser(2);
//        Assert.assertEquals(response.getStatusCode(), 204);
//    }

}
