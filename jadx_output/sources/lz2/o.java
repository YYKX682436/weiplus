package lz2;

/* loaded from: classes14.dex */
public class o extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog f322348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog walletFaceIdDialog) {
        super(false);
        this.f322348d = walletFaceIdDialog;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog walletFaceIdDialog = this.f322348d;
        lz2.w wVar = walletFaceIdDialog.f136993n;
        wVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "click left btn");
        if (wVar.f322362i) {
            wVar.b(-1);
        } else {
            wVar.a();
        }
        walletFaceIdDialog.dismiss();
    }
}
