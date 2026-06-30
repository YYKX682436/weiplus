package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199075d;

    public g2(com.tencent.mm.ui.chatting.component.q2 q2Var, java.lang.String str) {
        this.f199075d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.a3 z07;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().q(null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForMigration conversation size:%s", java.lang.Integer.valueOf(arrayList.size()));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.tencent.mm.storage.z3.q4(str) && !com.tencent.mm.sdk.platformtools.t8.D0(this.f199075d, str) && (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str)) != null) {
                if (z07.field_openIMRoomMigrateStatus == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForMigration %s", str);
                    ((nn.j) i95.n0.c(nn.j.class)).Ni().c(str, z07.field_associateOpenIMRoomName);
                }
            }
        }
    }
}
