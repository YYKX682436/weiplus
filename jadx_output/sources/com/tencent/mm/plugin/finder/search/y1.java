package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        super(1);
        this.f125982d = finderFeedSearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String suggestion = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(suggestion, "suggestion");
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "onSuggestion Click :".concat(suggestion));
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125982d;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderFeedSearchUI.f125547t;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().q(suggestion, null, true);
        com.tencent.mm.plugin.finder.search.k4 k4Var = finderFeedSearchUI.V;
        if (k4Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var.c(suggestion);
        finderFeedSearchUI.H = 4;
        finderFeedSearchUI.K = 0;
        finderFeedSearchUI.r7();
        finderFeedSearchUI.Y = null;
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.v7(finderFeedSearchUI, suggestion, null, false, false, 14, null);
        return jz5.f0.f302826a;
    }
}
