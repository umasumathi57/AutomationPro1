package backend.project.TaskBackend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class Security extends WebSecurityConfigurerAdapter

{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("sriuma").password(getEncode().encode("umab")).roles("ADMIN");
	
	}
	
	@Bean
	public PasswordEncoder getEncode()
	{
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		// TODO Auto-generated method stub
		//super.configure(http);
		http.authorizeHttpRequests().anyRequest().authenticated(); 
		
		http.httpBasic();
		http.formLogin();
		http.csrf().disable(); //for active post,put,delete 
		//http.authorizeHttpRequests().anyRequest().permitAll(); // for disable csrf
		
	}

	

}
