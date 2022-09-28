
public class U2L2Runner {

    public static void main(String[] args){
        int perimeterRec1;
        int perimeterRec2;
        int perimeterRec3;
        int totalPerimeter;
        int areaRec1;
        int areaRec2;
        int areaRec3;
        int areaTotal;
        Rectangle rec1 = new Rectangle(150,200);
     Rectangle rec2 = new Rectangle(100);
     Rectangle rec3 = new Rectangle();
     rec1.setWidth(125);
     rec2.setWidth(125);
     rec2.setLength(125);
     rec3.setWidth(125);
     perimeterRec2 = rec2.calculatePerimeter();
     perimeterRec1 = rec1.calculatePerimeter();
     perimeterRec3 = rec3.calculatePerimeter();
     totalPerimeter = perimeterRec1 + perimeterRec2 + perimeterRec3;
     areaRec1 = rec1.calculateArea();
     areaRec2 = rec2.calculateArea();
     areaRec3 = rec3.calculateArea();
     areaTotal = areaRec2 + areaRec1 + areaRec3;
    System.out.println("Hello user! The total length in fencing needed is "+ totalPerimeter+ " feet. The total area that will needed for the seeds is "+ areaTotal + " square feet");
    }
}
