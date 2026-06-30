package fs4;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f266345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fs4.m f266346e;

    public l(fs4.m mVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f266346e = mVar;
        this.f266345d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        fs4.m mVar = this.f266346e;
        android.os.Bundle bundle = mVar.f213801c;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f266345d;
        mVar.f(walletBaseUI, bundle);
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
        walletBaseUI.clearErr();
    }
}
