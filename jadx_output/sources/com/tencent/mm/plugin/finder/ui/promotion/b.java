package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ai f129656d;

    public b(com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar) {
        this.f129656d = aiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUI$Companion$openDrawer$drawer$1$createHeaderComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f129656d.P6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUI$Companion$openDrawer$drawer$1$createHeaderComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
