package m06;

/* loaded from: classes15.dex */
public final class a implements q06.c {

    /* renamed from: a, reason: collision with root package name */
    public final e26.c0 f322589a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.v0 f322590b;

    public a(e26.c0 storageManager, o06.v0 module) {
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(module, "module");
        this.f322589a = storageManager;
        this.f322590b = module;
    }

    @Override // q06.c
    public boolean a(n16.c packageFqName, n16.g name) {
        kotlin.jvm.internal.o.g(packageFqName, "packageFqName");
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String h17 = name.h();
        kotlin.jvm.internal.o.f(h17, "asString(...)");
        if (!r26.i0.y(h17, "Function", false) && !r26.i0.y(h17, "KFunction", false) && !r26.i0.y(h17, "SuspendFunction", false) && !r26.i0.y(h17, "KSuspendFunction", false)) {
            return false;
        }
        m06.o oVar = m06.o.f322611b;
        return m06.o.f322611b.a(packageFqName, h17) != null;
    }

    @Override // q06.c
    public java.util.Collection b(n16.c packageFqName) {
        kotlin.jvm.internal.o.g(packageFqName, "packageFqName");
        return kz5.r0.f314002d;
    }

    @Override // q06.c
    public o06.g c(n16.b classId) {
        kotlin.jvm.internal.o.g(classId, "classId");
        if (classId.f334158c || classId.k()) {
            return null;
        }
        java.lang.String b17 = classId.i().b();
        if (!r26.n0.B(b17, "Function", false)) {
            return null;
        }
        n16.c h17 = classId.h();
        kotlin.jvm.internal.o.f(h17, "getPackageFqName(...)");
        m06.n a17 = m06.o.f322611b.a(h17, b17);
        if (a17 == null) {
            return null;
        }
        r06.o0 o0Var = (r06.o0) this.f322590b.Q(h17);
        java.util.List list = (java.util.List) e26.b0.a(o0Var.f368497h, o0Var, r06.o0.f368494n[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof l06.d) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        android.support.v4.media.f.a(kz5.n0.Z(arrayList2));
        return new m06.c(this.f322589a, (l06.d) kz5.n0.X(arrayList), a17.f322609a, a17.f322610b);
    }
}
