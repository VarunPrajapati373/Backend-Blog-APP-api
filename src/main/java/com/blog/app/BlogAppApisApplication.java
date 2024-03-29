package com.blog.app;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.blog.app.config.AppConstant;
import com.blog.app.entities.Role;
import com.blog.app.repositories.RoleRepository;


@SpringBootApplication
public class BlogAppApisApplication implements CommandLineRunner {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.passwordEncoder.encode("xyz"));
		
		try {
			
			Role role =  new Role();
			role.setId(AppConstant.ADMIN_USER);
			role.setName("ROLE_ADMIN");
			
			Role role1 =  new Role();
			role1.setId(AppConstant.NORMAL_USER);
			role1.setName("ROLE_NORMAL");
			
			List<Role> roles = List.of(role, role1);
			List<Role> result = this.roleRepository.saveAll(roles);
			
			result.forEach(r->{
				System.out.println(r.getName());
			});
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
