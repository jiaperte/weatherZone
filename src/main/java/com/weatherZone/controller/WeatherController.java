package com.weatherZone.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.weatherZone.bean.Weather;
import com.weatherZone.service.WeatherServiceI;


@RestController
@RequestMapping("/weatherController")
public class WeatherController {
	@Autowired
	private WeatherServiceI weatherService;
	
	@GetMapping("/getList")
//	@ResponseBody
	public List<Weather> getList(HttpServletRequest request) {
		return weatherService.getList();
	}
	

}
