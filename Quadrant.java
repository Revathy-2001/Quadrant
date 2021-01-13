import java.util.*;
class Quadrant{
    public static void main(String[] args){
       Scanner kbd = new Scanner(System.in);
       int x = kbd.nextInt();
       int y = kbd.nextInt();
       if(x >= -1000 && x <= 1000 && y >= -1000 && y <= 1000 && x != 0 && y != 0){
          if(x >= 1 && y >= 1)
            System.out.print("1");
          else if(x >= 1 && y < 1)
            System.out.print("4");
          else if(x < 1 && y < 1)
            System.out.print("3");
          else if(x < 1 && y >= 1)
            System.out.print("2");
        } 
    }
}