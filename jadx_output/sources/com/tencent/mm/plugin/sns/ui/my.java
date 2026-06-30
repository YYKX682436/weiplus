package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class my implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f169951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ny f169952e;

    public my(com.tencent.mm.plugin.sns.ui.ny nyVar, android.content.Intent intent) {
        this.f169952e = nyVar;
        this.f169951d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$4$1");
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(this.f169951d, this.f169952e.f170059d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$4$1");
    }
}
