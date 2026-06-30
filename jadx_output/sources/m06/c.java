package m06;

/* loaded from: classes16.dex */
public final class c extends r06.e {

    /* renamed from: r, reason: collision with root package name */
    public static final n16.b f322592r = new n16.b(l06.x.f314956k, n16.g.k("Function"));

    /* renamed from: s, reason: collision with root package name */
    public static final n16.b f322593s = new n16.b(l06.x.f314954i, n16.g.k("KFunction"));

    /* renamed from: h, reason: collision with root package name */
    public final e26.c0 f322594h;

    /* renamed from: i, reason: collision with root package name */
    public final o06.d1 f322595i;

    /* renamed from: m, reason: collision with root package name */
    public final m06.m f322596m;

    /* renamed from: n, reason: collision with root package name */
    public final int f322597n;

    /* renamed from: o, reason: collision with root package name */
    public final m06.b f322598o;

    /* renamed from: p, reason: collision with root package name */
    public final m06.f f322599p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f322600q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e26.c0 storageManager, o06.d1 containingDeclaration, m06.m functionTypeKind, int i17) {
        super(storageManager, functionTypeKind.a(i17));
        p06.k kVar;
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.o.g(functionTypeKind, "functionTypeKind");
        this.f322594h = storageManager;
        this.f322595i = containingDeclaration;
        this.f322596m = functionTypeKind;
        this.f322597n = i17;
        this.f322598o = new m06.b(this);
        this.f322599p = new m06.f(storageManager, this);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        e06.k kVar2 = new e06.k(1, i17);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(kVar2, 10));
        kz5.x0 it = kVar2.iterator();
        while (true) {
            boolean z17 = ((e06.j) it).f246214f;
            kVar = p06.i.f350765a;
            if (!z17) {
                break;
            }
            int b17 = it.b();
            arrayList.add(r06.p1.x0(this, kVar, false, f26.d3.f259144g, n16.g.k("P" + b17), arrayList.size(), this.f322594h));
            arrayList2.add(jz5.f0.f302826a);
        }
        arrayList.add(r06.p1.x0(this, kVar, false, f26.d3.f259145h, n16.g.k("R"), arrayList.size(), this.f322594h));
        this.f322600q = kz5.n0.S0(arrayList);
        m06.d dVar = m06.e.f322601d;
        m06.m functionTypeKind2 = this.f322596m;
        dVar.getClass();
        kotlin.jvm.internal.o.g(functionTypeKind2, "functionTypeKind");
        if (kotlin.jvm.internal.o.b(functionTypeKind2, m06.i.f322603c) || kotlin.jvm.internal.o.b(functionTypeKind2, m06.l.f322606c) || kotlin.jvm.internal.o.b(functionTypeKind2, m06.j.f322604c)) {
            return;
        }
        kotlin.jvm.internal.o.b(functionTypeKind2, m06.k.f322605c);
    }

    @Override // r06.s0
    public y16.s P(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f322599p;
    }

    @Override // o06.g
    public /* bridge */ /* synthetic */ java.util.Collection S() {
        return kz5.p0.f313996d;
    }

    @Override // o06.g
    public /* bridge */ /* synthetic */ java.util.Collection T() {
        return kz5.p0.f313996d;
    }

    @Override // o06.g
    public o06.j2 d0() {
        return null;
    }

    @Override // o06.m
    public o06.m e() {
        return this.f322595i;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.g, o06.r0
    public o06.t0 f() {
        return o06.t0.f341988h;
    }

    @Override // o06.j
    public f26.c2 g() {
        return this.f322598o;
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

    @Override // o06.p
    public o06.x1 getSource() {
        return o06.x1.f342004a;
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

    @Override // o06.r0
    public boolean isExternal() {
        return false;
    }

    @Override // o06.g
    public boolean isInline() {
        return false;
    }

    @Override // o06.g
    public o06.h j() {
        return o06.h.f341961e;
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
        return this.f322600q;
    }

    @Override // o06.g
    public /* bridge */ /* synthetic */ y16.s m0() {
        return y16.r.f458973b;
    }

    @Override // o06.k
    public boolean p() {
        return false;
    }

    @Override // o06.g
    public /* bridge */ /* synthetic */ o06.f s() {
        return null;
    }

    @Override // o06.g
    public boolean t0() {
        return false;
    }

    public java.lang.String toString() {
        java.lang.String h17 = getName().h();
        kotlin.jvm.internal.o.f(h17, "asString(...)");
        return h17;
    }
}
