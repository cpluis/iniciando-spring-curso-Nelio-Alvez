package br.com.couserspring.minhacarteira.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.couserspring.minhacarteira.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "maria", "maria@gmail.com", "999999999999","234234");
		return ResponseEntity.ok().body(u);
	}
}
