package i06;

/* loaded from: classes16.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k0 f286631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i06.k0 k0Var) {
        super(0);
        this.f286631d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        i06.k0 k0Var = this.f286631d;
        o06.d l17 = k0Var.l();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i18 = 0;
        if (k0Var.o()) {
            i17 = 0;
        } else {
            o06.r1 g17 = i06.o4.g(l17);
            if (g17 != null) {
                arrayList.add(new i06.u2(k0Var, 0, f06.n.f258454d, new i06.b0(g17)));
                i17 = 1;
            } else {
                i17 = 0;
            }
            o06.r1 c07 = l17.c0();
            if (c07 != null) {
                arrayList.add(new i06.u2(k0Var, i17, f06.n.f258455e, new i06.c0(c07)));
                i17++;
            }
        }
        int size = l17.W().size();
        while (i18 < size) {
            arrayList.add(new i06.u2(k0Var, i17, f06.n.f258456f, new i06.d0(l17, i18)));
            i18++;
            i17++;
        }
        if (k0Var.n() && (l17 instanceof z06.a) && arrayList.size() > 1) {
            kz5.g0.t(arrayList, new i06.e0());
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
