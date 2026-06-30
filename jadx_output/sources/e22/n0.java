package e22;

/* loaded from: classes14.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f246689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f246690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(java.util.List list, yz5.l lVar) {
        super(4);
        this.f246689d = list;
        this.f246690e = lVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        f0.x items = (f0.x) obj;
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
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) this.f246689d.get(intValue);
        int i18 = z0.t.f468922q1;
        e22.a1.h(a0.d0.d(z0.p.f468921d, false, null, null, new e22.k0(this.f246690e, finderObject), 7, null), finderObject, oVar, 64, 0);
        return jz5.f0.f302826a;
    }
}
