public class Coordinate {
    private char letter;
    private int number;

    public Coordinate(char letter, int number) {
        this.letter = String.valueOf(letter).toUpperCase().charAt(0);
        this.number = number;
    }

    //put your task here
    public int getNumber(){
        return number;
    }
    public char getLetter(){
        return letter;
    }
    @Override
    public String toString(){
        return "(" + letter + "," + number + ")";
    }
}