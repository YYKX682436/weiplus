package pg0;

/* loaded from: classes9.dex */
public final class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.EntryWalletLedgerEvent event = (com.tencent.mm.autogen.events.EntryWalletLedgerEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.x4 x4Var = event.f54111g;
        java.lang.ref.WeakReference weakReference = x4Var.f8345b;
        if (weakReference == null || weakReference.get() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedger", "callback contextRef is null");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedger", "receive talker:%s", x4Var.f8344a);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_talker", x4Var.f8344a);
        java.lang.Object obj = x4Var.f8345b.get();
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.content.Context");
        j45.l.j((android.content.Context) obj, "wallet_core", ".ui.ledger.WalletLedgerMainUI", intent, null);
        return true;
    }
}
