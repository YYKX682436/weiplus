package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190395d;

    public i4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190395d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        sb5.q2 q2Var;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190395d;
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        if (y4Var == null || y4Var.a() == null || (q2Var = (sb5.q2) chatFooter.f189955a3.a().f460708c.a(sb5.q2.class)) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.component.ro roVar = (com.tencent.mm.ui.chatting.component.ro) q2Var;
        roVar.f199879v = true;
        roVar.x0();
    }
}
