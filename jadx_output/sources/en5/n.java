package en5;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f255466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.util.ArrayList arrayList, yz5.l lVar) {
        super(4);
        this.f255466d = arrayList;
        this.f255467e = lVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(items, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) == 144) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj5 = n0.e1.f333492a;
        int i17 = z0.t.f468922q1;
        float f17 = 8;
        z0.t h17 = d0.a3.h(z0.p.f468921d, ((float) 7.5d) * f17);
        yz5.l lVar = this.f255467e;
        java.util.ArrayList arrayList = this.f255466d;
        en5.n0.c(b1.d.a(a0.d0.d(h17, false, null, null, new en5.m(lVar, arrayList, intValue), 7, null), i0.h.a(1 * f17)), ((aq.a) arrayList.get(intValue)).f12827b, null, null, oVar, 0, 12);
        return jz5.f0.f302826a;
    }
}
