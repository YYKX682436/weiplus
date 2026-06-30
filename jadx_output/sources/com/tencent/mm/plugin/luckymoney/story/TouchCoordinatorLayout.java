package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes5.dex */
public class TouchCoordinatorLayout extends androidx.coordinatorlayout.widget.CoordinatorLayout {
    public final java.util.List D;
    public boolean E;

    public TouchCoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = new java.util.ArrayList();
        this.E = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.util.Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((android.view.View.OnTouchListener) it.next()).onTouch(this, motionEvent);
        }
        if (this.E) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public TouchCoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.D = new java.util.ArrayList();
        this.E = false;
    }
}
