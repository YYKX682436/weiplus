package zw1;

/* loaded from: classes8.dex */
public class s3 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f476790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476792c;

    public s3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17, ww1.a3 a3Var) {
        this.f476792c = walletCollectQrCodeUI;
        this.f476790a = i17;
        this.f476791b = a3Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "click set money tv");
        ww1.a3 a3Var = this.f476791b;
        int i17 = this.f476790a;
        if (i17 == 1) {
            if (view == null || a3Var == null) {
                com.tencent.mars.xlog.Log.e("WalletCollectQrCode", "handlePersonalCodeClick: 参数为空 view=" + view + ", dataModel=" + a3Var);
            } else {
                android.content.Context context = view.getContext();
                walletCollectQrCodeUI = context instanceof com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI ? (com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI) context : null;
                if (walletCollectQrCodeUI == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "Invalid context type, expected WalletCollectQrCodeUI");
                } else {
                    r45.hk5 hk5Var = a3Var.f450093c0;
                    boolean z17 = hk5Var != null ? hk5Var.f376247d : false;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "checkIfNeedShowSheetForPersonal: " + z17);
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "showReceiptSettingSheetForPersonal");
                        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) walletCollectQrCodeUI, 1, false);
                        k0Var.f211872n = new zw1.m6(walletCollectQrCodeUI, a3Var, i17);
                        k0Var.v();
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 22, java.lang.Integer.valueOf(i17));
                    } else {
                        walletCollectQrCodeUI.M7(a3Var, i17);
                    }
                }
            }
        } else if (view == null || a3Var == null) {
            com.tencent.mars.xlog.Log.e("WalletCollectQrCode", "handlePersonalCodeClick:  view=" + view + ", dataModel=" + a3Var);
        } else {
            android.content.Context context2 = view.getContext();
            walletCollectQrCodeUI = context2 instanceof com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI ? (com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI) context2 : null;
            if (walletCollectQrCodeUI == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "Invalid context type, expected WalletCollectQrCodeUI");
            } else {
                r45.fk5 fk5Var = a3Var.f450091b0;
                boolean z18 = fk5Var != null ? fk5Var.f374412d : false;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "checkIfNeedShowSheet: " + z18);
                if (z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "showReceiptSettingSheet");
                    com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) walletCollectQrCodeUI, 1, false);
                    k0Var2.f211872n = new zw1.i6(walletCollectQrCodeUI, a3Var);
                    k0Var2.f211881s = new zw1.j6(walletCollectQrCodeUI, a3Var, i17);
                    k0Var2.v();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 22, java.lang.Integer.valueOf(i17));
                } else {
                    walletCollectQrCodeUI.M7(a3Var, i17);
                }
            }
        }
        this.f476792c.N = 3;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 3, java.lang.Integer.valueOf(i17));
    }
}
