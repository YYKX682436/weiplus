package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public final class l0 implements db5.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController f139215a;

    public l0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController chatRoomPanelController) {
        this.f139215a = chatRoomPanelController;
    }

    @Override // db5.z1
    public final void a(int i17, int i18, boolean z17) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel chatroomPanel;
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController chatRoomPanelController = this.f139215a;
        chatRoomPanelController.f138921g.f451610b.setSelectedDot(i18);
        if (chatRoomPanelController.f138924m.get(java.lang.Integer.valueOf(i18)) != null || (chatroomPanel = chatRoomPanelController.f138922h) == null) {
            return;
        }
        chatRoomPanelController.a(i18, chatroomPanel);
    }
}
