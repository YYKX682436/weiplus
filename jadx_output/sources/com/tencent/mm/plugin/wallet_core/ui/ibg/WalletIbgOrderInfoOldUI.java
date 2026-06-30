package com.tencent.mm.plugin.wallet_core.ui.ibg;

/* loaded from: classes9.dex */
public class WalletIbgOrderInfoOldUI extends com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI {
    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI, com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI
    public com.tencent.mm.plugin.wallet_core.model.Orders X6() {
        return this.f180057n;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI
    public void c7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIbgOrderInfoOldUI", "hy: result is not set manly. set to OK");
        for (java.lang.String str : this.f180060q) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.wallet_core.model.a1(str));
            }
        }
        setResult(-1);
        finish();
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI, com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f180057n = com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoUI.f180343n;
        super.onCreate(bundle);
    }
}
