package com.dreamsol.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VendorTypeDto {
	@NotBlank(message = "Vendor Type must not be Empty")
	private String typeName;

}
