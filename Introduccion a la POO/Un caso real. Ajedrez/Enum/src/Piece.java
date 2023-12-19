
public class Piece {

    private Type type;

    public Piece(Type type) {
        this.type = type;
    }

    public enum Color {
        WHITE("Blanco"), BLACK("Negro");
        private String color;
        Color(String text){
            this.color=text;
        }
        public String getColor(){
            return color;
        }
    }

    public enum Type {

        //put your task here
        WHITE_KING,
        WHITE_QUEEN,
        WHITE_ROOK,
        WHITE_BISHOP,
        WHITE_KNIGHT,
        WHITE_PAWN,
        BLACK_KING,
        BLACK_QUEEN,
        BLACK_ROOK,
        BLACK_BISHOP,
        BLACK_KNIGHT,
        BLACK_PAWN;
        private String shape;
        private Color color;
        public String getShape(){
            return shape;
        }
        public Color getColor(){
            return color;
        }
    }

}

