package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class k5 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.GameIconViewTipPreference f209031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f209032e;

    public k5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.ui.GameIconViewTipPreference gameIconViewTipPreference) {
        this.f209032e = findMoreFriendsUI;
        this.f209031d = gameIconViewTipPreference;
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
        yj0.a.b("com/tencent/mm/ui/FindMoreFriendsUI$33", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/FindMoreFriendsUI$33", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/FindMoreFriendsUI$33", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0) {
            com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f209032e;
            int firstVisiblePosition = findMoreFriendsUI.f196656w.f197819u.getFirstVisiblePosition();
            int lastVisiblePosition = findMoreFriendsUI.f196656w.f197819u.getLastVisiblePosition();
            android.view.View view = this.f209031d.W1;
            if (view == null || (findMoreFriendsUI.f196656w.o("more_tab_game_recommend") > lastVisiblePosition && findMoreFriendsUI.f196656w.o("more_tab_game_recommend") < firstVisiblePosition)) {
                yj0.a.h(this, "com/tencent/mm/ui/FindMoreFriendsUI$33", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            } else if (view.getLocalVisibleRect(new android.graphics.Rect())) {
                findMoreFriendsUI.w1();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/FindMoreFriendsUI$33", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
