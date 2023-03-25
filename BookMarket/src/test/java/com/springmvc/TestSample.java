package com.springmvc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebAppConfiguration
@ExtendWith( SpringExtension.class )
@ContextConfiguration(locations={
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class TestSample {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;


	@BeforeEach
	public void setup(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup( context )
//				.addFilter( new CharacterEncodingFilter( "UTF-8", Boolean.TRUE ) )
				.build();
	}

	@Test
	@DisplayName( "스프링레거시 테스트" )
	@Disabled
	void contextLoad() {
		assertEquals( 1,2 );
	}


	@Test
	@DisplayName( "homecontroller 테스트 코드" )
	@Disabled
	void homeControllerTest() throws Exception {
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get( "/home" );
		mockMvc.perform( builder )
				.andExpect( status().isOk() )
				.andDo( print() ).andReturn().getResponse();
	}
}
