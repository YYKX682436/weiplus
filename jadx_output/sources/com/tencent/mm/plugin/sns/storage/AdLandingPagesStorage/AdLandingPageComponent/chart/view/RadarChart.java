package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

/* loaded from: classes13.dex */
public class RadarChart extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.Chart {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f165009d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f165010e;

    /* renamed from: f, reason: collision with root package name */
    public bb4.c f165011f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid f165012g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer[] f165013h;

    /* renamed from: i, reason: collision with root package name */
    public cb4.a f165014i;

    /* renamed from: m, reason: collision with root package name */
    public int f165015m;

    /* renamed from: n, reason: collision with root package name */
    public int f165016n;

    /* renamed from: o, reason: collision with root package name */
    public int f165017o;

    /* renamed from: p, reason: collision with root package name */
    public android.text.Spannable[] f165018p;

    /* renamed from: q, reason: collision with root package name */
    public final float f165019q;

    public RadarChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f165011f = new bb4.c();
        this.f165015m = 3;
        this.f165016n = 0;
        this.f165017o = 4;
        this.f165019q = 1.0f;
        this.f165009d = context;
    }

    public bb4.c getGridStyle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid radarGrid = this.f165012g;
        if (radarGrid == null) {
            bb4.c cVar = this.f165011f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
            return cVar;
        }
        this.f165011f = radarGrid.getGridStyle();
        bb4.c gridStyle = this.f165012g.getGridStyle();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
        return gridStyle;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
        int childCount = getChildCount();
        for (int i28 = 0; i28 < childCount; i28++) {
            getChildAt(i28).layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[LOOP:2: B:16:0x002e->B:23:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setData(bb4.a... r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart.setData(bb4.a[]):void");
    }

    public void setGridStyle(bb4.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
        this.f165011f = cVar;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid radarGrid = this.f165012g;
        if (radarGrid != null) {
            radarGrid.setGridStyle(cVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
    }

    public void setLatitudeNum(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLatitudeNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
        this.f165017o = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLatitudeNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
    }

    public RadarChart(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165011f = new bb4.c();
        this.f165015m = 3;
        this.f165016n = 0;
        this.f165017o = 4;
        this.f165019q = 1.0f;
        this.f165009d = context;
    }
}
