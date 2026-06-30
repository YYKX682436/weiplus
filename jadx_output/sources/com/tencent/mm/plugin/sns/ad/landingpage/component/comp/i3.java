package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes14.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 f162853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f162854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f162855f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var, kotlinx.coroutines.q qVar, androidx.lifecycle.y yVar) {
        super(1);
        this.f162853d = j3Var;
        this.f162854e = qVar;
        this.f162855f = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
        am.g0 data = (am.g0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
        kotlin.jvm.internal.o.g(data, "data");
        int i17 = data.f6716a;
        kotlinx.coroutines.q qVar = this.f162854e;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var = this.f162853d;
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingMusicComponent", "music comp error =  " + data.f6721f + "  " + data.f6722g);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            c01.k O = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.O(j3Var);
            if (O != null) {
                O.a();
            }
            bool = java.lang.Boolean.TRUE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
        } else if (i17 != 7) {
            bool = java.lang.Boolean.FALSE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingMusicComponent", "music comp dur =  " + data.f6717b);
            int i18 = (int) data.f6717b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMusicDuration$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            j3Var.S = i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMusicDuration$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPrepared$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            j3Var.B = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPrepared$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            j3Var.Y().c(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e3(j3Var), n01.c.d(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.R(j3Var)) != null ? r7.f333862a : 0.0f, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f3.f162815d);
            j3Var.Y().setProgress(0.0f);
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView Y = j3Var.Y();
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h3 h3Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h3(j3Var, this.f162855f);
            Y.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDragControl", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            Y.pointView.setOnTouchListener(new i84.f(Y, h3Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDragControl", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            bool = java.lang.Boolean.TRUE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(bool));
            j3Var.V().setShowLoading(false);
            j3Var.W().b();
            c01.k O2 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.O(j3Var);
            if (O2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAudioRespond", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                c01.i iVar = j3Var.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAudioRespond", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                O2.c(iVar);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            int i19 = j3Var.P;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            j3Var.P = i19 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
        return bool;
    }
}
