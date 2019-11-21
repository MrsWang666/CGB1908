package com.cy.cache.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.common.cache.DefaultCache;
/**
 * @SpringBootTest 此注解是将此类交给spring管理
 *
 */
@SpringBootTest
public class CacheTests {
	@Autowired
	private DefaultCache defaultCache;
	@Test
	public void testDefaultCache() {
		System.out.println(defaultCache);
	}
}
