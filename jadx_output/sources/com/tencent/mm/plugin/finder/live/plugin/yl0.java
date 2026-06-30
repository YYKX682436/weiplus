package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yl0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.km0 f115214d;

    public yl0(com.tencent.mm.plugin.finder.live.plugin.km0 km0Var) {
        this.f115214d = km0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.zv1 zv1Var = (r45.zv1) obj;
        if (zl2.r4.F1(this.f115214d.S0())) {
            this.f115214d.u1(true);
            return;
        }
        if (zv1Var == null || !zv1Var.getBoolean(0)) {
            pm0.v.d0(this.f115214d.f113285v, com.tencent.mm.plugin.finder.live.plugin.xl0.f115104d);
            this.f115214d.u1(false);
            return;
        }
        java.util.LinkedList linkedList = this.f115214d.f113285v;
        pm0.v.d0(linkedList, com.tencent.mm.plugin.finder.live.plugin.fm0.f112570d);
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.tl0(zv1Var));
        if (this.f115214d.f113281r < this.f115214d.f113285v.size()) {
            com.tencent.mm.plugin.finder.live.plugin.km0 km0Var = this.f115214d;
            java.lang.Object obj2 = km0Var.f113285v.get(km0Var.f113281r);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            km0Var.w1((com.tencent.mm.plugin.finder.live.plugin.tl0) obj2, false);
        }
        com.tencent.mm.plugin.finder.live.view.k0 Y0 = this.f115214d.Y0();
        if (Y0 != null && Y0.isScreenClear()) {
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.km0 km0Var2 = this.f115214d;
        if (km0Var2.f113284u) {
            km0Var2.f113284u = false;
            com.tencent.mm.plugin.finder.live.plugin.km0.t1(km0Var2);
        }
        this.f115214d.K0(0);
    }
}
