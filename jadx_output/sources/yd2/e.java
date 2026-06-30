package yd2;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f461045d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f461046e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f461047f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f461048g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f461049h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f461050i;

    /* renamed from: m, reason: collision with root package name */
    public int f461051m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yd2.a f461052n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yd2.l f461053o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yd2.b f461054p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yd2.j f461055q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yd2.b f461056r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yd2.n f461057s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yd2.a aVar, yd2.l lVar, yd2.b bVar, yd2.j jVar, yd2.b bVar2, yd2.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461052n = aVar;
        this.f461053o = lVar;
        this.f461054p = bVar;
        this.f461055q = jVar;
        this.f461056r = bVar2;
        this.f461057s = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yd2.e(this.f461052n, this.f461053o, this.f461054p, this.f461055q, this.f461056r, this.f461057s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yd2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461051m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yd2.a aVar2 = this.f461052n;
            this.f461045d = aVar2;
            yd2.l lVar = this.f461053o;
            this.f461046e = lVar;
            yd2.b bVar = this.f461054p;
            this.f461047f = bVar;
            yd2.j jVar = this.f461055q;
            this.f461048g = jVar;
            yd2.b bVar2 = this.f461056r;
            this.f461049h = bVar2;
            yd2.n nVar = this.f461057s;
            this.f461050i = nVar;
            this.f461051m = 1;
            oz5.n nVar2 = new oz5.n(pz5.f.b(this));
            aVar2.b(lVar, bVar, new yd2.d(nVar2, jVar, bVar2, nVar));
            obj = nVar2.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
