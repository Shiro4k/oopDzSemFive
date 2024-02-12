package model;


public abstract class User {
    protected String birthday;
    protected String fullname;

    public User(String birthday, String fullname) {
        this.birthday = birthday;
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "User{" +
                "birthday='" + birthday + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
