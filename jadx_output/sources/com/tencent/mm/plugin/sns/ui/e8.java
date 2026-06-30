package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.RangeWidget f168226d;

    public e8(com.tencent.mm.plugin.sns.ui.RangeWidget rangeWidget) {
        this.f168226d = rangeWidget;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.RangeWidget$3");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        int i17 = com.tencent.mm.plugin.sns.ui.RangeWidget.f166598x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        wa4.x xVar = this.f168226d.f166609r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        s0Var.S(xVar.f444299d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.RangeWidget$3");
    }
}
