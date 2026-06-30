package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class b6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveLinkIndicator f116207d;

    public b6(com.tencent.mm.plugin.finder.live.view.FinderLiveLinkIndicator finderLiveLinkIndicator) {
        this.f116207d = finderLiveLinkIndicator;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveLinkIndicator$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l tabOnclickListener = this.f116207d.getTabOnclickListener();
        if (tabOnclickListener != null) {
            tabOnclickListener.invoke(1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveLinkIndicator$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
