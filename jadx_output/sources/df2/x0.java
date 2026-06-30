package df2;

/* loaded from: classes3.dex */
public final class x0 implements com.tencent.mm.plugin.finder.live.util.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d1 f231751d;

    public x0(df2.d1 d1Var) {
        this.f231751d = d1Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.util.k1
    public void N(com.tencent.mm.plugin.finder.live.util.m1 giftType, java.util.List appendList) {
        r45.qv1 qv1Var;
        kotlin.jvm.internal.o.g(giftType, "giftType");
        kotlin.jvm.internal.o.g(appendList, "appendList");
        df2.d1 d1Var = this.f231751d;
        if (pm0.v.z(((mm2.c1) d1Var.business(mm2.c1.class)).f328807g2, 524288)) {
            return;
        }
        java.util.ArrayList<com.tencent.mm.plugin.finder.live.util.l1> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : appendList) {
            com.tencent.mm.plugin.finder.live.util.l1 l1Var = (com.tencent.mm.plugin.finder.live.util.l1) obj;
            boolean z17 = false;
            if (l1Var.f115602t) {
                r45.kv1 kv1Var = (r45.kv1) l1Var.f115592g.getCustom(3);
                if (((kv1Var == null || (qv1Var = (r45.qv1) kv1Var.getCustom(23)) == null) ? 0 : qv1Var.getInteger(1)) > 0 && (kotlin.jvm.internal.o.b(l1Var.f115601s, xy2.c.e(d1Var.O6())) || kotlin.jvm.internal.o.b(l1Var.f115601s, c01.z1.r()) || kotlin.jvm.internal.o.b(l1Var.f115601s, ((mm2.c1) d1Var.business(mm2.c1.class)).I7().getString(3)))) {
                    z17 = true;
                }
            }
            if (z17) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (com.tencent.mm.plugin.finder.live.util.l1 l1Var2 : arrayList) {
            com.tencent.mars.xlog.Log.i(d1Var.f229933m, "batchGifts targetusername:" + l1Var2.f115601s);
            arrayList2.add(new df2.w6(df2.x6.f231762e, l1Var2, null));
        }
        com.tencent.mars.xlog.Log.i(d1Var.f229933m, "fallingGifts ".concat(kz5.n0.g0(arrayList2, null, null, null, 0, null, df2.w0.f231648d, 31, null)));
        df2.a7 a7Var = (df2.a7) d1Var.controller(df2.a7.class);
        if (a7Var != null) {
            a7Var.Z6(d1Var.f229933m, arrayList2);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.util.k1
    public void y() {
    }
}
