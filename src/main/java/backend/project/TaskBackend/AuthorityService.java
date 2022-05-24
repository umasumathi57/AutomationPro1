package backend.project.TaskBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthorityService implements UserDetailsService
{
	@Autowired
	AuthoryRepo rep;
	
	public Authority createuser(Authority authority)
	{
		return rep.save(authority);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Authority auth= rep.findByusername(username);
		if(auth!=null)
		{
			throw new UsernameNotFoundException(username);
		}
	
		return auth;
	}
	
}
