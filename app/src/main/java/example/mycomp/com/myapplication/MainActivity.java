package example.mycomp.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }


public void init(){
    Button buttonContact = (Button)findViewById(R.id.btn_contact);
    Button buttonCamera = (Button)findViewById(R.id.btn_camera);
    Button buttonLocation = (Button)findViewById(R.id.btn_location);
    buttonCamera.setOnClickListener(this);
    buttonContact.setOnClickListener(this);
    buttonLocation.setOnClickListener(this);

}


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btn_camera:
                Intent cam_intent = new Intent(MainActivity.this,MyCameraActivity.class);
                MainActivity.this.startActivity(cam_intent);
                break;

            case R.id.btn_contact:

                Intent contact_intent = new Intent(MainActivity.this,ContactActivity.class);
                MainActivity.this.startActivity(contact_intent);

                break;

            case R.id.btn_location:
                Intent loc_intent = new Intent(MainActivity.this,MyLoctionActivity.class);
                MainActivity.this.startActivity(loc_intent);
                break;

            default:
                break;

        }


    }
}
