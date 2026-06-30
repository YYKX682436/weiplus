package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static db5.d5 f139186a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b4 f139187b = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.game.chatroom.view.s0(), false);

    public static void a() {
        db5.d5 d5Var = f139186a;
        if (d5Var != null && d5Var.isShowing()) {
            f139186a.dismiss();
        }
        f139186a = null;
    }

    public static com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData b(w33.a aVar) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData2;
        if (aVar == null) {
            return null;
        }
        com.tencent.mm.protobuf.f fVar = aVar.f442700b;
        if (!(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo)) {
            if (!(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo) || (chatroomData = ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo) fVar).chatroom_data) == null) {
                return null;
            }
            return chatroomData;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo = ((com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo) fVar).chatroom_info;
        if (chatroomRecInfo == null || (chatroomData2 = chatroomRecInfo.chatroom_data) == null) {
            return null;
        }
        return chatroomData2;
    }

    public static int c(android.content.Context context, int i17, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData, com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs, android.view.View view, java.util.List list, long j17, long j18) {
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        int i18 = l33.c.f315428a;
        if (i18 == 1 || i18 == 3) {
            ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Vi();
            return 0;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.autogen.chatroom.BanAction banAction = (com.tencent.mm.plugin.game.autogen.chatroom.BanAction) it.next();
                if (banAction.type == 1) {
                    d(context, banAction.desc);
                    return 0;
                }
            }
        }
        if (chatroomData == null || com.tencent.mm.sdk.platformtools.t8.K0(chatroomData.chatroom_name)) {
            return 0;
        }
        android.app.ActivityOptions makeScaleUpAnimation = view != null ? android.app.ActivityOptions.makeScaleUpAnimation(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0) : null;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("chat_room_title", chatroomData.room_name);
        t33.e eVar = new t33.e(chatroomData.chatroom_name, chatroomData.chatroom_icon, j17, j18, false, bundle);
        if (i17 == 1) {
            s33.y.h(context, chatroomData.apply_jump_info);
            return 2;
        }
        if (i17 == 2) {
            eVar.f415407c = true;
            ((s33.j0) ((t33.f) i95.n0.c(t33.f.class))).getClass();
            s33.n.f402530b = true;
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.b7(context, eVar, lbs, makeScaleUpAnimation, false);
            return 1;
        }
        if (i17 == 3) {
            ((s33.j0) ((t33.f) i95.n0.c(t33.f.class))).getClass();
            s33.n.f402530b = true;
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.b7(context, eVar, lbs, makeScaleUpAnimation, false);
            return 1;
        }
        if (i17 != 4) {
            return 0;
        }
        if (chatroomData.is_private || !chatroomData.can_onlooker) {
            s33.y.h(context, chatroomData.apply_jump_info);
            return 2;
        }
        ((s33.j0) ((t33.f) i95.n0.c(t33.f.class))).getClass();
        s33.n.f402530b = true;
        com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.b7(context, eVar, lbs, makeScaleUpAnimation, false);
        return 1;
    }

    public static void d(android.content.Context context, java.lang.String str) {
        a();
        f139186a = com.tencent.mm.ui.widget.dialog.y3.a((android.app.Activity) context, 1, com.tencent.mm.R.raw.tipsbar_icon_warning, context.getResources().getColor(com.tencent.mm.R.color.a9e), str, 0, null, null, null);
        f139187b.c(5000L, 0L);
    }
}
