package yr4;

/* loaded from: classes9.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f465097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465098e;

    public g(yr4.u uVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f465098e = uVar;
        this.f465097d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yr4.u uVar = this.f465098e;
        uVar.f213801c.putInt("key_err_code", com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PLATFORMVIEWNOTFOUND);
        android.os.Bundle bundle = uVar.f213801c;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f465097d;
        uVar.o(walletBaseUI, 0, bundle);
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
    }
}
