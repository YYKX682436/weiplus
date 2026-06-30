package zw1;

/* loaded from: classes15.dex */
public class r5 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f476782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476783f;

    public r5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var, ww1.b3 b3Var) {
        this.f476783f = walletCollectQrCodeUI;
        this.f476781d = a3Var;
        this.f476782e = b3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        ww1.a3 a3Var = this.f476781d;
        if (a3Var.C) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "has show error, do not show timer error");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "has not back resp");
            a3Var.C = true;
            ww1.y2.e(this.f476782e, a3Var, "", this.f476783f.getContext());
        }
        return true;
    }
}
