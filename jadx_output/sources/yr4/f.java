package yr4;

/* loaded from: classes9.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f465094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f465095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465096f;

    public f(yr4.u uVar, int i17, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f465096f = uVar;
        this.f465094d = i17;
        this.f465095e = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yr4.u uVar = this.f465096f;
        uVar.f213801c.putInt("key_pay_flag", 3);
        uVar.f213801c.putInt("key_err_code", this.f465094d);
        android.os.Bundle bundle = uVar.f213801c;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f465095e;
        uVar.o(walletBaseUI, 0, bundle);
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
    }
}
