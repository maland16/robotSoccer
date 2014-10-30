class Robot{
    Point pos = new Point();
    public void move(int spots, String dir){
        if(dir.equals("w")){
            for(int i = spots; i == 0; i--){
                if(pos.y > 0){
                    pos.y--;
                }else{nope();}
            }
        }else if(dir.equals("s")){
             if(pos.y < (Game.fieldSize - 1) && spots > 0){
                pos.y++;
                spots--;
            }else{nope();}
        }else if(dir.equals("a")){
            if(pos.x > 0 && spots > 0){
                pos.x--;
                spots--;
            }else{nope();}
        }else if(dir.equals("d")){
            if(pos.x < (Game.fieldSize - 1) && spots > 0){
                pos.x++;
                spots--;
            }else{nope();}
        }
    }
    public void nope(){
        System.out.println("You can't move off the board silly!");
    }
}
