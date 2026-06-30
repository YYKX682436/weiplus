package np5;

/* loaded from: classes9.dex */
public class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f338849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f338850e;

    public s(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, int i17) {
        this.f338849d = walletBaseUI;
        this.f338850e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f338849d;
        com.tencent.mm.wallet_core.a.c(walletBaseUI, walletBaseUI.getInput(), this.f338850e);
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
    }
}
