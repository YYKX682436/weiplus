package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI2 f141311d;

    public t(com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI2 gameChatTabUI2) {
        this.f141311d = gameChatTabUI2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f141311d.finish();
        return false;
    }
}
