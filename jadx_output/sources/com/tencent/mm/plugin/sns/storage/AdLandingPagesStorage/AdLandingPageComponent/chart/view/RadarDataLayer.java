package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

/* loaded from: classes13.dex */
public class RadarDataLayer extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView {

    /* renamed from: o, reason: collision with root package name */
    public static final android.graphics.Point f165020o = new android.graphics.Point(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public bb4.a f165021d;

    /* renamed from: e, reason: collision with root package name */
    public bb4.b f165022e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f165023f;

    /* renamed from: g, reason: collision with root package name */
    public final int f165024g;

    /* renamed from: h, reason: collision with root package name */
    public int f165025h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Point f165026i;

    /* renamed from: m, reason: collision with root package name */
    public float f165027m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Path f165028n;

    public RadarDataLayer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f165022e = new bb4.b();
        this.f165023f = true;
        this.f165024g = 4;
        this.f165025h = 80;
        this.f165026i = f165020o;
        this.f165027m = 1.0f;
        this.f165028n = new android.graphics.Path();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        setMinimumHeight(160);
        setMinimumWidth(160);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    private android.graphics.Paint getPaintLayerBorder() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaintLayerBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.b bVar = this.f165022e;
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayerBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        int i17 = bVar.f19103a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayerBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        bb4.b bVar2 = this.f165022e;
        bVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayerBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        float f17 = bVar2.f19104b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayerBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setStrokeWidth(f17);
        paint.setAntiAlias(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaintLayerBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return paint;
    }

    private android.graphics.Paint getPaintLayerDotPoint() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaintLayerDotPoint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.b bVar = this.f165022e;
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayerDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        int i17 = bVar.f19107e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayerDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setColor(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaintLayerDotPoint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return paint;
    }

    private android.graphics.Paint getPaintLayerFilling() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaintLayerFilling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.b bVar = this.f165022e;
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayerFillColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        int i17 = bVar.f19105c;
        if (i17 == -1) {
            i17 = bVar.f19103a;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayerFillColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
        bb4.b bVar2 = this.f165022e;
        bVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayerFillAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        int i18 = bVar2.f19106d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayerFillAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setAlpha(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaintLayerFilling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return paint;
    }

    private android.graphics.Paint getPaintLayerPoint() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaintLayerPoint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.b bVar = this.f165022e;
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayerBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        int i17 = bVar.f19103a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayerBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setColor(i17);
        bb4.b bVar2 = this.f165022e;
        bVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayerBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        float f17 = bVar2.f19104b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayerBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
        paint.setStrokeWidth(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaintLayerPoint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return paint;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView
    public int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hGetMaximumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        int i17 = this.f165025h * 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hGetMaximumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return i17;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView
    public int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hGetMaximumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        int i17 = this.f165025h * 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hGetMaximumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        return i17;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.lang.String str = "onDraw";
        java.lang.String str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        this.f165025h = (int) ((java.lang.Math.min(height, width) / 2.0f) * 0.8d);
        android.graphics.Point point = this.f165026i;
        point.set((int) (width / 2.0f), (int) (height / 2.0f));
        bb4.a aVar = this.f165021d;
        if (aVar == null) {
            java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Error: NullPointerException at data.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
            throw runtimeException;
        }
        java.util.Iterator it = aVar.entrySet().iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            android.graphics.Path path = this.f165028n;
            if (!hasNext) {
                path.close();
                canvas.drawPath(path, getPaintLayerFilling());
                canvas.drawPath(path, getPaintLayerBorder());
                path.reset();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str3 = str;
            java.lang.String str4 = str2;
            double d17 = 6.283185307179586d - (((i17 * 2) * 3.141592653589793d) / this.f165024g);
            float floatValue = (float) (point.x - (((((java.lang.Float) entry.getValue()).floatValue() / this.f165027m) * this.f165025h) * java.lang.Math.sin(d17)));
            float floatValue2 = (float) (point.y - (((((java.lang.Float) entry.getValue()).floatValue() / this.f165027m) * this.f165025h) * java.lang.Math.cos(d17)));
            if (i17 == 0) {
                path.moveTo(floatValue, floatValue2);
            } else {
                path.lineTo(floatValue, floatValue2);
            }
            if (this.f165023f) {
                bb4.b bVar = this.f165022e;
                bVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayerDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                int i18 = bVar.f19108f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayerDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                canvas.drawCircle(floatValue, floatValue2, i18, getPaintLayerDotPoint());
            }
            i17++;
            str = str3;
            str2 = str4;
        }
    }

    public void setData(bb4.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        this.f165021d = aVar;
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    public void setGlobalMax(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGlobalMax", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        this.f165027m = f17;
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGlobalMax", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    public void setLayerStyle(bb4.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayerStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        this.f165022e = bVar;
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayerStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    public void setMaxValue(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaxValue", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        this.f165027m = f17;
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaxValue", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    public RadarDataLayer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165022e = new bb4.b();
        this.f165023f = true;
        this.f165024g = 4;
        this.f165025h = 80;
        this.f165026i = f165020o;
        this.f165027m = 1.0f;
        this.f165028n = new android.graphics.Path();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        setMinimumHeight(160);
        setMinimumWidth(160);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }

    public RadarDataLayer(android.content.Context context, float f17, bb4.a aVar) {
        super(context);
        this.f165022e = new bb4.b();
        this.f165023f = true;
        this.f165024g = 4;
        this.f165025h = 80;
        this.f165026i = f165020o;
        this.f165027m = 1.0f;
        this.f165028n = new android.graphics.Path();
        this.f165027m = f17;
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayerStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayerStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        this.f165022e = aVar.f19102d;
        this.f165024g = aVar.size();
        this.f165021d = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInterpolator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInterpolator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animateLayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateLayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer");
    }
}
