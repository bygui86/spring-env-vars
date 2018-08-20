package com.rabbit.samples.springenvvars.dtos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Data
@Builder
public class InfoDto {

	String classical;

	String envVarHome;

	String envVarPath;

	String envVarSpring;

	String envVarDocker;

	String envVarKube;

}
