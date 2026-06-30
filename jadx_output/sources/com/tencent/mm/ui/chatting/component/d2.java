package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f198920d;

    public d2(com.tencent.mm.ui.chatting.component.q2 q2Var) {
        this.f198920d = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.q2 q2Var = this.f198920d;
        if (q2Var.f198580d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "[getChatroomMemberDetail] mChattingContext is null!");
            return;
        }
        com.tencent.mm.storage.a3 z07 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(q2Var.f198580d.x());
        if (z07 == null || !z07.Q0()) {
            return;
        }
        java.lang.String x17 = q2Var.f198580d.x();
        com.tencent.mm.roomsdk.model.factory.a g17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(q2Var.f198580d.x()).g(q2Var.f198580d.x(), z07.D0());
        g17.f192246b = new com.tencent.mm.ui.chatting.component.c2(this, x17);
        g17.b();
    }
}
