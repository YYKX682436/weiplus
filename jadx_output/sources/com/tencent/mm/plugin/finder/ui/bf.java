package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class bf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f128949d;

    public bf(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f128949d = finderSelectCoverUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
        this.f128949d.x7(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
