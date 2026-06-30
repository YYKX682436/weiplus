package zw1;

/* loaded from: classes15.dex */
public class x5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        super(false);
        this.f476849d = walletCollectQrCodeUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476849d;
        if (walletCollectQrCodeUI.f96439h.f450121a.getVisibility() == 8) {
            return;
        }
        if (walletCollectQrCodeUI.f96435d == 1) {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.b7(walletCollectQrCodeUI, 2);
        } else {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.b7(walletCollectQrCodeUI, 1);
        }
    }
}
