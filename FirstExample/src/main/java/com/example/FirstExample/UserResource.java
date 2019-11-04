package com.example.FirstExample;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	List<User1> list;
	@Autowired
	private UserRepository usrrepo;
	
	@GetMapping()
	public List<User1> getUsers()
	{
		return usrrepo.findAll();
		
	}
	
	@GetMapping("/{mailid}")
	public Optional<User1> getUser(@PathVariable String mailid)
	{
		
		//usrrepo.findById(mailid);
		//Optional<User1> user= usrrepo.findById(mailid);
		return usrrepo.findById(mailid);
		
		
	}
	
	
	@PostMapping()
	public List<User1> addUser(@RequestBody final User1 user)
	{
		usrrepo.save(user);
		return usrrepo.findAll();
	}
	
	@PutMapping()
	public List<User1> putUser(@RequestBody final User1 user1)
	{
		User1 user=new User1();
		//usrrepo.findById(mailid);
		user.setFname(user1.getFname());
		user.setLname(user1.getLname());
		user.setMailid(user1.getMailid());
		usrrepo.save(user1);
		return usrrepo.findAll();
	}
	
	@DeleteMapping("/{mailid}")
	@GetMapping("/{mailid}")
	public List<User1> deleteUser(@PathVariable String mailid)
	{
		
		//usrrepo.findById(mailid);
		//Optional<User1> user= usrrepo.findById(mailid);
		//Optional<User1> user=usrrepo.findById(mailid);
		
		usrrepo.deleteById(mailid);
		return usrrepo.findAll();
		
		
	}
}
