package com.example.chatx.Models;

public class Users {

    String profilepic, userName, email, password, userID, lastMessage;

    public Users(String profilepic, String userName, String email, String password, String userID, String lastMessage) {
        this.profilepic = profilepic;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.userID = userID;
        this.lastMessage = lastMessage;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Users(){}

    //signup constructor

    public Users(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getProfilepic() {

        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }



}
