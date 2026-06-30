package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ad implements com.tencent.mm.storage.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent f203347d;

    public ad(com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent) {
        this.f203347d = walletQueryRemittanceStatusEvent;
    }

    @Override // com.tencent.mm.storage.a9
    public boolean U(java.lang.Object obj) {
        com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = ((com.tencent.mm.ui.chatting.viewitems.ad) obj).f203347d;
        com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent2 = this.f203347d;
        walletQueryRemittanceStatusEvent2.getClass();
        if (walletQueryRemittanceStatusEvent != null && n51.f.a(walletQueryRemittanceStatusEvent2.f54971g.f8421a, walletQueryRemittanceStatusEvent.f54971g.f8421a)) {
            am.z10 z10Var = walletQueryRemittanceStatusEvent2.f54972h;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(z10Var.f8505a);
            am.z10 z10Var2 = walletQueryRemittanceStatusEvent.f54972h;
            if (n51.f.a(valueOf, java.lang.Integer.valueOf(z10Var2.f8505a)) && n51.f.a(java.lang.Boolean.valueOf(z10Var.f8506b), java.lang.Boolean.valueOf(z10Var2.f8506b)) && n51.f.a(java.lang.Boolean.valueOf(z10Var.f8507c), java.lang.Boolean.valueOf(z10Var2.f8507c))) {
                return true;
            }
        }
        return false;
    }
}
