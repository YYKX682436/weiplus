package qe5;

/* loaded from: classes12.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f362124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe5.m0 f362125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.storage.f9 f9Var, qe5.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362124d = f9Var;
        this.f362125e = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qe5.i0(this.f362124d, this.f362125e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qe5.i0 i0Var = (qe5.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.storage.f9 f9Var = this.f362124d;
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        h40.f fVar = new h40.f(Q0, f9Var.I0());
        fVar.f278742c = this.f362125e.f362145d;
        fVar.f278745f = h40.b.f278722g;
        ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).aj(fVar);
        return jz5.f0.f302826a;
    }
}
