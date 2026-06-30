package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f162982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.y3 f162983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(boolean z17, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.y3 y3Var) {
        super(1);
        this.f162982d = z17;
        this.f162983e = y3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$3");
        com.tencent.mars.xlog.Log.i("SnsAd.RedPkgUriBtn", "the fetch cover url job completes, doUIAction is " + this.f162982d);
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.y3.h0(this.f162983e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$3");
        return f0Var;
    }
}
