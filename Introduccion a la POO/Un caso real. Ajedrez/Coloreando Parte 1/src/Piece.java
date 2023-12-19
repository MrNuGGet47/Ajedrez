import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Attribute.BACK_COLOR;
import static com.diogonunes.jcolor.Attribute.TEXT_COLOR;

public class Piece {

    private Type type;
    private Cell cell;

    public Piece(Type type, Cell cell){
        this.type = type;
        this.cell = cell;
    }

    public enum Color {
        WHITE(TEXT_COLOR(255,255,255)),
        BLACK(TEXT_COLOR(0,0,0));

        private Attribute color;
        Color(Attribute color){
            this.color = color;
        }
        public Attribute getColor(){
            return color;
        }
    }

    public enum Type {

        WHITE_KING("\u265A", Color.WHITE),
        WHITE_QUEEN("\u265B", Color.WHITE),
        WHITE_ROOK("\u265C", Color.WHITE),
        WHITE_BISHOP("\u265D", Color.WHITE),
        WHITE_KNIGHT("\u265E", Color.WHITE),
        WHITE_PAWN("\u265F", Color.WHITE),
        BLACK_KING("♚", Color.BLACK),
        BLACK_QUEEN("♛", Color.BLACK),
        BLACK_ROOK("♜", Color.BLACK),
        BLACK_BISHOP("♝", Color.BLACK),
        BLACK_KNIGHT("♞", Color.BLACK),
        BLACK_PAWN("♟", Color.BLACK);

        private final String shape;
        private final Color color;

        Type(String shape, Color color) {
            this.shape = shape;
            this.color = color;
        }

        public String getShape() {
            return shape;
        }
        public Color getColor(){
            return color;
        }
    }

}