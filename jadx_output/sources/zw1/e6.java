package zw1;

/* loaded from: classes15.dex */
public class e6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.f6 f476619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(zw1.f6 f6Var) {
        super(false);
        this.f476619d = f6Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476619d.f476631i;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.c7(walletCollectQrCodeUI, walletCollectQrCodeUI.f96439h);
    }
}
