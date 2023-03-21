package fr.eni.escaperooms.controllers;

import fr.eni.escaperooms.services.TreasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreasureRoomController {
	@Autowired
	private TreasureService tresorService;

	public String fin() {
		return tresorService.ouvrir();
	}

	public void setTresorService(TreasureService tresorService) {
		this.tresorService = tresorService;
	}
}
