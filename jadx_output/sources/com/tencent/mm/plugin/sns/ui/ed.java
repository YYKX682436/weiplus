package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class ed implements com.tencent.mm.plugin.sns.ui.ld {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI f168234a;

    public ed(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        this.f168234a = snsAdNativeLandingTestUI;
    }

    @Override // com.tencent.mm.plugin.sns.ui.ld
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
    }

    @Override // com.tencent.mm.plugin.sns.ui.ld
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(this.f168234a).setThumb(com.tencent.mm.sdk.platformtools.x.J(str, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
    }

    @Override // com.tencent.mm.plugin.sns.ui.ld
    public void c(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
    }
}
