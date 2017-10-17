package com.example.romeryujra.puma_promo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class Menu extends Activity implements OnClickListener  {

    LinearLayout llmenufront;
    LinearLayout llmenu;
    LinearLayout llcontenido;
    LinearLayout llmenu1;
    LinearLayout llcontenido1;
    ImageView iv;
    TextView tv;
    TextView tv_title;
    Button ayuda;
    Intent ir;
    Button btnmenu1;
    Button btnmenu2;
    Button btnmenu3;
    Button btnvolver;
    Button btnvolver1;
    Button btnscroll1;
    Button btnscroll2;
    Button btnscroll3;
    Button btnscroll4;
    Button btnscroll5;
    Intent move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnmenu1 = (Button) findViewById(R.id.btnmenu1);
        btnmenu1.setOnClickListener(this);
//cambio de actividad AudioVisual
        btnmenu2 = (Button) findViewById(R.id.btnmenu2);
        btnmenu2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View view) {
                                            Toast toast1 = Toast.makeText(getApplicationContext(), "Mantén pulsada una imagen para guardarla", Toast.LENGTH_SHORT);
                                            toast1.show();
                                            move=new Intent(Menu.this, AudioVisual.class);
                                            startActivity(move);
                                        }
                                    }
        );
        btnmenu3 = (Button) findViewById(R.id.btnmenu3);
        btnmenu3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View view) {
                                            Toast toast1 = Toast.makeText(getApplicationContext(), "Menu 2", Toast.LENGTH_SHORT);
                                            toast1.show();
                                            move=new Intent(Menu.this, ver.class);
                                            startActivity(move);
                                        }
                                    }
        );
        btnvolver = (Button) findViewById(R.id.btnvolver);
        btnvolver.setOnClickListener(this);
        btnvolver1 = (Button) findViewById(R.id.btnvolver1);
        btnvolver1.setOnClickListener(this);
        btnscroll1=(Button)findViewById(R.id.btnscroll1);
        btnscroll1.setOnClickListener(this);
        btnscroll2=(Button)findViewById(R.id.btnscroll2);
        btnscroll2.setOnClickListener(this);
        btnscroll3=(Button)findViewById(R.id.btnscroll3);
        btnscroll3.setOnClickListener(this);
        btnscroll4=(Button)findViewById(R.id.btnscroll4);
        btnscroll4.setOnClickListener(this);
        btnscroll5=(Button)findViewById(R.id.btnscroll5);
        btnscroll5.setOnClickListener(this);
        llmenufront = (LinearLayout) findViewById(R.id.llmenufront);
        //llcontenido = (LinearLayout) findViewById(R.id.llcontenido);
        llmenu = (LinearLayout) findViewById(R.id.llmenu);
        llcontenido = (LinearLayout) findViewById(R.id.llcontenido);
        llmenu1 = (LinearLayout) findViewById(R.id.llmenu1);
        llcontenido1 = (LinearLayout) findViewById(R.id.llcontenido1);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnmenu1:
                llmenu.setVisibility(LinearLayout.VISIBLE);
                btnmenu1.setEnabled(false);
                btnmenu1.setVisibility(Button.GONE);
                btnmenu2.setVisibility(Button.GONE);

                break;


            case R.id.btnscroll1:
                llmenu1.setVisibility(LinearLayout.VISIBLE);
                btnscroll1.setEnabled(true);


                //Typeface myTypeface1 = Typeface.createFromAsset(getAssets(),"dirtyheadline.ttf");

                tv_title = new TextView(this);

                //tv_title.setTypeface(myTypeface1);
                tv_title.setText(getResources().getString(R.string.prueba));
                tv_title.setTextSize(15);
                /////////////////////
                iv = new ImageView(this);
                iv.setImageDrawable(getResources().getDrawable(R.drawable.ti2));
                iv.setScaleType(ImageView.ScaleType.CENTER);



                tv = new TextView(this);
                //tv.setText("Some new text");
                tv.setText(getResources().getString(R.string.encendido));
                tv.getTextSize();
                //tv.setTypeface(myTypeface1);
                tv.setTextColor(getResources().getColor(R.color.plomo_obscuro));
                tv.setPadding(10, 10, 10, 10);




                ayuda = new Button(this);
                ayuda.setText("Ayuda");
                ayuda.setPadding(5, 5, 5, 5);
                ayuda.setOnClickListener(new View.OnClickListener() {
                                             public void onClick(View view) {

                                             }
                                         }
                );
                //llcontenido.addView(lll);

                llcontenido1.addView(tv_title);
                //llcontenido1.addView(iv);
                //llcontenido.addView(params);
                llcontenido1.addView(iv);
                llcontenido1.addView(tv);
                llcontenido1.addView(ayuda);

                break;
            case R.id.btnscroll2:
                llmenu1.setVisibility(LinearLayout.VISIBLE);
                btnscroll1.setEnabled(false);
                ///////Revision de carga validador
                Typeface myTypeface2 = Typeface.createFromAsset(getAssets(),"dirtyheadline.ttf");
                tv_title = new TextView(this);
                //tv.setText("Some new text");
                tv_title.setTypeface(myTypeface2);
                tv_title.setText(getResources().getString(R.string.carga_validador));
                tv_title.setTextSize(15);
                iv = new ImageView(this);
                iv.setImageDrawable(getResources().getDrawable(R.drawable.ti));
                iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
                tv = new TextView(this);
                //tv.setText("Some new text");
                tv.setText(getResources().getString(R.string.referido_carga));
                tv.getTextSize();
                tv.setTypeface(myTypeface2);
                tv.setTextColor(getResources().getColor(R.color.plomo_obscuro));
                tv.setPadding(10, 10, 10, 10);
                ayuda=new Button(this);
                ayuda.setText("Ayuda_Bateria");
                ayuda.setPadding(5,5,5,5);
                ayuda.setOnClickListener(new View.OnClickListener() {
                                             public void onClick(View view) {

                                             }
                                         }
                );


                llcontenido1.addView(tv_title);
                llcontenido1.addView(iv);
                llcontenido1.addView(tv);
                llcontenido1.addView(ayuda);

                break;
            case R.id.btnscroll3:
                llmenu1.setVisibility(LinearLayout.VISIBLE);
                btnscroll1.setEnabled(false);
                Typeface myTypeface3 = Typeface.createFromAsset(getAssets(),"dirtyheadline.ttf");
                ///////Revision de Fecha validador
                tv_title = new TextView(this);
                //tv.setText("Some new text");
                tv_title.setTypeface(myTypeface3);
                tv_title.setText(getResources().getString(R.string.revision_fecha));
                tv_title.setTextSize(15);
                iv = new ImageView(this);
                iv.setImageDrawable(getResources().getDrawable(R.drawable.ti2));
                iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
                tv = new TextView(this);
                //tv.setText("Some new text");
                tv.setText(getResources().getString(R.string.referido_fecha));
                tv.getTextSize();
                tv.setTypeface(myTypeface3);
                tv.setTextColor(getResources().getColor(R.color.plomo_obscuro));
                tv.setPadding(10, 10, 10, 10);
                llcontenido1.addView(tv_title);
                llcontenido1.addView(iv);
                llcontenido1.addView(tv);

                break;
            case R.id.btnscroll4:
                llmenu1.setVisibility(LinearLayout.VISIBLE);
                btnscroll1.setEnabled(false);
                Typeface myTypeface4 = Typeface.createFromAsset(getAssets(),"dirtyheadline.ttf");
                ///////Revision migracion de BD
                tv_title = new TextView(this);
                //tv.setText("Some new text");
                tv_title.setTypeface(myTypeface4);
                tv_title.setText(getResources().getString(R.string.actualizacion));
                tv_title.setTextSize(15);
                iv = new ImageView(this);
                iv.setImageDrawable(getResources().getDrawable(R.drawable.bateria_1));
                iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
                tv = new TextView(this);
                //tv.setText("Some new text");
                tv.setText(getResources().getString(R.string.referido_actualizacion));
                tv.getTextSize();
                tv.setTypeface(myTypeface4);
                tv.setTextColor(getResources().getColor(R.color.plomo_obscuro));
                tv.setPadding(10, 10, 10, 10);
                ayuda=new Button(this);
                ayuda.setText("Conexion Base de Datos");
                ayuda.setPadding(5,5,5,5);
                ayuda.setOnClickListener(new View.OnClickListener() {
                                             public void onClick(View view) {

                                             }
                                         }
                );


                llcontenido1.addView(tv_title);
                llcontenido1.addView(iv);
                llcontenido1.addView(tv);
                llcontenido1.addView(ayuda);
                break;
            case R.id.btnscroll5:
                //Intent ir3=new Intent(Ventana.this, AnfTI.class);
                //startActivity(ir3);
                break;
            case R.id.btnvolver:

                llmenu.setVisibility(LinearLayout.GONE);
                llmenu1.setVisibility(LinearLayout.GONE);
                llmenufront.setVisibility(LinearLayout.VISIBLE);

                //llcontenido.removeAllViews();
                btnmenu1.setVisibility(Button.VISIBLE);
                btnmenu2.setVisibility(Button.VISIBLE);

                btnmenu1.setEnabled(true);
                btnmenu2.setEnabled(true);

                break;
            case R.id.btnvolver1:

                llmenu1.setVisibility(LinearLayout.GONE);
                llmenufront.setVisibility(LinearLayout.VISIBLE);

                //llcontenido.removeAllViews();
                btnscroll1.setVisibility(Button.VISIBLE);
                btnscroll2.setVisibility(Button.VISIBLE);
                btnscroll3.setVisibility(Button.VISIBLE);
                btnscroll4.setVisibility(Button.VISIBLE);
                btnscroll5.setVisibility(Button.VISIBLE);
                btnscroll1.setEnabled(true);
                btnscroll2.setEnabled(true);
                btnscroll3.setEnabled(true);
                btnscroll4.setEnabled(true);
                btnscroll5.setEnabled(true);

                break;


            default:
                break;
        }

    }
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        //replaces the default 'Back' button action
        if(keyCode==KeyEvent.KEYCODE_BACK)
        {
            llmenu.setVisibility(LinearLayout.GONE);
            llmenu1.setVisibility(LinearLayout.GONE);
            llmenufront.setVisibility(LinearLayout.VISIBLE);

            //llcontenido.removeAllViews();
            btnmenu1.setVisibility(Button.VISIBLE);
            btnmenu2.setVisibility(Button.VISIBLE);

            btnmenu1.setEnabled(true);
            btnmenu2.setEnabled(true);

        }
        return true;
    }
/*
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.e("back key pressed","Back key pressed");
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }*/

}
