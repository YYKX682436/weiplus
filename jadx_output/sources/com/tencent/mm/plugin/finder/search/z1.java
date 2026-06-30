package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class z1 implements com.tencent.mm.plugin.finder.search.q4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125991a;

    public z1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        this.f125991a = finderFeedSearchUI;
    }

    @Override // com.tencent.mm.plugin.finder.search.q4
    public void a(int i17) {
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125991a;
        if (i17 != 0) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderFeedSearchUI.f125547t;
            if (fTSSearchView == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(fTSSearchView.getFtsEditText().getEditText().getText().toString())) {
                return;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = finderFeedSearchUI.N;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
        }
        android.view.View view = finderFeedSearchUI.R;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = finderFeedSearchUI.Q;
        if (textView == null) {
            kotlin.jvm.internal.o.o("noResultView");
            throw null;
        }
        textView.setVisibility(8);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderFeedSearchUI.N;
        if (refreshLoadMoreLayout2 != null) {
            refreshLoadMoreLayout2.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
    }
}
