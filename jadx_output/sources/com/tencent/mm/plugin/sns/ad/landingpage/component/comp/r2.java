package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes14.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 f162933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var) {
        super(1);
        this.f162933d = j3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initAudioListener$1");
        am.g0 it = (am.g0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initAudioListener$1");
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.f6716a;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var = this.f162933d;
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingMusicComponent", "error occur! " + it.f6722g + ' ' + it.f6721f);
            if (j3Var.b0()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdNativeLandingPagesUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdNativeLandingPagesUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = j3Var.f162862J;
                if (snsAdNativeLandingPagesUI != null) {
                    snsAdNativeLandingPagesUI.I2 = false;
                }
            }
            j3Var.Y().setRefreshing(false);
            j3Var.Y().setProgress(0.0f);
            j3Var.V().setShowLoading(false);
            j3Var.V().setState(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPrepared$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            j3Var.B = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPrepared$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        }
        if (it.f6716a == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingMusicComponent", "completed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayCompletedCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            int i18 = j3Var.Q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayCompletedCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayCompletedCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            j3Var.Q = i18 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayCompletedCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            n01.b bVar = new n01.b();
            bVar.f333836a = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.R(j3Var);
            bVar.f333842g = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            f54.b0 b0Var = j3Var.f162864t;
            if (b0Var == null || (str = b0Var.G) == null) {
                str = "";
            }
            bVar.f333837b = str;
            bVar.f333843h = false;
            n01.c.g(bVar);
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initAudioListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initAudioListener$1");
        return bool;
    }
}
