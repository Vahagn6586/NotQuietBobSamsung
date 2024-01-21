package com.example.notquietbob;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class DrawThread extends Thread{

    private SurfaceHolder surfaceHolder;
    private volatile boolean running = true;
    private Bitmap[] cutScene = {};
    public DrawThread(Context context, SurfaceHolder surfaceHolder){
        this.surfaceHolder = surfaceHolder;
    }

    public void requestStop() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            Canvas canvas = surfaceHolder.lockCanvas();
            if (canvas != null) {
                try {

                } finally {
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
        }
    }
}
