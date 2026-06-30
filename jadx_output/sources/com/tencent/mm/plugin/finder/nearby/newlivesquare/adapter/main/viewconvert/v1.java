package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class v1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.t f121980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w1 f121981e;

    public v1(vp2.t tVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w1 w1Var) {
        this.f121980d = tVar;
        this.f121981e = w1Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        vp2.t tVar = this.f121980d;
        if (i17 > tVar.f438956e.size()) {
            return;
        }
        java.lang.Object obj = tVar.f438956e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        android.content.Context context = holder.f293121e;
        if ((context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null) != null) {
            vp2.s sVar = j5Var instanceof vp2.s ? (vp2.s) j5Var : null;
            if (sVar != null) {
                r45.pw1 pw1Var = sVar.f438954d;
                int integer = pw1Var.getInteger(0);
                com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w1 w1Var = this.f121981e;
                if (integer == 1) {
                    w1Var.f121998e.p(sVar);
                } else if (integer != 2) {
                    pw1Var.getInteger(0);
                } else {
                    w1Var.f121998e.d(sVar);
                }
            }
        }
    }
}
