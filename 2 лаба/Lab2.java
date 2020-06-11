public class Lab2{
	//Формула треугольника Герона
	public static double computeArea(Point3D a,Point3D b,Point3D c){
		double disa=(a.distanceTo(b));
		double disb=(b.distanceTo(c));
		double disc=(c.distanceTo(a));
		double p=(disa+disb+disc)/2;
		return (Math.sqrt(p*(p-disa)*(p-disb)*(p-disc)));

	}
	public static void main(String[] args){
		Point3D a = new Point3D();//Создание первой точки 
		Point3D b = new Point3D(2,4,10);//Создание второй точки 
		Point3D c = new Point3D(4,12,7);//Создание третьей точки
		if (a.compare(b) || a.compare(c) || c.compare(b))//Проверка совпадений
			System.out.println("Incorrect coordinates");
		else {
			System.out.print("Area of the triangle :");
			System.out.printf("%.2f", computeArea(a, b, c));//Вывод ответа
		}
	}
}