package zw1;

/* loaded from: classes8.dex */
public final class i6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476670e;

    public i6(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var) {
        this.f476669d = walletCollectQrCodeUI;
        this.f476670e = a3Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        r45.uk4 uk4Var;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476669d;
        g4Var.f(0, walletCollectQrCodeUI.getString(com.tencent.mm.R.string.b_7));
        r45.i34 a17 = zw1.n6.f476744a.a(this.f476670e);
        java.lang.String str = (a17 == null || (uk4Var = a17.f376700e) == null) ? null : uk4Var.f387432e;
        if (str == null) {
            java.lang.String string = walletCollectQrCodeUI != null ? walletCollectQrCodeUI.getString(com.tencent.mm.R.string.n_r) : null;
            str = string == null ? "" : string;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "getReceiptSettingText result: ".concat(str));
        g4Var.f(1, str);
    }
}
