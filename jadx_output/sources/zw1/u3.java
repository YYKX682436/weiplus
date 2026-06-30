package zw1;

/* loaded from: classes15.dex */
public class u3 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f476819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476820c;

    public u3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var, int i17) {
        this.f476820c = walletCollectQrCodeUI;
        this.f476818a = a3Var;
        this.f476819b = i17;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "click clear money tv");
        ww1.a3 a3Var = this.f476818a;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476820c;
        walletCollectQrCodeUI.D7(a3Var);
        int i17 = this.f476819b;
        walletCollectQrCodeUI.B7(i17);
        walletCollectQrCodeUI.I7(i17);
        walletCollectQrCodeUI.h7(i17, true);
    }
}
