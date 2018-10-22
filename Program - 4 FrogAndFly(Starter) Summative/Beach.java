import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    public Beach()
    {    
       super(800, 600, 1); 
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       // DO THIS!)

       // add a Fly object at a random position somewhere in the world
       
       // add a Frog object at the center of the world 
       
    }
    
    /**
     * Adds n Food objects to the world
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
}
