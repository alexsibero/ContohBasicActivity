package com.alex.contohbasicactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.alex.contohbasicactivity.ui.login.LoginActivity;

import java.util.ArrayList;

public class OtherMainActivity extends AppCompatActivity {

    Button btn;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_main2);
//        btn = findViewById(R.id.buttonOk);
//        text = findViewById(R.id.textview);

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