package hr5;

/* loaded from: classes15.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f284376d;

    /* renamed from: e, reason: collision with root package name */
    public long f284377e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f284378f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f284379g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f284380h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f284381i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f284382m;

    /* renamed from: n, reason: collision with root package name */
    public int f284383n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284384o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f284385p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f284386q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f284387r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ gr5.d f284388s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(hr5.a1 a1Var, float f17, long j17, boolean z17, gr5.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284384o = a1Var;
        this.f284385p = f17;
        this.f284386q = j17;
        this.f284387r = z17;
        this.f284388s = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr5.k0(this.f284384o, this.f284385p, this.f284386q, this.f284387r, this.f284388s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr5.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        zq5.v vVar;
        hr5.a1 a1Var;
        long j17;
        long j18;
        zq5.v vVar2;
        gr5.b bVar;
        boolean z17;
        gr5.n nVar;
        zq5.v a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f284383n;
        hr5.a1 a1Var2 = this.f284384o;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zq5.b.d();
            long j19 = a1Var2.f284281e;
            zq5.g gVar = new zq5.g(j19);
            if (!zq5.h.c(j19)) {
                gVar = null;
            }
            if (gVar == null) {
                return java.lang.Boolean.FALSE;
            }
            long j27 = a1Var2.f284282f;
            zq5.g gVar2 = new zq5.g(j27);
            if (!zq5.h.c(j27)) {
                gVar2 = null;
            }
            if (gVar2 == null) {
                return java.lang.Boolean.FALSE;
            }
            vVar = a1Var2.f284295s;
            zq5.v vVar3 = a1Var2.f284296t;
            gr5.n nVar2 = a1Var2.f284284h;
            gr5.b bVar2 = a1Var2.f284285i;
            boolean z18 = a1Var2.f284286j;
            this.f284378f = vVar;
            this.f284379g = vVar3;
            this.f284380h = nVar2;
            this.f284381i = bVar2;
            long j28 = gVar.f475067a;
            this.f284376d = j28;
            long j29 = gVar2.f475067a;
            this.f284377e = j29;
            this.f284382m = z18;
            this.f284383n = 1;
            a1Var = a1Var2;
            if (a1Var.g("scale", this) == aVar) {
                return aVar;
            }
            j17 = j28;
            j18 = j29;
            vVar2 = vVar3;
            bVar = bVar2;
            z17 = z18;
            nVar = nVar2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return java.lang.Boolean.TRUE;
            }
            boolean z19 = this.f284382m;
            long j37 = this.f284377e;
            long j38 = this.f284376d;
            gr5.b bVar3 = (gr5.b) this.f284381i;
            gr5.n nVar3 = (gr5.n) this.f284380h;
            zq5.v vVar4 = (zq5.v) this.f284379g;
            vVar = (zq5.v) this.f284378f;
            kotlin.ResultKt.throwOnFailure(obj);
            z17 = z19;
            a1Var = a1Var2;
            bVar = bVar3;
            j18 = j37;
            j17 = j38;
            nVar = nVar3;
            vVar2 = vVar4;
        }
        float c17 = this.f284385p / vVar.c();
        float d17 = a1Var.d(c17, false);
        float c18 = vVar2.c();
        long j39 = vVar2.f475096b;
        long g17 = hr5.b1.g(j17, j18, nVar, bVar, z17, 0, c18, j39, this.f284386q);
        long e17 = hr5.b1.e(c18, j39, d17, g17, zq5.l.f475077b, 0.0f);
        long c19 = a1Var.c(e17, d17);
        a17 = r34.a((r20 & 1) != 0 ? r34.f475095a : zq5.s.a(d17, d17), (r20 & 2) != 0 ? r34.f475096b : c19, (r20 & 4) != 0 ? r34.f475097c : 0.0f, (r20 & 8) != 0 ? r34.f475098d : 0L, (r20 & 16) != 0 ? vVar2.f475099e : 0L);
        hr5.a1 a1Var3 = a1Var;
        a1Var.f284277a.a(new hr5.j0(c17, c18, d17, e17, j39, c19, a1Var3, this.f284385p, this.f284386q, this.f284387r, g17, vVar2, a17));
        if (this.f284387r) {
            hr5.a1 a1Var4 = this.f284384o;
            java.lang.Integer num = new java.lang.Integer(1);
            gr5.d dVar = this.f284388s;
            this.f284378f = null;
            this.f284379g = null;
            this.f284380h = null;
            this.f284381i = null;
            this.f284383n = 2;
            if (hr5.a1.a(a1Var4, a17, num, dVar, "scale", this) == aVar) {
                return aVar;
            }
        } else {
            a1Var3.j(a17);
        }
        return java.lang.Boolean.TRUE;
    }
}
