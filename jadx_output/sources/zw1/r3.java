package zw1;

/* loaded from: classes15.dex */
public class r3 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f476777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476778c;

    public r3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var, int i17) {
        this.f476778c = walletCollectQrCodeUI;
        this.f476776a = a3Var;
        this.f476777b = i17;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        ww1.a3 a3Var = this.f476776a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "click save code tv，usage_needed :%s", java.lang.Boolean.valueOf(a3Var.O));
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476778c;
        int i17 = walletCollectQrCodeUI.f96435d;
        int i18 = this.f476777b;
        if (i17 == 1 && a3Var.O) {
            walletCollectQrCodeUI.e7();
        } else {
            a3Var.f450112v = 2;
            walletCollectQrCodeUI.j7(i18, null);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 6, java.lang.Integer.valueOf(i18));
    }
}
