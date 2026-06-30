package com.tencent.mm.plugin.wallet_payu.balance.ui;

/* loaded from: classes9.dex */
public class WalletPayUBalanceSaveUI extends com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI {
    @Override // com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI
    public void U6() {
        doSceneProgress(new qt4.a(this.f177831d, "ZAR"));
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f177836i.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0 && (m1Var instanceof qt4.a)) {
            java.lang.String str2 = ((qt4.a) m1Var).f366650d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
                payInfo.f192114m = str2;
                payInfo.f192116o = "";
                payInfo.f192117p = null;
                payInfo.f192109e = 11;
                payInfo.f192121t = null;
                payInfo.f192111g = 0;
                h45.a0.f(this, payInfo, 1);
            }
        }
        return false;
    }
}
