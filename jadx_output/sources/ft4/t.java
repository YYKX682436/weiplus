package ft4;

/* loaded from: classes14.dex */
public final class t implements ft4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerDayDetailUI f266694a;

    public t(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerDayDetailUI walletLedgerDayDetailUI) {
        this.f266694a = walletLedgerDayDetailUI;
    }

    @Override // ft4.a
    public void a(ft4.j itemData) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
    }

    @Override // ft4.a
    public void b(dt4.u itemData) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDayDetailUI", "click item " + itemData.f243292a + ' ' + itemData.f243293b + ' ' + itemData.f243294c);
        int i17 = itemData.f243294c > 0 ? 10 : 11;
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerDayDetailUI walletLedgerDayDetailUI = this.f266694a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 5, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(walletLedgerDayDetailUI.f180414e), java.lang.Integer.valueOf(walletLedgerDayDetailUI.f180415f));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_talker", walletLedgerDayDetailUI.f180413d);
        intent.putExtra("key_username", itemData.f243293b);
        intent.putExtra("key_amount", itemData.f243294c);
        intent.putExtra("key_date", itemData.f243292a);
        intent.putExtra("key_select_type", walletLedgerDayDetailUI.f180417h);
        j45.l.j(walletLedgerDayDetailUI.getContext(), "wallet_core", ".ui.ledger.WalletLedgerPersonUI", intent, null);
    }

    @Override // ft4.a
    public void c(ft4.j itemData) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
    }
}
