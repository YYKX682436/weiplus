package com.tencent.mm.plugin.game.chatroom.channel;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage f138746d;

    public b(com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage) {
        this.f138746d = chatChannelPage;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/channel/ChatChannelPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage = this.f138746d;
        fVar.g(20L, 2L, chatChannelPage.f138727f, chatChannelPage.f138726e, 0L, "", 0L, 0);
        if (!chatChannelPage.f138738t) {
            chatChannelPage.f138738t = true;
            gm0.j1.d().g(new v33.h(null, "", "", 2, 19527));
            chatChannelPage.f138737s = new com.tencent.mm.ui.widget.dialog.z2(chatChannelPage.f138725d, 0, 0, true, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/channel/ChatChannelPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
