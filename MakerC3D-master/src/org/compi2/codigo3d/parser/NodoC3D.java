package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String lv;
    private String lf;

    public NodoC3D(String cad) {
        this.cad = cad;
    }

    public NodoC3D(String cad, String lv, String lf) {
        this.cad = cad;
        this.lv = lv;
        this.lf = lf;
    }
    
    
    public String getCad(){
        return cad;
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public String getLf() {
        return lf;
    }

    public void setLf(String lf) {
        this.lf = lf;
    }
    
    
    
        
}
