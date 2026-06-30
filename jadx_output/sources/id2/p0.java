package id2;

/* loaded from: classes.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        super(2, continuation);
        this.f290724d = h0Var;
        this.f290725e = h0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.p0(continuation, this.f290724d, this.f290725e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.p0 p0Var = (id2.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pm0.v.X(new id2.t0(this.f290725e));
        kotlinx.coroutines.p2.a((kotlinx.coroutines.r2) this.f290724d.f310123d, null, 1, null);
        return jz5.f0.f302826a;
    }
}
