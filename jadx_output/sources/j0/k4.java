package j0;

/* loaded from: classes14.dex */
public final class k4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f296413d;

    /* renamed from: e, reason: collision with root package name */
    public int f296414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f296415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f296416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f296417h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(n0.v2 v2Var, boolean z17, c0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296415f = v2Var;
        this.f296416g = z17;
        this.f296417h = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j0.k4(this.f296415f, this.f296416g, this.f296417h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.k4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        n0.v2 v2Var;
        n0.v2 v2Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f296414e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            v2Var = this.f296415f;
            c0.r rVar = (c0.r) v2Var.getValue();
            if (rVar != null) {
                c0.m sVar = this.f296416g ? new c0.s(rVar) : new c0.q(rVar);
                c0.o oVar = this.f296417h;
                if (oVar != null) {
                    this.f296413d = v2Var;
                    this.f296414e = 1;
                    if (((c0.p) oVar).a(sVar, this) == aVar) {
                        return aVar;
                    }
                    v2Var2 = v2Var;
                }
                v2Var.setValue(null);
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v2Var2 = (n0.v2) this.f296413d;
        kotlin.ResultKt.throwOnFailure(obj);
        v2Var = v2Var2;
        v2Var.setValue(null);
        return jz5.f0.f302826a;
    }
}
