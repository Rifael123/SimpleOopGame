public class Player implements Implement {
    
    public static  int health;
    public static String name;
    private String weapon;
    
    public Player(String name, String weapon, int health){
        this.health = health;
        this.name = name;
        this.weapon = weapon;
        
        if(this.health > 100){
            System.out.println("Health mu melebihi batas maksimum.Jadi kami memSet healthmu 100");
        }if(this.health <= 0){
            System.out.println("Jika healthmu segitu berarti kamu sudah mati dong");
            System.out.println("Silahkan set healthmu");
            try{
             Thread.sleep(3000);
             System.exit(0);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
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
    public void setName(String name){
        this.name = name;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public void setHealth(int health){
        this.health = health;
  }

    public void serang(String gunLevel) {
        if(gunLevel == "Low"){
            Enemy.health -= 10;
            this.health -= 3;
        }else if(gunLevel == "Standart"){
            Enemy.health -= 20;
            this.health -= 5;

        }else if(gunLevel == "Pro"){
            Enemy.health -= 30;
            this.health -= 7;

        }else{
            gunLevel = "Low";
        }
        System.out.println("Menyerang ..."+ Enemy.name);
    }

    @Override
    public void heal(){ 
        if(this.health == 0){
            System.out.println(getName() + " Sudah Mati ");
        }else{
            this.health += 50;
        }          
    }

    @Override
    public void defese() {
        this.health += 5;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
