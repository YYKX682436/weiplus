package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class am0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.km0 f111906d;

    public am0(com.tencent.mm.plugin.finder.live.plugin.km0 km0Var) {
        this.f111906d = km0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        dk2.z7 z7Var = (dk2.z7) obj;
        if (zl2.r4.F1(this.f111906d.S0())) {
            this.f111906d.u1(true);
            return;
        }
        if (z7Var == null || !z7Var.f234425b) {
            pm0.v.d0(this.f111906d.f113285v, com.tencent.mm.plugin.finder.live.plugin.zl0.f115357d);
            this.f111906d.u1(false);
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.km0 km0Var = this.f111906d;
        r45.c04 c04Var = z7Var.f234424a;
        java.util.LinkedList linkedList = km0Var.f113285v;
        pm0.v.d0(linkedList, com.tencent.mm.plugin.finder.live.plugin.gm0.f112715d);
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.tl0(c04Var));
        if (this.f111906d.f113281r < this.f111906d.f113285v.size()) {
            com.tencent.mm.plugin.finder.live.plugin.km0 km0Var2 = this.f111906d;
            java.lang.Object obj2 = km0Var2.f113285v.get(km0Var2.f113281r);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            km0Var2.w1((com.tencent.mm.plugin.finder.live.plugin.tl0) obj2, false);
        }
        com.tencent.mm.plugin.finder.live.view.k0 Y0 = this.f111906d.Y0();
        if (Y0 != null && Y0.isScreenClear()) {
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.km0 km0Var3 = this.f111906d;
        if (km0Var3.f113284u) {
            km0Var3.f113284u = false;
            com.tencent.mm.plugin.finder.live.plugin.km0.t1(km0Var3);
        }
        this.f111906d.K0(0);
    }
}
