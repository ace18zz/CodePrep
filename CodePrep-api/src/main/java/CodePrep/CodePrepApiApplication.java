package CodePrep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication(scanBasePackages = {"com.CodePrep"})
@EnableTransactionManagement
@EnableScheduling
@EnableAsync
public class CodePrepApiApplication {
    public static void main(String[] args){
        SpringApplication.run(CodePrepApiApplication.class,args);
    }


}
