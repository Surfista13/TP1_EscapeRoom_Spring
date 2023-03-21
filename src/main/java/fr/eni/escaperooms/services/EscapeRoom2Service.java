package fr.eni.escaperooms.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EscapeRoom2Service implements RoomService{
	
	public String entreeSalle(){
		return "Bravo, vous avez trouvé la deuxième salle !";
	}

}
