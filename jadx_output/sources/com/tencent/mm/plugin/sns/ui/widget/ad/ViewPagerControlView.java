package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes4.dex */
public class ViewPagerControlView extends android.widget.LinearLayout {
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f170952d;

    /* renamed from: e, reason: collision with root package name */
    public int f170953e;

    /* renamed from: f, reason: collision with root package name */
    public int f170954f;

    /* renamed from: g, reason: collision with root package name */
    public float f170955g;

    /* renamed from: h, reason: collision with root package name */
    public float f170956h;

    /* renamed from: i, reason: collision with root package name */
    public float f170957i;

    /* renamed from: m, reason: collision with root package name */
    public float f170958m;

    /* renamed from: n, reason: collision with root package name */
    public float f170959n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Paint f170960o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Paint f170961p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Paint f170962q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f170963r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f170964s;

    /* renamed from: t, reason: collision with root package name */
    public int f170965t;

    /* renamed from: u, reason: collision with root package name */
    public float f170966u;

    /* renamed from: v, reason: collision with root package name */
    public int f170967v;

    /* renamed from: w, reason: collision with root package name */
    public float f170968w;

    /* renamed from: x, reason: collision with root package name */
    public float f170969x;

    /* renamed from: y, reason: collision with root package name */
    public float f170970y;

    /* renamed from: z, reason: collision with root package name */
    public float f170971z;

    public ViewPagerControlView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawGrayPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        canvas.drawCircle(this.f170969x, this.f170970y, this.f170958m, this.f170962q);
        canvas.drawCircle(this.f170969x, this.f170970y, this.f170958m, this.f170961p);
        float f17 = this.f170968w + (this.f170957i * 2.0f);
        this.f170968w = f17;
        this.f170969x = f17 + this.f170958m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawGrayPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
    }

    public final void b(android.graphics.Canvas canvas, boolean z17) {
        float f17;
        float f18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawRoundRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        if (z17) {
            float f19 = this.f170956h;
            float f27 = this.f170966u;
            f18 = f19 - (this.f170959n * f27);
            f17 = f27 <= 0.3f ? 1.0f - ((f27 * 10.0f) / 3.0f) : 0.0f;
        } else {
            float f28 = this.f170966u;
            float f29 = (this.f170959n * f28) + this.f170957i;
            f17 = f28 >= 0.7f ? ((f28 - 0.7f) * 10.0f) / 3.0f : 0.0f;
            f18 = f29;
        }
        int i17 = (int) (f17 * 255.0f);
        float f37 = this.f170968w + f18;
        android.graphics.RectF rectF = new android.graphics.RectF(this.f170968w, 0.0f, f37, this.f170957i);
        float f38 = this.f170958m;
        canvas.drawRoundRect(rectF, f38, f38, this.f170960o);
        if (z17) {
            this.f170964s.setAlpha(i17);
            float f39 = this.f170969x;
            float f47 = this.f170958m;
            canvas.drawLine(f39, f47, f39 + ((f18 - (2.0f * f47)) * this.f170971z), f47, this.f170964s);
        } else if (this.A) {
            this.f170963r.setAlpha(i17);
            canvas.drawCircle(this.f170969x, this.f170970y, this.f170958m, this.f170963r);
        } else {
            this.f170964s.setAlpha(i17);
            float f48 = this.f170969x;
            float f49 = this.f170958m;
            canvas.drawLine(f48, f49, f48 + ((f18 - (2.0f * f49)) * this.f170971z), f49, this.f170964s);
        }
        float f57 = this.f170958m;
        canvas.drawRoundRect(rectF, f57, f57, this.f170961p);
        float f58 = f37 + this.f170957i;
        this.f170968w = f58;
        this.f170969x = f58 + this.f170958m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawRoundRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        super.onDraw(canvas);
        float f17 = this.f170955g;
        this.f170968w = f17;
        float f18 = this.f170958m;
        this.f170969x = f17 + f18;
        this.f170970y = f18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollingAnimation", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        int i17 = this.f170967v;
        if (i17 == 1 || i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            b(canvas, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawMiddlePoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            for (int i18 = 2; i18 <= this.f170953e - 1; i18++) {
                a(canvas);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawMiddlePoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            b(canvas, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawfrontPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            for (int i19 = 1; i19 < this.f170965t; i19++) {
                a(canvas);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawfrontPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            b(canvas, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawPreRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            b(canvas, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawPostRect", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawPostPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            for (int i27 = this.f170965t + 2; i27 <= this.f170953e; i27++) {
                a(canvas);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawPostPoints", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollingAnimation", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
    }

    public ViewPagerControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.A = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        this.f170952d = context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        this.f170954f = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(this.f170952d)[0];
        this.f170956h = i65.a.b(this.f170952d, 28);
        float b17 = i65.a.b(this.f170952d, 7);
        this.f170957i = b17;
        this.f170958m = b17 / 2.0f;
        this.f170959n = this.f170956h - b17;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f170960o = paint;
        paint.setFlags(1);
        this.f170960o.setColor(this.f170952d.getResources().getColor(com.tencent.mm.R.color.f479507a51));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f170961p = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f170961p.setStrokeWidth(0.5f);
        this.f170961p.setFlags(1);
        this.f170961p.setColor(this.f170952d.getResources().getColor(com.tencent.mm.R.color.f479506a50));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f170962q = paint3;
        paint3.setFlags(1);
        this.f170962q.setColor(this.f170952d.getResources().getColor(com.tencent.mm.R.color.f479507a51));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f170963r = paint4;
        paint4.setFlags(1);
        this.f170963r.setColor(-1);
        this.f170963r.setAlpha(0);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.f170964s = paint5;
        paint5.setFlags(1);
        this.f170964s.setColor(-1);
        this.f170964s.setAlpha(0);
        this.f170964s.setStyle(android.graphics.Paint.Style.STROKE);
        this.f170964s.setStrokeWidth(this.f170957i);
        this.f170964s.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        setWillNotDraw(false);
    }
}
