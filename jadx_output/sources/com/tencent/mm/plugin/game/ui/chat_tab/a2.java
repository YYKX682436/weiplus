package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class a2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation f141236d;

    public a2(com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation) {
        this.f141236d = iPCInvoke_readGameLifeConversation;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation;
        com.tencent.mm.ipcinvoker.r rVar;
        if (!(w0Var.f316976d instanceof z53.i) || (rVar = (iPCInvoke_readGameLifeConversation = this.f141236d).f141224d) == null) {
            return;
        }
        rVar.a(iPCInvoke_readGameLifeConversation.a());
    }
}
