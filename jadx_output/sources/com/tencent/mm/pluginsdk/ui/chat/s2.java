package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class s2 implements com.tencent.mm.pluginsdk.ui.chat.gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190640a;

    public s2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190640a = chatFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.gb
    public void a() {
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        this.f190640a.B0();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.gb
    public void b(java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190640a;
        com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = chatFooter.f190090x0;
        if (k5Var != null) {
            k5Var.d(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "onSendMsg listener is null !!!");
        }
        chatFooter.f189987g.n();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.gb
    public void c(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190640a;
        if (z17) {
            com.tencent.mm.pluginsdk.ui.chat.a5 a5Var = chatFooter.R2;
            if (a5Var != null) {
                ((com.tencent.mm.ui.chatting.component.xo) a5Var).a(java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.a5 a5Var2 = chatFooter.R2;
        if (a5Var2 != null) {
            ((com.tencent.mm.ui.chatting.component.xo) a5Var2).a(java.lang.Boolean.FALSE);
        }
    }
}
