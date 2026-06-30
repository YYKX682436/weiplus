package r06;

/* loaded from: classes15.dex */
public final class x0 extends r06.v implements o06.v0 {

    /* renamed from: f, reason: collision with root package name */
    public final e26.c0 f368548f;

    /* renamed from: g, reason: collision with root package name */
    public final l06.o f368549g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f368550h;

    /* renamed from: i, reason: collision with root package name */
    public final r06.c1 f368551i;

    /* renamed from: m, reason: collision with root package name */
    public r06.t0 f368552m;

    /* renamed from: n, reason: collision with root package name */
    public o06.e1 f368553n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f368554o;

    /* renamed from: p, reason: collision with root package name */
    public final e26.v f368555p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f368556q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(n16.g moduleName, e26.c0 storageManager, l06.o builtIns, o16.a aVar, java.util.Map capabilities, n16.g gVar, int i17, kotlin.jvm.internal.i iVar) {
        super(p06.i.f350765a, moduleName);
        capabilities = (i17 & 16) != 0 ? kz5.q0.f314001d : capabilities;
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(builtIns, "builtIns");
        kotlin.jvm.internal.o.g(capabilities, "capabilities");
        int i18 = p06.k.Z0;
        this.f368548f = storageManager;
        this.f368549g = builtIns;
        if (!moduleName.f334170e) {
            throw new java.lang.IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f368550h = capabilities;
        r06.c1.f368376a.getClass();
        r06.c1 c1Var = (r06.c1) I(r06.a1.f368370b);
        this.f368551i = c1Var == null ? r06.b1.f368373b : c1Var;
        this.f368554o = true;
        this.f368555p = ((e26.u) storageManager).c(new r06.w0(this));
        this.f368556q = jz5.h.b(new r06.v0(this));
    }

    @Override // o06.v0
    public java.lang.Object I(o06.u0 capability) {
        kotlin.jvm.internal.o.g(capability, "capability");
        java.lang.Object obj = this.f368550h.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // o06.v0
    public java.util.List K() {
        r06.t0 t0Var = this.f368552m;
        if (t0Var != null) {
            return ((r06.u0) t0Var).f368539c;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Dependencies of module ");
        java.lang.String str = getName().f334169d;
        kotlin.jvm.internal.o.f(str, "toString(...)");
        sb6.append(str);
        sb6.append(" were not set");
        throw new java.lang.AssertionError(sb6.toString());
    }

    @Override // o06.v0
    public o06.k1 Q(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        j0();
        return (o06.k1) ((e26.r) this.f368555p).invoke(fqName);
    }

    @Override // o06.v0
    public boolean b0(o06.v0 targetModule) {
        kotlin.jvm.internal.o.g(targetModule, "targetModule");
        if (kotlin.jvm.internal.o.b(this, targetModule)) {
            return true;
        }
        r06.t0 t0Var = this.f368552m;
        kotlin.jvm.internal.o.d(t0Var);
        return kz5.n0.O(((r06.u0) t0Var).f368538b, targetModule) || K().contains(targetModule) || targetModule.K().contains(this);
    }

    @Override // o06.m
    public o06.m e() {
        return null;
    }

    @Override // o06.v0
    public l06.o h() {
        return this.f368549g;
    }

    public void j0() {
        if (this.f368554o) {
            return;
        }
        o06.u0 u0Var = o06.q0.f341979a;
        android.support.v4.media.f.a(I(o06.q0.f341979a));
        throw new o06.p0("Accessing invalid module descriptor " + this);
    }

    @Override // o06.v0
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        j0();
        j0();
        return ((r06.u) ((jz5.n) this.f368556q).getValue()).l(fqName, nameFilter);
    }

    @Override // r06.v
    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(r06.v.P(this));
        if (!this.f368554o) {
            sb6.append(" !isValid");
        }
        sb6.append(" packageFragmentProvider: ");
        o06.e1 e1Var = this.f368553n;
        sb6.append(e1Var != null ? e1Var.getClass().getSimpleName() : null);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(visitor, "visitor");
        return visitor.d(this, obj);
    }
}
