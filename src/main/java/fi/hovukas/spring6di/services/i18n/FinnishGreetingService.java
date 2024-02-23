package fi.hovukas.spring6di.services.i18n;

import fi.hovukas.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FI")
@Service("i18NService")
public class FinnishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "No mitäpä maailma?";
    }
}