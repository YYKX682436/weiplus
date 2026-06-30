package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class yc implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI f171627d;

    public yc(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        this.f171627d = snsAdNativeLandingTestUI;
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "onSeek time " + i17);
        double d17 = (double) i17;
        int i18 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.f166766h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = this.f171627d;
        snsAdNativeLandingTestUI.f166769f = d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).b(d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
    }

    @Override // m34.e
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
    }

    @Override // m34.e
    public void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
    }
}
