package cw1;

/* loaded from: classes3.dex */
public final class z6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI f223542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f223543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223545g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223546h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223547i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223548m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f223549n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223550o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ cw1.j7 f223551p;

    public z6(com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI, yv1.g1 g1Var, android.view.View view, android.view.View view2, android.view.View view3, android.widget.TextView textView, android.widget.TextView textView2, int i17, android.view.View view4, cw1.j7 j7Var) {
        this.f223542d = cleanOtherAccountUI;
        this.f223543e = g1Var;
        this.f223544f = view;
        this.f223545g = view2;
        this.f223546h = view3;
        this.f223547i = textView;
        this.f223548m = textView2;
        this.f223549n = i17;
        this.f223550o = view4;
        this.f223551p = j7Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(((java.lang.Boolean) ((jz5.n) this.f223542d.f95796f).getValue()).booleanValue() ? 2 : 1));
        lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(this.f223542d.f95795e));
        lVarArr[2] = new jz5.l("storage_manage_sessionid", this.f223543e.f466043b);
        ((cy1.a) rVar).Hj("resource_other_remove_double_ack_btn", "view_clk", kz5.c1.k(lVarArr), 32903);
        android.view.View view = this.f223544f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f223545g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f223546h;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f223547i.setText(this.f223542d.getString(com.tencent.mm.R.string.f490915ey3, 0));
        this.f223548m.setText(this.f223542d.getString(com.tencent.mm.R.string.d4a, java.lang.Integer.valueOf(this.f223549n)));
        android.view.View view4 = this.f223550o;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f223542d.setBackBtnVisible(false);
        this.f223542d.setBackBtn(cw1.w6.f223482d);
        this.f223542d.addOnBackPressListener(cw1.x6.f223505a);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI = this.f223542d;
        if (cleanOtherAccountUI.getF65848t()) {
            cleanOtherAccountUI.getSwipeBackLayout().setEnableGesture(false);
        }
        this.f223542d.f95797g = new com.tencent.wcdb.support.CancellationSignal();
        this.f223551p.f223051e = java.lang.System.currentTimeMillis();
        ku5.u0 u0Var = ku5.t0.f312615d;
        cw1.j7 j7Var = this.f223551p;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI2 = this.f223542d;
        cw1.y6 y6Var = new cw1.y6(cleanOtherAccountUI2);
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = cleanOtherAccountUI2.f95797g;
        aw1.y yVar = new aw1.y(j7Var);
        ((ku5.t0) u0Var).a(new aw1.b0(yVar, true, yVar, cancellationSignal, y6Var));
    }
}
