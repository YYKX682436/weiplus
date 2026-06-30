package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class da0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f112243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f112244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(java.lang.Object obj, com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var) {
        super(0);
        this.f112243d = obj;
        this.f112244e = ea0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var;
        java.lang.Object obj = this.f112243d;
        boolean z17 = obj instanceof cm2.k0;
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f112244e;
        if (z17) {
            com.tencent.mars.xlog.Log.i(ea0Var.f112390t, "update coupon " + obj);
            ea0Var.y1().i((cm2.k0) obj, true);
        } else if (obj instanceof cm2.m0) {
            com.tencent.mars.xlog.Log.i(ea0Var.f112390t, "update goods  " + obj);
            cm2.m0 m0Var = (cm2.m0) obj;
            xt2.e3.j(ea0Var.y1(), m0Var.f43368v, true, false, 4, null);
            com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var2 = (com.tencent.mm.plugin.finder.live.plugin.ga0) ea0Var.X0(com.tencent.mm.plugin.finder.live.plugin.ga0.class);
            boolean z18 = false;
            if (ga0Var2 != null) {
                st2.h1 h1Var = ga0Var2.f112668r;
                if (h1Var != null && h1Var.h().isShowing) {
                    z18 = true;
                }
            }
            if (z18 && (ga0Var = (com.tencent.mm.plugin.finder.live.plugin.ga0) ea0Var.X0(com.tencent.mm.plugin.finder.live.plugin.ga0.class)) != null) {
                r45.y23 productInfo = m0Var.f43368v;
                kotlin.jvm.internal.o.g(productInfo, "productInfo");
                st2.h1 h1Var2 = ga0Var.f112668r;
                if (h1Var2 != null) {
                    java.lang.Object d17 = ((mm2.f6) h1Var2.f412335f.a(mm2.f6.class)).f329039o.d(new st2.m0(productInfo));
                    cm2.m0 m0Var2 = d17 instanceof cm2.m0 ? (cm2.m0) d17 : null;
                    if (m0Var2 != null) {
                        m0Var2.f43368v.set(52, (r45.t42) productInfo.getCustom(52));
                        h1Var2.P.U(-1, m0Var2.f43368v, 6);
                    } else {
                        com.tencent.mars.xlog.Log.e("Finder.LiveShoppingListPlugin", "onUpdateCountdownAnim for product " + productInfo.getString(1) + " real product not found");
                    }
                }
            }
            xt2.e3 y17 = ea0Var.y1();
            y17.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on bubble update, animInfo = ");
            r45.t42 t42Var = (r45.t42) m0Var.f43368v.getCustom(52);
            sb6.append(t42Var != null ? t42Var.toJSON() : null);
            com.tencent.mars.xlog.Log.i(y17.f456706h, sb6.toString());
            r45.t42 t42Var2 = (r45.t42) m0Var.f43368v.getCustom(52);
            if (t42Var2 != null) {
                ((mm2.f6) y17.f456705g.P0(mm2.f6.class)).E1.put(java.lang.Long.valueOf(m0Var.f43369w), t42Var2);
                y17.A.b(m0Var.f43369w, t42Var2, "bubble");
            }
        }
        return jz5.f0.f302826a;
    }
}
