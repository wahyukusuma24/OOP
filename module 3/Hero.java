import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveHero();
        shootLaser();
        heroCollision();
    }
    
    public void moveHero()
    {
        if(Greenfoot.isKeyDown("W"))
            setLocation(getX(),getY()-4);
            
        if(Greenfoot.isKeyDown("S"))
            setLocation(getX(),getY()+4);
            
        if(Greenfoot.isKeyDown("A"))
            setLocation(getX()-4,getY());
        
        if(Greenfoot.isKeyDown("D"))
            setLocation(getX()+4,getY());
    }
    
    public int timerShoot = 0;
    public void shootLaser() {
        if (timerShoot == 30) {
            getWorld().addObject(new Laser(), getX() + 70, getY());
            timerShoot = 0;
        } else {
            timerShoot++;
        }
        
    }
    public int life = 5;
    public void heroCollision() {
        if (isTouching(Enemy.class)) {
            setLocation(60, 200);
            life--;
        }
        if (life == 0) {
            getWorld().removeObject(this);
        }
    }
}
