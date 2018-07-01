package database.kotlin.flow9.net.myapplication;

import android.view.View;
import android.widget.Toast;

public class ClickClass implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(v.getContext(), "button1 클릭", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(v.getContext(), "button2 클릭", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(v.getContext(), "button3 클릭", Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(v.getContext(), "button4 클릭", Toast.LENGTH_LONG).show();
                break;
        }
    }


}
