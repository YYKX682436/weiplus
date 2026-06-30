package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class n3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData f139241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData f139242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.Lbs f139243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f139244g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.JoinChatRoomConfirmView f139245h;

    public n3(com.tencent.mm.plugin.game.chatroom.view.JoinChatRoomConfirmView joinChatRoomConfirmView, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData, com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.f139245h = joinChatRoomConfirmView;
        this.f139241d = chatroomUserData;
        this.f139242e = chatroomData;
        this.f139243f = lbs;
        this.f139244g = jumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/JoinChatRoomConfirmView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        com.tencent.mm.plugin.game.chatroom.view.JoinChatRoomConfirmView joinChatRoomConfirmView = this.f139245h;
        fVar.m(1L, 13L, 0L, joinChatRoomConfirmView.f138988f, joinChatRoomConfirmView.f138987e);
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = this.f139241d;
        if (chatroomUserData.is_authorized) {
            gm0.j1.d().g(new v33.o(this.f139242e.chatroom_name, this.f139243f, true, joinChatRoomConfirmView.f138988f, joinChatRoomConfirmView.f138987e));
        } else if (chatroomUserData.create_account_jump_info != null) {
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.f139244g;
            if (jumpInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo.jump_url)) {
                java.lang.String str = jumpInfo.preload_id;
                if (str == null) {
                    str = "";
                }
                if (str.equals(chatroomUserData.create_account_jump_info.preload_id)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("source_id", 1311L);
                    } catch (org.json.JSONException unused) {
                    }
                    s33.y.i(joinChatRoomConfirmView.f138986d, chatroomUserData.create_account_jump_info, 11, java.net.URLEncoder.encode(jSONObject.toString()));
                }
            }
            s33.y.i(joinChatRoomConfirmView.f138986d, chatroomUserData.create_account_jump_info, 11, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/JoinChatRoomConfirmView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
