package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes12.dex */
public class id implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.kd f168607e;

    public id(com.tencent.mm.plugin.sns.ui.kd kdVar, java.lang.String str) {
        this.f168607e = kdVar;
        this.f168606d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$2");
        this.f168607e.f169623b.a(this.f168606d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$2");
    }
}
