package com.syntax.Task05;
/*Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class.
After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password.
Requirements:
Valid email consider to be only yahoo
Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.*/
public class Registration {

    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        if (email.contains("yahoo")){
            System.out.println("Valid email address entered");
        }else{
            System.out.println("Please enter yahoo email address");
        }

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        if (userName.isEmpty()){
            System.out.println("Username field can not be empty");
        } else if (userName.length()<6){
            System.out.println("User name must be at least 8 characters");
        }else if(userName.length()>16){
            System.out.println("User name must be less than 16 characters");
        }else{
            System.out.println("Valid Username entered");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if (password.isEmpty()) {
            System.out.println("Password field can not be empty");
        }else if (password.contains(userName)){
            System.out.println("Password should not contain user name");
        }else{
            System.out.println("Valid password entered");
        }
        }
        public void printInfo(){
            System.out.println("E-mail Address: " +this.email+" UserName: "+this.userName+" Password: "+this.password.replaceAll("[A-Za-z0-9@!#$%&*()+_<>?]","*"));
        }
    }

