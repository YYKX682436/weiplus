package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class re0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f114129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114130e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re0(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f114129d = hVar;
        this.f114130e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.re0(this.f114129d, continuation, this.f114130e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.re0 re0Var = (com.tencent.mm.plugin.finder.live.plugin.re0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        re0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f114130e.f310123d = (r45.l71) ((xg2.i) this.f114129d).f454393b;
        return jz5.f0.f302826a;
    }
}
