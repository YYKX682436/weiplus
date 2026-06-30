package lz2;

/* loaded from: classes14.dex */
public class p extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog f322349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog walletFaceIdDialog) {
        super(false);
        this.f322349d = walletFaceIdDialog;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        lz2.w wVar = this.f322349d.f136993n;
        wVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "click right btn");
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog walletFaceIdDialog = wVar.f322357d;
        walletFaceIdDialog.f136988f.setEnabled(false);
        walletFaceIdDialog.f136987e.setText(com.tencent.mm.R.string.c8r);
        walletFaceIdDialog.f136987e.post(new lz2.r(walletFaceIdDialog));
        wVar.c();
    }
}
