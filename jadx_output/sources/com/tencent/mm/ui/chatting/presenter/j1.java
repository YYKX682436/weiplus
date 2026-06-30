package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.o1 f202279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f202280e;

    public j1(com.tencent.mm.ui.chatting.presenter.o1 o1Var, java.util.ArrayList arrayList) {
        this.f202279d = o1Var;
        this.f202280e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zb5.e eVar;
        com.tencent.mm.ui.chatting.presenter.o1 o1Var = this.f202279d;
        if (o1Var.f202393i == null || o1Var.f202394m.get() || (eVar = o1Var.f202393i) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI finderFeedHistoryListUI = (com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI) eVar;
        java.util.ArrayList appendedData = this.f202280e;
        kotlin.jvm.internal.o.g(appendedData, "appendedData");
        q40.e eVar2 = finderFeedHistoryListUI.f200564f;
        if (eVar2 != null) {
            java.lang.String query = finderFeedHistoryListUI.f200565g;
            com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment finderConvSearchFeedFragment = (com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment) eVar2;
            kotlin.jvm.internal.o.g(query, "query");
            com.tencent.mars.xlog.Log.i("Finder.ConvSearchFeedFragment", "onSearchResultAppend query=" + query + " size=" + appendedData.size());
            finderConvSearchFeedFragment.f129008y = query;
            finderConvSearchFeedFragment.f129005v.postValue(appendedData);
        }
    }
}
