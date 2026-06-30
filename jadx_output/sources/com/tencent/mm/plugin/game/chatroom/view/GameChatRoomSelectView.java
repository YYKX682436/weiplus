package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class GameChatRoomSelectView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard f138984d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.m3 f138985e;

    public GameChatRoomSelectView(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488391s1, this);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.i3b)).setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.l3(this));
        this.f138984d = (com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard) findViewById(com.tencent.mm.R.id.f483616bg1);
    }

    public void setData(java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> list) {
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard chatRoomListCard = this.f138984d;
        if (chatRoomListCard != null) {
            chatRoomListCard.setData(list);
        }
    }

    public void setOnCloseListener(com.tencent.mm.plugin.game.chatroom.view.m3 m3Var) {
        this.f138985e = m3Var;
    }

    public GameChatRoomSelectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public GameChatRoomSelectView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
