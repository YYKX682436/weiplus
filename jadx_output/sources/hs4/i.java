package hs4;

/* loaded from: classes9.dex */
public class i implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.ui.WalletJsApiAdapterUI f284633a;

    public i(com.tencent.mm.plugin.wallet.ui.WalletJsApiAdapterUI walletJsApiAdapterUI) {
        this.f284633a = walletJsApiAdapterUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.wallet.ui.WalletJsApiAdapterUI walletJsApiAdapterUI = this.f284633a;
        walletJsApiAdapterUI.setResult(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND);
        walletJsApiAdapterUI.finish();
    }
}
