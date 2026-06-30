package zw1;

/* loaded from: classes15.dex */
public class t3 implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f476802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476803b;

    public t3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17) {
        this.f476803b = walletCollectQrCodeUI;
        this.f476802a = i17;
    }

    @Override // h45.i
    public void onKindaBusinessCallback(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("key_error_msg");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra);
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476803b;
        if (K0 || !stringExtra.equals("ok")) {
            walletCollectQrCodeUI.N = 2;
            return;
        }
        int i17 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
        walletCollectQrCodeUI.G7(intent);
        walletCollectQrCodeUI.B7(this.f476802a);
    }
}
