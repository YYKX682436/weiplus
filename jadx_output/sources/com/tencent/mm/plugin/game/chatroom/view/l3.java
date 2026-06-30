package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatRoomSelectView f139218d;

    public l3(com.tencent.mm.plugin.game.chatroom.view.GameChatRoomSelectView gameChatRoomSelectView) {
        this.f139218d = gameChatRoomSelectView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatRoomSelectView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.chatroom.view.m3 m3Var = this.f139218d.f138985e;
        if (m3Var != null) {
            ((com.tencent.mm.plugin.game.chatroom.channel.c) m3Var).f138747a.f138737s.B();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatRoomSelectView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
