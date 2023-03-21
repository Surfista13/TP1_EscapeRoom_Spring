package fr.eni.escaperooms;

import fr.eni.escaperooms.controllers.EscapeRoom1Controller;
import fr.eni.escaperooms.controllers.EscapeRoom2Controller;
import fr.eni.escaperooms.controllers.TreasureRoomController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/*
 * NE PAS MODIFIER LE CODE DE CETTE CLASSE
 */
@SpringBootApplication
public class EscapeRoomApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EscapeRoomApplication.class, args);
		
		System.out.println("Entrée dans la salle 1 : ");
		EscapeRoom1Controller room1 = (EscapeRoom1Controller) ctx.getBean("escapeRoom1Controller");
		room1.entreeSalle1();
		
		System.out.println("Entrée dans la salle 2 : ");
		EscapeRoom2Controller room2 = (EscapeRoom2Controller) ctx.getBean("room2");
		room2.entreeSalle2();
		
		System.out.println("Entrée dans la salle du trésor : ");
		TreasureRoomController treasureRoom = ctx.getBean(TreasureRoomController.class);
		System.out.println(treasureRoom.fin());
	}

}
