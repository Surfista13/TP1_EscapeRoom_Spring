package fr.eni.escaperooms.controllers;

import fr.eni.escaperooms.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("room2")
public class EscapeRoom2Controller {

	@Autowired
	private RoomService roomService;

	public void entreeSalle2() {
		System.out.println(roomService.entreeSalle());
	}

}
