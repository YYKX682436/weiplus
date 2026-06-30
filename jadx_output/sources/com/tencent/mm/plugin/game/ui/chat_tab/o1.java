package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.p1 f141302d;

    public o1(com.tencent.mm.plugin.game.ui.chat_tab.p1 p1Var) {
        this.f141302d = p1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.p1 p1Var = this.f141302d;
        p1Var.f141304d.a();
        com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = p1Var.f141304d;
        com.tencent.mm.ipcinvoker.r rVar = iPCInvoke_readGameLifeConversation.f141207d;
        if (rVar != null) {
            rVar.a(iPCInvoke_readGameLifeConversation.f141209f);
        }
    }
}
