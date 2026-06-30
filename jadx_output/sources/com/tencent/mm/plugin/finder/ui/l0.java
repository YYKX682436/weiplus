package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI f129450d;

    public l0(com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI finderAggregationSettingUI) {
        this.f129450d = finderAggregationSettingUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI context = this.f129450d;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("expose_type", 0);
            lVarArr[1] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
            lVarArr[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
            lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            ((cy1.a) rVar).Bj("recently_browse_feed_delete", "view_clk", kz5.c1.k(lVarArr), 1, false);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.r.f460525a.d(4, new java.util.LinkedList(), new java.util.LinkedList(), new com.tencent.mm.plugin.finder.ui.k0(context));
        }
    }
}
