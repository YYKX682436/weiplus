package d26;

/* loaded from: classes16.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f226051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d26.x xVar) {
        super(0);
        this.f226051d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        d26.x xVar = this.f226051d;
        xVar.getClass();
        o06.t0 t0Var = o06.t0.f341986f;
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (xVar.f226057o != t0Var) {
            return p0Var;
        }
        java.util.List<java.lang.Integer> list = xVar.f226053h.A;
        kotlin.jvm.internal.o.d(list);
        if (!(!list.isEmpty())) {
            if (xVar.f() != t0Var) {
                return p0Var;
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            o06.m e17 = xVar.e();
            if (e17 instanceof o06.d1) {
                r16.b.a(xVar, linkedHashSet, ((o06.d1) e17).V(), false);
            }
            y16.s z17 = xVar.z();
            kotlin.jvm.internal.o.f(z17, "getUnsubstitutedInnerClassesScope(...)");
            r16.b.a(xVar, linkedHashSet, z17, true);
            return kz5.n0.F0(linkedHashSet, new r16.a());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer num : list) {
            b26.t tVar = xVar.f226060r;
            b26.q qVar = tVar.f17515a;
            kotlin.jvm.internal.o.d(num);
            o06.g b17 = qVar.b(b26.t0.a(tVar.f17516b, num.intValue()));
            if (b17 != null) {
                arrayList.add(b17);
            }
        }
        return arrayList;
    }
}
