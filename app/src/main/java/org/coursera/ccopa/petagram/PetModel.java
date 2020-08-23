package org.coursera.ccopa.petagram;

public class PetModel {
    private int image;
    private String name;
    private int rating;
    private boolean favorite;

    public PetModel() {
    }

    public PetModel(int image, String name, int rating, boolean favorite) {
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.favorite = favorite;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
