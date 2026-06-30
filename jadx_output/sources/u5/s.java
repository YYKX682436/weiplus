package u5;

/* loaded from: classes14.dex */
public final class s extends h1.c implements n0.e4 {

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f424726i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.y0 f424727m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f424728n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.v2 f424729o;

    /* renamed from: p, reason: collision with root package name */
    public final n0.v2 f424730p;

    /* renamed from: q, reason: collision with root package name */
    public final n0.v2 f424731q;

    /* renamed from: r, reason: collision with root package name */
    public final n0.v2 f424732r;

    /* renamed from: s, reason: collision with root package name */
    public u5.e f424733s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f424734t;

    /* renamed from: u, reason: collision with root package name */
    public final n0.v2 f424735u;

    /* renamed from: v, reason: collision with root package name */
    public final n0.v2 f424736v;

    /* renamed from: w, reason: collision with root package name */
    public final n0.v2 f424737w;

    public s(kotlinx.coroutines.y0 parentScope, c6.j request, r5.j imageLoader) {
        kotlin.jvm.internal.o.g(parentScope, "parentScope");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(imageLoader, "imageLoader");
        this.f424726i = parentScope;
        int i17 = d1.k.f225643d;
        this.f424729o = n0.s4.c(new d1.k(d1.k.f225641b), null, 2, null);
        this.f424730p = n0.s4.c(java.lang.Float.valueOf(1.0f), null, 2, null);
        this.f424731q = n0.s4.c(null, null, 2, null);
        this.f424732r = n0.s4.c(null, null, 2, null);
        int i18 = u5.e.f424702a;
        this.f424733s = u5.d.f424701b;
        this.f424735u = n0.s4.c(u5.g.f424706a, null, 2, null);
        this.f424736v = n0.s4.c(request, null, 2, null);
        this.f424737w = n0.s4.c(imageLoader, null, 2, null);
    }

    @Override // h1.c
    public boolean a(float f17) {
        ((n0.q4) this.f424730p).setValue(java.lang.Float.valueOf(f17));
        return true;
    }

    @Override // n0.e4
    public void b() {
        if (this.f424734t) {
            return;
        }
        kotlinx.coroutines.y0 y0Var = this.f424727m;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        oz5.l f11582e = this.f424726i.getF11582e();
        int i17 = kotlinx.coroutines.r2.O0;
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(f11582e.plus(new kotlinx.coroutines.s3((kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d))));
        this.f424727m = a17;
        kotlinx.coroutines.l.d(a17, null, null, new u5.q(this, null), 3, null);
    }

    @Override // n0.e4
    public void c() {
        d();
    }

    @Override // n0.e4
    public void d() {
        kotlinx.coroutines.y0 y0Var = this.f424727m;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.f424727m = null;
        kotlinx.coroutines.r2 r2Var = this.f424728n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f424728n = null;
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        ((n0.q4) this.f424731q).setValue(zVar);
        return true;
    }

    @Override // h1.c
    public long h() {
        h1.c cVar = (h1.c) ((n0.q4) this.f424732r).getValue();
        d1.k kVar = cVar == null ? null : new d1.k(cVar.h());
        return kVar == null ? d1.k.f225642c : kVar.f225644a;
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        long a17 = iVar.a();
        ((n0.q4) this.f424729o).setValue(new d1.k(a17));
        h1.c cVar = (h1.c) ((n0.q4) this.f424732r).getValue();
        if (cVar == null) {
            return;
        }
        cVar.g(iVar, iVar.a(), ((java.lang.Number) ((n0.q4) this.f424730p).getValue()).floatValue(), (e1.z) ((n0.q4) this.f424731q).getValue());
    }
}
