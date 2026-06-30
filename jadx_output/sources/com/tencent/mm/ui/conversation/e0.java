package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.f0 f207640d;

    public e0(com.tencent.mm.ui.conversation.f0 f0Var) {
        this.f207640d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment2;
        com.tencent.mm.ui.chatting.ChattingUIFragment unused;
        com.tencent.mm.ui.conversation.f0 f0Var = this.f207640d;
        unused = f0Var.f207662h.chattingFragmet;
        chattingUIFragment = f0Var.f207662h.chattingFragmet;
        if (chattingUIFragment != null) {
            chattingUIFragment2 = f0Var.f207662h.chattingFragmet;
            chattingUIFragment2.onActivityResult(f0Var.f207659e & 65535, f0Var.f207660f, f0Var.f207661g);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|PostSelectImageJob_onActivityResult";
    }
}
