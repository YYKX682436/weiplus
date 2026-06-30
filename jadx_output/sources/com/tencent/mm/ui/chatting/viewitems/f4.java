package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class f4 implements com.tencent.mm.storage.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.WalletQueryHbStatusEvent f203941d;

    public f4(com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent) {
        this.f203941d = walletQueryHbStatusEvent;
    }

    @Override // com.tencent.mm.storage.a9
    public boolean U(java.lang.Object obj) {
        com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent = ((com.tencent.mm.ui.chatting.viewitems.f4) obj).f203941d;
        com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent2 = this.f203941d;
        walletQueryHbStatusEvent2.getClass();
        if (walletQueryHbStatusEvent != null && n51.f.a(walletQueryHbStatusEvent2.f54969g.f8253a, walletQueryHbStatusEvent.f54969g.f8253a)) {
            am.x10 x10Var = walletQueryHbStatusEvent2.f54970h;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(x10Var.f8335a);
            am.x10 x10Var2 = walletQueryHbStatusEvent.f54970h;
            if (n51.f.a(valueOf, java.lang.Integer.valueOf(x10Var2.f8335a)) && n51.f.a(java.lang.Integer.valueOf(x10Var.f8336b), java.lang.Integer.valueOf(x10Var2.f8336b)) && n51.f.a(java.lang.Integer.valueOf(x10Var.f8337c), java.lang.Integer.valueOf(x10Var2.f8337c))) {
                return true;
            }
        }
        return false;
    }
}
