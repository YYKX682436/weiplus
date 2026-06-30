package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class q implements com.tencent.mm.plugin.game.ui.chat_tab.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI f141305a;

    public q(com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI gameChatTabUI) {
        this.f141305a = gameChatTabUI;
    }

    @Override // com.tencent.mm.plugin.game.ui.chat_tab.s1
    public void a(int i17) {
        int i18 = com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI.f141117r;
        com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI gameChatTabUI = this.f141305a;
        android.view.ViewGroup.LayoutParams layoutParams = gameChatTabUI.T6().f1750b.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = i17;
        }
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams3.topMargin = i65.a.b(gameChatTabUI, 152);
        android.widget.FrameLayout frameLayout = gameChatTabUI.T6().f1751c;
        com.tencent.mm.plugin.gamelife.ui.GameLifeLoadingCoverView gameLifeLoadingCoverView = gameChatTabUI.f141993i;
        if (gameLifeLoadingCoverView == null) {
            kotlin.jvm.internal.o.o("loadingCoverView");
            throw null;
        }
        frameLayout.addView(gameLifeLoadingCoverView, layoutParams3);
        android.widget.FrameLayout frameLayout2 = gameChatTabUI.T6().f1751c;
        com.tencent.mm.plugin.gamelife.ui.GameLifeEmptyCoverView gameLifeEmptyCoverView = gameChatTabUI.f141994m;
        if (gameLifeEmptyCoverView != null) {
            frameLayout2.addView(gameLifeEmptyCoverView, layoutParams3);
        } else {
            kotlin.jvm.internal.o.o("emptyCoverView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.game.ui.chat_tab.s1
    public void b(java.lang.String str) {
        this.f141305a.f141119q = str;
    }
}
