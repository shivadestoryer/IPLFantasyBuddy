package com.example.demo.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Comment;
import com.example.demo.model.IPLSchedule;
import com.example.demo.model.Users;
import com.example.demo.repostiory.CommentRepository;
import com.example.demo.repostiory.IPLRepository;
import com.example.demo.repostiory.UsersRepository;


@RestController
public class IplController {
	
	@Autowired
    private UsersRepository urepo; 
	
	@Autowired
	private IPLRepository repo;

	@Autowired
	private CommentRepository crepo;
	
	@PostMapping("/comment")
	public String getcomment(@RequestBody List<Comment> comment)
	{
		crepo.saveAll(comment);
		return "Comment Saved";
	}
	
	@GetMapping("/getAllMatches")
	public List<IPLSchedule> getMatches()
	{
		return (List<IPLSchedule>)repo.findAll();
	}
	
	@GetMapping("/{date}")
	public IPLSchedule getbydate(@PathVariable String date)
	{
		return repo.findByDate(date);
	}
	
	@GetMapping("/getAllUsers")
		public List<Users> getusers()
		{
		
		  return urepo.findAll();
		}
	
	@RequestMapping("/getComments/{cid}")
	public Optional<Comment> getComment(@PathVariable int cid)
	{
		return crepo.findById(cid);
	}
	
	@RequestMapping("/getAllComments")
	public List<Comment> getAllComments()
	{
		return crepo.findAll();
	}
	  
	

		
	
	
}