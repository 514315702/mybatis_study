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


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.studymybatis.demo.mapper.UserMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * mybatis 的测试类
 */
public class Client {
  public static void main(String[] args) throws IOException {
    String resource = "mybatis_config.xml";
    InputStream resourceAsStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
    SqlSession sqlSession = build.openSession();
    //通过动态代理
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    System.out.println(mapper.findById(1));
    sqlSession.close();

  }
}
