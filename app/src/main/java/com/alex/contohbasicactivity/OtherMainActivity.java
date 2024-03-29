package com.alex.contohbasicactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class OtherMainActivity extends AppCompatActivity {

    Button btn;
    TextView text;
    EditText edit;
    RadioButton rbpria;
    RadioButton rbwanita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_main);
        btn = findViewById(R.id.buttonOk);
        text = findViewById(R.id.textview);
        edit = findViewById(R.id.edittext);
        rbpria = findViewById(R.id.rbpria);
        rbwanita = findViewById(R.id.rbwanita);
        btn.setText("Button Send");

        edit.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (btn.getText() != "") {
                    btn.setText(edit.getText());
                } else {
                    btn.setText("Button OK");
                }
                return false;
            }
        });

        rbpria.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true)
                    edit.setText(rbpria.getText());
//                rbwanita.setChecked(false);
            }
        });

        rbwanita.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true)
                    edit.setText(rbwanita.getText());
//                rbpria.setChecked(false);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherMainActivity.this,MainActivity.class);
                startActivity(intent);
                edit.setText("");
            }
        });

//        FirstFragment firstFragment = new FirstFragment();
//        firstFragment.setArguments(getIntent().getExtras());
//
//        SecondFragment secondFragment = new SecondFragment();
//        secondFragment.setArguments(getIntent().getExtras());
//
//        BlankFragment blankFragment = new BlankFragment();
//        blankFragment.setArguments(getIntent().getExtras());
//
//        // Add the fragment to the 'fragment_container' FrameLayout
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.frag_container, firstFragment).commit();
//
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.frag_container2, secondFragment).commit();
//
//        FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//        trans = getSupportFragmentManager().beginTransaction();
//        trans.replace(R.id.frag_container,blankFragment);
//        trans.addToBackStack(null);
//        trans.commit();
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//                trans.replace(R.id.frag_container, firstFragment);
//                trans.commit();
//
////                Intent Implicit Camera
////                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
////                try {
////                    startActivityForResult(takePictureIntent, 1);
////                } catch (ActivityNotFoundException e) {
////                    // display error state to the user
////                }
//
////                Another Implicit Camera
////                Intent i = new Intent();
////                i.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
////                i.setAction(Intent.ACTION_VIEW);
////                i.setData(Uri.parse("content://media/external/images/media/"));
////                startActivity(i);
//
//
////                Start Parcelable
////                Siswa siswa = new Siswa(1000,"Alex","Medan");
////                Siswa siswa1 = new Siswa(1001,"Filbert","Singapore");
////                ArrayList<Siswa> listSiswa = new ArrayList<Siswa>();
////                listSiswa.add(siswa);
////                listSiswa.add(siswa1);
////                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
//////                i.putExtra("Siswa",siswa);
////                i.putExtra("Siswa",listSiswa);
////                startActivity(i);
//
////                Start Activity For Result
////                Intent i = new Intent(OtherMainActivity.this, LoginActivity.class);
////                startActivityForResult(i,11);
////                btn.setVisibility(View.INVISIBLE);
//
////                Intent i = new Intent(OtherMainActivity.this, LoginActivity.class);
////                i.putExtra("nama1","Pemrograman");
////                i.putExtra("nama2", "Mobile");
////                startActivity(i);
//            }
//        });
        Toast.makeText(getApplicationContext(),"On Create dijalankan",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 11) {
            text.setText(data.getExtras().get("uname") + " " + data.getExtras().get("upass"));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"On Start dijalankan",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"On Resume dijalankan",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"On Pause dijalankan",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        btn.setVisibility(View.VISIBLE);
        Toast.makeText(getApplicationContext(),"On Stop dijalankan",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"On Restart dijalankan",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"On Destroy dijalankan",Toast.LENGTH_SHORT).show();
    }
}