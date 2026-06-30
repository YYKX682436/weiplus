package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        super(1);
        this.f125954d = finderFeedSearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125954d;
        com.tencent.mm.plugin.finder.search.u4 u4Var = finderFeedSearchUI.W;
        if (u4Var == null) {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
        u4Var.f125891l = it;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderFeedSearchUI.f125547t;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().q(it, null, true);
        finderFeedSearchUI.H = 2;
        finderFeedSearchUI.Y = null;
        finderFeedSearchUI.K = 0;
        finderFeedSearchUI.r7();
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI.v7(this.f125954d, it, null, false, false, 14, null);
        return jz5.f0.f302826a;
    }
}
