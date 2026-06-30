package com.tencent.mm.plugin.game.chatroom.channel;

/* loaded from: classes15.dex */
public class f implements db5.s7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage f138750a;

    public f(com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage) {
        this.f138750a = chatChannelPage;
    }

    @Override // db5.s7
    public void a(android.view.View view) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f487356oe2);
        if (weImageView != null) {
            weImageView.setIconColor(this.f138750a.f138725d.getResources().getColor(com.tencent.mm.R.color.a9e));
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_game_favour);
        }
    }
}
