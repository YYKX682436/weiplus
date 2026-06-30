package cw1;

/* loaded from: classes3.dex */
public final class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI f222969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222972g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f222973h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f222974i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f222975m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222976n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222977o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f222978p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222979q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222980r;

    public h7(com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI, android.view.View view, android.view.View view2, android.view.View view3, boolean z17, long j17, yv1.g1 g1Var, android.widget.TextView textView, android.widget.TextView textView2, boolean z18, android.widget.TextView textView3, android.widget.TextView textView4) {
        this.f222969d = cleanOtherAccountUI;
        this.f222970e = view;
        this.f222971f = view2;
        this.f222972g = view3;
        this.f222973h = z17;
        this.f222974i = j17;
        this.f222975m = g1Var;
        this.f222976n = textView;
        this.f222977o = textView2;
        this.f222978p = z18;
        this.f222979q = textView3;
        this.f222980r = textView4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f222969d.f95798h;
        if (k0Var != null) {
            k0Var.u();
        }
        this.f222969d.f95798h = null;
        android.view.View view = this.f222970e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f222971f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f222972g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f222973h) {
            this.f222976n.setText(this.f222969d.getString(com.tencent.mm.R.string.b8k));
            this.f222977o.setVisibility(8);
            this.f222980r.setVisibility(8);
        } else {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(((java.lang.Boolean) ((jz5.n) this.f222969d.f95796f).getValue()).booleanValue() ? 2 : 1));
            lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(this.f222969d.f95795e));
            lVarArr[2] = new jz5.l("removed_size_byte", java.lang.Long.valueOf(this.f222974i));
            lVarArr[3] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(this.f222974i));
            lVarArr[4] = new jz5.l("storage_manage_sessionid", this.f222975m.f466043b);
            ((cy1.a) rVar).Ej("resource_other_remove_complete", kz5.c1.k(lVarArr), 32903);
            this.f222976n.setText(this.f222969d.getString(com.tencent.mm.R.string.d1f));
            this.f222977o.setVisibility(0);
            if (this.f222978p) {
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI = this.f222969d;
                cleanOtherAccountUI.f95794d = true;
                this.f222979q.setText(cleanOtherAccountUI.getString(com.tencent.mm.R.string.b7r));
                this.f222980r.setText(this.f222969d.getString(com.tencent.mm.R.string.b7s, 5));
                this.f222980r.setVisibility(0);
                cw1.g7 g7Var = new cw1.g7(this.f222969d, this.f222980r);
                ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
                t0Var.getClass();
                t0Var.z(g7Var, 1000L, false);
            } else {
                this.f222979q.setText(this.f222969d.getString(com.tencent.mm.R.string.apm));
                this.f222980r.setVisibility(8);
            }
        }
        this.f222969d.setResult(-1);
    }
}
