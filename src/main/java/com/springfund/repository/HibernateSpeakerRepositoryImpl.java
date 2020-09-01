package com.springfund.repository;

import com.springfund.model.Speaker;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findall()
    {
        List<Speaker> speakers=new ArrayList<Speaker>();
        Speaker sp=new Speaker();
        sp.setFirstname("Loga");
        sp.setLastname("Rathinam");

        speakers.add(sp);
        return speakers;
    }
}
