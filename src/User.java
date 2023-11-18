
public class User {
    private String username;
    private String password;
    private String role; //this would be the admin, store mgr, or staff

    //constructor to take un and pw
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //add my getter and setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

//Admin
//Can create, update, and delete stores.
//Manages user access and roles.
//Manages item categories.
//Generates purchase orders.
public class Admin extends User {

    //methods for user
    public Admin(String username, String password) {
        super(username, password);
        this.setRole("Admin");
    }

}

//Store Manager
//Can add items to the store's inventory.
//Monitors store inventory levels.
//Generates purchase orders for the store.
public class StoreManager extends User {

    //methods for store manager

}

//Store Staff
//Can view store inventory.
//Can request item additions.
//Can update item quantities (e.g., sales).
public class StoreStaff extends User {

    //methods for store staff

}
