package dao;


import models.Foodtype;
import models.Restaurant;
import models.Review;

import java.util.List;

public interface FoodtypeDao {

    //create
    void add(Foodtype foodtype); // Q
    void addFoodtypeToRestaurant(Foodtype foodtype, Restaurant restaurant); // E

    //read
    List<Foodtype> getAll(); // we may need this in the future. Even though it does not 100% match a specific user story, it should be implemented.
    List<Restaurant> getAllRestaurantsForAFoodtype(int id); //E we will implement this NOW :)

    //update
    //omit for now
    Foodtype findById(int id); //B

    //delete
    void deleteById(int id); //see above
}
