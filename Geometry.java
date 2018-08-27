/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (Kevin) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }

    /**
     * Calculates the area of a trapezoid.
     *
     * @param b1  length of base 1 of the trapezoid
     *  @param b2  length of base 2 of the trapezoid
     * @param height  height of the trapezoid
     * @return  area of the trapezoid
     */
    public static double trapezoidArea(double b1, double b2, double height) 
    {
        return (b1+b2)/2*height;
    }
    
    /**
     * Calculates the volume of a rectangular prism.
     *
     * @param w width of the prism
     *  @param h height of base 2 of prism
     * @param l length of the prism
     * @return  volume of a rectangular prism
     */
    public static double prismVolume(double w, double h, double l) 
    {
        return (w*h*l);
    }
    
     /**
     * Calculates the volume of a cone.
     *
     * @param r radius of cone
     *  @param h height of cone
     * @return  volume of the cone
     */
    public static double coneVolume(double r, double h) 
    {
        return (Math.PI * Math.pow(r, 2)* (h / 3));
    }
    
     /**
     * Calculates the surface area of a rectangular prism.
     *
     * @param w width of the rectangular prism
     *  @param h height of the rectangular prism
     * @param l length of the rectangular prism
     * @return surface area of the rectangular prism
     */
    public static double prismSurfaceArea(double w, double h, double l) 
    {
        return (2 * (w * l + h * l + h *w));
    }
    
      /**
     * Calculates the surface area of a sphere.
     * @param r radius of the sphere
     * @return surface area of the sphere
     */
    public static double sphereSurfaceArea(double r) 
    {
        return 4 * Math.PI * Math.pow(r, 2);
    }
    
     /**
     * Calculates the hypotenuse of a right triangle.
     * @param a leg 1 of a right triangle
     * @param b leg 2 of the right triangle
     * @return hypotenuse of the right triangle
     */
    public static double hypotenuseLength(double a, double b, double c) 
    {
        return Math.pow(a, 2) + Math.pow(b, 2);
    }
    
    /**
     * Calculates the area of a triangle.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = parallelogramArea(5.2, 9.3);
        System.out.println(ra1);
    }
}
