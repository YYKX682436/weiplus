package np5;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f338836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f338837e;

    public i(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, int i17) {
        this.f338836d = walletBaseUI;
        this.f338837e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f338836d;
        com.tencent.mm.wallet_core.a.c(walletBaseUI, walletBaseUI.getInput(), this.f338837e);
        if (walletBaseUI.isTransparent() || walletBaseUI.getContentViewVisibility() != 0) {
            walletBaseUI.finish();
        }
    }
}
