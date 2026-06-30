package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class oe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129601d;

    public oe(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f129601d = finderSelectCoverUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129601d;
        if (finderSelectCoverUI.s7() && finderSelectCoverUI.getIntent().getIntExtra("key_cover_select_source", 0) == 0) {
            finderSelectCoverUI.t7(true);
        } else {
            finderSelectCoverUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
