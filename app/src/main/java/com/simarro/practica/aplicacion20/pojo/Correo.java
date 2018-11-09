package com.simarro.practica.aplicacion20.pojo;

public class Correo {
    private String de;
    private String asunto;
    private String text;

    public Correo(String de, String asunto, String text) {
        this.de = de;
        this.asunto = asunto;
        this.text = text;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Correo{" +
                "de='" + de + '\'' +
                ", asunto='" + asunto + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
