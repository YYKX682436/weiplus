package h0;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277787d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f277789f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.o f277790g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f277791h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f277792i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f277793m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z17, c0.o oVar, n0.v2 v2Var, n0.e5 e5Var, n0.e5 e5Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277789f = z17;
        this.f277790g = oVar;
        this.f277791h = v2Var;
        this.f277792i = e5Var;
        this.f277793m = e5Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        h0.f fVar = new h0.f(this.f277789f, this.f277790g, this.f277791h, this.f277792i, this.f277793m, continuation);
        fVar.f277788e = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h0.f) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277787d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.a0 a0Var = (p1.a0) this.f277788e;
            h0.d dVar = new h0.d(this.f277789f, this.f277790g, this.f277791h, this.f277792i, null);
            h0.e eVar = new h0.e(this.f277789f, this.f277793m);
            this.f277787d = 1;
            if (b0.d4.d(a0Var, dVar, eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
