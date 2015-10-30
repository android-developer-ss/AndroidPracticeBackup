package com.example.snehal.allbuttonssample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;

public class DragAndDrop extends AppCompatActivity {

    private static final String LOGCAT = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_and_drop);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        btn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                String str = eText.getText().toString();
//                Toast msg = Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG);
//                msg.show();
//            }
//        });

        findViewById(R.id.textView1).setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                    view.startDrag(null, shadowBuilder, view, 0);
                    view.setVisibility(View.INVISIBLE);
                    return true;
                } else {
                    return false;
                }
            }
        });

        //onDragListener();
        findViewById(R.id.yellowLayout).setOnDragListener(new MyDragListener());
        findViewById(R.id.pinkLayout).setOnDragListener(new MyDragListener());


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }



//    public boolean onTouch(View view, MotionEvent motionEvent) {
//        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
//            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
//            view.startDrag(null, shadowBuilder, view, 0);
//            view.setVisibility(View.INVISIBLE);
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//    public boolean onDrag(View layoutview, DragEvent dragevent) {
//        int action = dragevent.getAction();
//        switch (action) {
//            case DragEvent.ACTION_DRAG_STARTED:
//                Log.d(LOGCAT, "Drag event started");
//                break;
//            case DragEvent.ACTION_DRAG_ENTERED:
//                Log.d(LOGCAT, "Drag event entered into "+layoutview.toString());
//                break;
//            case DragEvent.ACTION_DRAG_EXITED:
//                Log.d(LOGCAT, "Drag event exited from "+layoutview.toString());
//                break;
//            case DragEvent.ACTION_DROP:
//                Log.d(LOGCAT, "Dropped");
//                View view = (View) dragevent.getLocalState();
//                ViewGroup owner = (ViewGroup) view.getParent();
//                owner.removeView(view);
//                LinearLayout container = (LinearLayout) layoutview;
//                container.addView(view);
//                view.setVisibility(View.VISIBLE);
//                break;
//            case DragEvent.ACTION_DRAG_ENDED:
//                Log.d(LOGCAT, "Drag ended");
//                break;
//            default:
//                break;
//        }
//        return true;
//    }

}
