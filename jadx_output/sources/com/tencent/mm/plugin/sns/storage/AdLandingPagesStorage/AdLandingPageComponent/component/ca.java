package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class ca extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {

    /* renamed from: w, reason: collision with root package name */
    public static final int f165125w = android.graphics.Color.parseColor("#26eae9e2");

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart f165126s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Bitmap f165127t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Bitmap f165128u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f165129v;

    public ca(android.content.Context context, ab4.x0 x0Var, android.view.ViewGroup viewGroup) {
        super(context, x0Var, viewGroup);
        this.f165129v = new java.util.concurrent.CountDownLatch(2);
    }

    public static /* synthetic */ java.util.concurrent.CountDownLatch O(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ca caVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        java.util.concurrent.CountDownLatch countDownLatch = caVar.f165129v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        return countDownLatch;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        android.view.ViewGroup.LayoutParams layoutParams = this.f165056n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ab4.d0 d0Var = this.f165050e;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) d0Var.f2821h, (int) d0Var.f2819f, (int) d0Var.f2822i, (int) d0Var.f2820g);
        }
        this.f165056n.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        super.L();
        java.util.concurrent.CountDownLatch countDownLatch = this.f165129v;
        countDownLatch.countDown();
        countDownLatch.countDown();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        this.f165126s = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart) this.f165056n.findViewById(com.tencent.mm.R.id.bfl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z9(this));
        ab4.x0 x0Var = (ab4.x0) y();
        if (x0Var != null) {
            za4.t0.c(x0Var.F, false, x0Var.f2818e, 0, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.aa(this));
            za4.t0.c(x0Var.M, false, x0Var.f2818e, 0, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ba(this));
            G();
        } else {
            android.util.Log.wtf("AdlandingRadarChartComp", "null info");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        return com.tencent.mm.R.layout.cp9;
    }
}
