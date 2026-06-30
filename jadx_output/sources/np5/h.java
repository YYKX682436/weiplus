package np5;

/* loaded from: classes9.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f338835d;

    public h(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f338835d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f338835d;
        com.tencent.mm.wallet_core.ui.r1.V(walletBaseUI, "https://www.payu.co.za/wechat/contact-us/", true);
        if (walletBaseUI.isTransparent() || walletBaseUI.getContentViewVisibility() != 0) {
            walletBaseUI.finish();
        }
    }
}
