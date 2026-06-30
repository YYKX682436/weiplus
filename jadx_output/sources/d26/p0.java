package d26;

/* loaded from: classes16.dex */
public final class p0 extends r06.l implements d26.a0 {

    /* renamed from: o, reason: collision with root package name */
    public final i16.o1 f226036o;

    /* renamed from: p, reason: collision with root package name */
    public final k16.g f226037p;

    /* renamed from: q, reason: collision with root package name */
    public final k16.k f226038q;

    /* renamed from: r, reason: collision with root package name */
    public final k16.m f226039r;

    /* renamed from: s, reason: collision with root package name */
    public final d26.z f226040s;

    /* renamed from: t, reason: collision with root package name */
    public f26.z0 f226041t;

    /* renamed from: u, reason: collision with root package name */
    public f26.z0 f226042u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f226043v;

    /* renamed from: w, reason: collision with root package name */
    public f26.z0 f226044w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e26.c0 storageManager, o06.m containingDeclaration, p06.k annotations, n16.g name, o06.g0 visibility, i16.o1 proto, k16.g nameResolver, k16.k typeTable, k16.m versionRequirementTable, d26.z zVar) {
        super(storageManager, containingDeclaration, annotations, name, o06.x1.f342004a, visibility);
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.o.g(annotations, "annotations");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(visibility, "visibility");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        kotlin.jvm.internal.o.g(versionRequirementTable, "versionRequirementTable");
        this.f226036o = proto;
        this.f226037p = nameResolver;
        this.f226038q = typeTable;
        this.f226039r = versionRequirementTable;
        this.f226040s = zVar;
    }

    @Override // d26.a0
    public k16.g X() {
        return this.f226037p;
    }

    @Override // d26.a0
    public d26.z Y() {
        return this.f226040s;
    }

    @Override // o06.a2
    public o06.n d(f26.v2 substitutor) {
        kotlin.jvm.internal.o.g(substitutor, "substitutor");
        if (substitutor.h()) {
            return this;
        }
        e26.c0 c0Var = this.f368479h;
        o06.m e17 = e();
        kotlin.jvm.internal.o.f(e17, "getContainingDeclaration(...)");
        p06.k annotations = getAnnotations();
        kotlin.jvm.internal.o.f(annotations, "<get-annotations>(...)");
        n16.g name = getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        d26.p0 p0Var = new d26.p0(c0Var, e17, annotations, name, this.f368480i, this.f226036o, this.f226037p, this.f226038q, this.f226039r, this.f226040s);
        java.util.List m17 = m();
        f26.z0 v07 = v0();
        f26.d3 d3Var = f26.d3.f259143f;
        f26.o0 i17 = substitutor.i(v07, d3Var);
        kotlin.jvm.internal.o.f(i17, "safeSubstitute(...)");
        f26.z0 a17 = f26.r2.a(i17);
        f26.o0 i18 = substitutor.i(u0(), d3Var);
        kotlin.jvm.internal.o.f(i18, "safeSubstitute(...)");
        p0Var.w0(m17, a17, f26.r2.a(i18));
        return p0Var;
    }

    @Override // o06.j
    public f26.z0 k() {
        f26.z0 z0Var = this.f226044w;
        if (z0Var != null) {
            return z0Var;
        }
        kotlin.jvm.internal.o.o("defaultTypeImpl");
        throw null;
    }

    public o06.g s0() {
        if (f26.s0.a(u0())) {
            return null;
        }
        o06.j i17 = u0().w0().i();
        if (i17 instanceof o06.g) {
            return (o06.g) i17;
        }
        return null;
    }

    @Override // d26.a0
    public k16.k t() {
        return this.f226038q;
    }

    public f26.z0 u0() {
        f26.z0 z0Var = this.f226042u;
        if (z0Var != null) {
            return z0Var;
        }
        kotlin.jvm.internal.o.o("expandedType");
        throw null;
    }

    public f26.z0 v0() {
        f26.z0 z0Var = this.f226041t;
        if (z0Var != null) {
            return z0Var;
        }
        kotlin.jvm.internal.o.o("underlyingType");
        throw null;
    }

    public final void w0(java.util.List declaredTypeParameters, f26.z0 underlyingType, f26.z0 expandedType) {
        y16.s sVar;
        kotlin.jvm.internal.o.g(declaredTypeParameters, "declaredTypeParameters");
        kotlin.jvm.internal.o.g(underlyingType, "underlyingType");
        kotlin.jvm.internal.o.g(expandedType, "expandedType");
        this.f368481m = declaredTypeParameters;
        this.f226041t = underlyingType;
        this.f226042u = expandedType;
        this.f226043v = o06.i2.b(this);
        o06.g s07 = s0();
        if (s07 == null || (sVar = s07.A()) == null) {
            sVar = y16.r.f458973b;
        }
        this.f226044w = f26.z2.n(this, sVar, new r06.h(this));
    }
}
