package backend.project.TaskBackend;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TaskBackendApplication {
	
	@Autowired
	AuthorityService serv;
	
	@Autowired
	BCryptPasswordEncoder encoder;

	public static void main(String[] args)
	{
		SpringApplication.run(TaskBackendApplication.class, args);	
	}
	
	@PostConstruct
	public void hai()
	{
		Authority auth1=new Authority("sriuma", encoder.encode("uma"),8870098577L,"uma@gmail.com");
		
	}

}
