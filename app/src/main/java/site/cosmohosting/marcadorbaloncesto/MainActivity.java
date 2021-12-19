package site.cosmohosting.marcadorbaloncesto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int puntajeEquipoA =0, puntajeEquipoB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sumar3EquipoA(View view){
        puntajeEquipoA = puntajeEquipoA + 3;
        mostrarResultadoEquipoA();
    }

    public void sumar2EquipoA(View view){
        puntajeEquipoA = puntajeEquipoA + 2;
        mostrarResultadoEquipoA();
    }

    public void sumar1EquipoA(View view){
        puntajeEquipoA = puntajeEquipoA + 1;
        mostrarResultadoEquipoA();
    }

    public void sumar3EquipoB(View view){
        puntajeEquipoB = puntajeEquipoB + 3;
        mostrarResultadoEquipoB();
    }

    public void sumar2EquipoB(View view){
        puntajeEquipoB = puntajeEquipoB + 2;
        mostrarResultadoEquipoB();
    }

    public void sumar1EquipoB(View view){
        puntajeEquipoB = puntajeEquipoB + 1;
        mostrarResultadoEquipoB();
    }


    /**
     * Métodos para resetear los marcadores
     * */
    public void resetarMarcadores(View view){
        puntajeEquipoA = 0;
        puntajeEquipoB = 0;
        mostrarResultadoEquipoA();
        mostrarResultadoEquipoB();
    }

    /**
     * Métodos para mostrar los resultados
     * */
    public void mostrarResultadoEquipoA(){
        TextView tv_ResultadoEquipoA = (TextView) findViewById(R.id.tv_puntajeEquipoA);
        tv_ResultadoEquipoA.setText(String.valueOf(puntajeEquipoA));
    }

    public void mostrarResultadoEquipoB(){
        TextView tv_ResultadoEquipoB = (TextView) findViewById(R.id.tv_puntajeEquipoB);
        tv_ResultadoEquipoB.setText(String.valueOf(puntajeEquipoB));
    }

    /**
     * Métodos para incrementar el puntaje de los equipos
     * */
    public void incrementarEquipoA(int puntos){
        puntajeEquipoA = puntajeEquipoA + puntos;
    }

    public void incrementarEquipoB(int puntos){
        puntajeEquipoB = puntajeEquipoB + puntos;
    }
}