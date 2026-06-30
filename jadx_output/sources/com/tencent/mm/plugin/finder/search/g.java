package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI f125698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI) {
        super(1);
        this.f125698d = finderContactSearchIncludeFollowUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI = this.f125698d;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderContactSearchIncludeFollowUI.f125507d;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().n(it, null);
        finderContactSearchIncludeFollowUI.Z6(it);
        return jz5.f0.f302826a;
    }
}
