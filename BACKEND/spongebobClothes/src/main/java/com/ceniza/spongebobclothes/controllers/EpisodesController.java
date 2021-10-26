package com.ceniza.spongebobclothes.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ceniza.spongebobclothes.entity.services.IEpisodeService;

import java.util.Optional;

import com.ceniza.spongebobclothes.entity.models.Basket;
import com.ceniza.spongebobclothes.entity.models.Episode;
@CrossOrigin(origins = "http://localhost:8100")
@RestController
public class EpisodesController {
	@Autowired
	IEpisodeService episodeservice;
	
	
	@GetMapping("/SpongebobEpisode")
	List<Episode> getAll(){
		return episodeservice.getAll();
	}
	@GetMapping("/SpongebobEpisode/{id}")
	Episode getOne(@PathVariable("id") long id) {
		Optional<Episode> b = episodeservice.getOne(id);
		if(b.isPresent()) {
			return b.get();
		};
		
		return null;
	}

	@PostMapping("/SpongebobEpisode")
	void add(Episode item) {
		episodeservice.add(item);
	}
	@DeleteMapping("/SpongebobEpisode/{id}")
	void delete(@PathVariable("id") long id) {
		System.out.println(id);
		episodeservice.delete(id);
	}
	
	@PutMapping("SpongebobEpisode/{id}")
		void update(@PathVariable("id") long id , Episode item) {
		episodeservice.update(item, id);
	}

}