package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class p4 implements in5.x, in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154510d;

    public p4(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154510d = s4Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        vr3.b0 b0Var = (vr3.b0) holder.f293125i;
        r45.mm mmVar = b0Var.f439623d;
        int i18 = mmVar.f380636e;
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = this.f154510d;
        if (i18 == 0) {
            s4Var.getClass();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) s4Var.f154553e, 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.profile.ui.tab.f3(b0Var);
            k0Var.f211881s = new com.tencent.mm.plugin.profile.ui.tab.g3(s4Var, b0Var, i17);
            k0Var.v();
        } else if (i18 == 1 || i18 == 2 || i18 == 5 || i18 == 6) {
            s4Var.v(mmVar, i17, -1);
        } else {
            com.tencent.mars.xlog.Log.i("ContactWidgetTabBizHeaderView", "illegal service type(" + b0Var.f439623d.f380636e + "), ignore.");
        }
        com.tencent.mm.storage.z3 z3Var = s4Var.f154555f;
        kotlin.jvm.internal.o.d(z3Var);
        java.lang.String d17 = z3Var.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = s4Var.f154551d;
        gr3.e.d(d17, 1100, m0Var.D, s4Var.f154553e.getIntent(), m0Var.L, m0Var.f154467v, 0, null, null, null, 0, 0, 4032, null);
    }
}
