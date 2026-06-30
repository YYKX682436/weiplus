package com.tencent.mm.plugin.sns.ad.landingpage;

@db5.a(32)
@ul5.d(0)
/* loaded from: classes3.dex */
public class SnsAdNativeLandingPagesMMUI extends com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI {
    @Override // com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI
    public java.lang.String D7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.landingpage.SnsAdNativeLandingPagesMMUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.landingpage.SnsAdNativeLandingPagesMMUI");
        return "MicroMsg.SnsAdNativeLandingPagesUIMM";
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI
    public boolean V7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMMLandingPage", "com.tencent.mm.plugin.sns.ad.landingpage.SnsAdNativeLandingPagesMMUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMMLandingPage", "com.tencent.mm.plugin.sns.ad.landingpage.SnsAdNativeLandingPagesMMUI");
        return true;
    }
}
