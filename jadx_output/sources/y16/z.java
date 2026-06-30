package y16;

/* loaded from: classes16.dex */
public final class z extends y16.t {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f458977f = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(y16.z.class), "functions", "getFunctions()Ljava/util/List;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(y16.z.class), "properties", "getProperties()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    public final o06.g f458978b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f458979c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.x f458980d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.x f458981e;

    public z(e26.c0 storageManager, o06.g containingClass, boolean z17) {
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(containingClass, "containingClass");
        this.f458978b = containingClass;
        this.f458979c = z17;
        containingClass.j();
        o06.h hVar = o06.h.f341960d;
        e26.u uVar = (e26.u) storageManager;
        this.f458980d = uVar.b(new y16.x(this));
        this.f458981e = uVar.b(new y16.y(this));
    }

    @Override // y16.t, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        java.util.List list = (java.util.List) e26.b0.a(this.f458980d, this, f458977f[0]);
        o26.q qVar = new o26.q();
        for (java.lang.Object obj : list) {
            if (kotlin.jvm.internal.o.b(((r06.v) ((o06.v1) obj)).getName(), name)) {
                qVar.add(obj);
            }
        }
        return qVar;
    }

    @Override // y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        java.util.List list = (java.util.List) e26.b0.a(this.f458981e, this, f458977f[1]);
        o26.q qVar = new o26.q();
        for (java.lang.Object obj : list) {
            if (kotlin.jvm.internal.o.b(((o06.o1) obj).getName(), name)) {
                qVar.add(obj);
            }
        }
        return qVar;
    }

    @Override // y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return null;
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        e26.x xVar = this.f458980d;
        f06.v[] vVarArr = f458977f;
        return kz5.n0.t0((java.util.List) e26.b0.a(xVar, this, vVarArr[0]), (java.util.List) e26.b0.a(this.f458981e, this, vVarArr[1]));
    }
}
