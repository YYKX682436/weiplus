package n06;

/* loaded from: classes15.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final n06.f f333977d = new n06.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o06.v0 module = (o06.v0) obj;
        kotlin.jvm.internal.o.g(module, "module");
        r06.o0 o0Var = (r06.o0) module.Q(n06.i.f333982f);
        java.util.List list = (java.util.List) e26.b0.a(o0Var.f368497h, o0Var, r06.o0.f368494n[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (obj2 instanceof l06.d) {
                arrayList.add(obj2);
            }
        }
        return (l06.d) kz5.n0.X(arrayList);
    }
}
