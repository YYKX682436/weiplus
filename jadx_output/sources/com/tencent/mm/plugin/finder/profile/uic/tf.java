package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class tf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f124236d = finderProfileTabUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.tf(this.f124236d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.profile.uic.tf tfVar = (com.tencent.mm.plugin.finder.profile.uic.tf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tfVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.p7(this.f124236d, 10, 0, 2, null);
        return jz5.f0.f302826a;
    }
}
