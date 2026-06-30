package com.tencent.mm.plugin.gallery.picker.view;

/* loaded from: classes5.dex */
public class TouchCoordinatorLayout extends androidx.coordinatorlayout.widget.CoordinatorLayout {
    public android.view.View.OnTouchListener D;

    public TouchCoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnTouchListener onTouchListener = this.D;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.D = onTouchListener;
    }

    public TouchCoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
