package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f115659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.a1 f115660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f115661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f115662g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.util.a1 a1Var, int i17, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f115659d = hVar;
        this.f115660e = a1Var;
        this.f115661f = i17;
        this.f115662g = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.util.r0(this.f115659d, continuation, this.f115660e, this.f115661f, this.f115662g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.util.r0 r0Var = (com.tencent.mm.plugin.finder.live.util.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.el1 el1Var = (r45.el1) ((xg2.i) this.f115659d).f454393b;
        com.tencent.mars.xlog.Log.i(this.f115660e.f115438m, "checkFanClub with opCode " + this.f115661f + " success");
        this.f115662g.f310123d = el1Var;
        return jz5.f0.f302826a;
    }
}
