package com.tencent.xweb.extension.video;

/* loaded from: classes4.dex */
public class ClickableFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnClickListener f220265d;

    public ClickableFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f220265d != null;
    }

    public void setGestureDetector(android.view.GestureDetector gestureDetector) {
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f220265d = onClickListener;
    }

    public ClickableFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
