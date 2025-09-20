public class Lado {
    private Punto extremo1;
    private Punto extremo2;
    private String nombre;

    public Lado(Punto extremo1, Punto extremo2, String nombre) {
	this.extremo1 = extremo1;
	this.extremo2 = extremo2;
	this.nombre = nombre;
    }

    public Lado(Lado otroLado){
        this.extremo1 = new Punto(otroLado.extremo1);
        this.extremo2 = new Punto(otroLado.extremo2);
        this.nombre = otroLado.nombre;
    }

    public String obtenerNombre(){
        return nombre;
    }

    public Punto obtenerExtremo1(){
        return extremo1;
    }

    public Punto obtenerExtremo2(){
        return extremo2;
    }

    public void asignarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public void asignarExtremo1(Punto nuevoExtremo1){
        extremo1 = nuevoExtremo1;
    }

    public void asignarExtremo2(Punto nuevoExtremo2){
        extremo2 = nuevoExtremo2;
    }

    public String toString() {
        return "Lado: " + nombre + " [" + extremo1 + " - " + extremo2 + "]";
    }

    public boolean equals(Lado l){
        boolean igual = true;
        igual = igual && (this.extremo1.equals(l.extremo1) ? true : false);
        igual = igual && (this.extremo2.equals(l.extremo2) ? true : false);
        igual = igual && (this.nombre.equals(l.nombre) ? true : false);
        return igual;
    }

    public boolean seInterseca(Lado otroLado) {
        Recta r1 = new Recta(this);
        Recta r2 = new Recta(otroLado);

        Punto interseccion = r1.interseccion(r2);
        if (interseccion.obtenerX() >= Math.min(this.extremo1.obtenerX(), this.extremo2.obtenerX())) {
            if (interseccion.obtenerX() <= Math.max(this.extremo1.obtenerX(), this.extremo2.obtenerX())) {
                if (interseccion.obtenerX() >= Math.min(otroLado.extremo1.obtenerX(), otroLado.extremo2.obtenerX())) {
                    if (interseccion.obtenerX() <= Math.max(otroLado.extremo1.obtenerX(), otroLado.extremo2.obtenerX())) {
                        if (interseccion.obtenerY() >= Math.min(this.extremo1.obtenerY(), this.extremo2.obtenerY())) {
                            if (interseccion.obtenerY() <= Math.max(this.extremo1.obtenerY(), this.extremo2.obtenerY())) {
                                if (interseccion.obtenerY() >= Math.min(otroLado.extremo1.obtenerY(), otroLado.extremo2.obtenerY())) {
                                    if (interseccion.obtenerY() <= Math.max(otroLado.extremo1.obtenerY(), otroLado.extremo2.obtenerY())) {
                                        return true;
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }

                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}