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
package org.studymybatis.demo;


import com.mysql.cj.jdbc.Driver;

import java.sql.*;

/**
 * jdbc的复习
 */
public class JDBCClient {

  static {
    try {
      Class.forName(Driver.class.getName());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws SQLException {
    Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql_study?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8","root","123456");
    PreparedStatement preparedStatement = connection.prepareStatement("select * from sys_user where id = ?");
    preparedStatement.setInt(1,1);
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()){
      String columnName_id = resultSet.getMetaData().getColumnName(1);
      String columnName_name = resultSet.getMetaData().getColumnName(2);
      System.out.println(columnName_id+ ":"+resultSet.getInt(1));
      System.out.println(columnName_name+ ":"+resultSet.getString(2));
      System.out.println("------------------------------");
    }
    resultSet.close();
    preparedStatement.close();
    connection.close();
  }
}
