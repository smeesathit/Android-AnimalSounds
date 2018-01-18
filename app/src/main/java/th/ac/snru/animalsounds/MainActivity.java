package th.ac.snru.animalsounds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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

    } // End onClick
} // End MainActivity
