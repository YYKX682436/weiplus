package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class o0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView f139248d;

    public o0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView chatRoomStateView) {
        this.f139248d = chatRoomStateView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView chatRoomStateView = this.f139248d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(chatRoomStateView.f138936r)) {
            chatRoomStateView.a();
            return true;
        }
        chatRoomStateView.f138932n.setText("");
        chatRoomStateView.f138932n.setVisibility(8);
        return true;
    }
}
