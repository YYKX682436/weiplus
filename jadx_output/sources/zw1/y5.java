package zw1;

/* loaded from: classes15.dex */
public class y5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        super(false);
        this.f476862d = walletCollectQrCodeUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476862d;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.c7(walletCollectQrCodeUI, walletCollectQrCodeUI.f96438g);
    }
}
