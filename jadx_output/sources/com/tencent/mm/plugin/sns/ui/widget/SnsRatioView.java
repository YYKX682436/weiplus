package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsRatioView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f170905d;

    /* renamed from: e, reason: collision with root package name */
    public int f170906e;

    /* renamed from: f, reason: collision with root package name */
    public int f170907f;

    /* renamed from: g, reason: collision with root package name */
    public int f170908g;

    /* renamed from: h, reason: collision with root package name */
    public int f170909h;

    /* renamed from: i, reason: collision with root package name */
    public int f170910i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Path f170911m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Path f170912n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f170913o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f170914p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f170915q;

    public SnsRatioView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170908g = 70;
        this.f170909h = 10;
        this.f170910i = 0;
        this.f170911m = new android.graphics.Path();
        this.f170912n = new android.graphics.Path();
        this.f170913o = new android.graphics.Paint();
        this.f170914p = new android.graphics.Paint();
        this.f170915q = new float[8];
    }

    public void a(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRatio", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
        this.f170905d = i17;
        this.f170906e = i18;
        int max = java.lang.Math.max(0, i17);
        this.f170905d = max;
        this.f170905d = java.lang.Math.min(100, max);
        int max2 = java.lang.Math.max(0, this.f170906e);
        this.f170906e = max2;
        int min = java.lang.Math.min(100, max2);
        this.f170906e = min;
        int i19 = this.f170905d;
        if (min + i19 != 100) {
            this.f170906e = 100 - i19;
        }
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRatio", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
        int width = getWidth();
        int height = getHeight();
        int tan = (int) (height / java.lang.Math.tan(java.lang.Math.toRadians(this.f170908g)));
        int max = java.lang.Math.max((int) ((((((width - tan) - this.f170909h) - (this.f170907f * 2)) * this.f170905d) * 1.0f) / 100.0f), this.f170910i);
        android.graphics.Path path = this.f170911m;
        path.reset();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(tan + max, 0.0f);
        float f17 = height;
        path.lineTo(max, f17);
        path.lineTo(0.0f, f17);
        path.close();
        android.graphics.Path path2 = this.f170912n;
        path2.reset();
        path2.moveTo(r4 + this.f170909h, 0.0f);
        float f18 = width;
        path2.lineTo(f18, 0.0f);
        path2.lineTo(f18, f17);
        path2.lineTo(max + this.f170909h, f17);
        path2.close();
        android.graphics.Path path3 = new android.graphics.Path();
        path3.addRoundRect(new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f170915q, android.graphics.Path.Direction.CW);
        canvas.clipPath(path3);
        canvas.drawPath(path, this.f170913o);
        canvas.drawPath(path2, this.f170914p);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            invalidate();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
    }
}
