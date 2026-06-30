package fs4;

/* loaded from: classes9.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f266339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fs4.h f266340e;

    public f(fs4.h hVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f266340e = hVar;
        this.f266339d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        fs4.h hVar = this.f266340e;
        android.os.Bundle bundle = hVar.f213801c;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f266339d;
        hVar.f(walletBaseUI, bundle);
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
        walletBaseUI.clearErr();
    }
}
