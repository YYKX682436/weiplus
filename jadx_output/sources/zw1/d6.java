package zw1;

/* loaded from: classes15.dex */
public class d6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.f6 f476613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(zw1.f6 f6Var) {
        super(false);
        this.f476613d = f6Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        com.tencent.mm.plugin.newtips.model.p Di = rn3.i.Di();
        zw1.f6 f6Var = this.f476613d;
        Di.a(f6Var.f476629g);
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = f6Var.f476631i;
        if (walletCollectQrCodeUI.f96435d == 2) {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.b7(walletCollectQrCodeUI, 1);
        } else {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.b7(walletCollectQrCodeUI, 2);
        }
    }
}
