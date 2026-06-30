package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.e2 f190258d;

    public d2(com.tencent.mm.pluginsdk.ui.chat.e2 e2Var) {
        this.f190258d = e2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.e2 e2Var = this.f190258d;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = e2Var.f190294d;
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        if (chatFooter.f190021m.getTag(com.tencent.mm.R.id.bpj) != null) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = e2Var.f190294d;
            chatFooter2.setDelaySendAnim(false);
            chatFooter2.B(com.tencent.mm.pluginsdk.ui.chat.ChatFooter.m(chatFooter2, chatFooter2.f190021m.getText()));
            chatFooter2.f190021m.getSizeAnimController().resume();
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter2.f189955a3;
            if (y4Var == null || y4Var.a() == null) {
                return;
            }
            ((com.tencent.mm.ui.chatting.component.ho) ((sb5.o2) chatFooter2.f189955a3.a().f460708c.a(sb5.o2.class))).q0().resume();
        }
    }
}
