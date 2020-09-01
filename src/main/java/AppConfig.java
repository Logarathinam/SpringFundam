import com.springfund.repository.HibernateSpeakerRepositoryImpl;
import com.springfund.repository.SpeakerRepository;
import com.springfund.service.SpeakerService;
import com.springfund.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="speakerService")
    public SpeakerService getSpeakerService()
    {
        SpeakerServiceImpl service=new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository()
    {
            return new HibernateSpeakerRepositoryImpl();
    }
}
