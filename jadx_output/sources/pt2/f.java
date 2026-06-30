package pt2;

/* loaded from: classes2.dex */
public final class f implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment f358247a;

    public f(com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment) {
        this.f358247a = finderMixSearchFeedFragment;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        jz5.l lVar;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.widget.TextView textView;
        android.view.View view4;
        android.view.View view5;
        android.view.View view6;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment = this.f358247a;
        com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter = finderMixSearchFeedFragment.f125904u;
        if (finderMixSearchPresenter != null) {
            lVar = finderMixSearchPresenter.p(finderMixSearchFeedFragment.f129265p);
        } else {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            lVar = new jz5.l(bool, bool);
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        if (!((java.lang.Boolean) lVar.f302834e).booleanValue()) {
            return false;
        }
        if (booleanValue) {
            on5.c loadMoreFooter = finderMixSearchFeedFragment.z0().getLoadMoreFooter();
            android.view.View view7 = loadMoreFooter != null ? loadMoreFooter.getView() : null;
            if (view7 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view7, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            on5.c loadMoreFooter2 = finderMixSearchFeedFragment.z0().getLoadMoreFooter();
            if (loadMoreFooter2 != null && (view6 = loadMoreFooter2.getView()) != null && (textView2 = (android.widget.TextView) view6.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setText(com.tencent.mm.R.string.f491894el1);
            }
            on5.c loadMoreFooter3 = finderMixSearchFeedFragment.z0().getLoadMoreFooter();
            android.widget.TextView textView3 = (loadMoreFooter3 == null || (view5 = loadMoreFooter3.getView()) == null) ? null : (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.ili);
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            on5.c loadMoreFooter4 = finderMixSearchFeedFragment.z0().getLoadMoreFooter();
            android.view.View findViewById = (loadMoreFooter4 == null || (view4 = loadMoreFooter4.getView()) == null) ? null : view4.findViewById(com.tencent.mm.R.id.ilg);
            if (findViewById == null) {
                return true;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        on5.c loadMoreFooter5 = finderMixSearchFeedFragment.z0().getLoadMoreFooter();
        android.view.View view8 = loadMoreFooter5 != null ? loadMoreFooter5.getView() : null;
        if (view8 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view8, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        on5.c loadMoreFooter6 = finderMixSearchFeedFragment.z0().getLoadMoreFooter();
        if (loadMoreFooter6 != null && (view3 = loadMoreFooter6.getView()) != null && (textView = (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setText(com.tencent.mm.R.string.f491896el3);
        }
        on5.c loadMoreFooter7 = finderMixSearchFeedFragment.z0().getLoadMoreFooter();
        android.widget.TextView textView4 = (loadMoreFooter7 == null || (view2 = loadMoreFooter7.getView()) == null) ? null : (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ili);
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        on5.c loadMoreFooter8 = finderMixSearchFeedFragment.z0().getLoadMoreFooter();
        android.view.View findViewById2 = (loadMoreFooter8 == null || (view = loadMoreFooter8.getView()) == null) ? null : view.findViewById(com.tencent.mm.R.id.ilg);
        if (findViewById2 == null) {
            return true;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }
}
