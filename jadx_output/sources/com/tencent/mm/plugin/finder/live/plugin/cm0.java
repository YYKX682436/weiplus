package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cm0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.km0 f112177d;

    public cm0(com.tencent.mm.plugin.finder.live.plugin.km0 km0Var) {
        this.f112177d = km0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.pm1 pm1Var = (r45.pm1) obj;
        if (zl2.r4.F1(this.f112177d.S0())) {
            this.f112177d.u1(true);
            return;
        }
        if (pm1Var != null) {
            java.util.LinkedList list = pm1Var.getList(0);
            if (!(list == null || list.isEmpty())) {
                java.util.LinkedList linkedList = this.f112177d.f113285v;
                pm0.v.d0(linkedList, com.tencent.mm.plugin.finder.live.plugin.em0.f112436d);
                java.util.LinkedList<r45.gh6> list2 = pm1Var.getList(0);
                if (list2 != null) {
                    for (r45.gh6 gh6Var : list2) {
                        kotlin.jvm.internal.o.d(gh6Var);
                        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.tl0(gh6Var));
                    }
                }
                if (this.f112177d.f113281r < this.f112177d.f113285v.size()) {
                    com.tencent.mm.plugin.finder.live.plugin.km0 km0Var = this.f112177d;
                    java.lang.Object obj2 = km0Var.f113285v.get(km0Var.f113281r);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    km0Var.w1((com.tencent.mm.plugin.finder.live.plugin.tl0) obj2, false);
                }
                com.tencent.mm.plugin.finder.live.view.k0 Y0 = this.f112177d.Y0();
                if (Y0 != null && Y0.isScreenClear()) {
                    return;
                }
                com.tencent.mm.plugin.finder.live.plugin.km0 km0Var2 = this.f112177d;
                if (km0Var2.f113284u) {
                    km0Var2.f113284u = false;
                    com.tencent.mm.plugin.finder.live.plugin.km0.t1(km0Var2);
                }
                this.f112177d.K0(0);
                return;
            }
        }
        pm0.v.d0(this.f112177d.f113285v, com.tencent.mm.plugin.finder.live.plugin.bm0.f112051d);
        this.f112177d.u1(false);
    }
}
