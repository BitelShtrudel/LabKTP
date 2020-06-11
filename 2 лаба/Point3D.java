//Трёхмерный класс точки 
public class Point3D {
	private double xCoord;
	private double yCoord;
	private double zCoord;
//Конструктор иниициализации для 3 переменных
	public Point3D(double x, double y, double z) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}
//Конструктор
	public Point3D() {
		this(0, 0, 0);
	}
//Возвращение координаты X
	public double getX() {
		return xCoord;
	}
//Возвращение координаты Y
	public double getY() {
		return yCoord;
	}
//Возвращение координаты Z
	public double getZ() {
		return zCoord;
	}
//Установка значения координаты X
	public void setX(double x) {
		xCoord = x;
	}
//Установка значения координаты Y
	public void setY(double y) {
		yCoord = y;
	}
//Установка значения координаты Z
	public void setZ(double z) {
		zCoord = z;
	}
//Вычисляет расстояние между двумя точками 
	public double distanceTo(Point3D two) {
		double x1 = this.getX(), x2 = two.getX();
		double y1 = this.getY(), y2 = two.getY();
		double z1 = this.getZ(), z2 = two.getZ();
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
		return distance;
	}
//Проверка на равенство 
	public boolean compare(Point3D com) {
		return (this.getX() == com.getX() && this.getY() == com.getY() && this.getZ() == com.getZ());
	}
}