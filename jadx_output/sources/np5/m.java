package np5;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f338842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f338843e;

    public m(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, int i17) {
        this.f338842d = walletBaseUI;
        this.f338843e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        int i18 = this.f338843e;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f338842d;
        com.tencent.mm.wallet_core.a.c(walletBaseUI, bundle, i18);
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
    }
}
