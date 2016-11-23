/**
 * Created by t00181847 on 23/11/2016.
 */
public class Login {

    //Basic Login class


    //Users firstname surname password and date of birth are required to login
    private String firstname;
    private String surname;
    private String password;
    private String dob;
    //should be on multiple lines


    //constructor
    public Login(String firstname, String surname, String password) {
        this.firstname = firstname;
        this.surname = surname;
        this.password = password;
    }


    //getters and setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }











}
