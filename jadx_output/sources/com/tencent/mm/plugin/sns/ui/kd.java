package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes12.dex */
public class kd implements com.tencent.mm.plugin.sns.ui.ld {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f169622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ld f169623b;

    public kd(com.tencent.mm.plugin.sns.ui.md mdVar, com.tencent.mm.sdk.platformtools.n3 n3Var, com.tencent.mm.plugin.sns.ui.ld ldVar) {
        this.f169622a = n3Var;
        this.f169623b = ldVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.ld
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
        this.f169622a.post(new com.tencent.mm.plugin.sns.ui.id(this, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.ld
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
        this.f169622a.post(new com.tencent.mm.plugin.sns.ui.jd(this, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.ld
    public void c(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
        this.f169622a.post(new com.tencent.mm.plugin.sns.ui.hd(this, str, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
    }
}
