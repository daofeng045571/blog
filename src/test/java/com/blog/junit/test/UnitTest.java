/**
 * Copyright (c) Windliven 2016 All Rights Reserved
 *
 * @author 立枫
 * @date 2016年10月31日 下午2:47:27
 * @since V1.0.0
 */
package com.blog.junit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * TODO
 *
 * @author 立枫
 * @date 2016年10月31日 下午2:47:27
 *
 */
public class UnitTest {
    private ApplicationContext context = null;
    private JdbcTemplate jdbcTemplate = null;
    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("spring-context.xml");
        jdbcTemplate = context.getBean(JdbcTemplate.class);
    }
    
    @Test
    public void testDB() {
        System.out.println("jdbcTemplate : " + jdbcTemplate);
    }
    
    @After
    public void destroy() {
        context = null;
        jdbcTemplate = null;
    }
}
