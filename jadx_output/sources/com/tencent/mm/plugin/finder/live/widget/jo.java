package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class jo implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.lo f118767d;

    public jo(com.tencent.mm.plugin.finder.live.widget.lo loVar) {
        this.f118767d = loVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        yz5.l lVar;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.widget.lo loVar = this.f118767d;
        vm2.b0 b0Var = (vm2.b0) kz5.n0.a0(loVar.f118966j, i17);
        if (b0Var == null || (lVar = loVar.f118967k) == null) {
            return;
        }
        lVar.invoke(b0Var);
    }
}
