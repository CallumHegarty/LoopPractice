public class LoopWorld {

    public static void main(String[] args) {
        LoopWorld loops = new LoopWorld();
    }

    public LoopWorld(){
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();
        pattern11();
        pattern12();
        pattern13();
    }

    public void pattern1(){
        System.out.println();
        System.out.println("Pattern 1:");
        for(int x=0;x<26;x=x+5){
            System.out.println(x);
        }
    }

    public void pattern2(){
        System.out.println();
        System.out.println("Pattern 2:");
        for(int x=2;x<28;x=x+5){
            System.out.println(x);
        }
    }

    public void pattern3(){
        System.out.println();
        System.out.println("Pattern 3:");
        for(int x=21;x>0;x=x-4){
            System.out.print(x+"\t");
        }
        System.out.println();
    }

    public void pattern4(){
        System.out.println();
        System.out.println("Pattern 4:");
        for(int x=1;x<7;x++){
            System.out.print(x*x+"\t");
        }
        System.out.println();
    }

    public void pattern5(){
        System.out.println();
        System.out.println("Pattern 5:");
        for(int x=0;x<4;x++){
            for(int y=1;y<5;y++) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }

    public void pattern6(){
        System.out.println();
        System.out.println("Pattern 6:");
        for(int x=1;x<6;x++){
            for(int y=0;y<x-1;y++){
                System.out.print(" ");
            }
            System.out.println(x);
        }
    }

    public void pattern7(){
        System.out.println();
        System.out.println("Pattern 7:");
        for(int x=1;x<6;x++){
            for(int y=5;y>x-1;y--){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public void pattern8(){
        System.out.println();
        System.out.println("Pattern 8:");
        for(int x=1;x<6;x++){
            for(int y=0;y<x-1;y++){
                System.out.print(" ");
            }
            for(int z=5;z>x-1;z--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern9(){
        System.out.println();
        System.out.println("Pattern 9:");
        for(int x=1;x<7;x++){
            for(int y=1;y<x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public void pattern10(){
        System.out.println();
        System.out.println("Pattern 10:");
        for(int x=0;x<6;x++){
            for(int y=1;y<=x;y++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public void pattern11(){
        System.out.println();
        System.out.println("Pattern 11:");
        for(int x=1;x<7;x++){
            for(int y=1;y<x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
        for(int x=5;x>1;x--){
            for(int y=1;y<x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public void pattern12(){
        System.out.println();
        System.out.println("Pattern 12:");
        for(int x=6;x>1;x--){
            for(int y=1;y<x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
        for(int x=3;x<7;x++){
            for(int y=1;y<x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public void pattern13(){
        System.out.println();
        System.out.println("Pattern 13:");
        for(int x=6;x>1;x--){
            for(int y=1;y<x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
        for(int x=3;x<7;x++){
            for(int y=1;y<x;y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

}
