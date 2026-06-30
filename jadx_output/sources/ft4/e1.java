package ft4;

/* loaded from: classes14.dex */
public final class e1 implements gt4.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI f266609a;

    public e1(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI) {
        this.f266609a = walletLedgerPersonDetailUI;
    }

    @Override // gt4.y
    public java.util.Map a(int i17, int i18) {
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI = this.f266609a;
        dt4.p pVar = walletLedgerPersonDetailUI.f180458q;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("ledgerDataCenter");
            throw null;
        }
        dt4.s k17 = pVar.k(walletLedgerPersonDetailUI.f180454m, walletLedgerPersonDetailUI.f180449e, i17, i18);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = k17.f243286e.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(java.lang.Integer.valueOf(((dt4.u) it.next()).f243292a), java.lang.Boolean.TRUE);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "getDotMap result size " + linkedHashMap.size());
        return linkedHashMap;
    }

    @Override // gt4.y
    public void b(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "onSelectMonth month:" + i17);
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI = this.f266609a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 4, 8, java.lang.Integer.valueOf(walletLedgerPersonDetailUI.f180450f), java.lang.Integer.valueOf(walletLedgerPersonDetailUI.f180451g));
        gt4.s0 s0Var = walletLedgerPersonDetailUI.f180457p;
        if (s0Var != null) {
            s0Var.e();
        }
        int i18 = i17 * 100;
        walletLedgerPersonDetailUI.f180450f = i18 + 1;
        walletLedgerPersonDetailUI.f180451g = i18 + 31;
        walletLedgerPersonDetailUI.f180466y = 1;
        walletLedgerPersonDetailUI.U6();
    }

    @Override // gt4.y
    public void c(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "onSelectSection start:" + i17 + " end:" + i18 + " quickDatePickBtnState:" + i19);
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI = this.f266609a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 4, 9, java.lang.Integer.valueOf(walletLedgerPersonDetailUI.f180450f), java.lang.Integer.valueOf(walletLedgerPersonDetailUI.f180451g), java.lang.Integer.valueOf(i19));
        gt4.s0 s0Var = walletLedgerPersonDetailUI.f180457p;
        if (s0Var != null) {
            s0Var.e();
        }
        walletLedgerPersonDetailUI.f180450f = i17;
        walletLedgerPersonDetailUI.f180451g = i18;
        if (i17 == i18) {
            walletLedgerPersonDetailUI.f180466y = 2;
        } else {
            walletLedgerPersonDetailUI.f180466y = 3;
        }
        walletLedgerPersonDetailUI.U6();
    }
}
