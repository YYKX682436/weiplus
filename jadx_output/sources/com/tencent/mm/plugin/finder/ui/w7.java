package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class w7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI f129979d;

    public w7(com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI finderLikedFeedUI) {
        this.f129979d = finderLikedFeedUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI finderLikedFeedUI = this.f129979d;
        finderLikedFeedUI.f128814p = false;
        finderLikedFeedUI.onBackPressed();
        finderLikedFeedUI.f128814p = true;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
