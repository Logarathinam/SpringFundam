import com.springfund.repository.HibernateSpeakerRepositoryImpl;
import com.springfund.repository.SpeakerRepository;
import com.springfund.service.SpeakerService;
import com.springfund.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan({"Com.springfund"})
public class AppConfig {

    /*
    @Bean(name="speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService()
    {
        //SpeakerServiceImpl service=new SpeakerServiceImpl(getSpeakerRepository()); // Bean to Bean
        SpeakerServiceImpl service=new SpeakerServiceImpl(); // Autowired Demo
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository()
    {
            return new HibernateSpeakerRepositoryImpl();
    }*/
}
