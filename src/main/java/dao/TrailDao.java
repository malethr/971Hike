package dao;

import models.Trail;

import java.util.List;

/**
 * Created by Guest on 8/24/17.
 */
public interface TrailDao {

    void add(Trail trail); //Create

    List<Trail> getAll(); //Read

    Trail findById(int id); // Find Trail by id

    void update(int id, String name, String difficulty, String location, Double latitude, Double longitude, Integer distance);//update

    void deleteById(int id); //Delete

    //need findAllJournalByTrail
}