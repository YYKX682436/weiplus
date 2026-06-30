package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class ke implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129433d;

    public ke(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f129433d = finderSelectCoverUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129433d;
        ym5.n6 n6Var = finderSelectCoverUI.B1;
        if (n6Var != null) {
            l45.n nVar = (l45.n) n6Var.getPresenter();
            nVar.getClass();
            new l45.a(nVar).a(qk.g6.TEXT);
            n6Var.postDelayed(new com.tencent.mm.plugin.finder.ui.je(n6Var, finderSelectCoverUI), 350L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
