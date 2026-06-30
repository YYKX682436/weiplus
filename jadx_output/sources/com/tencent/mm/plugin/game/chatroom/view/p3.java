package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData f139259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData f139260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView f139261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo f139262g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.Lbs f139263h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f139264i;

    public p3(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData, com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView joinRoomExternalConfirmView, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo chatroomEnterInfo, com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.f139259d = chatroomData;
        this.f139260e = chatroomUserData;
        this.f139261f = joinRoomExternalConfirmView;
        this.f139262g = chatroomEnterInfo;
        this.f139263h = lbs;
        this.f139264i = jumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/JoinRoomExternalConfirmView$attachData$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData = this.f139259d;
        if (chatroomData == null || (chatroomUserData = this.f139260e) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/JoinRoomExternalConfirmView$attachData$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView joinRoomExternalConfirmView = this.f139261f;
        fVar.n(1L, 13L, 0L, joinRoomExternalConfirmView.f138997e, joinRoomExternalConfirmView.f138996d, this.f139262g.report_str);
        if (chatroomUserData.is_authorized) {
            gm0.j1.d().g(new v33.o(chatroomData.chatroom_name, this.f139263h, true, joinRoomExternalConfirmView.f138997e, joinRoomExternalConfirmView.f138996d));
        } else if (chatroomUserData.create_account_jump_info != null) {
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.f139264i;
            if (jumpInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo.jump_url)) {
                java.lang.String str = jumpInfo.preload_id;
                if (str == null) {
                    str = "";
                }
                if (kotlin.jvm.internal.o.b(str, chatroomUserData.create_account_jump_info.preload_id)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("source_id", 1311L);
                    } catch (org.json.JSONException unused) {
                    }
                    java.lang.String encode = java.net.URLEncoder.encode(jSONObject.toString());
                    kotlin.jvm.internal.o.f(encode, "encode(...)");
                    s33.y.i(joinRoomExternalConfirmView.getContext(), chatroomUserData.create_account_jump_info, 11, encode);
                }
            }
            s33.y.i(joinRoomExternalConfirmView.getContext(), chatroomUserData.create_account_jump_info, 11, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/JoinRoomExternalConfirmView$attachData$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
