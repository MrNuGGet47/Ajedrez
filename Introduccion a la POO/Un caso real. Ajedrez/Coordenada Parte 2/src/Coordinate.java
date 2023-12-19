public class Coordinate {
    private char letter;
    private int number;

    public Coordinate(char letter, int number) {
        this.letter = String.valueOf(letter).toUpperCase().charAt(0);
        this.number = number;
    }

    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "(" + letter + "," + number + ")";
    }

    //put your task here
    public Coordinate up(){
        return new Coordinate(letter, number-1);
    }
    public Coordinate down(){
        return new Coordinate(letter, number+1);
    }
    public Coordinate left(){
        return new Coordinate((char) (((int) letter) -1), number);
    }
    public Coordinate right(){
        return new Coordinate((char) (((int) letter) +1), number);
    }
    public Coordinate diagonalUpLeft(){
        return new Coordinate((char) (((int) letter) -1), number-1);
    }
    public Coordinate diagonalUpRight(){
        return new Coordinate((char) (((int) letter) +1), number-1);
    }
    public Coordinate diagonalDownLeft(){
        return new Coordinate((char) (((int) letter) -1), number+1);
    }
    public Coordinate diagonalDownRight(){
        return new Coordinate((char) (((int) letter) +1), number+1);
    }
}