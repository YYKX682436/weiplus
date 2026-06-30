package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.z0 f181008a = new com.tencent.mm.plugin.wallet_core.utils.z0();

    public final boolean a() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_show_pay_entrance_switch", "0").equals("0")) {
            return false;
        }
        return !(r26.i0.p(c01.e2.s(), "CN", true) || r26.i0.p(c01.e2.s(), "HK", true));
    }

    public final boolean b() {
        return !a() || (c01.z1.i() & 2199023255552L) == 0;
    }

    public final void c(android.content.Context context, yz5.l onSwitch) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onSwitch, "onSwitch");
        boolean b17 = b();
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 0, true);
        z2Var.m(context.getResources().getString(com.tencent.mm.R.string.f490347sg), context.getResources().getString(b17 ? com.tencent.mm.R.string.f490356so : com.tencent.mm.R.string.mnw));
        z2Var.o(b17 ? 2 : 0);
        z2Var.v(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        com.tencent.mm.plugin.wallet_core.utils.x0 x0Var = new com.tencent.mm.plugin.wallet_core.utils.x0(z2Var);
        com.tencent.mm.plugin.wallet_core.utils.y0 y0Var = new com.tencent.mm.plugin.wallet_core.utils.y0(b17, onSwitch, z2Var);
        z2Var.D = x0Var;
        z2Var.E = y0Var;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e3n, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.sze);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.szc);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.b(textView);
        if (b17) {
            textView.setText(com.tencent.mm.R.string.nb_);
            textView2.setVisibility(8);
        } else {
            textView.setText(com.tencent.mm.R.string.nbb);
            textView2.setVisibility(0);
        }
        z2Var.j(inflate);
        z2Var.C();
    }
}
