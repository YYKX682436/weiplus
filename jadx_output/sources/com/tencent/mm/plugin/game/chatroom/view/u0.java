package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.v0 f139303d;

    public u0(com.tencent.mm.plugin.game.chatroom.view.v0 v0Var) {
        this.f139303d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.chatroom.view.v0 v0Var = this.f139303d;
        com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo myChatroomInfo = v0Var.f139316o;
        if (myChatroomInfo != null && (chatroomRecInfo = myChatroomInfo.chatroom_info) != null && chatroomRecInfo.chatroom_data != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("reportStr", v0Var.f139316o.chatroom_info.chatroom_data.report_str);
            } catch (java.lang.Exception unused) {
            }
            int c17 = com.tencent.mm.plugin.game.chatroom.view.j1.c(v0Var.f139297d, 3, v0Var.f139316o.chatroom_info.chatroom_data, v0Var.f139318q, v0Var.f139310f, null, 0L, 1001L);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData = v0Var.f139317p;
            java.lang.String str = chatroomData == null ? "" : chatroomData.appid;
            java.lang.String str2 = chatroomData != null ? chatroomData.chatroom_name : "";
            com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
            if (c17 == 1) {
                fVar.k(1001L, v0Var.f139319r, 6L, 0L, v0Var.f139320s, v0Var.f139321t, str, str2, jSONObject.toString());
            } else if (c17 == 2) {
                fVar.k(1001L, v0Var.f139319r, 7L, 0L, v0Var.f139320s, v0Var.f139321t, str, str2, jSONObject.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
