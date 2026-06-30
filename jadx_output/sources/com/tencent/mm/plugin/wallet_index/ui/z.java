package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class z implements com.tencent.mm.plugin.wallet_index.ui.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletIapUI f181227a;

    public z(com.tencent.mm.plugin.wallet_index.ui.WalletIapUI walletIapUI) {
        this.f181227a = walletIapUI;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.f
    public void a(nt4.f fVar, mt4.e eVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "Consume finished: " + fVar + ", purchase: " + eVar);
        boolean c17 = fVar.c();
        com.tencent.mm.plugin.wallet_index.ui.WalletIapUI walletIapUI = this.f181227a;
        if (c17) {
            walletIapUI.f181103f = 1002;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "back to preview UI, reason: consume Fail ! ");
        } else {
            walletIapUI.f181103f = 1000;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "back to preview UI, reason: consume Success ! ");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", fVar.f339823a);
        intent.putExtra("key_err_msg", fVar.f339824b);
        intent.putStringArrayListExtra("key_response_product_ids", walletIapUI.f181107m.f181152a);
        intent.putStringArrayListExtra("key_response_series_ids", walletIapUI.f181107m.f181153b);
        intent.putExtra("key_launch_ts", com.tencent.mm.plugin.wallet_index.ui.c.f181139m);
        walletIapUI.setResult(-1, intent);
        walletIapUI.finish();
    }
}
