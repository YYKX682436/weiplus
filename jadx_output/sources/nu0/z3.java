package nu0;

/* loaded from: classes5.dex */
public final class z3 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f340160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(nu0.b4 b4Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f340159d = b4Var;
        this.f340160e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new nu0.z3(this.f340159d, this.f340160e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        nu0.z3 z3Var = (nu0.z3) create((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f340159d.T.d(this.f340160e);
        return jz5.f0.f302826a;
    }
}
