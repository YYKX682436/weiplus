package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI f129490d;

    public m0(com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI finderAggregationSettingUI) {
        this.f129490d = finderAggregationSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI finderAggregationSettingUI = this.f129490d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) finderAggregationSettingUI.getContext(), 1, true);
        k0Var.q(finderAggregationSettingUI.getContext().getResources().getString(com.tencent.mm.R.string.maj), 17);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.ui.j0(finderAggregationSettingUI);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.ui.l0(finderAggregationSettingUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
