package backend.project.TaskBackend;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="users")
public class Authority implements UserDetails
{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String username;
	private String password;
	private Long contact;
	private String email;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Authority [aid=" + aid + ", username=" + username + ", password=" + password + ", contact=" + contact
				+ ", email=" + email + "]";
	}
	
	public Authority() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Authority(int aid, String username, String password, Long contact, String email) {
		super();
		this.aid = aid;
		this.username = username;
		this.password = password;
		this.contact = contact;
		this.email = email;
	}
	public Authority(String username, String password, Long contact, String email) {
		super();
		this.username = username;
		this.password = password;
		this.contact = contact;
		this.email = email;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
