package com.tencent.mm.plugin.finder.ui.conv;

/* loaded from: classes10.dex */
public final class a implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment f129010d;

    public a(com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment finderConvSearchFeedFragment) {
        this.f129010d = finderConvSearchFeedFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.Iterator it;
        java.util.List list = (java.util.List) obj;
        com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment finderConvSearchFeedFragment = this.f129010d;
        com.tencent.mm.plugin.finder.ui.conv.c cVar = finderConvSearchFeedFragment.f129009z;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        java.lang.String query = finderConvSearchFeedFragment.f129008y;
        kotlin.jvm.internal.o.d(list);
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mars.xlog.Log.i("FinderConvSearchFeedPresenter", "onSearchResult size=" + list.size());
        java.util.ArrayList arrayList = cVar.f129012d;
        arrayList.size();
        arrayList.clear();
        java.util.Iterator it6 = list.iterator();
        long j17 = -1;
        while (it6.hasNext()) {
            r45.bu2 bu2Var = (r45.bu2) it6.next();
            long j18 = bu2Var.getLong(0);
            java.lang.String string = bu2Var.getString(3);
            r45.kv2 kv2Var = (r45.kv2) bu2Var.getCustom(2);
            long j19 = bu2Var.getLong(1);
            if (j18 == 0 || kv2Var == null || j19 == 0) {
                it = it6;
            } else {
                long a17 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(j19));
                it = it6;
                com.tencent.mm.plugin.finder.storage.FinderItem a18 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(com.tencent.mm.plugin.finder.assist.n7.f102406a.c(kv2Var), 16);
                a18.setMsgId(j18);
                a18.setMsgTalker(string);
                com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(a18);
                if (a17 != j17) {
                    arrayList.add(new com.tencent.mm.plugin.finder.ui.conv.n(j19));
                    j17 = a17;
                }
                arrayList.add(p17);
            }
            it6 = it;
        }
        cVar.c().f129027f = query;
        androidx.recyclerview.widget.f2 adapter = cVar.c().b().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        cVar.c().d();
        cVar.c().c().i(true);
        cVar.c().c().E(true);
        if (arrayList.isEmpty()) {
            cVar.c().f();
            on5.c loadMoreFooter = cVar.c().c().getLoadMoreFooter();
            android.view.View view = loadMoreFooter != null ? loadMoreFooter.getView() : null;
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            on5.c loadMoreFooter2 = cVar.c().c().getLoadMoreFooter();
            android.view.View view3 = loadMoreFooter2 != null ? loadMoreFooter2.getView() : null;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                android.view.View view4 = view3;
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        cVar.c().e();
    }
}
