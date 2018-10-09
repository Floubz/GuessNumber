package com.example.flo.guessnumber;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {
    int randomInt = (int)(Math.random()*100);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView zoneTexte = findViewById(R.id.zoneTexte);
        final TextView zoneTexte2 = findViewById(R.id.zoneTexte2);
        ImageButton image0 = findViewById(R.id.ImageButton0);
        ImageButton image1 = findViewById(R.id.ImageButton1);
        ImageButton image2 = findViewById(R.id.ImageButton2);
        ImageButton image3 = findViewById(R.id.ImageButton3);
        ImageButton image4 = findViewById(R.id.ImageButton4);
        ImageButton image5 = findViewById(R.id.ImageButton5);
        ImageButton image6 = findViewById(R.id.ImageButton6);
        ImageButton image7 = findViewById(R.id.ImageButton7);
        ImageButton image8 = findViewById(R.id.ImageButton8);
        ImageButton image9 = findViewById(R.id.ImageButton9);

        zoneTexte2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(zoneTexte2.getText() == "OK")
                {
                    zoneTexte2.setText("RESET");
                }
                else {
                    if (zoneTexte2.getText() == "RESET") {
                        zoneTexte2.setText("JOUER");
                    }
                    else
                    {
                        if(zoneTexte2.getText() == "JOUER")
                        {
                            zoneTexte.setText(null);
                            zoneTexte2.setText(null);
                            zoneTexte2.setTextColor(Color.parseColor("#010101"));
                            randomInt = (int)(Math.random()*100);
                        }
                    }
                }
            }
        });

        image0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoneTexte.getText().length() < 2) {
                    zoneTexte.setText(zoneTexte.getText() + "0");
                }
                else
                {
                    zoneTexte.setText("0");
                }

                if(randomInt == Integer.parseInt(zoneTexte.getText().toString()))
                {
                    zoneTexte2.setText("OK");
                    zoneTexte2.setTextColor(Color.parseColor("#FE0000"));
                }
                else
                {
                    if(randomInt > Integer.parseInt(zoneTexte.getText().toString()))
                    {
                        zoneTexte2.setText("PLUS");
                    }
                    else
                    {
                        zoneTexte2.setText("MOINS");
                    }
                }
            }
        });

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoneTexte.getText().length() < 2) {
                    zoneTexte.setText(zoneTexte.getText() + "1");
                }
                else
                {
                    zoneTexte.setText("1");
                }

                if(randomInt == Integer.parseInt(zoneTexte.getText().toString()))
                {
                    zoneTexte2.setText("OK");
                    zoneTexte2.setTextColor(Color.parseColor("#FE0000"));
                }
                else
                {
                    if(randomInt > Integer.parseInt(zoneTexte.getText().toString()))
                    {
                        zoneTexte2.setText("PLUS");
                    }
                    else
                    {
                        zoneTexte2.setText("MOINS");
                    }
                }
            }
        });


        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoneTexte.getText().length() < 2) {
                    zoneTexte.setText(zoneTexte.getText() + "2");
                }
                else
                {
                    zoneTexte.setText("2");
                }

                if(randomInt == Integer.parseInt(zoneTexte.getText().toString()))
                {
                    zoneTexte2.setText("OK");
                    zoneTexte2.setTextColor(Color.parseColor("#FE0000"));
                }
                else
                {
                    if(randomInt > Integer.parseInt(zoneTexte.getText().toString()))
                    {
                        zoneTexte2.setText("PLUS");
                    }
                    else
                    {
                        zoneTexte2.setText("MOINS");
                    }
                }
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoneTexte.getText().length() < 2) {
                    zoneTexte.setText(zoneTexte.getText() + "3");
                }
                else
                {
                    zoneTexte.setText("3");
                }

                if(randomInt == Integer.parseInt(zoneTexte.getText().toString()))
                {
                    zoneTexte2.setText("OK");
                    zoneTexte2.setTextColor(Color.parseColor("#FE0000"));
                }
                else
                {
                    if(randomInt > Integer.parseInt(zoneTexte.getText().toString()))
                    {
                        zoneTexte2.setText("PLUS");
                    }
                    else
                    {
                        zoneTexte2.setText("MOINS");
                    }
                }
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoneTexte.getText().length() < 2) {
                    zoneTexte.setText(zoneTexte.getText() + "4");
                }
                else
                {
                    zoneTexte.setText("4");
                }

                if(randomInt == Integer.parseInt(zoneTexte.getText().toString()))
                {
                    zoneTexte2.setText("OK");
                    zoneTexte2.setTextColor(Color.parseColor("#FE0000"));
                }
                else
                {
                    if(randomInt > Integer.parseInt(zoneTexte.getText().toString()))
                    {
                        zoneTexte2.setText("PLUS");
                    }
                    else
                    {
                        zoneTexte2.setText("MOINS");
                    }
                }
            }
        });


        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoneTexte.getText().length() < 2) {
                    zoneTexte.setText(zoneTexte.getText() + "5");
                }
                else
                {
                    zoneTexte.setText("5");
                }

                if(randomInt == Integer.parseInt(zoneTexte.getText().toString()))
                {
                    zoneTexte2.setText("OK");
                    zoneTexte2.setTextColor(Color.parseColor("#FE0000"));
                }
                else
                {
                    if(randomInt > Integer.parseInt(zoneTexte.getText().toString()))
                    {
                        zoneTexte2.setText("PLUS");
                    }
                    else
                    {
                        zoneTexte2.setText("MOINS");
                    }
                }
            }
        });

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoneTexte.getText().length() < 2) {
                    zoneTexte.setText(zoneTexte.getText() + "6");
                }
                else
                {
                    zoneTexte.setText("6");
                }

                if(randomInt == Integer.parseInt(zoneTexte.getText().toString()))
                {
                    zoneTexte2.setText("OK");
                    zoneTexte2.setTextColor(Color.parseColor("#FE0000"));
                }
                else
                {
                    if(randomInt > Integer.parseInt(zoneTexte.getText().toString()))
                    {
                        zoneTexte2.setText("PLUS");
                    }
                    else
                    {
                        zoneTexte2.setText("MOINS");
                    }
                }
            }
        });

        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoneTexte.getText().length() < 2) {
                    zoneTexte.setText(zoneTexte.getText() + "7");
                }
                else
                {
                    zoneTexte.setText("7");
                }

                if(randomInt == Integer.parseInt(zoneTexte.getText().toString()))
                {
                    zoneTexte2.setText("OK");
                    zoneTexte2.setTextColor(Color.parseColor("#FE0000"));
                }
                else
                {
                    if(randomInt > Integer.parseInt(zoneTexte.getText().toString()))
                    {
                        zoneTexte2.setText("PLUS");
                    }
                    else
                    {
                        zoneTexte2.setText("MOINS");
                    }
                }
            }
        });

        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoneTexte.getText().length() < 2) {
                    zoneTexte.setText(zoneTexte.getText() + "8");
                }
                else
                {
                    zoneTexte.setText("8");
                }

                if(randomInt == Integer.parseInt(zoneTexte.getText().toString()))
                {
                    zoneTexte2.setText("OK");
                    zoneTexte2.setTextColor(Color.parseColor("#FE0000"));
                }
                else
                {
                    if(randomInt > Integer.parseInt(zoneTexte.getText().toString()))
                    {
                        zoneTexte2.setText("PLUS");
                    }
                    else
                    {
                        zoneTexte2.setText("MOINS");
                    }
                }
            }
        });

        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoneTexte.getText().length() < 2) {
                    zoneTexte.setText(zoneTexte.getText() + "9");
                }
                else
                {
                    zoneTexte.setText("9");
                }

                if(randomInt == Integer.parseInt(zoneTexte.getText().toString()))
                {
                    zoneTexte2.setText("OK");
                    zoneTexte2.setTextColor(Color.parseColor("#FE0000"));
                }
                else
                {
                    if(randomInt > Integer.parseInt(zoneTexte.getText().toString()))
                    {
                        zoneTexte2.setText("PLUS");
                    }
                    else
                    {
                        zoneTexte2.setText("MOINS");
                    }
                }
            }
        });

    }
}
