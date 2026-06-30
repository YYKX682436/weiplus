package r06;

/* loaded from: classes16.dex */
public abstract class l extends r06.w implements o06.d2 {

    /* renamed from: h, reason: collision with root package name */
    public final e26.c0 f368479h;

    /* renamed from: i, reason: collision with root package name */
    public final o06.g0 f368480i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f368481m;

    /* renamed from: n, reason: collision with root package name */
    public final r06.k f368482n;

    static {
        kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(r06.l.class), "constructors", "getConstructors()Ljava/util/Collection;"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e26.c0 storageManager, o06.m containingDeclaration, p06.k annotations, n16.g name, o06.x1 sourceElement, o06.g0 visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.o.g(annotations, "annotations");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(sourceElement, "sourceElement");
        kotlin.jvm.internal.o.g(visibilityImpl, "visibilityImpl");
        this.f368479h = storageManager;
        this.f368480i = visibilityImpl;
        ((e26.u) storageManager).b(new r06.i(this));
        this.f368482n = new r06.k(this);
    }

    @Override // r06.w, r06.v, o06.m
    public o06.j a() {
        return this;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.j
    public f26.c2 g() {
        return this.f368482n;
    }

    @Override // o06.q, o06.r0
    public o06.g0 getVisibility() {
        return this.f368480i;
    }

    @Override // o06.r0
    public boolean isExternal() {
        return false;
    }

    @Override // r06.w
    /* renamed from: j0 */
    public o06.p a() {
        return this;
    }

    @Override // o06.r0
    public boolean l0() {
        return false;
    }

    @Override // o06.k
    public java.util.List m() {
        java.util.List list = this.f368481m;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.o.o("declaredTypeParametersImpl");
        throw null;
    }

    @Override // o06.k
    public boolean p() {
        return f26.z2.c(((d26.p0) this).v0(), new r06.j(this));
    }

    @Override // r06.v
    public java.lang.String toString() {
        return "typealias " + getName().h();
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(visitor, "visitor");
        return visitor.c(this, obj);
    }

    @Override // r06.w, r06.v, o06.m
    public o06.m a() {
        return this;
    }
}
