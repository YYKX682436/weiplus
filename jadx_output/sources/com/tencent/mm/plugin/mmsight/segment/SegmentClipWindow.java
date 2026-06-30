package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes3.dex */
public class SegmentClipWindow extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f148932d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f148933e;

    /* renamed from: f, reason: collision with root package name */
    public int f148934f;

    /* renamed from: g, reason: collision with root package name */
    public float f148935g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f148936h;

    /* renamed from: i, reason: collision with root package name */
    public int f148937i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f148938m;

    public SegmentClipWindow(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getBorderWidth() {
        return this.f148934f;
    }

    public int getWindowHeight() {
        return getHeight();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17 = this.f148937i;
        int i18 = this.f148932d + i17;
        if (i17 > 0 || i18 > 0) {
            if (i17 > 0) {
                canvas.drawRect(0.0f, 0.0f, i17, getWindowHeight(), this.f148936h);
            }
            if (i18 < getWidth()) {
                canvas.drawRect(i18, 0.0f, getWidth(), getWindowHeight(), this.f148936h);
            }
            android.graphics.RectF rectF = this.f148938m;
            rectF.set(i17, this.f148935g, i18, getWindowHeight() - this.f148935g);
            canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f148933e);
            getWindowHeight();
        }
    }

    public SegmentClipWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f148937i = 0;
        this.f148938m = new android.graphics.RectF();
        postInvalidate();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f148936h = paint;
        paint.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478492d));
        this.f148936h.setAlpha(102);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f148933e = paint2;
        paint2.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478502m));
        this.f148933e.setStyle(android.graphics.Paint.Style.STROKE);
        int round = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 2.0f, getContext().getResources().getDisplayMetrics()));
        this.f148934f = round;
        this.f148933e.setStrokeWidth(round);
        this.f148935g = this.f148934f * 0.5f;
    }
}
