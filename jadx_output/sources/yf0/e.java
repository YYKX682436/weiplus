package yf0;

/* loaded from: classes12.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f461531d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f461532e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f461533f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f461534g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f461535h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f461536i;

    /* renamed from: m, reason: collision with root package name */
    public int f461537m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f461538n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f461539o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461540p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f461541q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yf0.f f461542r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f461543s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ oi3.h f461544t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z17, t21.v2 v2Var, java.lang.String str, kotlin.jvm.internal.h0 h0Var, yf0.f fVar, java.util.Map map, oi3.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461538n = z17;
        this.f461539o = v2Var;
        this.f461540p = str;
        this.f461541q = h0Var;
        this.f461542r = fVar;
        this.f461543s = map;
        this.f461544t = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf0.e(this.f461538n, this.f461539o, this.f461540p, this.f461541q, this.f461542r, this.f461543s, this.f461544t, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461537m;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f461538n;
        t21.v2 v2Var = this.f461539o;
        java.lang.String str = this.f461540p;
        kotlin.jvm.internal.h0 h0Var = this.f461541q;
        yf0.f fVar = this.f461542r;
        java.util.Map map = this.f461543s;
        oi3.h hVar = this.f461544t;
        this.f461531d = v2Var;
        this.f461532e = str;
        this.f461533f = h0Var;
        this.f461534g = fVar;
        this.f461535h = map;
        this.f461536i = hVar;
        this.f461537m = 1;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar.k();
        ((o25.t) ((p25.f) i95.n0.c(p25.f.class))).getClass();
        z25.d dVar = new z25.d();
        yf0.d dVar2 = new yf0.d(fVar, z17, rVar, v2Var, h0Var, str, map, dVar, hVar);
        if (!z17) {
            v2Var.f415023u = -1;
            v2Var.f415011i = 104;
            v2Var.f415006d = 0;
            v2Var.U = 524552;
            vf0.m3.k(v2Var);
            ((f65.u) ((wf0.c2) i95.n0.c(wf0.c2.class))).wi(v2Var.d(), wf0.e2.f445504e);
        }
        z25.f fVar2 = new z25.f();
        fVar2.f469799j = v2Var.f415016n;
        fVar2.f469804o = v2Var.h();
        fVar2.f469791b = 2;
        fVar2.f469790a = 4;
        fVar2.f469793d = str;
        if (!z17) {
            fVar2.f469794e = (java.lang.String) h0Var.f310123d;
        }
        fVar2.f469792c = dVar2;
        dVar.d(fVar2);
        dVar.f469789n = z17;
        rVar.m(new yf0.c(fVar, z17, dVar));
        java.lang.Object j17 = rVar.j();
        return j17 == aVar ? aVar : j17;
    }
}
