package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail f139338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView f139339e;

    public x(com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView chatRoomFooterView, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroomJumpDetail) {
        this.f139339e = chatRoomFooterView;
        this.f139338d = chatroomJumpDetail;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView chatRoomFooterView = this.f139339e;
        int h17 = s33.y.h(chatRoomFooterView.f138884d, this.f139338d.jump_info);
        com.tencent.mm.game.report.g.f68195a.k(1003L, 1L, h17 != 1 ? h17 != 2 ? h17 != 3 ? -1L : 28L : 7L : 6L, 0L, chatRoomFooterView.f138894q, chatRoomFooterView.f138893p, "", "", "");
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
