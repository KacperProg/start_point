public class Rectangle {

    int width;
    int length;
    int area;
    boolean square;

    public Rectangle(int inputLength, int inputWidth){
        this.length = inputLength;
        this.width = inputWidth;
        this.area = inputLength * inputWidth;
        this.square = false;
    }

    public int getArea(){
        return this.area;
    }

    public boolean getSquare(){
        if (this.length == this.width){
            square = true;
            return this.square;
        }    else {
            return this.square;
        }
    }

    }

