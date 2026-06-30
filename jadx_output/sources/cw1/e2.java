package cw1;

/* loaded from: classes12.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f222898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f222899e;

    public e2(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI) {
        this.f222899e = cleanCacheUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f222898d) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI = this.f222899e;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(cleanCacheUI);
        u1Var.k(cleanCacheUI.getResources().getColor(com.tencent.mm.R.color.f478622ch));
        u1Var.m(com.tencent.mm.R.string.b7q);
        u1Var.g(cleanCacheUI.getString(com.tencent.mm.R.string.b7t));
        u1Var.l(new cw1.c2(cleanCacheUI, false));
        u1Var.i(null);
        u1Var.e(new cw1.d2(this));
        u1Var.q(false);
        this.f222898d = true;
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
