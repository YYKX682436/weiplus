package pt2;

/* loaded from: classes8.dex */
public final class l extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI f358252a;

    public l(com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI finderSearchBaseUI) {
        this.f358252a = finderSearchBaseUI;
    }

    @Override // ym5.q3
    public void b(int i17) {
        android.view.View findViewById;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI finderSearchBaseUI = this.f358252a;
        com.tencent.mars.xlog.Log.i(finderSearchBaseUI.f125910t, "onLoadMoreBegin");
        boolean z17 = ((com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader) finderSearchBaseUI.c7()).f125677e == 1;
        java.lang.String str = finderSearchBaseUI.f125910t;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "showNoMoreFooter");
            android.view.View f213435x = finderSearchBaseUI.e7().getF213435x();
            if (f213435x != null && (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setText(com.tencent.mm.R.string.f491896el3);
            }
            android.view.View f213435x2 = finderSearchBaseUI.e7().getF213435x();
            android.widget.TextView textView3 = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            android.view.View f213435x3 = finderSearchBaseUI.e7().getF213435x();
            findViewById = f213435x3 != null ? f213435x3.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view = findViewById;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "startSearchNextPage: " + finderSearchBaseUI.f125912v);
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader = (com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader) finderSearchBaseUI.c7();
        finderActivitySearchLoader.getClass();
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(finderActivitySearchLoader, false, 1, null);
        com.tencent.mars.xlog.Log.i(str, "showLoadMoreFooter");
        android.view.View f213435x4 = finderSearchBaseUI.e7().getF213435x();
        if (f213435x4 != null && (textView2 = (android.widget.TextView) f213435x4.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView2.setText(com.tencent.mm.R.string.f491894el1);
        }
        android.view.View f213435x5 = finderSearchBaseUI.e7().getF213435x();
        android.widget.TextView textView4 = f213435x5 != null ? (android.widget.TextView) f213435x5.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        android.view.View f213435x6 = finderSearchBaseUI.e7().getF213435x();
        findViewById = f213435x6 != null ? f213435x6.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        android.view.View view2 = findViewById;
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
