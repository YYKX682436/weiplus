package zf0;

/* loaded from: classes11.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472433d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f472434e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f472435f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f472436g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f472437h;

    /* renamed from: i, reason: collision with root package name */
    public int f472438i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vf0.o2 f472439m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c01.f7 f472440n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472441o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472442p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f472443q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f472444r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vf0.o2 o2Var, c01.f7 f7Var, java.lang.String str, zf0.v0 v0Var, java.util.Map map, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f472439m = o2Var;
        this.f472440n = f7Var;
        this.f472441o = str;
        this.f472442p = v0Var;
        this.f472443q = map;
        this.f472444r = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zf0.i(this.f472439m, this.f472440n, this.f472441o, this.f472442p, this.f472443q, this.f472444r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zf0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.r rVar;
        zf0.v0 v0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f472438i;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        vf0.o2 o2Var = this.f472439m;
        java.lang.String str = this.f472441o;
        zf0.v0 v0Var2 = this.f472442p;
        java.util.Map map = this.f472443q;
        long j17 = this.f472444r;
        this.f472433d = o2Var;
        c01.f7 f7Var = this.f472440n;
        this.f472434e = f7Var;
        this.f472435f = str;
        this.f472436g = v0Var2;
        this.f472437h = map;
        this.f472438i = 1;
        kotlinx.coroutines.r rVar2 = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar2.k();
        zf0.h hVar = new zf0.h(v0Var2, str, rVar2, o2Var);
        zf0.g gVar = new zf0.g(v0Var2, str, map, rVar2, o2Var, j17);
        if (o2Var == vf0.o2.f436243e) {
            rVar = rVar2;
            v0Var = v0Var2;
            ((a82.u1) ((o72.q4) i95.n0.c(o72.q4.class))).Di(f7Var.u(), f7Var.w(), f7Var.n(), f7Var.l(), f7Var.x(), str, "", hVar, gVar);
        } else {
            rVar = rVar2;
            v0Var = v0Var2;
            ((a82.u1) ((o72.q4) i95.n0.c(o72.q4.class))).Di(f7Var.r(), f7Var.q(), f7Var.k(), f7Var.j(), f7Var.o(), str, "", hVar, gVar);
        }
        rVar.m(new zf0.f(v0Var, str, o2Var));
        java.lang.Object j18 = rVar.j();
        return j18 == aVar ? aVar : j18;
    }
}
