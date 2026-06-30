package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.NewRangeWidget f168491d;

    public h6(com.tencent.mm.plugin.sns.ui.NewRangeWidget newRangeWidget) {
        this.f168491d = newRangeWidget;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewRangeWidget$2");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        java.lang.String str = com.tencent.mm.plugin.sns.ui.NewRangeWidget.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        wa4.x xVar = this.f168491d.f166395s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        s0Var.S(xVar.f444299d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewRangeWidget$2");
    }
}
