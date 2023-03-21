package fr.eni.escaperooms.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class Treasure2Service implements TreasureService {

	@Override
	public String ouvrir() {
		return "Gagné, vous avez trouvé le trésor !";
	}
}
