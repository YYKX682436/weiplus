package com.tencent.mm.plugin.taskbar.api;

/* loaded from: classes3.dex */
public class GyroView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public float f172481d;

    /* renamed from: e, reason: collision with root package name */
    public float f172482e;

    /* renamed from: f, reason: collision with root package name */
    public float f172483f;

    /* renamed from: g, reason: collision with root package name */
    public float f172484g;

    /* renamed from: h, reason: collision with root package name */
    public float f172485h;

    /* renamed from: i, reason: collision with root package name */
    public float f172486i;

    /* renamed from: m, reason: collision with root package name */
    public float f172487m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f172488n;

    public GyroView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172481d = 0.0f;
        this.f172482e = 0.0f;
        this.f172484g = getResources().getDisplayMetrics().density * 40.0f;
        this.f172483f = getResources().getDisplayMetrics().density * 100.0f;
        this.f172485h = getResources().getDisplayMetrics().density * 20.0f;
        this.f172486i = getResources().getDisplayMetrics().density * 10.0f;
        this.f172487m = getResources().getDisplayMetrics().density * 6.0f;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f172488n = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f172488n.setColor(-9934744);
    }

    public void a(float f17, int i17) {
        float f18 = this.f172484g;
        this.f172482e = java.lang.Math.max(0.0f, java.lang.Math.min((f17 - f18) / (i17 - f18), 1.0f));
        this.f172481d = java.lang.Math.max(0.0f, java.lang.Math.min(f17 / this.f172484g, 1.0f));
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f17 = this.f172482e;
        if (f17 <= 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, (this.f172481d * this.f172486i) / 2.0f, this.f172488n);
            return;
        }
        float f18 = this.f172486i;
        canvas.drawCircle(measuredWidth, measuredHeight, (f18 / 2.0f) - ((f17 * (f18 - this.f172487m)) / 2.0f), this.f172488n);
        canvas.drawCircle(measuredWidth - (this.f172482e * this.f172485h), measuredHeight, this.f172487m / 2.0f, this.f172488n);
        canvas.drawCircle(measuredWidth + (this.f172482e * this.f172485h), measuredHeight, this.f172487m / 2.0f, this.f172488n);
    }

    public void setVerticalScroll(float f17) {
        float f18 = this.f172484g;
        this.f172482e = java.lang.Math.max(0.0f, java.lang.Math.min((f17 - f18) / (this.f172483f - f18), 1.0f));
        this.f172481d = java.lang.Math.max(0.0f, java.lang.Math.min(f17 / this.f172484g, 1.0f));
        postInvalidate();
    }
}
