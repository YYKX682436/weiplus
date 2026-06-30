package com.tencent.mm.plugin.sns.ad.widget.twistad;

/* loaded from: classes4.dex */
public class TwistDegreeView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.RectF f163936d;

    /* renamed from: e, reason: collision with root package name */
    public int f163937e;

    /* renamed from: f, reason: collision with root package name */
    public int f163938f;

    /* renamed from: g, reason: collision with root package name */
    public int f163939g;

    /* renamed from: h, reason: collision with root package name */
    public int f163940h;

    /* renamed from: i, reason: collision with root package name */
    public int f163941i;

    /* renamed from: m, reason: collision with root package name */
    public int f163942m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f163943n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Paint f163944o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Paint f163945p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Paint f163946q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f163947r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f163948s;

    /* renamed from: t, reason: collision with root package name */
    public float f163949t;

    /* renamed from: u, reason: collision with root package name */
    public int f163950u;

    public TwistDegreeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163949t = 0.9f;
        this.f163950u = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        setLayerType(1, null);
        this.f163937e = i65.a.b(context, 50);
        this.f163938f = i65.a.b(context, 7);
        this.f163939g = i65.a.b(context, 7);
        this.f163940h = i65.a.b(context, 14);
        i65.a.b(context, 4);
        i65.a.b(context, 3);
        this.f163942m = i65.a.b(context, 1);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f163943n = paint;
        paint.setColor(android.graphics.Color.parseColor("#99FFFFFF"));
        this.f163943n.setAntiAlias(true);
        this.f163943n.setDither(true);
        this.f163943n.setStyle(android.graphics.Paint.Style.STROKE);
        this.f163943n.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f163943n.setStrokeWidth(this.f163938f);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f163947r = paint2;
        paint2.setColor(android.graphics.Color.parseColor("#99FFFFFF"));
        this.f163947r.setAntiAlias(true);
        this.f163947r.setDither(true);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f163944o = paint3;
        paint3.setColor(android.graphics.Color.parseColor("#4DFFFFFF"));
        this.f163944o.setAntiAlias(true);
        this.f163944o.setDither(true);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f163945p = paint4;
        paint4.setColor(android.graphics.Color.parseColor("#FFFFFF"));
        this.f163945p.setAntiAlias(true);
        this.f163945p.setDither(true);
        this.f163945p.setStyle(android.graphics.Paint.Style.STROKE);
        this.f163945p.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f163945p.setStrokeWidth(this.f163939g);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.f163948s = paint5;
        paint5.setColor(android.graphics.Color.parseColor("#FFFFFF"));
        this.f163948s.setAntiAlias(true);
        this.f163948s.setDither(true);
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.f163946q = paint6;
        paint6.setColor(android.graphics.Color.parseColor("#CCFFFFFF"));
        this.f163946q.setAntiAlias(true);
        this.f163946q.setDither(true);
        float f17 = this.f163938f / 2;
        float f18 = (this.f163937e * 2) - f17;
        this.f163936d = new android.graphics.RectF(f17, f17, f18, f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    public void a(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        android.graphics.Point point;
        android.graphics.Point point2;
        android.graphics.Point point3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        double radians = java.lang.Math.toRadians(45.0d);
        if (this.f163950u == 0) {
            radians = java.lang.Math.toRadians(135.0d);
        }
        int cos = (int) (this.f163937e + ((r5 - (this.f163938f / 2)) * java.lang.Math.cos(radians)));
        int sin = (int) (this.f163937e - ((r6 - (this.f163938f / 2)) * java.lang.Math.sin(radians)));
        int i17 = this.f163940h / 2;
        if (this.f163950u == 0) {
            int i18 = cos - i17;
            int i19 = sin + i17;
            point = new android.graphics.Point(i18, i19);
            point2 = new android.graphics.Point(cos + i17, i19);
            point3 = new android.graphics.Point(i18, sin - i17);
        } else {
            int i27 = sin + i17;
            point = new android.graphics.Point(cos - i17, i27);
            int i28 = cos + i17;
            point2 = new android.graphics.Point(i28, i27);
            point3 = new android.graphics.Point(i28, sin - i17);
        }
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        path.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        canvas.drawPath(path, paint);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawTriangle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        if (this.f163936d != null) {
            canvas.save();
            canvas.translate(-this.f163941i, this.f163942m);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawOutArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            canvas.drawArc(this.f163936d, 225.0f, 90.0f, false, this.f163943n);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawOutArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            a(canvas, this.f163947r);
            float f17 = this.f163949t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawInnerArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            if (this.f163950u == 0) {
                canvas.drawArc(this.f163936d, 315.0f - f17, f17, false, this.f163945p);
            } else {
                canvas.drawArc(this.f163936d, 225.0f, f17, false, this.f163945p);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawInnerArc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            if (this.f163949t >= 86.4f) {
                a(canvas, this.f163948s);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
            canvas.restore();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        double radians = java.lang.Math.toRadians(45.0d);
        int cos = (int) (this.f163937e * 2 * java.lang.Math.cos(radians));
        int i19 = this.f163937e;
        int sin = (int) (i19 - (i19 * java.lang.Math.sin(radians)));
        int i27 = this.f163937e;
        double cos2 = i27 - (i27 * java.lang.Math.cos(radians));
        int i28 = this.f163938f;
        this.f163941i = (int) (cos2 - (i28 / 2));
        setMeasuredDimension(cos + i28, sin + i28 + (this.f163942m * 2));
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    public void setProgress(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        if (f17 <= 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        float f18 = f17 * 90.0f;
        this.f163949t = f18;
        if (f18 < 0.9f) {
            this.f163949t = 0.9f;
        }
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }

    public void setShowMode(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowMode", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        this.f163950u = i17;
        postInvalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowMode", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
    }
}
