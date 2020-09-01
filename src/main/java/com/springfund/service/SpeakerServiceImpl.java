package com.springfund.service;

import com.springfund.model.Speaker;
import com.springfund.repository.HibernateSpeakerRepositoryImpl;
import com.springfund.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository)
    {
        repository=speakerRepository;
    }

    public List<Speaker> findall()
    {
        return repository.findall();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
