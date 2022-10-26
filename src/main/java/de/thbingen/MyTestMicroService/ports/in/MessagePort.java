package de.thbingen.MyTestMicroService.ports.in;

public interface MessagePort {
    //Schnittstelle fuer den RestAdapter
    void writeMessage(String msg);
}
