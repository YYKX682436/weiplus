package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes14.dex */
public final class x2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 f162981d;

    public x2(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var) {
        this.f162981d = j3Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1$1");
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingMusicComponent", "userControlFlow called " + intValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isPrepared$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var = this.f162981d;
        boolean z17 = j3Var.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isPrepared$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        java.lang.Object obj2 = jz5.f0.f302826a;
        if (!z17) {
            if (intValue == 2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Sns.AdLandingMusicComponent", "userControlFlow called ACTION_PAUSE but not prepared!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1$1");
            } else {
                java.lang.Object S = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.S(j3Var, continuation);
                if (S == pz5.a.f359186d) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1$1");
                    obj2 = S;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1$1");
            return obj2;
        }
        j3Var.V().setShowLoading(false);
        if (intValue == 1) {
            java.lang.String R = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.R(j3Var);
            am.f0 f0Var = new am.f0();
            am.d0 d0Var = f0Var.f6621a;
            d0Var.f6413a = 1;
            d0Var.f6414b = R;
            d0Var.f6417e = null;
            dl3.c.a(f0Var);
            boolean z18 = f0Var.f6622b.f6512a;
            j3Var.W().b();
            j3Var.Y().setRefreshing(true);
            j3Var.V().setState(1);
            android.content.Context P = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.P(j3Var);
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = P instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI ? (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) P : null;
            if (snsAdNativeLandingPagesUI != null) {
                snsAdNativeLandingPagesUI.I2 = true;
            }
            android.content.Context P2 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.P(j3Var);
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = P2 instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI ? (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) P2 : null;
            if (snsAdNativeLandingPagesUI2 != null) {
                snsAdNativeLandingPagesUI2.J2 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.R(j3Var);
            }
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.T(j3Var);
            c01.k O = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.O(j3Var);
            if (O != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAudioRespond", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                c01.i iVar = j3Var.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAudioRespond", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                O.c(iVar);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            int i17 = j3Var.P;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            j3Var.P = i17 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        } else {
            n01.c.e(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.R(j3Var));
            j3Var.W().a();
            j3Var.Y().setRefreshing(false);
            j3Var.V().setState(0);
            android.content.Context P3 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.P(j3Var);
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = P3 instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI ? (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) P3 : null;
            if (kotlin.jvm.internal.o.b(snsAdNativeLandingPagesUI3 != null ? snsAdNativeLandingPagesUI3.J2 : null, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.R(j3Var))) {
                snsAdNativeLandingPagesUI3.I2 = false;
            }
            c01.k O2 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.O(j3Var);
            if (O2 != null) {
                O2.b(false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1$1");
        return obj2;
    }
}
