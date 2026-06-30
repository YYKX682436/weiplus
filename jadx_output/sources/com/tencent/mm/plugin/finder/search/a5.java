package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderTopicSearchUI f125618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI) {
        super(1);
        this.f125618d = finderTopicSearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI = this.f125618d;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderTopicSearchUI.f125590d;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().n(it, null);
        finderTopicSearchUI.X6(it);
        return jz5.f0.f302826a;
    }
}
