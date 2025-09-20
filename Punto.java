public class Punto {
    private double coorX;
    private double coorY;

    /**
     * Constructor por parametros.
     * @param x es la primer entrada en la coordenada.
     * @param coorY es la segunda entrada en la coordenada.
     */
    Punto(double x, double coorY) {
	coorX = x;
	this.coorY = coorY;
    }

    /**
     * Constructor por omision.
     */
    Punto() {
	this.coorX = 0;
	coorY = 0.0;
    }

    /**
     * Constructor por copia.
     * @param p un punto a copiar.
     */
    Punto(Punto p) {
	coorX = p.coorX;
	coorY = p.obtenerY();
    }

    /**
     * @return double la primer entrada en la coordenada.
     */
    public double obtenerX() {
	return coorX;
    }

    /**
     * @return double la segunda entrada en la coordenada.
     */
    public double obtenerY() {
	return coorY;
    }

    /**
     * @param coorX la primer entrada a modificar.
     */
    public void asignarX(double coorX) {
	this.coorX = coorX;
    }

    /**
     * @param coorY la segunda entrada a modificar.
     */
    public void asignarY(double coorY) {
	this.coorY = coorY;
    }

    /**
     * @param otro un punto a comparar.
     * @return double la distancia entre dos puntos.
     */
    public double distancia(Punto otro) {
	return Math.sqrt(Math.pow(this.coorX - otro.coorX, 2) + Math.pow(coorY - otro.coorY, 2));
    }

    /**
     * @return String la cadena que representa un punto.
     */
    @Override
    public String toString() {
	return "(" + coorX + "," + coorY + ")";
    }

    /**
     * @param otro un punto a comparar.
     * @return boolean la comparacion entre dos puntos.
     */
    public boolean equals(Punto otro) {
	return (this.coorX == otro.coorX) ? (this.coorY == otro.coorY) ? true : false : false;
    }
}