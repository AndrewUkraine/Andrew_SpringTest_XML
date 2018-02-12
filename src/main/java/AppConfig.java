import beans.Client;
import loggers.EventLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * Created by AndrewUkraine on 05.02.2018.
 */

@Configuration
//@Import(и какой то .class)
public class AppConfig {

    @Bean
    @Scope ("prototype")
    public Client client(){

        return new Client("id", "ghbd");
    }
    @Autowired
    private EventLogger combinedLogger;
}
