package e22;

/* loaded from: classes14.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f246617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f246618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f246619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f246620g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f246621h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.util.List list, e22.d1 d1Var, boolean z17, yz5.l lVar, yz5.a aVar) {
        super(4);
        this.f246617d = list;
        this.f246618e = d1Var;
        this.f246619f = z17;
        this.f246620g = lVar;
        this.f246621h = aVar;
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
        com.tencent.mm.protocal.protobuf.FinderObject finder = (com.tencent.mm.protocal.protobuf.FinderObject) this.f246617d.get(intValue);
        e22.d1 d1Var = this.f246618e;
        d1Var.getClass();
        kotlin.jvm.internal.o.g(finder, "finder");
        boolean contains = d1Var.f246639m.contains(finder);
        boolean z17 = this.f246619f && !contains;
        int i18 = z0.t.f468922q1;
        e22.a1.i(a0.d0.d(z0.p.f468921d, !z17, null, null, new e22.x(this.f246620g, finder), 6, null), finder, contains, z17, new e22.y(this.f246619f, contains, this.f246621h, this.f246618e, finder), oVar, 64, 0);
        return jz5.f0.f302826a;
    }
}
