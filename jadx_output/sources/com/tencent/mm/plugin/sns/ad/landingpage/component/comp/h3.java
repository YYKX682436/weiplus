package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes7.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 f162842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f162843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var, androidx.lifecycle.y yVar) {
        super(2);
        this.f162842d = j3Var;
        this.f162843e = yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3");
        float floatValue = ((java.lang.Number) obj).floatValue();
        yz5.a canRefresh = (yz5.a) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3");
        kotlin.jvm.internal.o.g(canRefresh, "canRefresh");
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        e0Var.f310115d = floatValue;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var = this.f162842d;
        java.lang.String R = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.R(j3Var);
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g3 g3Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g3(j3Var, e0Var, canRefresh);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("listenAudioEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        j3Var.c0(this.f162843e, R, true, g3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("listenAudioEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        n01.c.f(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.R(j3Var), (int) e0Var.f310115d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3");
        return f0Var;
    }
}
