package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes14.dex */
public final class d3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f162785d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f162786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 f162787f;

    /* renamed from: g, reason: collision with root package name */
    public int f162788g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f162787f = j3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$1");
        this.f162786e = obj;
        this.f162788g |= Integer.MIN_VALUE;
        java.lang.Object S = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.S(this.f162787f, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$1");
        return S;
    }
}
