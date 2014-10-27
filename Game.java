import java.util.*;

public class Game{
    static int fieldSize = 10;
    static String field[][] = new String[fieldSize][fieldSize];
    static Robot rob = new Robot();
    static Ball ball = new Ball();
    
    public static void main(String[]args){
        System.out.println("HI");
        ball.pos.x = 0;
        ball.pos.y = 0;
        rob.pos.x = 1;
        rob.pos.y = 1;
        String move;
        boolean on = true;
        while(on = true){
            printBoard();
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Move: ");
            move = kbReader.next();
            if(move.equals("w")){
                rob.moveUp();//move up
            }else if(move.equals("s")){
                rob.moveDown();//move down
            }else if(move.equals("a")){
                rob.moveLeft();//move right
            }else if(move.equals("d")){
                rob.moveRight();//move left
            }else if(move.equals("q")){
                on = false;
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