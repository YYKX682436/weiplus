package com.tencent.mm.transvoice.ui;

/* loaded from: classes5.dex */
public class RingView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f196421d;

    /* renamed from: e, reason: collision with root package name */
    public int f196422e;

    /* renamed from: f, reason: collision with root package name */
    public float f196423f;

    /* renamed from: g, reason: collision with root package name */
    public float f196424g;

    /* renamed from: h, reason: collision with root package name */
    public float f196425h;

    /* renamed from: i, reason: collision with root package name */
    public int f196426i;

    public RingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f196421d = new android.graphics.Paint();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463111r, i17, 0);
            this.f196422e = obtainStyledAttributes.getColor(0, getResources().getColor(com.tencent.mm.R.color.f478553an));
            this.f196423f = obtainStyledAttributes.getFloat(1, 100.0f);
            this.f196425h = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f196424g = obtainStyledAttributes.getFloat(2, -90.0f);
            this.f196426i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public float getProgress() {
        return this.f196425h;
    }

    public int getRoundWidth() {
        return this.f196426i;
    }

    public float getStartAngle() {
        return this.f196424g;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int i17 = (width - (this.f196426i / 2)) - 1;
        getResources().getColor(com.tencent.mm.R.color.f478542ad);
        this.f196421d.setStrokeWidth(this.f196426i);
        this.f196421d.setColor(this.f196422e);
        this.f196421d.setAlpha(0);
        this.f196421d.setAntiAlias(true);
        this.f196421d.setStyle(android.graphics.Paint.Style.STROKE);
        float f17 = width;
        canvas.drawCircle(f17, f17, i17, this.f196421d);
        this.f196421d.setStrokeWidth(this.f196426i);
        this.f196421d.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f196421d.setColor(this.f196422e);
        float f18 = width - i17;
        float f19 = width + i17;
        canvas.drawArc(new android.graphics.RectF(f18, f18, f19, f19), this.f196424g, (this.f196425h * 360.0f) / this.f196423f, false, this.f196421d);
    }

    public void setProgress(float f17) {
        this.f196425h = java.lang.Math.max(0.0f, f17);
        this.f196425h = java.lang.Math.min(f17, this.f196423f);
        invalidate();
    }

    public void setProgressColor(int i17) {
        this.f196422e = i17;
        invalidate();
    }

    public void setRoundWidth(int i17) {
        if (this.f196426i == i17) {
            return;
        }
        this.f196426i = i17;
        invalidate();
    }

    public void setStartAngle(float f17) {
        this.f196424g = f17;
        invalidate();
    }

    public RingView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context, attributeSet, i17);
    }
}
