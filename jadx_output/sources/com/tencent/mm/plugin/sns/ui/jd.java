package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes12.dex */
public class jd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.kd f169508e;

    public jd(com.tencent.mm.plugin.sns.ui.kd kdVar, java.lang.String str) {
        this.f169508e = kdVar;
        this.f169507d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$3");
        this.f169508e.f169623b.b(this.f169507d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$3");
    }
}
