import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Attribute.TEXT_COLOR;

public class Cell {

    private Piece piece;
    private Board board;
    private Coordinate coordinate;
    private Color originalColor;
    private Color color;

    public Cell(Board board, Coordinate coordinate) {
        this.board = board;
        this.coordinate = coordinate;
        this.piece = null;

        //put your task here
        if(((int)(coordinate.getLetter()) + coordinate.getNumber() )%2 == 0){
            this.originalColor = Color.WHITE;
        }
        else {
            this.originalColor = Color.BLACK;
        }
        this.color = this.originalColor;
    }
    public boolean isEmpty(){
        return piece==null;
    }

    public Piece getPiece() {
        return piece;
    }

    public Board getBoard() {
        return board;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Color getColor() {
        return color;
    }

    public enum Color {
        //put your task here
        WHITE(TEXT_COLOR(180,180,180)),
        BLACK(TEXT_COLOR(130,0,0)),
        HIGHLIGHT_KILL_WHITE(TEXT_COLOR(180,0,0)),
        HIGHLIGHT_KILL_BLACK(TEXT_COLOR(130,0,0)),
        HIGHLIGHT_WHITE(TEXT_COLOR(180,180,0)),
        HIGHLIGHT_BLACK(TEXT_COLOR(130,130,0));
        private Attribute color;
        Color(Attribute color){
            this.color = color;
        }
        public Attribute getColor(){
            return color;
        }
    }
}