import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JungleWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JungleWorld extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    public JungleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(866, 600, 1); 
        addObject(new Alan(), 100, 300);
        
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60;

    }
    
    public void started(){
        lastFrameTimeMS = System.currentTimeMillis();
    }
    
    public void act(){
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }
    
    public double getTimeStepDuration(){
        return timeStepDuration;
    }
}

