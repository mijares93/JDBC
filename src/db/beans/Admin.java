package db.beans;


/**
 * Created by mijares on 09/08/2017.
 */
public class Admin {

    private int AdminId;
    private String Password;
    private String UserName;

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        this.AdminId = adminId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
