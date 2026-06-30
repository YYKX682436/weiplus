package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class j1 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlackListUI f129376d;

    public j1(com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI) {
        this.f129376d = finderBlackListUI;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView != null && !absListView.canScrollVertically(1)) {
            com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI = this.f129376d;
            if (finderBlackListUI.f128518x) {
                finderBlackListUI.d7();
            } else {
                android.widget.ListView listView = finderBlackListUI.f128514t;
                if (listView == null) {
                    kotlin.jvm.internal.o.o("listView");
                    throw null;
                }
                if (listView.getFooterViewsCount() == 0) {
                    android.widget.ListView listView2 = finderBlackListUI.f128514t;
                    if (listView2 == null) {
                        kotlin.jvm.internal.o.o("listView");
                        throw null;
                    }
                    listView2.addFooterView(android.view.View.inflate(finderBlackListUI, com.tencent.mm.R.layout.f489026b26, null));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
