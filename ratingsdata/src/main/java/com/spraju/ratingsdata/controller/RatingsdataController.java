package com.spraju.ratingsdata.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spraju.ratingsdata.model.MovieRatting;

@RestController
@RequestMapping("/ratting")
public class RatingsdataController {
	
	@GetMapping()
	public List<MovieRatting> getMovieratting(){
		return Arrays.asList(new MovieRatting(1, 558, 4),new MovieRatting(2, 559, 2)
				            ,new MovieRatting(1, 558, 1),new MovieRatting(2, 559, 5));
		
	}
}
