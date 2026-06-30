package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f141383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.i0 f141384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(java.util.List list, x0.i0 i0Var) {
        super(4);
        this.f141383d = list;
        this.f141384e = i0Var;
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
        com.tencent.mm.plugin.game.ui.i2 i2Var = (com.tencent.mm.plugin.game.ui.i2) this.f141383d.get(intValue);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        l0.a2.a(d0.a2.h(d0.a3.f(pVar, 0.0f, 1, null), 0.0f, 12, 1, null), null, e1.y.f246315f, 0L, null, 0.0f, u0.j.b(oVar, 1817817132, true, new com.tencent.mm.plugin.game.ui.c2(i2Var, this.f141384e)), oVar, 1573254, 58);
        l0.a0.a(d0.a2.j(pVar, 16, 0.0f, 0.0f, 0.0f, 14, null), e1.a0.c(4293783021L), (float) 0.8d, 0.0f, oVar, 438, 8);
        return jz5.f0.f302826a;
    }
}
