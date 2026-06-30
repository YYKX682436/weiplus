package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class eb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.fb f168232d;

    public eb(com.tencent.mm.plugin.sns.ui.fb fbVar) {
        this.f168232d = fbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12$1");
        com.tencent.mm.plugin.sns.ui.fb fbVar = this.f168232d;
        android.content.Context applicationContext = fbVar.f168337a.getApplicationContext();
        if (applicationContext != null) {
            db5.t7.g(applicationContext, "广告无效，已为你关闭");
        }
        fbVar.f168337a.l8();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12$1");
    }
}
