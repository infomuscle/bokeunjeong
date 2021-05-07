package com.bokeunjeong.portfolio.service;

import com.bokeunjeong.portfolio.model.Contact;
import com.bokeunjeong.portfolio.model.Project;
import com.bokeunjeong.portfolio.model.Skill;
import com.bokeunjeong.portfolio.repository.PortfolioContactRepository;
import com.bokeunjeong.portfolio.repository.PortfolioProjectRepository;
import com.bokeunjeong.portfolio.repository.PortfolioSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    private final PortfolioProjectRepository portfolioProjectRepository;
    private final PortfolioSkillRepository portfolioSkillRepository;
    private final PortfolioContactRepository portfolioContactRepository;

    @Autowired
    public PortfolioService(PortfolioProjectRepository portfolioProjectRepository, PortfolioSkillRepository portfolioSkillRepository, PortfolioContactRepository portfolioContactRepository) {
        this.portfolioProjectRepository = portfolioProjectRepository;
        this.portfolioSkillRepository = portfolioSkillRepository;
        this.portfolioContactRepository = portfolioContactRepository;
    }


    public List<Project> getProjects() {
        return portfolioProjectRepository.findAll();
    }

    public List<Skill> getSkills() {
        return portfolioSkillRepository.findAll();
    }

    public List<Contact> getContacts() {
        return  portfolioContactRepository.findAll();
    }

}
