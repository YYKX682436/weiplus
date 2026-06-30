package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class j0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI f129375d;

    public j0(com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI finderAggregationSettingUI) {
        this.f129375d = finderAggregationSettingUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            int parseColor = android.graphics.Color.parseColor("#FA5151");
            com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI context = this.f129375d;
            g4Var.d(0, parseColor, context.getContext().getResources().getString(com.tencent.mm.R.string.mai));
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("expose_type", 0);
            lVarArr[1] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
            lVarArr[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
            lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            ((cy1.a) rVar).Bj("recently_browse_feed_delete", "view_exp", kz5.c1.k(lVarArr), 1, false);
        }
    }
}
