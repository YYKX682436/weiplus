package f0;

/* loaded from: classes14.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f258155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.l2 f258156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.k0 f258157f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f0.l2 l2Var, z.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f258156e = l2Var;
        this.f258157f = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f0.n(this.f258156e, this.f258157f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f258155d;
        f0.l2 l2Var = this.f258156e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                boolean e17 = l2Var.f258148b.e();
                z.p pVar = this.f258157f;
                if (e17) {
                    pVar = pVar instanceof z.p1 ? (z.p1) pVar : f0.p.f258180a;
                }
                z.p pVar2 = pVar;
                z.e eVar = l2Var.f258148b;
                p2.m mVar = new p2.m(l2Var.f258149c);
                this.f258155d = 1;
                if (z.e.c(eVar, mVar, pVar2, null, null, this, 12, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            ((n0.q4) l2Var.f258150d).setValue(java.lang.Boolean.FALSE);
        } catch (java.util.concurrent.CancellationException unused) {
        }
        return jz5.f0.f302826a;
    }
}
