import java.util.*;

public class Game{
    static int fieldSize = 5;
    static String field[][] = new String[fieldSize][fieldSize];
    static Robot rob = new Robot();
    static Ball ball = new Ball();
    
    public static void main(String[]args){
        ball.pos.x = 0;
        ball.pos.y = 0;
        rob.pos.x = 1;
        rob.pos.y = 1;
        String move;
        int hFar;
        boolean on = true;
        while(on = true){
            printBoard();
            for(int i=0;i>50;i++){System.out.println(" ");}
            Scanner moveScan = new Scanner(System.in);
            System.out.print("Move: ");
            move = moveScan.next();
            Scanner farScan = new Scanner(System.in);
            System.out.print("Distance (int): ");
            hFar = Integer.parseInt(farScan.next());
            rob.move(hFar,move);
            if(move.equals("q")){
                break;
            }//quit
        }
    }
    
    static void printBoard(){ 
        for(int i = 0; i < fieldSize; i++){
            for(int a = 0; a < fieldSize; a++){
                field[i][a]=" ";
            }
        }//load the 2d array with spaces
        field[rob.pos.x][rob.pos.y] = "R";//place robot in array
        field[ball.pos.x][ball.pos.y] = "O";//place ball in array
        for(int i = 0; i < fieldSize;i++){
            for(int a = 0; a < fieldSize; a++){
                System.out.print("| "+field[a][i]+" ");
            }//print vertical lines
            System.out.println("|");//print end vertical line
            if(i < fieldSize-1){
                for(int a = 0; a < fieldSize; a++){
                    System.out.print("----");
                }//print horizontal line
                System.out.println("-");//finish vertical line
            }else{
                System.out.println();
            }
        }//main board print loop
    }
}