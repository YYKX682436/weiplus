package com.tencent.mm.plugin.game.chatroom.channel;

/* loaded from: classes15.dex */
public class d implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage f138748d;

    public d(com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage) {
        this.f138748d = chatChannelPage;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage.b(this.f138748d, iVar, false);
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        com.tencent.mm.ui.base.CustomViewPager customViewPager;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("GameChatRoom.ChatChannelPage", "select tab:%d", java.lang.Integer.valueOf(iVar.f343782e));
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage = this.f138748d;
        customViewPager = chatChannelPage.mViewPager;
        customViewPager.setCurrentItem(iVar.f343782e);
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage.b(chatChannelPage, iVar, true);
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = (com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) chatChannelPage.f138731m.getItem(iVar.f343782e);
        if (chatChannelPage.f138732n != null && chatChannelFragment != null) {
            com.tencent.mm.plugin.game.autogen.chatroom.Channel channel = chatChannelFragment.f138711g;
            if (channel.read_only) {
                str = channel.cant_send_reason;
            } else {
                if (channel.channel_id == 0) {
                    str = "";
                } else {
                    str = "# " + chatChannelFragment.f138711g.name;
                }
            }
            chatChannelPage.f138732n.a(!chatChannelFragment.f138711g.read_only, str);
            com.tencent.mm.plugin.game.autogen.chatroom.Channel channel2 = chatChannelFragment.f138711g;
            chatChannelPage.f138732n.b(!(channel2.channel_id == 0), channel2, false);
        }
        chatChannelPage.f138733o = chatChannelFragment.f138711g.channel_id;
        if (!chatChannelPage.f138734p) {
            com.tencent.mm.game.report.g.f68195a.o(iVar.f343778a instanceof java.lang.Integer ? ((java.lang.Integer) r0).intValue() : 1, 2L, chatChannelPage.f138727f, chatChannelPage.f138726e, chatChannelPage.f138733o);
        }
        chatChannelPage.f138734p = false;
    }
}
