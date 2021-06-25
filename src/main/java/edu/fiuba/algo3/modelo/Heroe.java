package edu.fiuba.algo3.modelo;

public class Heroe {
    private final Salud salud;

    public Heroe() {
        this.salud = new Salud(10);
    }

    public int puntosDeSalud() {
        return this.salud.puntos();
    }

    public void atacar(Enemigo enemigo) {
        int danio = enemigo.puntosDeDanio();
        enemigo.recibirDanio(this.salud.puntos());
        this.recibirDanio(danio);
    }

    public void recibirDanio(int danio) {
        this.salud.disminuir(danio);
    }

    public void activar(Heroe heroe) {
    }
}
