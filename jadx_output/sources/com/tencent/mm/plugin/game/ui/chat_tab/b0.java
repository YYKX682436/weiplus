package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public final class b0 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment f141238a;

    public b0(com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment gameMsgNoticeFragment) {
        this.f141238a = gameMsgNoticeFragment;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment gameMsgNoticeFragment = this.f141238a;
        int i17 = com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment.f141130s;
        gameMsgNoticeFragment.getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.ui.chat_tab.e0(gameMsgNoticeFragment), gameMsgNoticeFragment.f141131d);
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f141238a.f141134g;
        if (wxRefreshLayout != null) {
            wxRefreshLayout.e(true);
            return true;
        }
        kotlin.jvm.internal.o.o("refreshLayout");
        throw null;
    }
}
