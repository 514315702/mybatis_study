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
package org.studymybatis.demo.mapper;

import org.studymybatis.demo.entity.User;

import java.util.List;

/**
 * 本类测试几个问题
 */
public interface UserMapper {

  /**
   * 测试存在if的情况下的判断
   */
  public List<User> findUser(User user);

  /**
   * 测试#{}的用法
   */
  public User findById(Integer id);

  /**
   * 测试${}的执行过程
   */
  public User findUserById(Integer id);

  /**
   * 没有参数的情况的测试
   * @param user
   * @return
   */
  public List<User> findAll(User user);
}
