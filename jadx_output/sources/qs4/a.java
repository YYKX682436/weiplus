package qs4;

/* loaded from: classes9.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f366413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qs4.b f366414e;

    public a(qs4.b bVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f366414e = bVar;
        this.f366413d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qs4.b bVar = this.f366414e;
        android.os.Bundle bundle = bVar.f213801c;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f366413d;
        bVar.f(walletBaseUI, bundle);
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
        walletBaseUI.clearErr();
    }
}
