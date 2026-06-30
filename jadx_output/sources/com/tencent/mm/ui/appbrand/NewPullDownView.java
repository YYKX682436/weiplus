package com.tencent.mm.ui.appbrand;

/* loaded from: classes4.dex */
public class NewPullDownView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public float f197185d;

    /* renamed from: e, reason: collision with root package name */
    public float f197186e;

    /* renamed from: f, reason: collision with root package name */
    public float f197187f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f197188g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f197189h;

    public NewPullDownView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197185d = 0.0f;
        this.f197186e = getResources().getDisplayMetrics().density * 20.0f;
        this.f197187f = (getResources().getDisplayMetrics().density * 14.0f) - (getResources().getDisplayMetrics().density * 4.0f);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f197188g = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f197188g.setColor(-4408132);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f197189h = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f197189h.setColor(0);
        this.f197189h.setStrokeWidth(getResources().getDisplayMetrics().density * 4.0f);
        this.f197189h.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2;
        float measuredHeight = getMeasuredHeight() / 2;
        canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        canvas.drawCircle(measuredWidth, measuredHeight, (this.f197185d * this.f197186e) / 2.0f, this.f197188g);
        float f17 = this.f197185d;
        if (f17 >= 0.4f) {
            canvas.drawCircle(measuredWidth, measuredHeight, (((f17 - 0.4f) / 0.6f) * this.f197187f) / 2.0f, this.f197189h);
        }
        canvas.restore();
    }

    public void setVerticalScrollPercent(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PullDownView", "[setVerticalScrollPercent] percent:%s", java.lang.Float.valueOf(f17));
        this.f197185d = java.lang.Math.max(0.0f, java.lang.Math.min(f17, 1.0f));
        postInvalidate();
    }
}
