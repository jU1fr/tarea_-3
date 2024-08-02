package Cafe;

public class Espressoitaliano extends Cafe{

    String intensidad;


    @Override
    public void Preparar(){ super.Preparar();}


    @Override
    public void  Servir(){ super.Servir();}


    public String getIntensidad() {return intensidad;}
}
