package com.rabbit.samples.springenvvars.controllers;

import com.rabbit.samples.springenvvars.dtos.InfoDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@RestController("/info")
public class InfoController {

	@Value("${property.classical:EMPTY}")
	String classical;

	@Value("${property.env.var.home}")
	String envVarHome;

	@Value("${property.env.var.path}")
	String envVarPath;

	@Value("${property.env.var.spring}")
	String envVarSpring;

	@Value("${property.env.var.docker}")
	String envVarDocker;

	@Value("${property.env.var.kube}")
	String envVarKube;

	@GetMapping
	@ResponseBody
	public InfoDto getInfo() {

		return InfoDto.builder()
				.classical(getClassical())
				.envVarHome(getEnvVarHome())
				.envVarPath(getEnvVarPath())
				.envVarSpring(getEnvVarSpring())
				.envVarDocker(getEnvVarDocker())
				.envVarKube(getEnvVarKube())
				.build();
	}

}
