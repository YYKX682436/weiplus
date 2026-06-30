package fm3;

/* loaded from: classes10.dex */
public final class q implements in5.c {

    /* renamed from: p, reason: collision with root package name */
    public static final fm3.h f264104p = new fm3.h(null);

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.Object f264105q = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public ll3.h1 f264106d;

    /* renamed from: e, reason: collision with root package name */
    public int f264107e;

    /* renamed from: f, reason: collision with root package name */
    public int f264108f;

    /* renamed from: g, reason: collision with root package name */
    public int f264109g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f264110h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f264111i;

    /* renamed from: m, reason: collision with root package name */
    public fm3.n f264112m;

    /* renamed from: n, reason: collision with root package name */
    public fm3.o f264113n;

    /* renamed from: o, reason: collision with root package name */
    public fm3.q f264114o;

    public q() {
        fm3.d a17 = fm3.d.f264035f.a();
        this.f264112m = new fm3.i(a17);
        fm3.p pVar = new fm3.p(a17.a(), a17.a(), a17.f264040d, 0, 0, 24, null);
        pVar.f264098d = a17.f264038b;
        pVar.f264099e = a17.f264039c;
        pVar.f264100f = true;
        this.f264113n = pVar;
    }

    public final java.lang.String a() {
        com.tencent.mm.protocal.protobuf.FinderObject f17;
        fm3.o oVar = this.f264113n;
        java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0((oVar == null || (f17 = oVar.f()) == null) ? 0L : f17.getId());
        kotlin.jvm.internal.o.f(r07, "getUnsignedLongString(...)");
        return r07;
    }

    public final java.lang.String b() {
        java.lang.String r17;
        com.tencent.mm.protocal.protobuf.FinderObject f17;
        fm3.o oVar = this.f264113n;
        if (oVar == null || (f17 = oVar.f()) == null || (r17 = f17.getUsername()) == null) {
            r17 = c01.z1.r();
        }
        return r17 == null ? "" : r17;
    }

    public final java.lang.String c(int i17) {
        ll3.f1 d17;
        ll3.h1 h1Var = this.f264106d;
        if (h1Var == null || (d17 = h1Var.d(h1Var.a(i17))) == null) {
            return null;
        }
        return d17.f319168b;
    }

    public final long d() {
        fm3.q qVar = this.f264114o;
        boolean z17 = false;
        if (qVar != null && qVar.f264109g == 0) {
            z17 = true;
        }
        return z17 ? 1L : 0L;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 4;
    }
}
