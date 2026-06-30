package gk5;

/* loaded from: classes.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f272651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk5.k1 f272652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.o f272653f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(wi5.n0 n0Var, gk5.k1 k1Var, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272651d = n0Var;
        this.f272652e = k1Var;
        this.f272653f = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gk5.f1(this.f272651d, this.f272652e, this.f272653f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gk5.f1 f1Var = (gk5.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        gk5.k1 k1Var;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (g95.e.f269801a.a()) {
            wi5.n0 n0Var = this.f272651d;
            if (!((n0Var.H & 4) > 0) && (O6 = (k1Var = this.f272652e).O6()) != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new gk5.e1(k1Var, this.f272653f, n0Var, null), 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
