import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    /**
     * when a fly is added is sets the rotation to a random number between 0 and 360
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public Fly()
    {
        setRotation(Greenfoot.getRandomNumber(360));
    }

    /**
     * runs toutchingFood and checkKeys evey cycle of the program
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public void act() 
    {
        checkKeys();
        toutchingFood();

    }    
    /**
     * if the fly is toutching food is removes the toutching food and adds one
     * to the scoreboard if it has eaten all of the food it adds 10 more
     * pices of food
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public void toutchingFood()
    {
        if(isTouching(Food.class))
        {
            removeTouching(Food.class);
            ( (Beach)getWorld()).update();
            if(getWorld().getObjects(Food.class).isEmpty() == true)
            {
                ( (Beach)getWorld()).addFood(10);
            }
        } 
    }
    /**
     * if a key is pressed based on what key is pressed it moves or turns the 
     * the fly
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("left") == true)
        {
            //rotate crab -5 pixles
            turn(-5);
        }
        //if the right key is down
        else if(Greenfoot.isKeyDown("right") == true)
        {
            //rotate crab 5 pixles
            turn(5);
        }
        if(Greenfoot.isKeyDown("up") == true)
        {
            move(4);   
        }
    }
}
