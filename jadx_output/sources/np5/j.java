package np5;

/* loaded from: classes9.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f338838d;

    public j(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f338838d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f338838d;
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
    }
}
