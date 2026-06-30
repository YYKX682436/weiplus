package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f115712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.a1 f115713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.util.a1 a1Var) {
        super(2, continuation);
        this.f115712d = hVar;
        this.f115713e = a1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.util.u0(this.f115712d, continuation, this.f115713e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.util.u0 u0Var = (com.tencent.mm.plugin.finder.live.util.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f115712d).f454381b;
        com.tencent.mars.xlog.Log.e(this.f115713e.f115438m, "doSubscribe failed, " + aVar2);
        return jz5.f0.f302826a;
    }
}
