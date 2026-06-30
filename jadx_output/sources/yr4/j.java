package yr4;

/* loaded from: classes9.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f465103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465104e;

    public j(yr4.u uVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f465104e = uVar;
        this.f465103d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yr4.u uVar = this.f465104e;
        android.os.Bundle bundle = uVar.f213801c;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f465103d;
        uVar.f(walletBaseUI, bundle);
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
    }
}
