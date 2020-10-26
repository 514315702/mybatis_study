/**
 *    Copyright 2009-2020 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.studymybatis.demo.entity;

import java.util.Date;

public class User {

  private Integer id;
  private String name;
  private String login;
  private String photo;
  private String phone;
  private Date createDate;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", login='" + login + '\'' +
      ", photo='" + photo + '\'' +
      ", phone='" + phone + '\'' +
      ", createDate=" + createDate +
      '}';
  }
}
