package g2;

/* loaded from: classes14.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final g2.d0 f267690d = new g2.d0();

    public d0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        w0.x xVar = a2.f1.f696a;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        a2.m1 m1Var = null;
        a2.d dVar = (kotlin.jvm.internal.o.b(obj, bool) || obj == null) ? null : (a2.d) ((w0.a0) xVar).a(obj);
        kotlin.jvm.internal.o.d(dVar);
        java.lang.Object obj2 = list.get(1);
        int i17 = a2.m1.f782c;
        w0.x xVar2 = a2.f1.f707l;
        if (!kotlin.jvm.internal.o.b(obj2, bool) && obj2 != null) {
            m1Var = (a2.m1) ((w0.a0) xVar2).a(obj2);
        }
        kotlin.jvm.internal.o.d(m1Var);
        return new g2.e0(dVar, m1Var.f783a, (a2.m1) null, 4, (kotlin.jvm.internal.i) null);
    }
}
