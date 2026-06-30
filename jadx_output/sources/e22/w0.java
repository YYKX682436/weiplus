package e22;

/* loaded from: classes5.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f246748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f246749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f246750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f246751g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(n0.e5 e5Var, f0.r1 r1Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f246749e = e5Var;
        this.f246750f = r1Var;
        this.f246751g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e22.w0(this.f246749e, this.f246750f, this.f246751g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e22.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f246748d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j f17 = n0.s4.f(new e22.s0(this.f246749e, this.f246750f));
            e22.t0 t0Var = new e22.t0(this.f246751g);
            this.f246748d = 1;
            java.lang.Object a17 = f17.a(new e22.v0(t0Var), this);
            if (a17 != pz5.a.f359186d) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
