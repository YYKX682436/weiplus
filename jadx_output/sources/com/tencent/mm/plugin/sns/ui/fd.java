package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class fd implements com.tencent.mm.plugin.sns.ui.ld {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI f168339a;

    public fd(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        this.f168339a = snsAdNativeLandingTestUI;
    }

    @Override // com.tencent.mm.plugin.sns.ui.ld
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
        com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SnsAdNativieLandingTestUI", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
    }

    @Override // com.tencent.mm.plugin.sns.ui.ld
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = this.f168339a;
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).setVideoPath(str);
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).setLoop(true);
        if (snsAdNativeLandingTestUI.f166768e.getIsPlay()) {
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView T6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            double d17 = snsAdNativeLandingTestUI.f166769f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            T6.b(d17);
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
    }

    @Override // com.tencent.mm.plugin.sns.ui.ld
    public void c(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = this.f168339a;
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).isPlaying()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
            return;
        }
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).setLoop(false);
        if (!str.equals(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).getVideoPath())) {
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).setVideoPath(str);
        }
        if (snsAdNativeLandingTestUI.f166768e.getIsPlay()) {
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView T6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            double d17 = snsAdNativeLandingTestUI.f166769f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            T6.b(d17);
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
    }
}
