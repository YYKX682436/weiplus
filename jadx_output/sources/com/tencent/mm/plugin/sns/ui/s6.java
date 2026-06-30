package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.i6 f170443d;

    public s6(com.tencent.mm.plugin.sns.ui.i6 i6Var) {
        this.f170443d = i6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$8");
        com.tencent.mm.plugin.sns.ui.i6.r(this.f170443d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$8");
    }
}
