package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.i6 f170162d;

    public p6(com.tencent.mm.plugin.sns.ui.i6 i6Var) {
        this.f170162d = i6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$5");
        db5.t7.makeText(this.f170162d.f169957c, com.tencent.mm.R.string.iil, 0).show();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$5");
    }
}
