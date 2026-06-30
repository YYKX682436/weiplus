package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

/* loaded from: classes13.dex */
public class RadarGrid extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView {

    /* renamed from: o, reason: collision with root package name */
    public static final android.graphics.Point f165029o = new android.graphics.Point(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public int f165030d;

    /* renamed from: e, reason: collision with root package name */
    public int f165031e;

    /* renamed from: f, reason: collision with root package name */
    public android.text.Spannable[] f165032f;

    /* renamed from: g, reason: collision with root package name */
    public int f165033g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Point f165034h;

    /* renamed from: i, reason: collision with root package name */
    public bb4.c f165035i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f165036m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Path f165037n;

    public RadarGrid(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f165030d = 4;
        this.f165031e = 4;
        this.f165033g = 80;
        this.f165034h = f165029o;
        this.f165037n = new android.graphics.Path();
        new android.graphics.Rect();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        setMinimumHeight(160);
        setMinimumWidth(160);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    private int getGridDotRadius() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f19124p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return i17;
    }

    private android.graphics.Paint getPaintGLabelFont() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f19116h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        bb4.c cVar2 = this.f165035i;
        cVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f19117i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setTextSize(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private android.graphics.Paint getPaintGScaleFont() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaintGScaleFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f19119k;
        if (i17 == -1) {
            i17 = cVar.f19116h;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        bb4.c cVar2 = this.f165035i;
        cVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f19120l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setTextSize(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaintGScaleFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private android.graphics.Paint getPaintGridBorder() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaintGridBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f19111c;
        if (i17 == -1) {
            i17 = cVar.f19112d;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        bb4.c cVar2 = this.f165035i;
        cVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f19115g;
        if (f17 == -1.0f) {
            f17 = cVar2.f19114f;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setStrokeWidth(f17);
        paint.setAntiAlias(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaintGridBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private android.graphics.Paint getPaintGridDot() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaintGridDot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f19123o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaintGridDot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private android.graphics.Paint getPaintGridFill() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaintGridFill", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f19110b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        paint.setAntiAlias(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaintGridFill", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private android.graphics.Paint getPaintGridLatitude() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaintGridLatitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f19112d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        bb4.c cVar2 = this.f165035i;
        cVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f19114f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setStrokeWidth(f17);
        paint.setAntiAlias(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaintGridLatitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private android.graphics.Paint getPaintGridLongitude() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaintGridLongitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.graphics.Paint paint = new android.graphics.Paint();
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f19113e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setColor(i17);
        bb4.c cVar2 = this.f165035i;
        cVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f19114f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        paint.setStrokeWidth(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaintGridLongitude", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return paint;
    }

    private android.text.TextPaint getTextPaintGLabelFont() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        android.text.TextPaint textPaint = new android.text.TextPaint();
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i17 = cVar.f19116h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        textPaint.setColor(i17);
        bb4.c cVar2 = this.f165035i;
        cVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        float f17 = cVar2.f19117i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        textPaint.setTextSize(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextPaintGLabelFont", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return textPaint;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView
    public int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hGetMaximumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        int i17 = this.f165033g * 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hGetMaximumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return i17;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView
    public int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hGetMaximumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        int i17 = this.f165033g * 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hGetMaximumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return i17;
    }

    public java.util.List c(float f17) {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid radarGrid = this;
        java.lang.String str = "getGridPoints";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridPoints", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (i17 < radarGrid.f165030d) {
            android.graphics.PointF pointF = new android.graphics.PointF();
            android.graphics.Point point = radarGrid.f165034h;
            double d17 = i17 * 2 * 3.141592653589793d;
            pointF.set((float) (point.x - ((radarGrid.f165033g * f17) * java.lang.Math.sin(d17 / radarGrid.f165030d))), (float) (point.y - ((radarGrid.f165033g * f17) * java.lang.Math.cos(d17 / radarGrid.f165030d))));
            arrayList.add(pointF);
            i17++;
            radarGrid = this;
            str = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return arrayList;
    }

    public bb4.c getGridStyle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        return cVar;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3 = "onDraw";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        this.f165033g = (int) ((java.lang.Math.min(height, width) / 2.0f) * 0.8d);
        this.f165034h.set((int) (width / 2.0f), (int) (height / 2.0f));
        if (this.f165035i.a() != null) {
            float f17 = this.f165033g * 2;
            bb4.c cVar = this.f165035i;
            cVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            float f18 = cVar.f19122n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            int i18 = (int) (f17 + (f18 * 2.0f));
            int width2 = (this.f165035i.a().getWidth() * i18) / this.f165035i.a().getHeight();
            if (this.f165035i.a() != null) {
                canvas.drawBitmap(android.graphics.Bitmap.createScaledBitmap(this.f165035i.a(), width2, i18, false), r2 - (width2 >>> 1), r1 - (i18 >>> 1), (android.graphics.Paint) null);
            }
        }
        this.f165035i.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        bb4.c cVar2 = this.f165035i;
        cVar2.getClass();
        java.lang.String str5 = "getGridChartType";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i19 = cVar2.f19109a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        android.graphics.Path path = this.f165037n;
        float f19 = 1.0f;
        if (i19 == 0) {
            this.f165036m = c(1.0f);
            for (int i27 = 0; i27 < this.f165030d; i27++) {
                android.graphics.PointF pointF = (android.graphics.PointF) ((java.util.ArrayList) this.f165036m).get(i27);
                if (i27 == 0) {
                    path.moveTo(pointF.x, pointF.y);
                } else {
                    path.lineTo(pointF.x, pointF.y);
                }
            }
            path.close();
            bb4.c cVar3 = this.f165035i;
            cVar3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            int i28 = cVar3.f19110b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            if (i28 != 0 && this.f165035i.a() == null) {
                canvas.drawPath(path, getPaintGridFill());
            }
        } else if (i19 == 1) {
            canvas.drawCircle(r10.x, r10.y, this.f165033g, getPaintGridFill());
        }
        this.f165035i.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLonAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLonAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        this.f165036m = c(1.0f);
        int i29 = 0;
        while (i29 < this.f165030d) {
            android.graphics.PointF pointF2 = (android.graphics.PointF) ((java.util.ArrayList) this.f165036m).get(i29);
            canvas.drawLine(r10.x, r10.y, pointF2.x, pointF2.y, getPaintGridLongitude());
            i29++;
            path = path;
            str5 = str5;
            f19 = 1.0f;
        }
        float f27 = f19;
        android.graphics.Path path2 = path;
        java.lang.String str6 = str5;
        this.f165035i.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLatAxis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        bb4.c cVar4 = this.f165035i;
        cVar4.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str6, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        int i37 = cVar4.f19109a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        if (i37 == 0) {
            canvas.drawPath(path2, getPaintGridBorder());
            path2.reset();
            int i38 = 1;
            while (true) {
                int i39 = this.f165031e;
                if (i38 >= i39) {
                    break;
                }
                this.f165036m = c((i38 * f27) / i39);
                for (int i47 = 0; i47 < this.f165030d; i47++) {
                    android.graphics.PointF pointF3 = (android.graphics.PointF) ((java.util.ArrayList) this.f165036m).get(i47);
                    if (i47 == 0) {
                        path2.moveTo(pointF3.x, pointF3.y);
                    } else {
                        path2.lineTo(pointF3.x, pointF3.y);
                    }
                    canvas.drawCircle(pointF3.x, pointF3.y, getGridDotRadius(), getPaintGridDot());
                }
                path2.close();
                canvas.drawPath(path2, getPaintGridLatitude());
                path2.reset();
                i38++;
            }
        } else if (i37 == 1) {
            canvas.drawCircle(r10.x, r10.y, this.f165033g, getPaintGridBorder());
            int i48 = 1;
            while (true) {
                int i49 = this.f165031e;
                if (i48 >= i49) {
                    break;
                }
                canvas.drawCircle(r10.x, r10.y, this.f165033g * ((i48 * f27) / i49), getPaintGridLatitude());
                i48++;
            }
        }
        if (this.f165032f != null) {
            this.f165035i.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLabels", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLabels", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            if (this.f165032f.length != this.f165030d) {
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Labels array length not matches longitude lines number.");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
                throw runtimeException;
            }
            int i57 = 0;
            while (i57 < this.f165030d) {
                android.text.Spannable spannable = this.f165032f[i57];
                if (spannable.equals(null)) {
                    str = str3;
                    str2 = str4;
                } else {
                    float f28 = 0.0f;
                    float f29 = (i57 == 0 || i57 == (i17 = this.f165030d >>> 1)) ? 0.5f : (i57 <= 0 || i57 >= i17) ? f27 : 0.0f;
                    if (i57 == 0) {
                        f28 = this.f165035i.b();
                    } else if (i57 == (this.f165030d >>> 1)) {
                        f28 = -this.f165035i.b();
                    }
                    android.text.StaticLayout staticLayout = new android.text.StaticLayout(spannable, getTextPaintGLabelFont(), 1000, android.text.Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, false);
                    double d17 = i57 * 2 * 3.141592653589793d;
                    str = str3;
                    str2 = str4;
                    float lineWidth = (float) ((r10.x - (staticLayout.getLineWidth(0) * f29)) - ((this.f165033g + this.f165035i.b()) * java.lang.Math.sin(6.283185307179586d - (d17 / this.f165030d))));
                    float height2 = (float) (((r10.y - (staticLayout.getHeight() / 2)) - ((this.f165033g + this.f165035i.b()) * java.lang.Math.cos(6.283185307179586d - (d17 / this.f165030d)))) - f28);
                    canvas.save();
                    canvas.translate(lineWidth, height2);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                i57++;
                str3 = str;
                str4 = str2;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(nd1.s0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(nd1.s0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19110b = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(nd1.s0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(nd1.s0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridBorderColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19111c = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridBorderStrokeWidth(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19115g = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridChartType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19109a = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridLabelColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19116h = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridLabelPadding(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19118j = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridLabelSize(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19117i = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridLatitudeColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19112d = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridLongitudeColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19113e = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridScaleColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19119k = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridScaleColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridScaleLabelPadding(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f165035i.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridScaleLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridScaleSize(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19120l = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridScaleSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridStrokeWidth(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        bb4.c cVar = this.f165035i;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        cVar.f19114f = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setGridStyle(bb4.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f165035i = cVar;
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setLabelsArray(android.text.Spannable[] spannableArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLabelsArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f165032f = spannableArr;
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelsArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setLatNum(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLatNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f165031e = i17;
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLatNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setLonNum(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLonNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        this.f165030d = i17;
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLonNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public void setMaxValue(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaxValue", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaxValue", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public RadarGrid(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165030d = 4;
        this.f165031e = 4;
        this.f165033g = 80;
        this.f165034h = f165029o;
        this.f165037n = new android.graphics.Path();
        new android.graphics.Rect();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
        setMinimumHeight(160);
        setMinimumWidth(160);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid");
    }

    public RadarGrid(android.content.Context context, int i17, int i18, float f17, android.text.Spannable[] spannableArr, bb4.c cVar) {
        super(context);
        this.f165030d = 4;
        this.f165031e = 4;
        this.f165033g = 80;
        this.f165034h = f165029o;
        this.f165037n = new android.graphics.Path();
        new android.graphics.Rect();
        this.f165030d = i17;
        this.f165031e = i18;
        this.f165032f = spannableArr;
        this.f165035i = cVar;
    }
}
