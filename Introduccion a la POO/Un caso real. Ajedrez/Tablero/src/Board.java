import javax.swing.*;
import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Board {


    //put your task here
    private Cell[][] cells;
    public Board(){
        Cell[][] cells = new Cell[8][8];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j]= new Cell(this, new Coordinate((char) (i+65), j+1));
            }
        }
        this.cells = cells;
    }
    public boolean contains(Coordinate c) {

        //put your task here
        if(c.getNumber()<9 && c.getNumber()>0 && c.getLetter() <= 'H' && c.getLetter()>='A'){
            return true;
        }
        return false;
    }

    public Cell getCellAt(Coordinate c) {
        if(contains(c)) {
            //put your task here
            return cells[((int) (c.getLetter()))-65][c.getNumber()-1];
        }
        return null;
    }
    @Override
    public String toString(){
        String tablero = "";
        tablero+= colorize("    A  B  C  D  E  F  G  H    ",Attribute.WHITE_BACK(), Attribute.BLACK_TEXT()) + "\n";
        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < this.cells.length; j++) {
                if(j==0){
                    tablero+= colorize(" " + i + " ", Attribute.WHITE_BACK(), Attribute.BLACK_TEXT());
                }
                tablero+=cells[i][j].toString();
                if(j==7){
                    tablero+= colorize(" " + i + " ", Attribute.WHITE_BACK(), Attribute.BLACK_TEXT());
                }
            }
            tablero+="\n";

        }
        tablero+= colorize("    A  B  C  D  E  F  G  H    ",Attribute.WHITE_BACK(), Attribute.BLACK_TEXT());
        return tablero;
    }

}

