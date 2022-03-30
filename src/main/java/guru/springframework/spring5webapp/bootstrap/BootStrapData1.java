package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.PublishRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData1 implements CommandLineRunner {

    private PublishRepository publishRepository;

    public BootStrapData1(PublishRepository publishRepository) {
        this.publishRepository = publishRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher vikas = new Publisher("vikas","india","mumbai","maharastra","450621");
        publishRepository.save(vikas);
        System.out.println("Number of publisher: "+publishRepository.count());
        System.out.println("Record: "+publishRepository.findAll());
    }
}
