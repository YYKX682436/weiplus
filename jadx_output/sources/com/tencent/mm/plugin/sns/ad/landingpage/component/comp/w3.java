package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class w3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f162975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e54.g f162976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f162977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.y3 f162978g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(e54.g gVar, boolean z17, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.y3 y3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f162976e = gVar;
        this.f162977f = z17;
        this.f162978g = y3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$2");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w3 w3Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w3(this.f162976e, this.f162977f, this.f162978g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$2");
        return w3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$2");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$2");
        return invokeSuspend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ef  */
    /* JADX WARN: Type inference failed for: r3v3, types: [jz5.f0, java.lang.Object] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
