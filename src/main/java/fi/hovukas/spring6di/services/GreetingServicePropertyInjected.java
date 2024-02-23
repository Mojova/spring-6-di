package fi.hovukas.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements  GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don’t let friends do property injection!";
    }
}
