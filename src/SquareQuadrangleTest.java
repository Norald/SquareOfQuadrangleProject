import java.math.BigDecimal;
/*Находить площаль четырехугольника будем как суму площадей 2 треугольников.
* В свою очередь площадь каждого треугольника будем находить по формуле Герона, через полупериметр.*/
public class SquareQuadrangleTest {
    public static void main(String[] args) {
        System.out.println(findSquareOfQuadrangle(3,4,4,2,5));
    }
    public static double findSquareOfQuadrangle(int a, int b, int c, int d, int f){//Находим площадь четырехугольника
        if(a<0||a>10000&&b<0||b>10000&&b<0||c>10000&&c<0||d>10000&&d<0||d>10000||f>10000&&f<0){
            throw new ArithmeticException("Value < 0 or value > 10000");
        }
        return findSquareOfTrinagle(a, b, f) + findSquareOfTrinagle(c ,d ,f);
    }
    private static double findSquareOfTrinagle(int a, int b, int c){//Используем формулу Герона для нахождения площади треугольника
        double semiperimeter = new Double(a + b + c)/2;//Находим полупериметр для формулы Герона
        return Math.sqrt(semiperimeter*(semiperimeter-a)*(semiperimeter-b)*(semiperimeter-c));
    }
}
