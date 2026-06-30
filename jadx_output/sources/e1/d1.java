package e1;

/* loaded from: classes14.dex */
public final class d1 extends androidx.compose.ui.platform.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final float f246235d;

    /* renamed from: e, reason: collision with root package name */
    public final float f246236e;

    /* renamed from: f, reason: collision with root package name */
    public final float f246237f;

    /* renamed from: g, reason: collision with root package name */
    public final float f246238g;

    /* renamed from: h, reason: collision with root package name */
    public final float f246239h;

    /* renamed from: i, reason: collision with root package name */
    public final float f246240i;

    /* renamed from: m, reason: collision with root package name */
    public final float f246241m;

    /* renamed from: n, reason: collision with root package name */
    public final float f246242n;

    /* renamed from: o, reason: collision with root package name */
    public final float f246243o;

    /* renamed from: p, reason: collision with root package name */
    public final float f246244p;

    /* renamed from: q, reason: collision with root package name */
    public final long f246245q;

    /* renamed from: r, reason: collision with root package name */
    public final e1.a1 f246246r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f246247s;

    /* renamed from: t, reason: collision with root package name */
    public final long f246248t;

    /* renamed from: u, reason: collision with root package name */
    public final long f246249u;

    /* renamed from: v, reason: collision with root package name */
    public final yz5.l f246250v;

    public d1(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, float f47, long j17, e1.a1 a1Var, boolean z17, e1.w0 w0Var, long j18, long j19, yz5.l lVar, kotlin.jvm.internal.i iVar) {
        super(lVar);
        this.f246235d = f17;
        this.f246236e = f18;
        this.f246237f = f19;
        this.f246238g = f27;
        this.f246239h = f28;
        this.f246240i = f29;
        this.f246241m = f37;
        this.f246242n = f38;
        this.f246243o = f39;
        this.f246244p = f47;
        this.f246245q = j17;
        this.f246246r = a1Var;
        this.f246247s = z17;
        this.f246248t = j18;
        this.f246249u = j19;
        this.f246250v = new e1.b1(this);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i0
    public int O(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.d(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.a(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.c(this, uVar, tVar, i17);
    }

    public boolean equals(java.lang.Object obj) {
        e1.d1 d1Var = obj instanceof e1.d1 ? (e1.d1) obj : null;
        if (d1Var == null) {
            return false;
        }
        if (!(this.f246235d == d1Var.f246235d)) {
            return false;
        }
        if (!(this.f246236e == d1Var.f246236e)) {
            return false;
        }
        if (!(this.f246237f == d1Var.f246237f)) {
            return false;
        }
        if (!(this.f246238g == d1Var.f246238g)) {
            return false;
        }
        if (!(this.f246239h == d1Var.f246239h)) {
            return false;
        }
        if (!(this.f246240i == d1Var.f246240i)) {
            return false;
        }
        if (!(this.f246241m == d1Var.f246241m)) {
            return false;
        }
        if (!(this.f246242n == d1Var.f246242n)) {
            return false;
        }
        if (!(this.f246243o == d1Var.f246243o)) {
            return false;
        }
        if (!(this.f246244p == d1Var.f246244p)) {
            return false;
        }
        int i17 = e1.i1.f246273c;
        return ((this.f246245q > d1Var.f246245q ? 1 : (this.f246245q == d1Var.f246245q ? 0 : -1)) == 0) && kotlin.jvm.internal.o.b(this.f246246r, d1Var.f246246r) && this.f246247s == d1Var.f246247s && kotlin.jvm.internal.o.b(null, null) && e1.y.c(this.f246248t, d1Var.f246248t) && e1.y.c(this.f246249u, d1Var.f246249u);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        return s1.v0.b(measure, m17.f402050d, m17.f402051e, null, new e1.c1(m17, this), 4, null);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((java.lang.Float.hashCode(this.f246235d) * 31) + java.lang.Float.hashCode(this.f246236e)) * 31) + java.lang.Float.hashCode(this.f246237f)) * 31) + java.lang.Float.hashCode(this.f246238g)) * 31) + java.lang.Float.hashCode(this.f246239h)) * 31) + java.lang.Float.hashCode(this.f246240i)) * 31) + java.lang.Float.hashCode(this.f246241m)) * 31) + java.lang.Float.hashCode(this.f246242n)) * 31) + java.lang.Float.hashCode(this.f246243o)) * 31) + java.lang.Float.hashCode(this.f246244p)) * 31;
        int i17 = e1.i1.f246273c;
        int hashCode2 = (((((((hashCode + java.lang.Long.hashCode(this.f246245q)) * 31) + this.f246246r.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f246247s)) * 31) + 0) * 31;
        int i18 = e1.y.f246321l;
        return ((hashCode2 + java.lang.Long.hashCode(this.f246248t)) * 31) + java.lang.Long.hashCode(this.f246249u);
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this, obj);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb6.append(this.f246235d);
        sb6.append(", scaleY=");
        sb6.append(this.f246236e);
        sb6.append(", alpha = ");
        sb6.append(this.f246237f);
        sb6.append(", translationX=");
        sb6.append(this.f246238g);
        sb6.append(", translationY=");
        sb6.append(this.f246239h);
        sb6.append(", shadowElevation=");
        sb6.append(this.f246240i);
        sb6.append(", rotationX=");
        sb6.append(this.f246241m);
        sb6.append(", rotationY=");
        sb6.append(this.f246242n);
        sb6.append(", rotationZ=");
        sb6.append(this.f246243o);
        sb6.append(", cameraDistance=");
        sb6.append(this.f246244p);
        sb6.append(", transformOrigin=");
        int i17 = e1.i1.f246273c;
        sb6.append((java.lang.Object) ("TransformOrigin(packedValue=" + this.f246245q + ')'));
        sb6.append(", shape=");
        sb6.append(this.f246246r);
        sb6.append(", clip=");
        sb6.append(this.f246247s);
        sb6.append(", renderEffect=null, ambientShadowColor=");
        sb6.append((java.lang.Object) e1.y.i(this.f246248t));
        sb6.append(", spotShadowColor=");
        sb6.append((java.lang.Object) e1.y.i(this.f246249u));
        sb6.append(')');
        return sb6.toString();
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // s1.i0
    public int x(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.b(this, uVar, tVar, i17);
    }
}
