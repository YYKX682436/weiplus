package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ea implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI f129097d;

    public ea(com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI finderMediaPreviewUI) {
        this.f129097d = finderMediaPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI$checkPlay$1$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI.D;
        com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI finderMediaPreviewUI = this.f129097d;
        if (finderMediaPreviewUI.d7().getVisibility() == 0) {
            finderMediaPreviewUI.d7().setVisibility(8);
        } else {
            finderMediaPreviewUI.d7().setVisibility(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI$checkPlay$1$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
