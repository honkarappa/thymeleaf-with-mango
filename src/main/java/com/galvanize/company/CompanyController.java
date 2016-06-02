package com.galvanize.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
final class CompanyController {

    private final MongoRepository<Company, String> companyRepository;

    @Autowired
    CompanyController(final MongoRepository<Company, String> companyRepository) {

        companyRepository.deleteAll();
        companyRepository.save(new Company("Galvanize", 200));
        companyRepository.save(new Company("Allstate", 40200));
        companyRepository.save(new Company("Google", 200121));
        companyRepository.save(new Company("Apple", 420200));

        this.companyRepository = companyRepository;
    }

    @RequestMapping("/company")
    public String index(final Model model) {

        model.addAttribute("companies", companyRepository.findAll());
        return "companies/index";
    }
}