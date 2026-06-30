package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class e2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i2 f118206d;

    public e2(com.tencent.mm.plugin.finder.live.widget.i2 i2Var) {
        this.f118206d = i2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.widget.i2 i2Var = this.f118206d;
        if (itemId == 1) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.app.Activity activity = i2Var.f118616d;
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            java.lang.String str = com.tencent.mm.plugin.finder.assist.e9.f102143l;
            java.lang.String str2 = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.l(activity, str, str2, 10011);
            i2Var.a(ml2.x3.f328223f);
            return;
        }
        if (itemId == 2) {
            vb0.o oVar2 = (vb0.o) i95.n0.c(vb0.o.class);
            android.app.Activity activity2 = i2Var.f118616d;
            ((ub0.r) oVar2).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.c(activity2, 10010, 1, 28, 1, false, null);
            i2Var.a(ml2.x3.f328224g);
            return;
        }
        if (itemId != 3) {
            return;
        }
        if (i2Var.f118624o.length() > 0) {
            km2.g.f309100a.a(i2Var.f118625p);
            java.lang.String str3 = i2Var.f118624o;
            i2Var.b(str3, str3, i2Var.f118625p);
        }
    }
}
