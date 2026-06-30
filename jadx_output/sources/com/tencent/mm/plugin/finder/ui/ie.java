package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class ie implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f129364e;

    public ie(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, float f17) {
        this.f129363d = finderSelectCoverUI;
        this.f129364e = f17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129363d;
        int i17 = finderSelectCoverUI.Z;
        float f17 = this.f129364e;
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.c7(finderSelectCoverUI, f17, 2);
        } else if (i17 == 2) {
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.c7(finderSelectCoverUI, f17, 1);
        }
        finderSelectCoverUI.p7();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
