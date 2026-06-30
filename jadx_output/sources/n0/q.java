package n0;

/* loaded from: classes14.dex */
public final class q extends n0.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f333673a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f333674b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Set f333675c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f333676d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f333677e = n0.s4.c(r0.d.f367962f, null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.y0 f333678f;

    public q(n0.y0 y0Var, int i17, boolean z17) {
        this.f333678f = y0Var;
        this.f333673a = i17;
        this.f333674b = z17;
    }

    @Override // n0.g1
    public void a(n0.p1 composition, yz5.p content) {
        kotlin.jvm.internal.o.g(composition, "composition");
        kotlin.jvm.internal.o.g(content, "content");
        this.f333678f.f333762c.a(composition, content);
    }

    @Override // n0.g1
    public void b() {
        n0.y0 y0Var = this.f333678f;
        y0Var.A--;
    }

    @Override // n0.g1
    public boolean c() {
        return this.f333674b;
    }

    @Override // n0.g1
    public p0.f d() {
        return (p0.f) ((n0.q4) this.f333677e).getValue();
    }

    @Override // n0.g1
    public int e() {
        return this.f333673a;
    }

    @Override // n0.g1
    public oz5.l f() {
        return this.f333678f.f333762c.f();
    }

    @Override // n0.g1
    public void g(n0.p1 composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        n0.y0 y0Var = this.f333678f;
        y0Var.f333762c.g(y0Var.f333767h);
        y0Var.f333762c.g(composition);
    }

    @Override // n0.g1
    public n0.t2 h(n0.u2 reference) {
        kotlin.jvm.internal.o.g(reference, "reference");
        return this.f333678f.f333762c.h(reference);
    }

    @Override // n0.g1
    public void i(java.util.Set table) {
        kotlin.jvm.internal.o.g(table, "table");
        java.util.Set set = this.f333675c;
        if (set == null) {
            set = new java.util.HashSet();
            this.f333675c = set;
        }
        set.add(table);
    }

    @Override // n0.g1
    public void j(n0.o composer) {
        kotlin.jvm.internal.o.g(composer, "composer");
        this.f333676d.add(composer);
    }

    @Override // n0.g1
    public void k() {
        this.f333678f.A++;
    }

    @Override // n0.g1
    public void l(n0.o composer) {
        kotlin.jvm.internal.o.g(composer, "composer");
        java.util.Set set = this.f333675c;
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((java.util.Set) it.next()).remove(((n0.y0) composer).f333763d);
            }
        }
        kotlin.jvm.internal.m0.a(this.f333676d).remove(composer);
    }

    @Override // n0.g1
    public void m(n0.p1 composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        this.f333678f.f333762c.m(composition);
    }

    public final void n() {
        java.util.Set<n0.y0> set = this.f333676d;
        if (!set.isEmpty()) {
            java.util.Set set2 = this.f333675c;
            if (set2 != null) {
                for (n0.y0 y0Var : set) {
                    java.util.Iterator it = ((java.util.HashSet) set2).iterator();
                    while (it.hasNext()) {
                        ((java.util.Set) it.next()).remove(y0Var.f333763d);
                    }
                }
            }
            set.clear();
        }
    }
}
