public class Cell {
    //put your task here
    private Piece piece;
    private Board board;
    private Coordinate coordinate;
    public Cell(Board board, Coordinate coordinate){
        this.board = board;
        this.coordinate = coordinate;
        this.piece = null;
    }
    public Piece getPiece(){
        return piece;
    }
    public Board getBoard(){
        return board;
    }
    public Coordinate getCoordiante(){
        return coordinate;
    }
    public void setPiece(Piece piece){
        this.piece = piece;
    }
    public boolean isEmpty(){
        return (this.piece==null);
    }
}
