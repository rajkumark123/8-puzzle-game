package crk.a8_puzzle;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,start;
    int i=0,a=0;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        t=findViewById(R.id.time);
        start=findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==1){
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    start.setText("start");
                    t.setText("0");

                }


                if(i==0){
                    if(a==0) {
                        b1.setText("7");
                        b2.setText("2");
                        b3.setText("4");
                        b4.setText("5");
                        b5.setText("");
                        b6.setText("6");
                        b7.setText("8");
                        b8.setText("3");
                        b9.setText("1");
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(false);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                    }
                    if(a==1) {
                        b1.setText("6");
                        b2.setText("1");
                        b3.setText("");
                        b4.setText("2");
                        b5.setText("4");
                        b6.setText("3");
                        b7.setText("5");
                        b8.setText("7");
                        b9.setText("8");
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(false);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                    }
                    if(a==2) {
                        b1.setText("4");
                        b2.setText("2");
                        b3.setText("8");
                        b4.setText("");
                        b5.setText("1");
                        b6.setText("7");
                        b7.setText("5");
                        b8.setText("3");
                        b9.setText("6");
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(false);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                    }
                    if(a==3) {
                        b1.setText("6");
                        b2.setText("4");
                        b3.setText("7");
                        b4.setText("2");
                        b5.setText("5");
                        b6.setText("3");
                        b7.setText("8");
                        b8.setText("1");
                        b9.setText("");
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(false);
                    }
                    if(a==4) {
                        b1.setText("6");
                        b2.setText("4");
                        b3.setText("7");
                        b4.setText("3");
                        b5.setText("5");
                        b6.setText("8");
                        b7.setText("1");
                        b8.setText("");
                        b9.setText("2");
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(false);
                        b9.setEnabled(true);
                    }
                    if(a==5) {
                        b1.setText("6");
                        b2.setText("4");
                        b3.setText("8");
                        b4.setText("7");
                        b5.setText("3");
                        b6.setText("");
                        b7.setText("5");
                        b8.setText("1");
                        b9.setText("2");
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(false);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                    }
                    if(a==6) {
                        b1.setText("8");
                        b2.setText("");
                        b3.setText("3");
                        b4.setText("4");
                        b5.setText("1");
                        b6.setText("7");
                        b7.setText("6");
                        b8.setText("2");
                        b9.setText("5");
                        b1.setEnabled(true);
                        b2.setEnabled(false);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                    }
                    if(a==7) {
                        b1.setText("1");
                        b2.setText("4");
                        b3.setText("3");
                        b4.setText("5");
                        b5.setText("2");
                        b6.setText("7");
                        b7.setText("");
                        b8.setText("6");
                        b9.setText("8");
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(false);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                    }
                    if(a==8) {
                        b1.setText("6");
                        b2.setText("");
                        b3.setText("5");
                        b4.setText("2");
                        b5.setText("7");
                        b6.setText("3");
                        b7.setText("8");
                        b8.setText("1");
                        b9.setText("4");
                        b1.setEnabled(true);
                        b2.setEnabled(false);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                    }
                    if(a==9) {
                        b1.setText("5");
                        b2.setText("6");
                        b3.setText("4");
                        b4.setText("");
                        b5.setText("2");
                        b6.setText("3");
                        b7.setText("8");
                        b8.setText("1");
                        b9.setText("7");
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(false);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                    }





                    start.setText("RESET");
                    i=1;
                    if(a==9)
                        a=0;
                    a=a+1;


                    CountDownTimer c = new CountDownTimer(60 * 1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            if (t.getText().toString().equals("0")) {
                                t.setText("Timer (60s)");
                                start.setText("start");
                                i=0;
                                cancel();
                            }
                            else
                                t.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            b1.setText("Y");
                            b2.setText("o");
                            b3.setText("u");
                            b4.setText("L");
                            b5.setText("O");
                            b6.setText("S");
                            b7.setText("");
                            b8.setText("T");
                            b9.setText("");
                            b1.setEnabled(false);
                            b2.setEnabled(false);
                            b3.setEnabled(false);
                            b4.setEnabled(false);
                            b5.setEnabled(false);
                            b6.setEnabled(false);
                            b7.setEnabled(false);
                            b8.setEnabled(false);
                            b9.setEnabled(false);
                            t.setText("Timer (60s)");
                            start.setText("start");
                            i=0;


                        }
                    }.start();


                }



            }

        });
    }

    public void b1(View view) {
        if(!b2.isEnabled()){
            b2.setEnabled(true);
            b1.setEnabled(false);
            b2.setText(b1.getText());
            b1.setText(null);
        }
        if(!b4.isEnabled()){
            b4.setEnabled(true);
            b1.setEnabled(false);
            b4.setText(b1.getText());
            b1.setText(null);
        }
        if(b1.getText().toString().equals("")&&b2.getText().toString().equals("1")&&b3.getText().toString().equals("2")&&b4.getText().toString().equals("3")&&b5.getText().toString().equals("4")&&b6.getText().toString().equals("5")&&b7.getText().toString().equals("6")&&b8.getText().toString().equals("7")&&b9.getText().toString().equals("8")){
            b1.setText("Y");
            b2.setText("o");
            b3.setText("u");
            b4.setText("w");
            b5.setText("i");
            b6.setText("n");
            b7.setText("!");
            b8.setText("!");
            b9.setText("!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            t.setText("0");

        }
    }
    public void b2(View view) {
        if(!b1.isEnabled()){
            b1.setEnabled(true);
            b2.setEnabled(false);
            b1.setText(b2.getText());
            b2.setText(null);
        }
        if(!b5.isEnabled()){
            b5.setEnabled(true);
            b2.setEnabled(false);
            b5.setText(b2.getText());
            b2.setText(null);
        }
        if(!b3.isEnabled()){
            b3.setEnabled(true);
            b2.setEnabled(false);
            b3.setText(b2.getText());
            b2.setText(null);
        }
        if(b1.getText().toString().equals("")&&b2.getText().toString().equals("1")&&b3.getText().toString().equals("2")&&b4.getText().toString().equals("3")&&b5.getText().toString().equals("4")&&b6.getText().toString().equals("5")&&b7.getText().toString().equals("6")&&b8.getText().toString().equals("7")&&b9.getText().toString().equals("8")) {
            b1.setText("Y");
            b2.setText("o");
            b3.setText("u");
            b4.setText("w");
            b5.setText("i");
            b6.setText("n");
            b7.setText("!");
            b8.setText("!");
            b9.setText("!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            t.setText("0");
        }


    }


    public void b3(View view) {
        if(!b2.isEnabled()){
            b2.setEnabled(true);
            b3.setEnabled(false);
            b2.setText(b3.getText());
            b3.setText(null);
        }
        if(!b6.isEnabled()){
            b6.setEnabled(true);
            b3.setEnabled(false);
            b6.setText(b3.getText());
            b3.setText(null);
        }
        if(b1.getText().toString().equals("")&&b2.getText().toString().equals("1")&&b3.getText().toString().equals("2")&&b4.getText().toString().equals("3")&&b5.getText().toString().equals("4")&&b6.getText().toString().equals("5")&&b7.getText().toString().equals("6")&&b8.getText().toString().equals("7")&&b9.getText().toString().equals("8")){            b1.setText("Y");
            b2.setText("o");
            b3.setText("u");
            b4.setText("w");
            b5.setText("i");
            b6.setText("n");
            b7.setText("!");
            b8.setText("!");
            b9.setText("!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            t.setText("0");

        }
    }
    public void b4(View view) {
        if(!b1.isEnabled()){
            b1.setEnabled(true);
            b4.setEnabled(false);
            b1.setText(b4.getText());
            b4.setText(null);
        }
        if(!b5.isEnabled()){
            b5.setEnabled(true);
            b4.setEnabled(false);
            b5.setText(b4.getText());
            b4.setText(null);
        }
        if(!b7.isEnabled()){
            b7.setEnabled(true);
            b4.setEnabled(false);
            b7.setText(b4.getText());
            b4.setText(null);
        }
        if(b1.getText().toString().equals("")&&b2.getText().toString().equals("1")&&b3.getText().toString().equals("2")&&b4.getText().toString().equals("3")&&b5.getText().toString().equals("4")&&b6.getText().toString().equals("5")&&b7.getText().toString().equals("6")&&b8.getText().toString().equals("7")&&b9.getText().toString().equals("8")){            b1.setText("Y");
            b2.setText("o");
            b3.setText("u");
            b4.setText("w");
            b5.setText("i");
            b6.setText("n");
            b7.setText("!");
            b8.setText("!");
            b9.setText("!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            t.setText("0");
        }
    }


    public void b5(View view) {
        if(!b2.isEnabled()){
            b2.setEnabled(true);
            b5.setEnabled(false);
            b2.setText(b5.getText());
            b5.setText(null);
        }
        if(!b4.isEnabled()){
            b4.setEnabled(true);
            b5.setEnabled(false);
            b4.setText(b5.getText());
            b5.setText(null);
        }
        if(!b6.isEnabled()){
            b6.setEnabled(true);
            b5.setEnabled(false);
            b6.setText(b5.getText());
            b5.setText(null);
        }
        if(!b8.isEnabled()){
            b8.setEnabled(true);
            b5.setEnabled(false);
            b8.setText(b5.getText());
            b5.setText(null);
        }
        if(b1.getText().toString().equals("")&&b2.getText().toString().equals("1")&&b3.getText().toString().equals("2")&&b4.getText().toString().equals("3")&&b5.getText().toString().equals("4")&&b6.getText().toString().equals("5")&&b7.getText().toString().equals("6")&&b8.getText().toString().equals("7")&&b9.getText().toString().equals("8")){            b1.setText("Y");
            b2.setText("o");
            b3.setText("u");
            b4.setText("w");
            b5.setText("i");
            b6.setText("n");
            b7.setText("!");
            b8.setText("!");
            b9.setText("!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            t.setText("0");

        }
    }
    public void b6(View view) {
        if(!b3.isEnabled()){
            b3.setEnabled(true);
            b6.setEnabled(false);
            b3.setText(b6.getText());
            b6.setText(null);
        }
        if(!b5.isEnabled()){
            b5.setEnabled(true);
            b6.setEnabled(false);
            b5.setText(b6.getText());
            b6.setText(null);
        }
        if(!b9.isEnabled()){
            b9.setEnabled(true);
            b6.setEnabled(false);
            b9.setText(b6.getText());
            b6.setText(null);
        }
        if(b1.getText().toString().equals("")&&b2.getText().toString().equals("1")&&b3.getText().toString().equals("2")&&b4.getText().toString().equals("3")&&b5.getText().toString().equals("4")&&b6.getText().toString().equals("5")&&b7.getText().toString().equals("6")&&b8.getText().toString().equals("7")&&b9.getText().toString().equals("8")){            b1.setText("Y");
            b2.setText("o");
            b3.setText("u");
            b4.setText("w");
            b5.setText("i");
            b6.setText("n");
            b7.setText("!");
            b8.setText("!");
            b9.setText("!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            t.setText("0");

        }
    }


    public void b7(View view) {
        if(!b4.isEnabled()){
            b4.setEnabled(true);
            b7.setEnabled(false);
            b4.setText(b7.getText());
            b7.setText(null);
        }
        if(!b8.isEnabled()){
            b8.setEnabled(true);
            b7.setEnabled(false);
            b8.setText(b7.getText());
            b7.setText(null);
        }
        if(b1.getText().toString().equals("")&&b2.getText().toString().equals("1")&&b3.getText().toString().equals("2")&&b4.getText().toString().equals("3")&&b5.getText().toString().equals("4")&&b6.getText().toString().equals("5")&&b7.getText().toString().equals("6")&&b8.getText().toString().equals("7")&&b9.getText().toString().equals("8")){            b1.setText("Y");
            b2.setText("o");
            b3.setText("u");
            b4.setText("w");
            b5.setText("i");
            b6.setText("n");
            b7.setText("!");
            b8.setText("!");
            b9.setText("!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

            t.setText("0");

        }
    }
    public void b8(View view) {
        if(!b7.isEnabled()){
            b7.setEnabled(true);
            b8.setEnabled(false);
            b7.setText(b8.getText());
            b8.setText(null);
        }
        if(!b5.isEnabled()){
            b5.setEnabled(true);
            b8.setEnabled(false);
            b5.setText(b8.getText());
            b8.setText(null);
        }
        if(!b9.isEnabled()){
            b9.setEnabled(true);
            b8.setEnabled(false);
            b9.setText(b8.getText());
            b8.setText(null);
        }
        if(b1.getText().toString().equals("")&&b2.getText().toString().equals("1")&&b3.getText().toString().equals("2")&&b4.getText().toString().equals("3")&&b5.getText().toString().equals("4")&&b6.getText().toString().equals("5")&&b7.getText().toString().equals("6")&&b8.getText().toString().equals("7")&&b9.getText().toString().equals("8")){
            b1.setText("Y");
            b2.setText("o");
            b3.setText("u");
            b4.setText("w");
            b5.setText("i");
            b6.setText("n");
            b7.setText("!");
            b8.setText("!");
            b9.setText("!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            t.setText("0");


        }
    }


    public void b9(View view) {
        if(!b6.isEnabled()){
            b6.setEnabled(true);
            b9.setEnabled(false);
            b6.setText(b9.getText());
            b9.setText(null);
        }
        if(!b8.isEnabled()){
            b8.setEnabled(true);
            b9.setEnabled(false);
            b8.setText(b9.getText());
            b9.setText(null);
        }
        if(b1.getText().toString().equals("")&&b2.getText().toString().equals("1")&&b3.getText().toString().equals("2")&&b4.getText().toString().equals("3")&&b5.getText().toString().equals("4")&&b6.getText().toString().equals("5")&&b7.getText().toString().equals("6")&&b8.getText().toString().equals("7")&&b9.getText().toString().equals("8")){
            b1.setText("Y");
            b2.setText("o");
            b3.setText("u");
            b4.setText("w");
            b5.setText("i");
            b6.setText("n");
            b7.setText("!");
            b8.setText("!");
            b9.setText("!");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            t.setText("0");

        }
    }

}

