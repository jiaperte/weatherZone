package com.weatherZone.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.weatherZone.bean.Constants;
import com.weatherZone.bean.Weather;
import com.weatherZone.service.WeatherServiceI;

@Service
public class WeatherServiceImpl implements WeatherServiceI{

	public List<Weather> getList() {
		List<Weather> inputList = new ArrayList<Weather>();
		String inputFilePath = Constants.WeatherFileName;
		File inputF = new File(inputFilePath);
		InputStream inputFS;
		try {
			inputFS = new FileInputStream(inputF);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
			// skip the header of the csv
			inputList = br.lines().skip(1).map(mapToItem).collect(Collectors.toList());
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return inputList;
	}


	private Function<String, Weather> mapToItem = (line) -> {
		String[] p = line.split(",");// a CSV has comma separated lines
		Weather weather = new Weather();
		weather.setDateTime(p[0].trim());
//		weather.setLocationType(p[1]);
//		weather.setLocationCode(Integer.parseInt(p[2]));
//		weather.setLocationName(p[3]);
		weather.setWindDirection(p[4]);
		weather.setWindSpeed(p[5]);
		weather.setTemperature(p[6]);
//		weather.setCloudPercent(p[7]);
//		weather.setHumidity(p[8]);
//		weather.setIcon(p[9]);
		weather.setPrecipiPercent(p[10]);
//		weather.setPressure(p[11]);
		return weather;
	};

}
