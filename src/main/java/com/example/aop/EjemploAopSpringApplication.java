package com.example.aop;

import com.example.aop.dao.ClienteDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EjemploAopSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploAopSpringApplication.class, args);
                AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
                ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);
                elCliente.insertarCliente();
                contexto.close();
	}

}
