package com.tencent.mm.wallet_core.ui;

/* loaded from: classes3.dex */
public class CustomerScrollView extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public float f214066d;

    /* renamed from: e, reason: collision with root package name */
    public float f214067e;

    /* renamed from: f, reason: collision with root package name */
    public float f214068f;

    /* renamed from: g, reason: collision with root package name */
    public float f214069g;

    public CustomerScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f214067e = 0.0f;
            this.f214066d = 0.0f;
            this.f214068f = motionEvent.getX();
            this.f214069g = motionEvent.getY();
        } else if (action == 2) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            this.f214066d += java.lang.Math.abs(x17 - this.f214068f);
            float abs = this.f214067e + java.lang.Math.abs(y17 - this.f214069g);
            this.f214067e = abs;
            this.f214068f = x17;
            this.f214069g = y17;
            if (this.f214066d > abs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public CustomerScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
