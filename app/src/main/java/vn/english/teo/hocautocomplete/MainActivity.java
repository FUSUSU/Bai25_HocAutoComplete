package vn.english.teo.hocautocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtTen;
    AutoCompleteTextView autoNoiSinh;
    Button btnXacNhan;
    TextView txtThongTin;
    String[] arrayTinhThanh;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
    }

    private void addControls() {

        txtTen = (EditText) findViewById(R.id.txtTen);
        autoNoiSinh = (AutoCompleteTextView) findViewById(R.id.autotxtNoiSinh);
        btnXacNhan = (Button) findViewById(R.id.btnXacNhan);
        txtThongTin = (TextView) findViewById(R.id.txtThongTin);
        arrayTinhThanh = getResources().getStringArray(R.array.arrayTinhThanh);

        adapter = new ArrayAdapter<String>(
                MainActivity.this,
                R.layout.support_simple_spinner_dropdown_item,
                arrayTinhThanh
        );

        autoNoiSinh.setAdapter(adapter);
    }
}
