public class Enemy implements Implement
{
    public static int health;
    public static String name;
    private String weapon;
    private int level;
    
    public Enemy(String name,String weapon,int health, int level){
        this.name = name;
        this.health = health;
        this.weapon =weapon;
        this.level = level;
        
        
    }
    
    
    public String getName(){
        return  this.name;
    }
    public String getWeapon(){
        return this.weapon;
    }
    public int getHealth(){
        return this.health;
    }
    public int getLevel(){
        return this.level;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setLevel(int level){
        this.level = level;
        
    }
    
    
    
    
    public void serang(){
        if(this.level < 10 && this.level > 0){
            Player.health -= 10;
        }if (this.level < 30 && this.level >= 10){
            Player.health -= 30;
     
        }if(this.level < 50 && this.level >= 30){
            Player.health -= 50;
          
        }else{
            this.level = 10;
        }
        
        System.out.println("Menyerang ... "+ Player.name);
    }

    @Override
    public void defese() {
        if(this.level < 10 || this.level > 0){
            this.level += 3;
        }if (this.level < 30 || this.level > 10){
            this.level += 7;
        }if(this.level < 50 || this.level > 30){
            this.level += 10;
        }else{
            this.level = 10;
        }
        
    }

    @Override
    public void heal() {
        if(this.health == 0){
            System.out.println(getName() + " Sudah Mati ");
        }else{
            this.health += 50;
        }          
    }


    
    
    
}
