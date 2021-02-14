/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vdmclcv
 */
import java.util.ArrayList;

public class BirdManager {
    private ArrayList<Bird> birds;
    
    public BirdManager() {
        this.birds = new ArrayList<Bird>();
    }
    
    public void addBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        this.birds.add(bird);
    }
    
    public void addObservation(String birdName) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(birdName)) {
                bird.addObservation();
                break;
            } else {
                System.out.println("No bird found.");
            }
        }
    }
    
    public Bird findBird(String name) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }
    
    public ArrayList<Bird> getBirdList() {
        return this.birds;
    }
}
