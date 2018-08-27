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
    public static double hypotenuseLength(double a, double b) 
    {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
      /**
     * Calculates distance formula
     *
     * @param x1 The x value of first coordinate
     * @param x2 The x value of second coordinate
     * @param y1 The y value of first coordinate
     * @param y2 The x value of second coordinate
     * @return Distance between two points.
     */
    
         public static double distanceFormula(double x1, double x2, double y1, double y2) 
    {
        return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2-y1, 2)));
    }      
    
    /**
     * Calculates slope formula in decimal
     * 
     * @param x1 The x value of first coordinate
     * @param x2 The x value of second coordinate
     * @param y1 The y value of first coordinate
     * @param y2 The x value of second coordinate
     * @return Slope between two points.
     */
    
         public static double slopeFormula(double x1, double x2, double y1, double y2) 
    {
        return (y2 - y1) / (x2 - x1);
    }     
    
        /**
     * Calculates triangle area given 3 sides
     * 
     * @param a The side length of first side
     * @param b The side length of second side
     * @param c The side length of third side
     * @return Area of a triangle with 3 sides.
     */
    
         public static double triangleArea(double a, double b, double c) 
    {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
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
    
    
    /**
     * calculates the volume of a sphere
     * @param radius The radius of the sphere used to calculate volume
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Allows for input of the code and displays the output
     */
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println("Triangle Area 1: " + ta1);
        System.out.println("Triangle Area 2: " + ta2);
        
        double ra1 = parallelogramArea(5.2, 9.3);
        System.out.println("Rectangle Area: " + ra1);
                //Trapezoid Area
        double tra1 = trapezoidArea(5.2, 7.2, 3.0);
        System.out.println("Trapezoid Area: " + tra1);
        
        //Rectangular Prism Volume
        double rpv1 = prismVolume(6.2, 6.5, 6.0);
        System.out.println("Rectangular Prism Volume: " + rpv1);
        
        //Cone Volume
        double cv1 = coneVolume(6.2, 6.4);
        System.out.println("Cone Volume: " + cv1);
            
        //Rectangular Prism Surface Area
        double rpsa1 = prismSurfaceArea(5.2, 4.5, 3.0);
        System.out.println("Rectangular Prism Surface Area: " + rpsa1); 
        
        //Sphere Surface Area
        double ssa1 = sphereSurfaceArea(2.8);
        System.out.println("Sphere Surface Area: " + ssa1);
        
        //Hypotenuse of Right Triangle
        double hrt1 = hypotenuseLength(6.5, 6.5);
        System.out.println("Hypotenuse of Right Triangle: " + hrt1);
        
        //Distance Formula
        double df1 = distanceFormula(5.2, 1.5, 3.0, 4.2);
        System.out.println("Distance Formula: " + df1);
        
        //Slope Formula
        double sf1 = slopeFormula(2.2, 3.5, 4.0, 4.1);
        System.out.println("Slope Formula: " + sf1);

        //Heron's Formula
        double hf1 = triangleArea(2 , 3 , 4);
        System.out.println("Area of a triangle given 3 sides: " + hf1);
    }
}
