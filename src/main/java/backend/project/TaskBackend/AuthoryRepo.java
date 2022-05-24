package backend.project.TaskBackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoryRepo extends JpaRepository<Authority, Integer>
{
	public Authority findByusername(String user);
}
