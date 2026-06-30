package zw1;

/* loaded from: classes15.dex */
public class x3 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f476844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f476845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476846c;

    public x3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17, java.util.List list) {
        this.f476846c = walletCollectQrCodeUI;
        this.f476844a = i17;
        this.f476845b = list;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "click more tv");
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476846c;
        walletCollectQrCodeUI.D = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) walletCollectQrCodeUI.getContext(), 1, false);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = walletCollectQrCodeUI.D;
        k0Var.f211872n = new zw1.v3(this);
        k0Var.f211881s = new zw1.w3(this);
        k0Var.v();
    }
}
