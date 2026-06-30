package o06;

/* loaded from: classes16.dex */
public final class z0 extends r06.s {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f342010n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f342011o;

    /* renamed from: p, reason: collision with root package name */
    public final f26.q f342012p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(e26.c0 storageManager, o06.m container, n16.g name, boolean z17, int i17) {
        super(storageManager, container, name, o06.x1.f342004a, false);
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(name, "name");
        this.f342010n = z17;
        e06.k m17 = e06.p.m(0, i17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            int i18 = p06.k.Z0;
            arrayList.add(r06.p1.x0(this, p06.i.f350765a, false, f26.d3.f259143f, n16.g.k(androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE + b17), b17, storageManager));
        }
        this.f342011o = arrayList;
        this.f342012p = new f26.q(this, o06.i2.b(this), kz5.o1.c(v16.f.j(this).h().f()), storageManager);
    }

    @Override // r06.s0
    public y16.s P(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return y16.r.f458973b;
    }

    @Override // o06.g
    public java.util.Collection S() {
        return kz5.r0.f314002d;
    }

    @Override // o06.g
    public java.util.Collection T() {
        return kz5.p0.f313996d;
    }

    @Override // o06.g
    public o06.j2 d0() {
        return null;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.g, o06.r0
    public o06.t0 f() {
        return o06.t0.f341985e;
    }

    @Override // o06.j
    public f26.c2 g() {
        return this.f342012p;
    }

    @Override // o06.g
    public boolean g0() {
        return false;
    }

    @Override // p06.a
    public p06.k getAnnotations() {
        int i17 = p06.k.Z0;
        return p06.i.f350765a;
    }

    @Override // o06.g, o06.q, o06.r0
    public o06.g0 getVisibility() {
        o06.g0 PUBLIC = o06.f0.f341945e;
        kotlin.jvm.internal.o.f(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // o06.g
    public boolean h0() {
        return false;
    }

    @Override // r06.s, o06.r0
    public boolean isExternal() {
        return false;
    }

    @Override // o06.g
    public boolean isInline() {
        return false;
    }

    @Override // o06.g
    public o06.h j() {
        return o06.h.f341960d;
    }

    @Override // o06.g
    public boolean k0() {
        return false;
    }

    @Override // o06.r0
    public boolean l0() {
        return false;
    }

    @Override // o06.g, o06.k
    public java.util.List m() {
        return this.f342011o;
    }

    @Override // o06.g
    public /* bridge */ /* synthetic */ y16.s m0() {
        return y16.r.f458973b;
    }

    @Override // o06.k
    public boolean p() {
        return this.f342010n;
    }

    @Override // o06.g
    public o06.f s() {
        return null;
    }

    @Override // o06.g
    public boolean t0() {
        return false;
    }

    public java.lang.String toString() {
        return "class " + getName() + " (not found)";
    }
}
