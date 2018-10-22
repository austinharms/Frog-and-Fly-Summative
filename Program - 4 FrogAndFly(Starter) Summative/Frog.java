import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    /**
     * when a frog is added is set the speed to a random number between 4-8
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
        speed = Greenfoot.getRandomNumber(4) + 4;
    }

    /**
     * runs toutchingFly, atEdge, and moveFrog evey cycle of the program
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public void act() 
    {
        toutchingFly();
        moveFrog();
        atEdge();
    }

    /**
     * moves the frog forward the speed amount, 35% of the time it turns left or right
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public void moveFrog()
    {
        move(speed);
        int percent = Greenfoot.getRandomNumber(100) + 1;
        if(percent < 35)
        {
            percent = Greenfoot.getRandomNumber(100) + 1;
            if( percent > 50)
            {
                turn(5);
            }
            else
            {
                turn(-5);
            }
        }
    }

    /**
     * if the frog is at the edg of the world it turns the frog 7  degress
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public void atEdge()
    {
        if(isAtEdge() == true)
        {
            turn(7); 
        }
    }
    /**
     * if the frog is toutching a fly it removes the fly than stops the program
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public void toutchingFly()
    {
        if(isTouching(Fly.class))
        {
            removeTouching(Fly.class);
            Greenfoot.stop();
        }

    }    
}
