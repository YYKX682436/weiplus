package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class h70 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.u70 f118551d;

    public h70(com.tencent.mm.plugin.finder.live.widget.u70 u70Var) {
        this.f118551d = u70Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        ya2.b2 b17;
        java.lang.String str2;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.widget.u70 u70Var = this.f118551d;
        if (itemId == 1) {
            com.tencent.mm.ui.MMActivity N6 = u70Var.N6();
            if (N6 != null) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                ae2.in inVar = ae2.in.f3688a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.O6).getValue()).r()).intValue() == 0) {
                    str = lp0.b.K();
                } else {
                    ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                    str = com.tencent.mm.plugin.finder.assist.e9.f102143l;
                }
                java.lang.String str3 = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
                ((ub0.r) oVar).getClass();
                com.tencent.mm.pluginsdk.ui.tools.l7.l(N6, str, str3, 10011);
            }
            u70Var.g7(ml2.x3.f328223f);
            return;
        }
        if (itemId == 2) {
            com.tencent.mm.ui.MMActivity N62 = u70Var.N6();
            if (N62 != null) {
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                com.tencent.mm.pluginsdk.ui.tools.l7.c(N62, 10010, 1, 28, 1, false, null);
            }
            u70Var.g7(ml2.x3.f328224g);
            return;
        }
        if (itemId != 3 || (b17 = ya2.h.f460484a.b(xy2.c.e(u70Var.O6()))) == null || (str2 = b17.field_avatarUrl) == null) {
            return;
        }
        if (!(str2.length() > 0)) {
            str2 = null;
        }
        if (str2 != null) {
            ml2.x3 x3Var = ml2.x3.f328230p;
            u70Var.g7(x3Var);
            if (android.webkit.URLUtil.isNetworkUrl(str2)) {
                kotlinx.coroutines.l.d(u70Var.f119958q, null, null, new com.tencent.mm.plugin.finder.live.widget.b70(str2, u70Var, null), 3, null);
            } else {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(x3Var);
                u70Var.b7(str2);
            }
        }
    }
}
