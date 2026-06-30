package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class tp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f170542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.up f170543e;

    public tp(com.tencent.mm.plugin.sns.ui.up upVar, android.content.Intent intent) {
        this.f170543e = upVar;
        this.f170542d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2$1");
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        android.content.Intent intent = this.f170542d;
        com.tencent.mm.plugin.sns.ui.up upVar = this.f170543e;
        y7Var.D(intent, upVar.f170592f);
        upVar.f170592f.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2$1");
    }
}
