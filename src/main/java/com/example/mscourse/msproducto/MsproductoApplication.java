package com.example.mscourse.msproducto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableEurekaClient en esta version ya no es soportado
//con la dependencia de eureka es suficiente
@SpringBootApplication
public class MsproductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsproductoApplication.class, args);
	}

}
