package hs4;

/* loaded from: classes9.dex */
public class k implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.ui.WalletJsApiAdapterUI f284634a;

    public k(com.tencent.mm.plugin.wallet.ui.WalletJsApiAdapterUI walletJsApiAdapterUI) {
        this.f284634a = walletJsApiAdapterUI;
    }

    @Override // h45.i
    public void onKindaBusinessCallback(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("retcode", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletJsApiAdapterUI", "startGetEncryptHKPasswd callback, retcode is %s", java.lang.Integer.valueOf(intExtra));
        com.tencent.mm.plugin.wallet.ui.WalletJsApiAdapterUI walletJsApiAdapterUI = this.f284634a;
        if (intExtra == 1) {
            walletJsApiAdapterUI.setResult(-1, intent);
        } else {
            walletJsApiAdapterUI.setResult(0, intent);
        }
        walletJsApiAdapterUI.finish();
    }
}
