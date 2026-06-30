package yp;

/* loaded from: classes16.dex */
public interface j {
    void a(yp.i iVar);

    float b();

    android.view.View getView();

    android.graphics.Canvas lockCanvas();

    void setOnTouchListener(android.view.View.OnTouchListener onTouchListener);

    void unlock();

    void unlockCanvasAndPost(android.graphics.Canvas canvas);
}
