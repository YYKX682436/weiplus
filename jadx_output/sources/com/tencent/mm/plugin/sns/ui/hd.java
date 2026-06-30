package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes12.dex */
public class hd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f168497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.kd f168498f;

    public hd(com.tencent.mm.plugin.sns.ui.kd kdVar, java.lang.String str, int i17) {
        this.f168498f = kdVar;
        this.f168496d = str;
        this.f168497e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$1");
        this.f168498f.f169623b.c(this.f168496d, this.f168497e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$1");
    }
}
