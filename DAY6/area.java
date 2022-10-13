package d2009;

 abstract class Shape {
abstract float area(int x,int y);
}
class rect extends Shape{
    
    /* (non-Javadoc)
     * @see d2009.Shape#area(int, int)
     */
    float area(int x,int y)
    {
        return(x*y);
    }

}  
