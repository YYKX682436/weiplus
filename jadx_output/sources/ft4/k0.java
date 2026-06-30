package ft4;

/* loaded from: classes14.dex */
public final class k0 implements ft4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI f266643a;

    public k0(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI) {
        this.f266643a = walletLedgerMainUI;
    }

    @Override // ft4.a
    public void a(ft4.j itemData) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click detail ");
        ft4.k kVar = itemData.f266632b;
        sb6.append(kVar.f266637b);
        sb6.append(' ');
        sb6.append(kVar.f266638c);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", sb6.toString());
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266643a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 1, 15, java.lang.Integer.valueOf(walletLedgerMainUI.f180429e), java.lang.Integer.valueOf(walletLedgerMainUI.f180430f));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_talker", walletLedgerMainUI.f180428d);
        int i17 = walletLedgerMainUI.f180438q;
        if (i17 == 3) {
            ft4.u uVar = walletLedgerMainUI.D;
            if (uVar == null) {
                kotlin.jvm.internal.o.o("header");
                throw null;
            }
            intent.putExtra("key_from_date", uVar.f266700d);
            ft4.u uVar2 = walletLedgerMainUI.D;
            if (uVar2 == null) {
                kotlin.jvm.internal.o.o("header");
                throw null;
            }
            intent.putExtra("key_to_date", uVar2.f266701e);
        } else if (i17 != 2) {
            intent.putExtra("key_from_date", ((kVar.f266637b / 100) * 100) + 1);
            intent.putExtra("key_to_date", ((kVar.f266637b / 100) * 100) + 32);
        }
        intent.putExtra("key_select_type", walletLedgerMainUI.f180437p);
        j45.l.j(walletLedgerMainUI.getContext(), "wallet_core", ".ui.ledger.WalletLedgerDayDetailUI", intent, null);
    }

    @Override // ft4.a
    public void b(dt4.u itemData) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "click item " + itemData.f243292a + ' ' + itemData.f243293b + ' ' + itemData.f243294c);
        int i17 = itemData.f243294c > 0 ? 10 : 11;
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266643a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(walletLedgerMainUI.f180429e), java.lang.Integer.valueOf(walletLedgerMainUI.f180430f));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_talker", walletLedgerMainUI.f180428d);
        intent.putExtra("key_username", itemData.f243293b);
        intent.putExtra("key_amount", itemData.f243294c);
        int i18 = walletLedgerMainUI.f180438q;
        if (i18 == 3) {
            if (walletLedgerMainUI.f180436o == 2) {
                ft4.u uVar = walletLedgerMainUI.D;
                if (uVar == null) {
                    kotlin.jvm.internal.o.o("header");
                    throw null;
                }
                intent.putExtra("key_from_date", uVar.f266700d);
                ft4.u uVar2 = walletLedgerMainUI.D;
                if (uVar2 == null) {
                    kotlin.jvm.internal.o.o("header");
                    throw null;
                }
                intent.putExtra("key_to_date", uVar2.f266701e);
            } else {
                intent.putExtra("key_date", itemData.f243292a);
            }
        } else if (i18 == 2) {
            intent.putExtra("key_date", itemData.f243292a);
        } else if (walletLedgerMainUI.f180436o == 2) {
            intent.putExtra("key_from_date", ((itemData.f243292a / 100) * 100) + 1);
            intent.putExtra("key_to_date", ((itemData.f243292a / 100) * 100) + 32);
        } else {
            intent.putExtra("key_date", itemData.f243292a);
        }
        intent.putExtra("key_select_type", walletLedgerMainUI.f180437p);
        j45.l.j(walletLedgerMainUI.getContext(), "wallet_core", ".ui.ledger.WalletLedgerPersonUI", intent, null);
    }

    @Override // ft4.a
    public void c(ft4.j itemData) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "click header ");
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI.U6(this.f266643a, itemData.f266632b.f266637b);
    }
}
