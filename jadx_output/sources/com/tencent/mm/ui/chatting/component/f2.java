package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199006d;

    public f2(com.tencent.mm.ui.chatting.component.q2 q2Var, java.lang.String str) {
        this.f199006d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.a3 z07;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().q(null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForGetRoomInfo conversation size:%s", java.lang.Integer.valueOf(arrayList.size()));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.tencent.mm.storage.z3.q4(str) && !com.tencent.mm.sdk.platformtools.t8.D0(this.f199006d, str) && (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str)) != null) {
                if ((((long) z07.field_chatroomStatus) & 2097152) == 2097152 && com.tencent.mm.sdk.platformtools.t8.K0(z07.field_associateOpenIMRoomName)) {
                    ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).m(str).b();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForGetRoomInfo %s", str);
                }
            }
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_OPEN_IM_MIGRATE_CHECK_ALL_CONVERSATION_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
    }
}
