import com.springfund.service.SpeakerService;
import com.springfund.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String args[])
    {
        ApplicationContext appcontext=new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService service=new SpeakerServiceImpl();
        SpeakerService service=appcontext.getBean("speakerService",SpeakerService.class);
        System.out.println(service.findall().get(0).getFirstname());
    }
}
