package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class q2 implements c01.i {
    @Override // c01.i
    public void P0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
    }

    @Override // c01.i
    public void U5() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
    }

    @Override // c01.i
    public void V3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gain", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gain", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
    }

    @Override // c01.i
    public void g3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loss", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loss", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
    }
}
