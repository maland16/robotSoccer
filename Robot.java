class Robot{
    Point pos = new Point();
    void moveUp(){
        if(pos.y > 0){
            pos.y--;
        }
    }
    void moveDown(){
        if(pos.y < fieldSize){
            pos.y++;
        }
    }
    void moveLeft(){
        if(pos.x > 0){
            pos.x--;
        }
    }
    void moveRight(){
        if(pos.x < fieldSize){
            pos.x++;
        }
    }
}