package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class op implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pp f170116d;

    public op(com.tencent.mm.plugin.sns.ui.pp ppVar) {
        this.f170116d = ppVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12$1");
        com.tencent.mm.plugin.sns.ui.pp ppVar = this.f170116d;
        ppVar.f170252a.finish();
        ppVar.f170252a.overridePendingTransition(0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12$1");
    }
}
