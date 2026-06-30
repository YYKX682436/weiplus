package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class y2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.z2 f124827d;

    public y2(com.tencent.mm.plugin.finder.profile.widget.z2 z2Var) {
        this.f124827d = z2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
            com.tencent.mm.plugin.finder.profile.widget.z2 z2Var = this.f124827d;
            com.tencent.mm.plugin.finder.report.d2.i(d2Var, z2Var.f124845a, "profile_cluster_nodisplay", "view_clk", false, z2Var.b(), 8, null);
            z2Var.c().setVisibility(8);
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c17).f221226g.f242285b;
            if (o4Var != null) {
                o4Var.G("KEY_FINDER_PROFILE_POST_PLAY_BANNER_STATUS", false);
            }
            com.tencent.mars.xlog.Log.i("HeaderPostPlayBannerWidget", "hide post play banner");
        }
    }
}
