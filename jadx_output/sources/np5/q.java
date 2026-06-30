package np5;

/* loaded from: classes9.dex */
public class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f338846d;

    public q(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f338846d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_is_bind_bankcard", false);
        com.tencent.mm.wallet_core.a.k(this.f338846d, "wallet", "BindCardProcess", bundle, new np5.p(this));
    }
}
