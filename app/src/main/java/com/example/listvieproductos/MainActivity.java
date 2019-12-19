package com.example.listvieproductos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.listvieproductos.adapters.ProductosAdaptador;
import com.example.listvieproductos.helpers.QueueUtils;
import com.example.listvieproductos.models.Productos;

public class MainActivity extends AppCompatActivity {
    QueueUtils.QueueObject queue = null;
    ListView ProductosList;
    ProductosAdaptador productosAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue = QueueUtils.getInstance(this.getApplicationContext());
        ProductosList = findViewById(R.id.productosList);
        productosAdaptador = new ProductosAdaptador(this, Productos.getCollection(), queue.getImageLoader());
        ProductosList.setAdapter(productosAdaptador);
    }
}
