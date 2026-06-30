package x06;

/* loaded from: classes15.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final x06.z0 f451341d = new x06.z0();

    public z0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o06.d b17;
        java.lang.String b18;
        o06.d it = (o06.d) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = false;
        if (l06.o.A(it)) {
            x06.j jVar = x06.j.f451264m;
            x06.d1 d1Var = null;
            if (x06.g1.f451247f.contains(it.getName()) && (b17 = v16.f.b(it, false, x06.i.f451259d, 1, null)) != null && (b18 = g16.w0.b(b17)) != null) {
                d1Var = ((java.util.ArrayList) x06.g1.f451244c).contains(b18) ? x06.d1.f451229d : ((x06.f1) kz5.c1.h(x06.g1.f451246e, b18)) == x06.f1.f451235e ? x06.d1.f451231f : x06.d1.f451230e;
            }
            if (d1Var != null) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
