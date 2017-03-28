package org.launchcode.models;

import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by LaunchCode
 */
public class Cheese {

    @NotNull
    @Size(min=3, max=15, message = "Name must be between 3 and 15 characters")
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;

    @NotNull
    private CheeseType type;

    @NotNull
    @Max(5)
    @Min(1)
    private Integer rating;

    private int cheeseId;
    private static int nextId = 1;

    public Cheese(String name, String description,
                  CheeseType type, Integer rating) {
        this();
        this.name = name;
        this.description = description;
        this.type = type;
        this.rating = rating;
    }

    public Cheese() {
        cheeseId = nextId;
        nextId++;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public CheeseType getType() {
        return type;
    }
    public void setType(CheeseType type) {
        this.type = type;
    }
}
