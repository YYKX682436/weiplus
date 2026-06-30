package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class r implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI f141307d;

    public r(com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI gameChatTabUI) {
        this.f141307d = gameChatTabUI;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI gameChatTabUI = this.f141307d;
        if (!gameChatTabUI.isDestroyed() && !gameChatTabUI.isFinishing()) {
            int i17 = com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI.f141117r;
            gameChatTabUI.getSwipeBackLayout().setEnableGesture(false);
            android.view.View findViewById = gameChatTabUI.findViewById(com.tencent.mm.R.id.nsv);
            if (findViewById != null) {
                ((com.tencent.mm.ui.widget.SwipeBackLayout) findViewById).setEnableGesture(false);
            }
        }
        return false;
    }
}
