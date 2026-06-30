package ft4;

/* loaded from: classes14.dex */
public final class z0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI f266743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI) {
        super(false);
        this.f266743d = walletLedgerPersonDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.util.Collection collection;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "clickDateBtnListener");
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI = this.f266743d;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 4, 7, java.lang.Integer.valueOf(walletLedgerPersonDetailUI.f180450f), java.lang.Integer.valueOf(walletLedgerPersonDetailUI.f180451g));
        if (walletLedgerPersonDetailUI.f180457p == null) {
            androidx.appcompat.app.AppCompatActivity context = walletLedgerPersonDetailUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gt4.s0 s0Var = new gt4.s0(context);
            walletLedgerPersonDetailUI.f180457p = s0Var;
            com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = s0Var.f275541n;
            if (customDatePickerNew == null) {
                kotlin.jvm.internal.o.o("datePicker");
                throw null;
            }
            customDatePickerNew.f212200o = false;
            customDatePickerNew.f212201p = true;
            customDatePickerNew.f212202q = true;
            java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date());
            kotlin.jvm.internal.o.d(format);
            java.util.List g17 = new r26.t("-").g(format, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f313996d;
            java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
            gt4.s0 s0Var2 = walletLedgerPersonDetailUI.f180457p;
            kotlin.jvm.internal.o.d(s0Var2);
            s0Var2.h(com.tencent.mm.sdk.platformtools.t8.D1(strArr[0], 0), com.tencent.mm.sdk.platformtools.t8.D1(strArr[1], 0), com.tencent.mm.sdk.platformtools.t8.D1(strArr[2], 0));
            gt4.s0 s0Var3 = walletLedgerPersonDetailUI.f180457p;
            kotlin.jvm.internal.o.d(s0Var3);
            s0Var3.g(com.tencent.mm.sdk.platformtools.t8.D1(strArr[0], 0), com.tencent.mm.sdk.platformtools.t8.D1(strArr[1], 0), com.tencent.mm.sdk.platformtools.t8.D1(strArr[2], 0));
            gt4.s0 s0Var4 = walletLedgerPersonDetailUI.f180457p;
            kotlin.jvm.internal.o.d(s0Var4);
            int i17 = walletLedgerPersonDetailUI.f180452h;
            s0Var4.i(i17 / 10000, (i17 % 10000) / 100, 1);
            if (walletLedgerPersonDetailUI.f180450f > 0) {
                gt4.s0 s0Var5 = walletLedgerPersonDetailUI.f180457p;
                kotlin.jvm.internal.o.d(s0Var5);
                int i18 = walletLedgerPersonDetailUI.f180450f;
                s0Var5.g(i18 / 10000, (i18 % 10000) / 100, i18 % 100);
            }
            gt4.s0 s0Var6 = walletLedgerPersonDetailUI.f180457p;
            kotlin.jvm.internal.o.d(s0Var6);
            s0Var6.L = new ft4.e1(walletLedgerPersonDetailUI);
        }
        dt4.p pVar = walletLedgerPersonDetailUI.f180458q;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("ledgerDataCenter");
            throw null;
        }
        int i19 = pVar.i(walletLedgerPersonDetailUI.f180449e, walletLedgerPersonDetailUI.f180454m);
        walletLedgerPersonDetailUI.f180452h = i19;
        if (i19 > 0) {
            gt4.s0 s0Var7 = walletLedgerPersonDetailUI.f180457p;
            kotlin.jvm.internal.o.d(s0Var7);
            int i27 = walletLedgerPersonDetailUI.f180452h;
            s0Var7.i(i27 / 10000, (i27 % 10000) / 100, 1);
        }
        if (walletLedgerPersonDetailUI.f180450f > 0) {
            gt4.s0 s0Var8 = walletLedgerPersonDetailUI.f180457p;
            kotlin.jvm.internal.o.d(s0Var8);
            int i28 = walletLedgerPersonDetailUI.f180450f;
            s0Var8.g(i28 / 10000, (i28 % 10000) / 100, i28 % 100);
        }
        gt4.s0 s0Var9 = walletLedgerPersonDetailUI.f180457p;
        kotlin.jvm.internal.o.d(s0Var9);
        s0Var9.l();
    }
}
