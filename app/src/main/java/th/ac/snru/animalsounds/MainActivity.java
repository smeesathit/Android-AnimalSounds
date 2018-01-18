package th.ac.snru.animalsounds;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    // อาร์เรย์ที่เก็บ reference ของ ImageView (รูปภาพสัตว์) ทั้งเก้า
    private final ImageView imgAnimals[] = new ImageView[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// ค้นหา ImageView ต่างๆจาก Layout File แล้วเก็บการอ้างอิงลงในอาร์เรย์
        imgAnimals[0] = (ImageView) findViewById(R.id.pig);
        imgAnimals[1] = (ImageView) findViewById(R.id.dog);
        imgAnimals[2] = (ImageView) findViewById(R.id.cat);
        imgAnimals[3] = (ImageView) findViewById(R.id.elephant);
        imgAnimals[4] = (ImageView) findViewById(R.id.horse);
        imgAnimals[5] = (ImageView) findViewById(R.id.cow);
        imgAnimals[6] = (ImageView) findViewById(R.id.bird);
        imgAnimals[7] = (ImageView) findViewById(R.id.duck);
        imgAnimals[8] = (ImageView) findViewById(R.id.rooster);

        // กำหนดให้การคลิก ImageView ทุกอันเรียกมาที่ onClick ในออบเจ็คปัจจุบัน
        for (int i = 0; i < imgAnimals.length; i++) {
            imgAnimals[i].setOnClickListener(this);
        }
    } // End on create

    @Override
    public void onClick(View v) {
        int resId = 0;
        int strId = 0;

        switch (v.getId()) {
            case R.id.bird:
                resId = R.raw.bird;
                strId = R.string.bird;
                break;
            case R.id.cow:
                resId = R.raw.cow;
                strId = R.string.cow;
                break;
            case R.id.cat:
                resId = R.raw.cat;
                strId = R.string.cat;
                break;
            case R.id.dog:
                resId = R.raw.dog;
                strId = R.string.dog;
                break;
            case R.id.duck:
                resId = R.raw.duck;
                    strId = R.string.duck;
                break;

            case R.id.elephant:
                resId = R.raw.elephant;
                strId = R.string.elephant;
                break;
            case R.id.horse:
                resId = R.raw.horse;
                strId = R.string.horse;
                break;
                case R.id.pig:
                resId = R.raw.pig;
                strId = R.string.pig;
                break;
            case R.id.rooster:
                resId = R.raw.rooster;
                strId = R.string.rooster;
                break;
        }// End switch

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, strId, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    } // End onClick
} // End MainActivity
