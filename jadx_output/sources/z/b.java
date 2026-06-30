package z;

/* loaded from: classes14.dex */
public final class b extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f468584d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f468585e;

    /* renamed from: f, reason: collision with root package name */
    public int f468586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.e f468587g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f468588h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z.l f468589i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f468590m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f468591n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z.e eVar, java.lang.Object obj, z.l lVar, long j17, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f468587g = eVar;
        this.f468588h = obj;
        this.f468589i = lVar;
        this.f468590m = j17;
        this.f468591n = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new z.b(this.f468587g, this.f468588h, this.f468589i, this.f468590m, this.f468591n, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((z.b) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.c0 c0Var;
        z.r rVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f468586f;
        z.e eVar = this.f468587g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                z.r rVar2 = eVar.f468632c;
                z.w wVar = (z.w) ((z.x2) eVar.f468630a).f468873a.invoke(this.f468588h);
                rVar2.getClass();
                kotlin.jvm.internal.o.g(wVar, "<set-?>");
                rVar2.f468812f = wVar;
                ((n0.q4) eVar.f468634e).setValue(this.f468589i.f());
                ((n0.q4) eVar.f468633d).setValue(java.lang.Boolean.TRUE);
                z.r rVar3 = eVar.f468632c;
                z.r rVar4 = new z.r(rVar3.f468810d, rVar3.getValue(), z.x.a(rVar3.f468812f), rVar3.f468813g, Long.MIN_VALUE, rVar3.f468815i);
                kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
                z.l lVar = this.f468589i;
                long j17 = this.f468590m;
                z.a aVar2 = new z.a(eVar, rVar4, this.f468591n, c0Var2);
                this.f468584d = rVar4;
                this.f468585e = c0Var2;
                this.f468586f = 1;
                if (z.z1.a(rVar4, lVar, j17, aVar2, this) == aVar) {
                    return aVar;
                }
                c0Var = c0Var2;
                rVar = rVar4;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = (kotlin.jvm.internal.c0) this.f468585e;
                rVar = (z.r) this.f468584d;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            z.m mVar = c0Var.f310112d ? z.m.BoundReached : z.m.Finished;
            z.e.b(eVar);
            return new z.n(rVar, mVar);
        } catch (java.util.concurrent.CancellationException e17) {
            z.e.b(eVar);
            throw e17;
        }
    }
}
