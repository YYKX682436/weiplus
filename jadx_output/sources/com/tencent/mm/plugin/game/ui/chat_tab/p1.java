package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class p1 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation f141304d;

    public p1(com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation) {
        this.f141304d = iPCInvoke_readGameLifeConversation;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (w0Var.f316976d instanceof z53.i) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = this.f141304d;
            if (currentTimeMillis - iPCInvoke_readGameLifeConversation.f141208e < 1000) {
                return;
            }
            iPCInvoke_readGameLifeConversation.f141208e = currentTimeMillis;
            if (iPCInvoke_readGameLifeConversation.f141207d != null) {
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.ui.chat_tab.o1(this), "MicroMsg.GameWebTabUI");
            }
        }
    }
}
