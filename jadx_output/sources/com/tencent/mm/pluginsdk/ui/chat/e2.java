package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190294d;

    public e2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190294d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.d2 d2Var = new com.tencent.mm.pluginsdk.ui.chat.d2(this);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190294d;
        chatFooter.post(d2Var);
        chatFooter.f190021m.getSizeAnimController().cancel();
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        if (y4Var == null || y4Var.a() == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.component.ho) ((sb5.o2) chatFooter.f189955a3.a().f460708c.a(sb5.o2.class))).q0().cancel();
    }
}
