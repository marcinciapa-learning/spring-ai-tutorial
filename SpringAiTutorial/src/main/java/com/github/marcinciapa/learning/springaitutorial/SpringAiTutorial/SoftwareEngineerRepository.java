package com.github.marcinciapa.learning.springaitutorial.SpringAiTutorial;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SoftwareEngineerRepository {
    private final Map<Integer, SoftwareEngineer> database = new HashMap<>();

    public void save(SoftwareEngineer softwareEngineer) {
        database.put(softwareEngineer.getId(), softwareEngineer);
    }

    public List<SoftwareEngineer> findAll() {
        return new ArrayList<>(database.values());
    }

    public Optional<SoftwareEngineer> findById(Integer id) {
        return Optional.of(database.get(id));
    }

    public boolean existsById(Integer id) {
        return database.containsKey(id);
    }

    public void deleteById(Integer id) {
        database.remove(id);
    }
}
