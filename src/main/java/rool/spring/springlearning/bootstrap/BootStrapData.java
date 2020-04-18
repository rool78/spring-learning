package rool.spring.springlearning.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rool.spring.springlearning.domain.Offer;
import rool.spring.springlearning.domain.User;
import rool.spring.springlearning.repositories.OfferRepository;
import rool.spring.springlearning.repositories.UserRepository;

/**
 * Command Line Runner is an interface. It is used to execute the code after the Spring Boot application started.
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final UserRepository userRepository;
    private final OfferRepository offerRepository;

    public BootStrapData(UserRepository userRepository, OfferRepository offerRepository) {
        this.userRepository = userRepository;
        this.offerRepository = offerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Starting Bootstrap");

        User u1 = new User("John Smith" , "USA");
        User u2 =  new User("Daniella Sophani", "London");

        Offer o1 = new Offer("Car on sale", "I'm looking for someone to buy my car");
        Offer o2 = new Offer("Half price", "Half price cinema tickets");
        Offer o3 = new Offer("Discount", "Supermarket discount");

        u1.getOffers().add(o1);

        o1.setUser(u1);

        u2.getOffers().add(o2);
        u2.getOffers().add(o3);

        o2.setUser(u2);
        o3.setUser(u2);

        userRepository.save(u1);
        userRepository.save(u2);
        offerRepository.save(o1);
        offerRepository.save(o2);
        offerRepository.save(o3);


        System.out.println("Number of users: " + userRepository.count());

        System.out.println("Number of offers: " + offerRepository.count());

    }
}
