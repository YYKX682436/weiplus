package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r10 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f114070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z10 f114071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.y f114072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, cm2.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114071e = z10Var;
        this.f114072f = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.r10 r10Var = new com.tencent.mm.plugin.finder.live.plugin.r10(this.f114071e, this.f114072f, continuation);
        r10Var.f114070d = obj;
        return r10Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.r10 r10Var = (com.tencent.mm.plugin.finder.live.plugin.r10) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r10Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f114070d;
        com.tencent.mm.plugin.finder.live.plugin.z10 z10Var = this.f114071e;
        kotlinx.coroutines.r2 r2Var = z10Var.f115265q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        z10Var.f115265q = kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.q10(z10Var, this.f114072f, null), 3, null);
        return jz5.f0.f302826a;
    }
}
