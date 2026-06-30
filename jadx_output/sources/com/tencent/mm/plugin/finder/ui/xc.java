package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class xc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI f130018d;

    public xc(com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI finderPreviewCoverUI) {
        this.f130018d = finderPreviewCoverUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.c7(this.f130018d, com.tencent.mm.plugin.finder.ui.td.f129875g, 1002);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
