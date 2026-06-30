package l0;

/* loaded from: classes14.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f314558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f314559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314561g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f314562h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f314563i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(float f17, long j17, yz5.p pVar, int i17, boolean z17, long j18) {
        super(2);
        this.f314558d = f17;
        this.f314559e = j17;
        this.f314560f = pVar;
        this.f314561g = i17;
        this.f314562h = z17;
        this.f314563i = j18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        a2.t tVar;
        a2.s sVar;
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        n0.h3 h3Var = l0.l5.f314376a;
        n0.y0 y0Var2 = (n0.y0) oVar;
        a2.o1 start = ((l0.j5) y0Var2.i(h3Var)).f314307g;
        a2.o1 stop = ((l0.j5) y0Var2.i(h3Var)).f314312l;
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(stop, "stop");
        int i17 = a2.i1.f747e;
        a2.g1 start2 = start.f790a;
        kotlin.jvm.internal.o.g(start2, "start");
        a2.g1 stop2 = stop.f790a;
        kotlin.jvm.internal.o.g(stop2, "stop");
        l2.l start3 = start2.f723a;
        kotlin.jvm.internal.o.g(start3, "start");
        l2.l stop3 = stop2.f723a;
        kotlin.jvm.internal.o.g(stop3, "stop");
        int i18 = l2.l.f315124a;
        long a17 = start3.a();
        long a18 = stop3.a();
        float f17 = this.f314558d;
        long f18 = e1.a0.f(a17, a18, f17);
        l2.l bVar = (f18 > e1.y.f246320k ? 1 : (f18 == e1.y.f246320k ? 0 : -1)) != 0 ? new l2.b(f18, null) : l2.j.f315122b;
        f2.h hVar = (f2.h) a2.i1.a(start2.f728f, stop2.f728f, f17);
        long b17 = a2.i1.b(start2.f724b, stop2.f724b, f17);
        f2.r start4 = start2.f725c;
        if (start4 == null) {
            start4 = f2.r.f258822i;
        }
        f2.r stop4 = stop2.f725c;
        if (stop4 == null) {
            stop4 = f2.r.f258822i;
        }
        kotlin.jvm.internal.o.g(start4, "start");
        kotlin.jvm.internal.o.g(stop4, "stop");
        int i19 = stop4.f258825d;
        f2.r rVar = new f2.r(e06.p.f(start4.f258825d + a06.d.a((i19 - r9) * f17), 1, 1000));
        f2.p pVar = (f2.p) a2.i1.a(start2.f726d, stop2.f726d, f17);
        f2.q qVar = (f2.q) a2.i1.a(start2.f727e, stop2.f727e, f17);
        java.lang.String str = (java.lang.String) a2.i1.a(start2.f729g, stop2.f729g, f17);
        long b18 = a2.i1.b(start2.f730h, stop2.f730h, f17);
        l2.a aVar = start2.f731i;
        float f19 = aVar != null ? aVar.f315106a : 0.0f;
        l2.a aVar2 = stop2.f731i;
        float a19 = q2.a.a(f19, aVar2 != null ? aVar2.f315106a : 0.0f, f17);
        l2.m mVar = l2.m.f315125c;
        l2.m mVar2 = start2.f732j;
        if (mVar2 == null) {
            mVar2 = mVar;
        }
        l2.m mVar3 = stop2.f732j;
        if (mVar3 != null) {
            mVar = mVar3;
        }
        l2.m mVar4 = new l2.m(q2.a.a(mVar2.f315126a, mVar.f315126a, f17), q2.a.a(mVar2.f315127b, mVar.f315127b, f17));
        h2.d dVar = (h2.d) a2.i1.a(start2.f733k, stop2.f733k, f17);
        long f27 = e1.a0.f(start2.f734l, stop2.f734l, f17);
        l2.g gVar = (l2.g) a2.i1.a(start2.f735m, stop2.f735m, f17);
        e1.z0 z0Var = start2.f736n;
        if (z0Var == null) {
            z0Var = new e1.z0(0L, 0L, 0.0f, 7, null);
        }
        e1.z0 z0Var2 = stop2.f736n;
        if (z0Var2 == null) {
            z0Var2 = new e1.z0(0L, 0L, 0.0f, 7, null);
        }
        long f28 = e1.a0.f(z0Var.f246327a, z0Var2.f246327a, f17);
        long j17 = z0Var.f246328b;
        float c17 = d1.e.c(j17);
        long j18 = z0Var2.f246328b;
        e1.z0 z0Var3 = new e1.z0(f28, d1.f.a(q2.a.a(c17, d1.e.c(j18), f17), q2.a.a(d1.e.d(j17), d1.e.d(j18), f17)), q2.a.a(z0Var.f246329c, z0Var2.f246329c, f17), null);
        a2.t tVar2 = start2.f737o;
        if (tVar2 == null && stop2.f737o == null) {
            tVar = null;
        } else {
            if (tVar2 == null) {
                tVar2 = a2.t.f810a;
            }
            tVar = tVar2;
        }
        a2.g1 g1Var = new a2.g1(bVar, b17, rVar, pVar, qVar, hVar, str, b18, new l2.a(a19), mVar4, dVar, f27, gVar, z0Var3, tVar, (kotlin.jvm.internal.i) null);
        int i27 = a2.q.f801b;
        a2.p start5 = start.f791b;
        kotlin.jvm.internal.o.g(start5, "start");
        a2.p stop5 = stop.f791b;
        kotlin.jvm.internal.o.g(stop5, "stop");
        l2.f fVar = (l2.f) a2.i1.a(start5.f793a, stop5.f793a, f17);
        l2.h hVar2 = (l2.h) a2.i1.a(start5.f794b, stop5.f794b, f17);
        long b19 = a2.i1.b(start5.f795c, stop5.f795c, f17);
        l2.n start6 = start5.f796d;
        if (start6 == null) {
            start6 = l2.n.f315128c;
        }
        l2.n stop6 = stop5.f796d;
        if (stop6 == null) {
            stop6 = l2.n.f315128c;
        }
        kotlin.jvm.internal.o.g(start6, "start");
        kotlin.jvm.internal.o.g(stop6, "stop");
        l2.n nVar = new l2.n(a2.i1.b(start6.f315129a, stop6.f315129a, f17), a2.i1.b(start6.f315130b, stop6.f315130b, f17), null);
        a2.s sVar2 = start5.f797e;
        a2.s sVar3 = stop5.f797e;
        if (sVar2 == null && sVar3 == null) {
            sVar = null;
        } else {
            a2.s sVar4 = a2.s.f807b;
            if (sVar2 == null) {
                sVar2 = sVar4;
            }
            if (sVar3 == null) {
                sVar3 = sVar4;
            }
            boolean z17 = sVar3.f808a;
            boolean z18 = sVar2.f808a;
            if (z18 != z17) {
                sVar2 = new a2.s(((java.lang.Boolean) a2.i1.a(java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17), f17)).booleanValue());
            }
            sVar = sVar2;
        }
        a2.o1 o1Var = new a2.o1(g1Var, new a2.p(fVar, hVar2, b19, nVar, sVar, (l2.d) a2.i1.a(start5.f798f, stop5.f798f, f17), null));
        long j19 = this.f314563i;
        if (this.f314562h) {
            o1Var = a2.o1.a(o1Var, j19, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null);
        }
        l0.h4.b(this.f314559e, o1Var, null, this.f314560f, oVar, ((this.f314561g >> 6) & 14) | 384, 0);
        return jz5.f0.f302826a;
    }
}
