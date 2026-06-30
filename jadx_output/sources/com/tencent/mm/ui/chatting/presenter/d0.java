package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class d0 implements y90.j {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f202158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.h0 f202159e;

    public d0(com.tencent.mm.ui.chatting.presenter.h0 h0Var) {
        this.f202159e = h0Var;
        this.f202158d = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.ui.chatting.presenter.c0(h0Var), false);
    }

    @Override // y90.j
    public void G2() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListPresenter", "onSearchEditTextReady");
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String searchText) {
        kotlin.jvm.internal.o.g(searchText, "searchText");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSearchChange query=");
        com.tencent.mm.ui.chatting.presenter.h0 h0Var = this.f202159e;
        sb6.append(h0Var.f202240i);
        sb6.append(" searchText=");
        sb6.append(searchText);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListPresenter", sb6.toString());
        if (kotlin.jvm.internal.o.b(h0Var.f202240i, searchText)) {
            return;
        }
        h0Var.f202240i = searchText;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f202158d;
        b4Var.d();
        b4Var.c(500L, 500L);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListPresenter", "onQuitSearch");
        zb5.b bVar = this.f202159e.f202237f;
        if (bVar != null) {
            com.tencent.mm.ui.chatting.gallery.EmojiHistoryListUI emojiHistoryListUI = (com.tencent.mm.ui.chatting.gallery.EmojiHistoryListUI) bVar;
            emojiHistoryListUI.finish();
            emojiHistoryListUI.overridePendingTransition(0, 0);
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
