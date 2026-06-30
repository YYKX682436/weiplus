package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.AnonymousClass3 f141308d;

    public r1(com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.AnonymousClass3 anonymousClass3) {
        this.f141308d = anonymousClass3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.AnonymousClass3 anonymousClass3 = this.f141308d;
        com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.this.a();
        com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.this;
        com.tencent.mm.ipcinvoker.r rVar = iPCInvoke_readGameLifeConversation.f141207d;
        if (rVar != null) {
            rVar.a(iPCInvoke_readGameLifeConversation.f141209f);
        }
    }
}
