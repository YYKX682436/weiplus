package cw1;

/* loaded from: classes12.dex */
public final class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI f223507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f223508e;

    public y0(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI, int i17) {
        this.f223507d = cleanCacheNewUI;
        this.f223508e = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Class cls = i17 == 0 ? com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI.class : com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.class;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI = this.f223507d;
        android.content.Intent intent = new android.content.Intent(cleanCacheNewUI, (java.lang.Class<?>) cls);
        lk5.s.e(intent, true);
        android.content.Intent putExtra = intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        int i18 = this.f223508e;
        android.content.Intent putExtra2 = putExtra.putExtra("isSent", i18 == -1);
        java.lang.String str = cleanCacheNewUI.f95664o;
        if (str == null) {
            kotlin.jvm.internal.o.o("cleanSessionID");
            throw null;
        }
        android.content.Intent putExtra3 = putExtra2.putExtra("cleanSessionID", str).putExtra("totalSize", i18 == -1 ? cleanCacheNewUI.f95666q : cleanCacheNewUI.f95667r);
        kotlin.jvm.internal.o.f(putExtra3, "putExtra(...)");
        int i19 = i18 == -1 ? 1 : 0;
        putExtra3.putExtra("select", cleanCacheNewUI.f95670u[i19]);
        cleanCacheNewUI.startActivityForResult(putExtra3, i19);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        yv1.g1 g1Var = cleanCacheNewUI.f95663n;
        if (g1Var == null) {
            kotlin.jvm.internal.o.o("session");
            throw null;
        }
        lVarArr[0] = new jz5.l("storage_manage_sessionid", g1Var.f466043b);
        java.lang.String str2 = cleanCacheNewUI.f95664o;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("cleanSessionID");
            throw null;
        }
        lVarArr[1] = new jz5.l("cache_remove_sessionid", str2);
        lVarArr[2] = new jz5.l("visual_view_type", java.lang.Integer.valueOf(i17 == 0 ? 2 : 1));
        lVarArr[3] = new jz5.l("cache_visual_type", java.lang.Integer.valueOf(i18 != -1 ? 2 : 1));
        ((cy1.a) rVar).Hj("visual_view_selection", "view_clk", kz5.c1.k(lVarArr), 32903);
    }
}
