import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    //store the number of points
    private int points;
    //store the font to use
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
    /**
     * when the score board is made is sets the location to 150x30, set the font 
     * to myFont and makes and displays a string with the score
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }
    /**
     * adds one to points, makes a greenfoot image named img. clears the curent image
     * and draws the string score with the points value
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        
        img.drawString("Score: " + points, 5,25); 
        
    }    
}