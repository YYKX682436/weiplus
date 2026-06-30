package com.tencent.mm.view;

/* loaded from: classes13.dex */
public class RoundedCornerHardTouchableLayout extends com.tencent.mm.view.HardTouchableLayout {

    /* renamed from: s, reason: collision with root package name */
    public ym5.c5 f213460s;

    public RoundedCornerHardTouchableLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet, 0);
    }

    public final void d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447182J, i17, 0);
        this.f213460s = new ym5.c5(this, obtainStyledAttributes.getDimension(2, 0.0f), obtainStyledAttributes.getDimension(3, 0.0f), obtainStyledAttributes.getDimension(0, 0.0f), obtainStyledAttributes.getDimension(1, 0.0f));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.Path path = new android.graphics.Path();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
        ym5.c5 c5Var = this.f213460s;
        float f17 = c5Var.f463235a;
        float f18 = c5Var.f463236b;
        float f19 = c5Var.f463238d;
        float f27 = c5Var.f463237c;
        path.addRoundRect(rectF, new float[]{f17, f17, f18, f18, f19, f19, f27, f27}, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    public void setRadius(float f17) {
        ym5.c5 c5Var = this.f213460s;
        c5Var.f463235a = f17;
        c5Var.f463236b = f17;
        c5Var.f463237c = f17;
        c5Var.f463238d = f17;
        postInvalidate();
    }

    public RoundedCornerHardTouchableLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        d(context, attributeSet, i17);
    }
}
