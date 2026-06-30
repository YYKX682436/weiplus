package cw1;

/* loaded from: classes12.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI f222988d;

    public i1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI) {
        this.f222988d = cleanCacheNewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer[][] numArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI.f95654x;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI = this.f222988d;
        if (cleanCacheNewUI.V6()) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(cleanCacheNewUI.V6() ? 2 : 1));
            lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(cleanCacheNewUI.f95662m));
            yv1.g1 g1Var = cleanCacheNewUI.f95663n;
            if (g1Var == null) {
                kotlin.jvm.internal.o.o("session");
                throw null;
            }
            lVarArr[2] = new jz5.l("storage_manage_sessionid", g1Var.f466043b);
            ((cy1.a) rVar).Hj("cache_remove_button", "view_clk", kz5.c1.k(lVarArr), 32903);
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.W6(cleanCacheNewUI, cleanCacheNewUI.getString(com.tencent.mm.R.string.ni6), false, cleanCacheNewUI.getString(com.tencent.mm.R.string.ni7), null, new cw1.h1(cleanCacheNewUI));
        } else {
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI.U6(cleanCacheNewUI);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
