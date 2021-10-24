/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tv;
   import java.util.Scanner;
/**
 *
 * @author ATD
 */
public class TV {
 public int channel;
    public int volumeLevel;
    public boolean on=true ;
    
    TV()
    {}
   public void turn_on(){
    if(on ==true)
    System.out.println(" tv is on ");
}
   public  void turn_off(){ 
     if(on !=true)
    System.out.println(" tv is off ");
    }
    public  void set_newChannel(int chan){
        channel=chan;
        
    System.out.println("new channel is " + channel);
}
    
   public void set_new_volumeLevel(int vol)  {
    volumeLevel=vol;
     System.out.println("new vol  is " + volumeLevel);
   }
    
     public void channel_up(){
    
     System.out.println("channel up is  " + ++channel);
    
     }
    
    public  void channel_dawn(){
         
    
    System.out.println("channel dawn is  " +  --channel);
    
     }
    
      public  void volume_up(){
     System.out.println("volume_up is  " +  ++volumeLevel);
     }
    
    
    
    
    public  void volume_dawn(){
     System.out.println("volume_dawn is  " + --volumeLevel);
     }
    
    
    
    
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
            
	  TV ss=new TV();
            ss.turn_on();
	    ss.turn_off();
            ss.set_newChannel(7);
            ss.set_new_volumeLevel(4);
	    ss.channel_up();
            ss.channel_dawn();
            ss.volume_up();
            ss.volume_dawn();
        
        
        
        
        
        
        
    }
    
}
