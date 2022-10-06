package com.usa.ciclo3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usa.ciclo3.model.Category;
import com.usa.ciclo3.model.Client;

import com.usa.ciclo3.repository.ClientRepository;



@Service
public class ClientService {

	@Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll() {
    	return (List<Client>) clientRepository.getAll();
    }
    
    public Optional<Client> getClient(int id){
		return clientRepository.getClient(id);
	}
    
    public Client  save(Client client){
	    return clientRepository.save(client);
	    
	}

    /*
    public boolean borrarClient(int id) {
		boolean flag=false;
        Optional<Client> c= clientRepository.getClient(id);
        if(c.isPresent()){
            clientRepository.delete(c.get());
            flag=true;
        }
        return flag;

	}
*/
     
}
