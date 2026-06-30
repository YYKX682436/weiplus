package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class c9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f116978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f116979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f116980f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        super(2, continuation);
        this.f116978d = hVar;
        this.f116979e = c0Var;
        this.f116980f = v9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.c9(this.f116978d, continuation, this.f116979e, this.f116980f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.viewmodel.c9 c9Var = (com.tencent.mm.plugin.finder.live.viewmodel.c9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f116979e.f310112d = true;
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f116980f;
        v9Var.f117497s = v9Var.A;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.viewmodel.g9(v9Var));
        return jz5.f0.f302826a;
    }
}
