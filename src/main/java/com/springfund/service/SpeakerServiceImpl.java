package com.springfund.service;

import com.springfund.model.Speaker;
import com.springfund.repository.HibernateSpeakerRepositoryImpl;
import com.springfund.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public  SpeakerServiceImpl()
    {
       System.out.println("Inside no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository)
    {
        System.out.println("Inside repo constructor");
        repository=speakerRepository;
    }

    public List<Speaker> findall()
    {
        return repository.findall();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
