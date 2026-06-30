package zw1;

/* loaded from: classes9.dex */
public class d3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.t1 f476605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI f476606e;

    public d3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI, ww1.t1 t1Var) {
        this.f476606e = walletCollectQrCodeSettingUI;
        this.f476605d = t1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ww1.t1 t1Var = this.f476605d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(t1Var.f450292p)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "goto h5: %s", t1Var.f450292p);
        com.tencent.mm.wallet_core.ui.r1.V(this.f476606e.getContext(), t1Var.f450292p, true);
    }
}
