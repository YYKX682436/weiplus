package y;

/* loaded from: classes14.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f458431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y.p1 f458432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f458433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y.s1 f458434g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(y.p1 p1Var, long j17, y.s1 s1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f458432e = p1Var;
        this.f458433f = j17;
        this.f458434g = s1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new y.q1(this.f458432e, this.f458433f, this.f458434g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((y.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yz5.p pVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f458431d;
        y.s1 s1Var = this.f458434g;
        y.p1 p1Var = this.f458432e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z.e eVar = p1Var.f458424a;
            p2.q qVar = new p2.q(this.f458433f);
            z.p pVar2 = s1Var.f458440d;
            this.f458431d = 1;
            obj = z.e.c(eVar, qVar, pVar2, null, null, this, 12, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        z.n nVar = (z.n) obj;
        if (nVar.f468746b == z.m.Finished && (pVar = s1Var.f458442f) != null) {
            pVar.invoke(new p2.q(p1Var.f458425b), nVar.f468745a.getValue());
        }
        return jz5.f0.f302826a;
    }
}
