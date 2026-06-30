package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class v9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f116748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.ka f116749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ el2.v2 f116750f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.view.ka kaVar, el2.v2 v2Var) {
        super(2, continuation);
        this.f116748d = hVar;
        this.f116749e = kaVar;
        this.f116750f = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.view.v9(this.f116748d, continuation, this.f116749e, this.f116750f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.view.v9 v9Var = (com.tencent.mm.plugin.finder.live.view.v9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.view.ka.e0(this.f116749e, this.f116750f);
        return jz5.f0.f302826a;
    }
}
