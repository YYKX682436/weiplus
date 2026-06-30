package yr4;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f465101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465102e;

    public i(yr4.u uVar, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f465102e = uVar;
        this.f465101d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yr4.u uVar = this.f465102e;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) uVar.f213801c.getParcelable("key_bankcard");
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) uVar.f213801c.getParcelable("key_pay_info");
        if (bankcard != null && payInfo != null) {
            bankcard.N2 = payInfo.f192114m;
        }
        uVar.f213801c.putInt("key_err_code", com.tencent.live.TXLivePluginDef.ErrorCode.CODE_VALUEISNULL);
        android.os.Bundle bundle = uVar.f213801c;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f465101d;
        uVar.o(walletBaseUI, 0, bundle);
        if (walletBaseUI.isTransparent()) {
            walletBaseUI.finish();
        }
    }
}
