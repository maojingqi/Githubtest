package cm.entity;

public class User {
    private String user_name;
    private String user_password;
    private Integer user_id;
    private Integer user_age;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    @Override
    public String toString() {
        return "User [user_name=" + user_name + ", user_password=" + user_password + ", user_id=" + user_id
                + ", user_age=" + user_age + "]";
    }

}
