package h0;

/* loaded from: classes14.dex */
public final class d extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f277778d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277779e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ long f277780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f277781g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f277782h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f277783i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f277784m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z17, c0.o oVar, n0.v2 v2Var, n0.e5 e5Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f277781g = z17;
        this.f277782h = oVar;
        this.f277783i = v2Var;
        this.f277784m = e5Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j17 = ((d1.e) obj2).f225627a;
        h0.d dVar = new h0.d(this.f277781g, this.f277782h, this.f277783i, this.f277784m, (kotlin.coroutines.Continuation) obj3);
        dVar.f277779e = (b0.f2) obj;
        dVar.f277780f = j17;
        return dVar.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277778d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.f2 f2Var = (b0.f2) this.f277779e;
            long j17 = this.f277780f;
            if (this.f277781g) {
                c0.o oVar = this.f277782h;
                n0.v2 v2Var = this.f277783i;
                n0.e5 e5Var = this.f277784m;
                this.f277778d = 1;
                java.lang.Object f17 = kotlinx.coroutines.z0.f(new a0.c0(f2Var, j17, oVar, v2Var, e5Var, null), this);
                if (f17 != aVar) {
                    f17 = f0Var;
                }
                if (f17 == aVar) {
                    return aVar;
                }
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
