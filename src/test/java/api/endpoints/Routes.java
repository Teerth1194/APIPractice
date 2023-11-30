package api.endpoints;

/*
Create user - https://petstore.swagger.io/v2/user
Get User - https://petstore.swagger.io/v2/user/{userName}
Update user - https://petstore.swagger.io/v2/user/{userName}
Delete user - https://petstore.swagger.io/v2/user/{userName}
 */

public class Routes {

    public static String base_url = "https://reqres.in";

    //user module
    public static String post_url = base_url+"/api/users";
    public static String get_url = base_url+"/api/users/{id}";
    public static String update_url = base_url+"/api/users/{id}";
    public static String delete_url = base_url+"/api/users/{id}";


}
