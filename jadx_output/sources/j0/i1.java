package j0;

/* loaded from: classes14.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.l f296329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.r0 f296330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f296331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f296332g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f296333h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296334i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g2.v f296335m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f296336n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f296337o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(g2.l lVar, g2.r0 r0Var, g2.e0 e0Var, boolean z17, boolean z18, boolean z19, j0.c5 c5Var, g2.v vVar, k0.y0 y0Var, c1.d0 d0Var) {
        super(1);
        this.f296329d = lVar;
        this.f296330e = r0Var;
        this.f296331f = e0Var;
        this.f296332g = z17;
        this.f296333h = z19;
        this.f296334i = c5Var;
        this.f296335m = vVar;
        this.f296336n = y0Var;
        this.f296337o = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        kotlin.jvm.internal.o.g(semantics, "$this$semantics");
        int i17 = this.f296329d.f267721e;
        f06.v[] vVarArr = y1.m0.f458770a;
        y1.m0.f458779j.a(semantics, vVarArr[11], new g2.k(i17));
        a2.d dVar = this.f296330e.f267744a;
        kotlin.jvm.internal.o.g(dVar, "<set-?>");
        y1.m0.f458777h.a(semantics, vVarArr[9], dVar);
        g2.e0 e0Var = this.f296331f;
        long j17 = e0Var.f267694b;
        y1.m0.f458778i.a(semantics, vVarArr[10], new a2.m1(j17));
        boolean z17 = this.f296332g;
        if (!z17) {
            y1.m0.a(semantics);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0.c5 c5Var = this.f296334i;
        j0.a1 a1Var = new j0.a1(c5Var);
        y1.o0 o0Var = y1.k.f458749a;
        y1.a aVar = new y1.a(null, a1Var);
        y1.l lVar = (y1.l) semantics;
        lVar.g(o0Var, aVar);
        lVar.g(y1.k.f458756h, new y1.a(null, new j0.b1(c5Var)));
        lVar.g(y1.k.f458755g, new y1.a(null, new j0.c1(this.f296335m, this.f296332g, this.f296331f, this.f296336n, this.f296334i)));
        c1.d0 d0Var = this.f296337o;
        boolean z18 = this.f296333h;
        y1.m0.b(semantics, null, new j0.d1(c5Var, d0Var, z18));
        k0.y0 y0Var = this.f296336n;
        lVar.g(y1.k.f458751c, new y1.a(null, new j0.e1(y0Var)));
        if (!a2.m1.b(e0Var.f267694b)) {
            lVar.g(y1.k.f458757i, new y1.a(null, new j0.f1(y0Var)));
            if (z17 && !z18) {
                lVar.g(y1.k.f458758j, new y1.a(null, new j0.g1(y0Var)));
            }
        }
        if (z17 && !z18) {
            lVar.g(y1.k.f458759k, new y1.a(null, new j0.h1(y0Var)));
        }
        return f0Var;
    }
}
