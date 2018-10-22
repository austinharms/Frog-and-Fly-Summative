


/**
 * Name: Austin
 * Class: Software Development 10S
 * Teacher: Mr Hardman
 * Date Last Modified: (today's date)
 */

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    //create a scoreboard named score
    private Scoreboard score;
    /**
     * runs an the start and creates a 800x600 world, add a fly in a random
     * location, adds a frog in the center of the world and adds a scorboard 
     * in the top left corner of the world
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public Beach()
    {    
        super(800, 600, 1); 
        // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
        // DO THIS!)
        addFood(10);
        // add a Fly object at a random position somewhere in the world
        addObject(new Fly(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        // add a Frog object at the center of the world 
        addObject(new Frog(), getWidth()/2, getHeight()/2);
        score = new Scoreboard();
        addObject( score, 100, 50);
    }

    /**
     * when called it adds the set amount of food objects in random locations
     * 
     * @param there is an intiger pramiter called n
     * @return nothing is returned
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    /**
     * when called runs addToScore for score
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public void update()
    {
        score.addToScore();
    }
}
