package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.Notification f139274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView f139275e;

    public r0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView chatRoomStateView, com.tencent.mm.plugin.game.autogen.chatroom.Notification notification) {
        this.f139275e = chatRoomStateView;
        this.f139274d = notification;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView chatRoomStateView = this.f139275e;
        chatRoomStateView.f138938t.c(0L, 0L);
        gm0.j1.d().g(new v33.x(chatRoomStateView.f138933o, 3, this.f139274d.f138699id));
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
