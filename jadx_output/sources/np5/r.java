package np5;

/* loaded from: classes9.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f338847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f338848e;

    public r(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, int i17) {
        this.f338847d = walletBaseUI;
        this.f338848e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f338847d;
        com.tencent.mm.wallet_core.a.c(walletBaseUI, walletBaseUI.getInput(), this.f338848e);
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
    }
}
