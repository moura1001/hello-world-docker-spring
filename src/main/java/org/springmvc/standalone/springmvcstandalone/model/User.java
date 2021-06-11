package org.springmvc.standalone.springmvcstandalone.model;

public class User {

  private String nickname;

  public User(){
    nickname = "World";
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

}