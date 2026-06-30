package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView f123374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f123375e;

    public l(com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView, android.widget.TextView textView) {
        this.f123374d = finderTopicFilterView;
        this.f123375e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/filter/FinderTopicFilterView$refreshArrow$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView = this.f123374d;
        finderTopicFilterView.setFold(!finderTopicFilterView.isFold);
        boolean z17 = finderTopicFilterView.isFold;
        android.widget.TextView textView = this.f123375e;
        if (z17) {
            textView.setText(finderTopicFilterView.getContext().getString(com.tencent.mm.R.string.f0i));
        } else {
            textView.setText(finderTopicFilterView.getContext().getString(com.tencent.mm.R.string.f0j));
        }
        com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView.b(finderTopicFilterView, finderTopicFilterView.isFold);
        com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView.a(finderTopicFilterView, true, finderTopicFilterView.isFold);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/filter/FinderTopicFilterView$refreshArrow$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
