package y16;

/* loaded from: classes16.dex */
public abstract class l extends y16.t {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f458965d = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(y16.l.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    public final o06.g f458966b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.x f458967c;

    public l(e26.c0 storageManager, o06.g containingClass) {
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(containingClass, "containingClass");
        this.f458966b = containingClass;
        this.f458967c = ((e26.u) storageManager).b(new y16.j(this));
    }

    @Override // y16.t, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        java.util.List list = (java.util.List) e26.b0.a(this.f458967c, this, f458965d[0]);
        if (list.isEmpty()) {
            return kz5.p0.f313996d;
        }
        o26.q qVar = new o26.q();
        for (java.lang.Object obj : list) {
            if ((obj instanceof o06.v1) && kotlin.jvm.internal.o.b(((r06.v) ((o06.v1) obj)).getName(), name)) {
                qVar.add(obj);
            }
        }
        return qVar;
    }

    @Override // y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        java.util.List list = (java.util.List) e26.b0.a(this.f458967c, this, f458965d[0]);
        if (list.isEmpty()) {
            return kz5.p0.f313996d;
        }
        o26.q qVar = new o26.q();
        for (java.lang.Object obj : list) {
            if ((obj instanceof o06.o1) && kotlin.jvm.internal.o.b(((o06.o1) obj).getName(), name)) {
                qVar.add(obj);
            }
        }
        return qVar;
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        return !kindFilter.a(y16.i.f458954n.f458961b) ? kz5.p0.f313996d : (java.util.List) e26.b0.a(this.f458967c, this, f458965d[0]);
    }

    public abstract java.util.List h();
}
