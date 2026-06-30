package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class nc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.oc f169988d;

    public nc(com.tencent.mm.plugin.sns.ui.oc ocVar) {
        this.f169988d = ocVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5$1$1");
        this.f169988d.f170094e.f170211a.b8();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5$1$1");
    }
}
