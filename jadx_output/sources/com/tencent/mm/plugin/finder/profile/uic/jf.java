package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class jf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.emoticon.s f123858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(com.tencent.wechat.aff.emoticon.s sVar, com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f123858d = sVar;
        this.f123859e = finderProfileTabUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.jf(this.f123858d, this.f123859e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.profile.uic.jf jfVar = (com.tencent.mm.plugin.finder.profile.uic.jf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jfVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.wechat.aff.emoticon.s sVar = this.f123858d;
        boolean z17 = sVar.f216665c.isEmpty() && sVar.f216666d.isEmpty();
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123859e;
        if (z17) {
            finderProfileTabUIC.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.fg(finderProfileTabUIC));
        } else {
            finderProfileTabUIC.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.ve(finderProfileTabUIC));
        }
        return jz5.f0.f302826a;
    }
}
