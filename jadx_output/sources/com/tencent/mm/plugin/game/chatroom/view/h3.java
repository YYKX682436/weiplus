package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.i3 f139146d;

    public h3(com.tencent.mm.plugin.game.chatroom.view.i3 i3Var) {
        this.f139146d = i3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = this.f139146d;
        java.util.Iterator it = ((java.util.HashSet) i3Var.f139170i).iterator();
        while (it.hasNext()) {
            c43.x xVar = (c43.x) it.next();
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
            if (chatroomMsgPack != null) {
                long j17 = chatroomMsgPack.seq;
                long j18 = i3Var.f139176r.J2;
                if (j17 == j18) {
                    xVar.R = j18;
                    xVar.r();
                    i3Var.f139176r.J2 = -1L;
                }
            }
        }
    }
}
