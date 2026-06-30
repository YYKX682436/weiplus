package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag f139021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.e1 f139022e;

    public a1(com.tencent.mm.plugin.game.chatroom.view.e1 e1Var, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag chatroomTag) {
        this.f139022e = e1Var;
        this.f139021d = chatroomTag;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        s33.y.h(this.f139022e.f139297d, this.f139021d.tag_jump_info);
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
