package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class w4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.s4 f206211e;

    public w4(com.tencent.mm.ui.chatting.s4 s4Var, java.lang.String str) {
        this.f206211e = s4Var;
        this.f206210d = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.s4 s4Var = this.f206211e;
        if (itemId != 0) {
            if (itemId != 1) {
                if (itemId != 2) {
                    return;
                }
                com.tencent.mm.ui.chatting.h4.w(s4Var.f202659b);
                return;
            } else {
                ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ij(s4Var.f202659b.f201645j.g(), s4Var.f202659b.I());
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(22385, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                g0Var.d(28838, 0, 1, 0, 0, 4);
                return;
            }
        }
        com.tencent.mm.ui.chatting.h4 h4Var = s4Var.f202659b;
        java.lang.String str = this.f206210d;
        com.tencent.mm.ui.chatting.h4.v(h4Var, str);
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.d(18890, 5, 0, str, "", "");
        g0Var2.d(28838, 0, 1, 0, 0, 2);
        com.tencent.mm.ui.chatting.h4.O(4, 0, s4Var.f202659b.f201647l);
        boolean Ri = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ri();
        com.tencent.mm.ui.chatting.h4.u(s4Var.f202659b, "view_clk", Ri);
        if (Ri) {
            g0Var2.A(182, 218);
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(56);
    }
}
