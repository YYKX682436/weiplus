package com.tencent.mm.ui.widget.loading;

/* loaded from: classes5.dex */
public class MMProgressLoading extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f212178d;

    /* renamed from: e, reason: collision with root package name */
    public int f212179e;

    /* renamed from: f, reason: collision with root package name */
    public int f212180f;

    /* renamed from: g, reason: collision with root package name */
    public int f212181g;

    /* renamed from: h, reason: collision with root package name */
    public int f212182h;

    public MMProgressLoading(android.content.Context context) {
        super(context);
        a(context, null, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f212178d = new android.graphics.Paint();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463109p, i17, 0);
            this.f212179e = obtainStyledAttributes.getColor(1, getResources().getColor(com.tencent.mm.R.color.f478553an));
            this.f212180f = obtainStyledAttributes.getInt(0, 100);
            this.f212182h = obtainStyledAttributes.getInt(3, 0);
            this.f212181g = obtainStyledAttributes.getInt(2, -90);
            obtainStyledAttributes.recycle();
        }
    }

    public int getProgress() {
        return this.f212182h;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int width2 = (int) ((getWidth() / 2) * 0.175d);
        int i17 = (width - (width2 / 2)) - 1;
        int color = getResources().getColor(com.tencent.mm.R.color.f478542ad);
        float f17 = width2;
        this.f212178d.setStrokeWidth(f17);
        this.f212178d.setColor(color);
        this.f212178d.setAlpha(127);
        this.f212178d.setAntiAlias(true);
        this.f212178d.setStyle(android.graphics.Paint.Style.STROKE);
        float f18 = width;
        float f19 = i17;
        canvas.drawCircle(f18, f18, f19, this.f212178d);
        this.f212178d.setStrokeWidth(f17);
        this.f212178d.setColor(this.f212179e);
        this.f212178d.setAlpha(51);
        this.f212178d.setAntiAlias(true);
        this.f212178d.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawCircle(f18, f18, f19, this.f212178d);
        this.f212178d.setStrokeWidth(f17);
        this.f212178d.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f212178d.setColor(this.f212179e);
        float f27 = width - i17;
        float f28 = width + i17;
        canvas.drawArc(new android.graphics.RectF(f27, f27, f28, f28), this.f212181g, (this.f212182h * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / this.f212180f, false, this.f212178d);
    }

    public void setProgress(int i17) {
        this.f212182h = java.lang.Math.max(0, i17);
        this.f212182h = java.lang.Math.min(i17, this.f212180f);
        invalidate();
    }

    public MMProgressLoading(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public MMProgressLoading(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context, attributeSet, i17);
    }
}
