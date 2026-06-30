package mo1;

/* loaded from: classes14.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f330272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f330273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.util.List list, yz5.p pVar) {
        super(4);
        this.f330272d = list;
        this.f330273e = pVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(items, "$this$items");
        if ((intValue2 & 14) == 0) {
            i17 = (((n0.y0) oVar).e(items) ? 4 : 2) | intValue2;
        } else {
            i17 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            i17 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((i17 & 731) == 146) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        com.tencent.wechat.aff.affroam.g gVar = (com.tencent.wechat.aff.affroam.g) this.f330272d.get(intValue);
        int i18 = z0.t.f468922q1;
        u0.a b17 = u0.j.b(oVar, -1525931573, true, new mo1.z(gVar, this.f330273e));
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(1956755640);
        i0.a aVar = ((l0.q1) y0Var2.i(l0.s1.f314508a)).f314470b;
        long k17 = ((l0.i) y0Var2.i(l0.k.f314314a)).k();
        l0.a2.a(d0.a2.f(z0.p.f468921d, 8), aVar, k17, l0.k.b(k17, y0Var2, 0), null, 4, b17, y0Var2, 1769478, 0);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
