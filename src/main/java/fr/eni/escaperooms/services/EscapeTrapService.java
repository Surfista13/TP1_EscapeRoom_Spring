package fr.eni.escaperooms.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class EscapeTrapService implements RoomService {

	@Override
	public String entreeSalle() {
		return "Perdu, vous etes dans la mauvaise salle !";
	}

}
