package com.tencent.mm.plugin.game.chatroom.channel;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage f138749d;

    public e(com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage) {
        this.f138749d = chatChannelPage;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage = this.f138749d;
        boolean z17 = s33.y.f((com.tencent.mm.ui.MMActivity) chatChannelPage.f138725d) && s33.y.g();
        chatChannelPage.f138730i.setVisibility(z17 ? 0 : 8);
        if (z17 && chatChannelPage.f138730i.getTag() == null) {
            chatChannelPage.f138730i.setTag(1);
            com.tencent.mm.game.report.g.f68195a.g(20L, 1L, chatChannelPage.f138727f, chatChannelPage.f138726e, 0L, "", 0L, 0);
        }
    }
}
