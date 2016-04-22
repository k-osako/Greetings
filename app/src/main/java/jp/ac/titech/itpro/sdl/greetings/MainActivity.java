package jp.ac.titech.itpro.sdl.greetings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{ //主たるもの, 画面に相当するもの

    private TextView outputView; //ここを入れると勝手にimportしてくれる
    private EditText inputName;
    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //mainactivityが作られるときに一回呼ばれる、起動時にでるやつ。
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputView = (TextView)findViewById(R.id.output_view);
        inputName=(EditText)findViewById(R.id.input_name);
        okButton=(Button)findViewById(R.id.ok_button);
        okButton.setOnClickListener(this); //this=mainactivityオブジェクトそのもの, ボタンが押されたときの動作をthisに任せる。
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ok_button:
                String name =inputName.getText().toString();
                if(name!=null && name.length()>0)
                    outputView.setText("Hello, "+name+"\nNice to see you!");
                break;
        }
    }
}
