package com.example.listvieproductos.models;

import java.util.ArrayList;

public class Productos {
    public String precio;
    public String descuento;
    public String image;

    public String getSmallImage() {return this.image;}

    public Productos(String _precio, String _descuento, String _image) {
        this.precio = _precio;
        this.descuento = _descuento;
        this.image = _image;
    }

    public static ArrayList getCollection() {
        ArrayList<Productos> collection = new ArrayList<>();
        collection.add(new Productos("S/.23.00", "Plácido","https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-7.jpg"));
        collection.add(new Productos("S/.15.00", "López","https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-8.jpg"));
        collection.add(new Productos("S/.10.00", "Palomino","https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-4.jpg"));
        return collection;
    }
}