package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class h6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f154350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.iam.biz.g f154351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.iam.biz.v1 f154352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.m0 f154353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154354h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.tencent.wechat.iam.biz.g gVar, com.tencent.wechat.iam.biz.v1 v1Var, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var, com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154351e = gVar;
        this.f154352f = v1Var;
        this.f154353g = m0Var;
        this.f154354h = contactWidgetTabBizInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.tab.h6(this.f154351e, this.f154352f, this.f154353g, this.f154354h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.tab.h6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f154350d;
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactWidgetTabBizInfo", e17, "[PhotoAccountGuide] refresh failed", new java.lang.Object[0]);
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.profile.ui.tab.f6 f6Var = new com.tencent.mm.plugin.profile.ui.tab.f6(this.f154351e, this.f154352f, null);
            this.f154350d = 1;
            obj = kotlinx.coroutines.z0.f(f6Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.profile.ui.tab.u4 u4Var = (com.tencent.mm.plugin.profile.ui.tab.u4) obj;
        int i18 = u4Var.f154609a;
        boolean z17 = u4Var.f154610b;
        com.tencent.wechat.iam.biz.w1 w1Var = u4Var.f154611c;
        boolean z18 = u4Var.f154612d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.profile.ui.tab.g6 g6Var = new com.tencent.mm.plugin.profile.ui.tab.g6(i18, this.f154353g, z17, w1Var, z18, this.f154354h, null);
        this.f154350d = 2;
        if (kotlinx.coroutines.l.g(g3Var, g6Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
