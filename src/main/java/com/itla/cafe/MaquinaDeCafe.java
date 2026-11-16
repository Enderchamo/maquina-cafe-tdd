package com.itla.cafe;

public class MaquinaDeCafe {
    private Cafetera cafetera;
    private Vaso vasosPequeno;
    private Vaso vasosMediano;
    private Vaso vasosGrande;
    private Azucarero azucarero;

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void setVasosPequeno(Vaso vasos) {
        this.vasosPequeno = vasos;
    }

    public void setVasosMediano(Vaso vasos) {
        this.vasosMediano = vasos;
    }

    public void setVasosGrande(Vaso vasos) {
        this.vasosGrande = vasos;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }

    public Cafetera getCafetera() {
        return cafetera;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public Azucarero getAzucarero() {
        return azucarero;
    }

    public Vaso getTipoVaso(String tipo) {
        if (tipo == null)
            return null;
        switch (tipo.toLowerCase()) {
            case "pequeno":
            case "pequeño":
                return vasosPequeno;
            case "mediano":
                return vasosMediano;
            case "grande":
                return vasosGrande;
            default:
                return null;
        }
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadVasos, int cantidadAzucar) {
        if (vaso == null || cantidadVasos <= 0 || cantidadAzucar < 0)
            throw new IllegalArgumentException("Solicitud invalida");
        if (!vaso.hasVasos(cantidadVasos))
            return "No hay Vasos";
        int cantidadCafeNecesaria = vaso.getContenido() * cantidadVasos;
        if (cafetera == null || !cafetera.hasCafe(cantidadCafeNecesaria))
            return "No hay Cafe";
        int azucarNecesaria = cantidadAzucar * cantidadVasos;
        if (azucarero == null || !azucarero.hasAzucar(azucarNecesaria))
            return "No hay Azucar";
        vaso.giveVasos(cantidadVasos);
        cafetera.giveCafe(cantidadCafeNecesaria);
        azucarero.giveAzucar(azucarNecesaria);
        return "Felicitaciones";
    }
}
