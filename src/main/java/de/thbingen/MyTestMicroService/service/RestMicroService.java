package de.thbingen.MyTestMicroService.service;

import de.thbingen.MyTestMicroService.adapters.out.PostgresStorage;
import de.thbingen.MyTestMicroService.ports.in.MessagePort;
import de.thbingen.MyTestMicroService.ports.out.MessageRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Business Logic
@RequiredArgsConstructor
public class RestMicroService implements MessagePort {
    @Autowired
    private MessageRepositoryPort outputPort;
    public void writeMessage(String msg){
        outputPort.storeMessage(msg);
    }
}
