package com.springmvc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSample {

	@Test
	@DisplayName( "스프링레거시 테스트" )
	@Disabled
	void contextLoad() {
		assertEquals( 1,1 );
	}
}
