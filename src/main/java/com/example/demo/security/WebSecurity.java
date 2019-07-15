/**
 * 
 */
package com.example.demo.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author monika.kolhe
 *
 */

public class WebSecurity extends WebSecurityConfigurerAdapter {


	@Override
	public void configure(HttpSecurity  http) throws Exception {
		http.authorizeRequests().antMatchers("/user").permitAll().antMatchers("/user/getAllUser").hasRole("USER");
		//http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
		}
	
	/*@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
				.withUser("monika").password("user").roles("USER");
	}*/
}
