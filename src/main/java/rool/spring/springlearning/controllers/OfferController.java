package rool.spring.springlearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rool.spring.springlearning.repositories.OfferRepository;

@Controller
public class OfferController {

    /*Dependency injection through constructor*/
    private final OfferRepository offerRepository;

    public OfferController(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    /*mapping /offers, sending the model referring to offers/list template */
    @RequestMapping("/offers")
    public String getOffers(Model model){
        model.addAttribute("offers",offerRepository.findAll());

        return "offers/list";
    }
}
