package t16;

/* loaded from: classes15.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t16.s f414620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t16.s sVar) {
        super(0);
        this.f414620d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = true;
        t16.s sVar = this.f414620d;
        f26.z0 k17 = sVar.h().k("Comparable").k();
        kotlin.jvm.internal.o.f(k17, "getDefaultType(...)");
        java.util.List k18 = kz5.c0.k(f26.r2.d(k17, kz5.b0.c(new f26.n2(f26.d3.f259144g, sVar.f414625d)), null, 2, null));
        o06.v0 v0Var = sVar.f414623b;
        kotlin.jvm.internal.o.g(v0Var, "<this>");
        f26.z0[] z0VarArr = new f26.z0[4];
        l06.o h17 = v0Var.h();
        h17.getClass();
        f26.z0 t17 = h17.t(l06.r.f314900p);
        if (t17 == null) {
            l06.o.a(59);
            throw null;
        }
        z0VarArr[0] = t17;
        l06.o h18 = v0Var.h();
        h18.getClass();
        f26.z0 t18 = h18.t(l06.r.f314902r);
        if (t18 == null) {
            l06.o.a(60);
            throw null;
        }
        z0VarArr[1] = t18;
        l06.o h19 = v0Var.h();
        h19.getClass();
        f26.z0 t19 = h19.t(l06.r.f314898n);
        if (t19 == null) {
            l06.o.a(57);
            throw null;
        }
        z0VarArr[2] = t19;
        l06.o h27 = v0Var.h();
        h27.getClass();
        f26.z0 t27 = h27.t(l06.r.f314899o);
        if (t27 == null) {
            l06.o.a(58);
            throw null;
        }
        z0VarArr[3] = t27;
        java.util.List i17 = kz5.c0.i(z0VarArr);
        if (!i17.isEmpty()) {
            java.util.Iterator it = i17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!(!sVar.f414624c.contains((f26.o0) it.next()))) {
                    z17 = false;
                    break;
                }
            }
        }
        if (!z17) {
            f26.z0 k19 = sVar.h().k("Number").k();
            if (k19 == null) {
                l06.o.a(56);
                throw null;
            }
            k18.add(k19);
        }
        return k18;
    }
}
