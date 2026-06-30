package cw1;

/* loaded from: classes4.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI f223529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f223530e;

    public z0(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI, int i17) {
        this.f223529d = cleanCacheNewUI;
        this.f223530e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        view.setEnabled(false);
        ku5.u0 u0Var = ku5.t0.f312615d;
        cw1.w0 w0Var = new cw1.w0(view);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(w0Var, 200L, false);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f223529d, 1, true);
        k0Var.r(this.f223529d.getString(this.f223530e == -1 ? com.tencent.mm.R.string.n8g : com.tencent.mm.R.string.n8f), 17, i65.a.b(this.f223529d, 14), null);
        k0Var.f211872n = cw1.x0.f223484d;
        k0Var.f211881s = new cw1.y0(this.f223529d, this.f223530e);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
