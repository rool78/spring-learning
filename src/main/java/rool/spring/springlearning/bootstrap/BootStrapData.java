package rool.spring.springlearning.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rool.spring.springlearning.repositories.UserRepository;

/**
 * Command Line Runner is an interface. It is used to execute the code after the Spring Boot application started.
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final UserRepository userRepository;

    public BootStrapData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //Empty
    }
}
