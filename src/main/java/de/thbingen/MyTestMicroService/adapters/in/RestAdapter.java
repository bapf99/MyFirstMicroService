package de.thbingen.MyTestMicroService.adapters.in;

import de.thbingen.MyTestMicroService.ports.in.MessagePort;
import de.thbingen.MyTestMicroService.service.RestMicroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAdapter {

    private MessagePort messagePort = new RestMicroService();

    @GetMapping("/sendMessage") //Schnittstelle nach aussen
    void sendMessage(){
        messagePort.writeMessage("This is my first message. BP");
    }

}
