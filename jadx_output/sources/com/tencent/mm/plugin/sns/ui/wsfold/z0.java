package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class z0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.f1 f171461a;

    public z0(com.tencent.mm.plugin.sns.ui.wsfold.f1 f1Var) {
        this.f171461a = f1Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$onCreate$2");
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDataUIC", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
            com.tencent.mm.plugin.sns.ui.wsfold.w U6 = this.f171461a.U6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDataUIC", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
            U6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markLoadingShowTime", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
            ym3.f fVar = U6.T6().f152057d;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLoadingShowTimeMs", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
            ((com.tencent.mm.plugin.sns.ui.wsfold.m0) fVar).f171405e = currentTimeMillis;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLoadingShowTimeMs", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markLoadingShowTime", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$onCreate$2");
    }
}
