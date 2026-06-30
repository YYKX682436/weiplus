package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderMixSearchUI f125694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.plugin.finder.search.FinderMixSearchUI finderMixSearchUI) {
        super(1);
        this.f125694d = finderMixSearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter;
        java.lang.String query = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mm.plugin.finder.search.FinderMixSearchUI finderMixSearchUI = this.f125694d;
        com.tencent.mm.plugin.finder.search.u4 u4Var = finderMixSearchUI.f125586w;
        if (u4Var == null) {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
        u4Var.f125891l = query;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderMixSearchUI.f125583t;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().n(query, null);
        finderMixSearchPresenter = finderMixSearchUI.presenter;
        if (finderMixSearchPresenter != null) {
            finderMixSearchPresenter.s(query, 2, false, null, finderMixSearchUI.f125588y);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
