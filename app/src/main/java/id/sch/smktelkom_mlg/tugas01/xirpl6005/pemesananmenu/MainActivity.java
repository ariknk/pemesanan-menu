package id.sch.smktelkom_mlg.tugas01.xirpl6005.pemesananmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Nama, nomer, jmakan, jminum;
    TextView hasil;
    CheckBox cbR, cbS, cbB, cbNG;
    RadioGroup rgstatus;
    Spinner minuman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama = (EditText) findViewById(R.id.editTextnama);
        jmakan = (EditText) findViewById(R.id.editTextjmakan);
        nomer = (EditText) findViewById(R.id.editTextnomer);
        jminum = (EditText) findViewById(R.id.editTextjminum);
        cbR = (CheckBox) findViewById(R.id.checkBoxR);
        cbS = (CheckBox) findViewById(R.id.checkBoxS);
        cbNG = (CheckBox) findViewById(R.id.checkBoxNG);
        cbB = (CheckBox) findViewById(R.id.checkBoxB);
        rgstatus = (RadioGroup) findViewById(R.id.rgstatus);
        minuman = (Spinner) findViewById(R.id.spinner);
        hasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }
        });
    }

    private void doClick() {
        String pesanan = "Pesanan anda : \n";
        int startlen = hasil.length();
        if (cbS.isChecked()) pesanan += cbS.getText() + "\n";
        if (cbB.isChecked()) pesanan += cbB.getText() + "\n";
        if (cbNG.isChecked()) pesanan += cbNG.getText() + "\n";
        if (cbR.isChecked()) pesanan += cbR.getText() + "\n";
        String nama = Nama.getText().toString();
        String meja = nomer.getText().toString();

        hasil.setText("Nama anda " + nama + " nomer meja " + meja + " memesan\n" + pesanan);

    }
}