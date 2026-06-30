package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class h1 implements y90.j {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f202244d = "";

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f202245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.o1 f202246f;

    public h1(com.tencent.mm.ui.chatting.presenter.o1 o1Var) {
        this.f202246f = o1Var;
        this.f202245e = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.ui.chatting.presenter.g1(o1Var, this), false);
    }

    @Override // y90.j
    public void G2() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
        com.tencent.mars.xlog.Log.i("Finder.FeedHistoryListPresenter", "onSearchEditTextReady");
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String searchText) {
        kotlin.jvm.internal.o.g(searchText, "searchText");
        com.tencent.mars.xlog.Log.i("Finder.FeedHistoryListPresenter", "onSearchChange query=" + this.f202244d + " searchText=" + searchText);
        if (kotlin.jvm.internal.o.b(this.f202244d, searchText)) {
            return;
        }
        this.f202244d = searchText;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f202245e;
        b4Var.d();
        b4Var.c(500L, 500L);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mars.xlog.Log.i("Finder.FeedHistoryListPresenter", "onQuitSearch");
        zb5.e eVar = this.f202246f.f202393i;
        if (eVar != null) {
            com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI finderFeedHistoryListUI = (com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI) eVar;
            finderFeedHistoryListUI.finish();
            finderFeedHistoryListUI.overridePendingTransition(0, 0);
        }
    }

    @Override // y90.j
    public void m6() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // y90.j
    public void o2(boolean z17, java.lang.String[] strArr, long j17, int i17) {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
