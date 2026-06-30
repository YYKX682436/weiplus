package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f115720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.a1 f115721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f115722f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f115723g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.util.a1 a1Var, int i17, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f115720d = hVar;
        this.f115721e = a1Var;
        this.f115722f = i17;
        this.f115723g = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.util.v0(this.f115720d, continuation, this.f115721e, this.f115722f, this.f115723g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.util.v0 v0Var = (com.tencent.mm.plugin.finder.live.util.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.r52 r52Var = (r45.r52) ((xg2.i) this.f115720d).f454393b;
        com.tencent.mars.xlog.Log.i(this.f115721e.f115438m, "doSubscribe consume type " + this.f115722f);
        com.tencent.mm.protobuf.g byteString = r52Var.getByteString(2);
        this.f115723g.f310123d = byteString != null ? byteString.g() : null;
        return jz5.f0.f302826a;
    }
}
