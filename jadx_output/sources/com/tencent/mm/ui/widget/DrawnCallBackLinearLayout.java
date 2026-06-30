package com.tencent.mm.ui.widget;

/* loaded from: classes11.dex */
public class DrawnCallBackLinearLayout extends com.tencent.mm.view.x2c.X2CLinearLayout {
    public DrawnCallBackLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.lang.System.currentTimeMillis();
        super.onLayout(z17, i17, i18, i19, i27);
        java.lang.System.currentTimeMillis();
    }

    public void setListener(al5.o oVar) {
    }

    public void setTouchedCallback(al5.p pVar) {
    }

    public DrawnCallBackLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
