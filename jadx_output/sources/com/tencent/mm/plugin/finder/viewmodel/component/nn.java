package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class nn extends com.tencent.mm.ui.component.UIComponent implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.j0 f135338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135338d = new androidx.lifecycle.j0(null);
    }

    public final bs2.a0 O6() {
        bs2.n1 R6 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).R6(35);
        if (R6 instanceof bs2.a0) {
            return (bs2.a0) R6;
        }
        return null;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        i95.m c17 = i95.n0.c(u60.g.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        i11.h e17 = i11.h.e();
        if (e17 != null) {
            e17.m(this);
        }
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((ey2.k0) a17).f257413g.onGetLocation(z17, f17, f18, i17, d17, d18, d19);
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128046yg).getValue()).r()).booleanValue();
        androidx.lifecycle.j0 j0Var = this.f135338d;
        if (booleanValue) {
            j0Var.setValue(new java.lang.Object());
            com.tencent.mars.xlog.Log.i("FinderLbsSameCityTabUIC", "force refresh!");
            return false;
        }
        ey2.d0 d0Var = new ey2.d0(f17, f18, 0L, 4, null);
        bs2.a0 O6 = O6();
        ey2.d0 d0Var2 = O6 != null ? O6.D : null;
        if (d0Var2 == null || j0Var.getValue() != null || kotlin.jvm.internal.o.b(d0Var2, d0Var)) {
            com.tencent.mars.xlog.Log.i("FinderLbsSameCityTabUIC", "oldLocation: " + d0Var2 + ", oldLocation equals to newLocation = " + kotlin.jvm.internal.o.b(d0Var2, d0Var) + ", needRefreshTab: " + j0Var.getValue());
            return false;
        }
        i95.m c19 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        if (((cq.k) c19).f221228i != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(r1.intValue());
            java.lang.Long l17 = (valueOf.longValue() > 0L ? 1 : (valueOf.longValue() == 0L ? 0 : -1)) > 0 ? valueOf : null;
            if (l17 != null) {
                long longValue = l17.longValue();
                double d27 = d0Var2.f257339b;
                double d28 = d0Var2.f257338a;
                double d29 = d0Var.f257339b;
                double d37 = d0Var.f257338a;
                double radians = java.lang.Math.toRadians(d29 - d27);
                double radians2 = java.lang.Math.toRadians(d37 - d28);
                double d38 = 2;
                double d39 = radians / d38;
                double d47 = radians2 / d38;
                double sin = (java.lang.Math.sin(d39) * java.lang.Math.sin(d39)) + (java.lang.Math.cos(java.lang.Math.toRadians(d27)) * java.lang.Math.cos(java.lang.Math.toRadians(d29)) * java.lang.Math.sin(d47) * java.lang.Math.sin(d47));
                if (6371000 * d38 * java.lang.Math.atan2(java.lang.Math.sqrt(sin), java.lang.Math.sqrt(1 - sin)) > longValue) {
                    com.tencent.mars.xlog.Log.i("FinderLbsSameCityTabUIC", "location has changed, need Refresh Tab!");
                    j0Var.postValue(new java.lang.Object());
                }
            }
        }
        return false;
    }
}
