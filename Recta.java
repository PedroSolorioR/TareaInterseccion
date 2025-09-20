public class Recta {
    double m,b; // recta y = mx + b

    public Recta(Lado segmento) {
        //y = mx + b
        double x1 = segmento.obtenerExtremo1().obtenerX();
        double y1 = segmento.obtenerExtremo1().obtenerY();
        double x2 = segmento.obtenerExtremo2().obtenerX();
        double y2 = segmento.obtenerExtremo2().obtenerY();
        m = (y2-y1)/(x2-x1);
        b = -x1*m+y1; //obteniendo b de la forma punto-pendiente y2-y1 = m(x2-x1) -> interseccion eje Y
    }

/*    @Override
    public String toString() {
	    return "Recta: " + a + "x + " + b + "y + " + c + " = 0";
    } */

    public Punto interseccion(Recta r) {
        if(this.m == r.m) {
            return null; //son paralelas
        }
        double x = (this.b-r.b)/(r.m-this.m); //despejando x de la igualación mx+b = MX+B para determinar el punto
        double y = (this.m)*x+this.b; //evaluando en x la ecuación que efectivamente coincide
        return new Punto(x, y);
    }
}
