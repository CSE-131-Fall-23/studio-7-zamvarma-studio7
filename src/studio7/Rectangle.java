package studio7;

/**
 * The Rectangle class represents a geometric rectangle with specified length and width.
 */
public class Rectangle {

    /** The length of the rectangle. */
    public int length;

    /** The width of the rectangle. */
    public int width;

    /**
     * Calculates the area of the rectangle.
     *
     * @return The area of the rectangle (length * width).
     */
    public int area() {
        return length * width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return The perimeter of the rectangle (2 * length + 2 * width).
     */
    public int perimeter() {
        return 2 * length + 2 * width;
    }

    /**
     * Checks if the rectangle is a square.
     *
     * @return true if the length and width are equal (i.e., it's a square), false otherwise.
     */
    public boolean isSquare() {
        return length == width;
    }

    /**
     * Checks if the current rectangle is smaller than the provided rectangle.
     *
     * @param r2 The rectangle to compare against.
     * @return true if the current rectangle's area is smaller than the provided rectangle's area, false otherwise.
     */
    public boolean isSmaller(Rectangle r2) {
        return r2.area() > this.area();
    }
    
    public Rectangle(int w, int l) {
    	this.width = w;
    	this.length = l;
    }
}
