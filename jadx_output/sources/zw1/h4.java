package zw1;

/* loaded from: classes3.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f476654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476655e;

    public h4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17) {
        this.f476655e = walletCollectQrCodeUI;
        this.f476654d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476655e;
        dp.a.makeText(walletCollectQrCodeUI.getContext(), walletCollectQrCodeUI.getString(com.tencent.mm.R.string.b_v), 1).show();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 17, java.lang.Integer.valueOf(this.f476654d));
    }
}
