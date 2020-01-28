package com.example.project.service;


import java.util.List;
import java.util.Optional;


import com.example.project.domain.entities.Client;
import com.example.project.exception.DataNotFoundException;
import com.example.project.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

//n fazer nos satatus
    public Client createClient(Client model) {
        return clientRepository.save(model);
    }


    public List<Client> listClient() {
        return clientRepository.findAll();
    }

    public Client findById(Integer id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.orElseThrow(() -> new DataNotFoundException("Client Not found"));
    }
    

    //n fazer nos satatus
     public void deleteClient(Integer id) {
         clientRepository.deleteById(id);
         //listClient();
        
    } 
//n fazer nos satatus
    public Client updateClient(Integer id, Client newClient) {
        Client client = findById(id);

        client.setName(newClient.getName());
        client.setPhone(newClient.getPhone());

       return clientRepository.save(client);
       
   } 



   public  List<String> listDistinct() {
    return clientRepository.listDistinct();
}



public  List<Client> listByPhone(String phone) {
    return clientRepository.findByPhone(phone);

}
}