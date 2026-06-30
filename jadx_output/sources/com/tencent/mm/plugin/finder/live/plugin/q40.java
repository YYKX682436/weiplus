package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q40 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f113958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z40 f113959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.d0 f113960f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(com.tencent.mm.plugin.finder.live.plugin.z40 z40Var, cm2.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113959e = z40Var;
        this.f113960f = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.q40 q40Var = new com.tencent.mm.plugin.finder.live.plugin.q40(this.f113959e, this.f113960f, continuation);
        q40Var.f113958d = obj;
        return q40Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.q40 q40Var = (com.tencent.mm.plugin.finder.live.plugin.q40) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q40Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f113958d;
        com.tencent.mm.plugin.finder.live.plugin.z40 z40Var = this.f113959e;
        kotlinx.coroutines.r2 r2Var = z40Var.f115298x;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        z40Var.f115298x = kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.p40(z40Var, this.f113960f, null), 3, null);
        return jz5.f0.f302826a;
    }
}
