package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderContactSearchUI f125952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI) {
        super(1);
        this.f125952d = finderContactSearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String query = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI = this.f125952d;
        com.tencent.mm.plugin.finder.search.u4 u4Var = finderContactSearchUI.N;
        if (u4Var == null) {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
        u4Var.f125891l = query;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderContactSearchUI.f125529u;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().n(query, null);
        finderContactSearchUI.L = 2;
        finderContactSearchUI.e7(query);
        return jz5.f0.f302826a;
    }
}
