package eu.numerocinque.chessboardmatrixlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static eu.numerocinque.chessboardmatrixlibrary.Coordinates.init;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init("abcedefgh", "12345678");

        Matrix matrix = new Matrix(8, 8);

        matrix.set("a1", "TORRE");
        Log.d("TAG", "onCreate: " + matrix.get("a1"));
    }
}
