package com.springfund.repository;

import com.springfund.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findall();
}
