package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderMixSearchUI f125722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.finder.search.FinderMixSearchUI finderMixSearchUI) {
        super(1);
        this.f125722d = finderMixSearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter;
        java.lang.String suggestion = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(suggestion, "suggestion");
        com.tencent.mars.xlog.Log.i("Finder.FinderMixSearchUI", "onSuggestion Click :".concat(suggestion));
        com.tencent.mm.plugin.finder.search.FinderMixSearchUI finderMixSearchUI = this.f125722d;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderMixSearchUI.f125583t;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().n(suggestion, null);
        com.tencent.mm.plugin.finder.search.k4 k4Var = finderMixSearchUI.f125585v;
        if (k4Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var.c(suggestion);
        finderMixSearchPresenter = finderMixSearchUI.presenter;
        if (finderMixSearchPresenter != null) {
            finderMixSearchPresenter.s(suggestion, 4, false, null, finderMixSearchUI.f125588y);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
