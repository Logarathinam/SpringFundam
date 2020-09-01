import com.springfund.service.SpeakerService;
import com.springfund.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="speakerService")
    public SpeakerService getSpeakerService()
    {
        return new SpeakerServiceImpl();
    }
}
