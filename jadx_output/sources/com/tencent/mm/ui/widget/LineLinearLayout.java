package com.tencent.mm.ui.widget;

/* loaded from: classes4.dex */
public class LineLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f211289d;

    /* renamed from: e, reason: collision with root package name */
    public final int f211290e;

    public LineLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int measuredHeight = getMeasuredHeight();
        android.graphics.Paint paint = this.f211289d;
        int i17 = 1;
        while (true) {
            if (this.f211290e * i17 >= measuredHeight) {
                super.onDraw(canvas);
                return;
            } else {
                canvas.drawLine(0.0f, r1 * i17, getMeasuredWidth(), r1 * i17, paint);
                i17++;
            }
        }
    }

    public LineLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setWillNotDraw(false);
        new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f211289d = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(-571543826);
        paint.setStrokeWidth(java.lang.Math.round(i65.a.g(getContext()) * 0.5f));
        this.f211290e = i65.a.b(context, 44);
    }
}
