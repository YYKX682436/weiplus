package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.a1 f171660d;

    public z0(com.tencent.mm.plugin.sns.ui.a1 a1Var) {
        this.f171660d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2$1");
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f171660d.f167700g.Y;
        java.util.List list = com.tencent.mm.plugin.sns.ui.l1.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        l1Var.f169705f = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2$1");
    }
}
