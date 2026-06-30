package zw1;

/* loaded from: classes15.dex */
public class b6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.c6 f476589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(zw1.c6 c6Var) {
        super(false);
        this.f476589d = c6Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(40);
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476589d.f476598f;
        r45.sm4 sm4Var = walletCollectQrCodeUI.f96437f.X.f381189d;
        java.lang.String str = sm4Var.f385847d;
        java.lang.String str2 = sm4Var.f385848e;
        walletCollectQrCodeUI.getClass();
        com.tencent.mm.wallet_core.ui.r1.c0(str, str2, 0, 1072, new zw1.v5(walletCollectQrCodeUI, 2, 2));
    }
}
