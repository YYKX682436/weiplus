package com.tencent.mm.plugin.wallet_payu.balance.ui;

/* loaded from: classes9.dex */
public class WalletPayUBalanceManagerUI extends com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI {
    @Override // com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI
    public void U6() {
        doSceneProgress(new us4.a(), vr4.f1.wi().Ai().f13999h == null);
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI
    public void W6() {
        startActivity(com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceSaveUI.class);
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0 && (m1Var instanceof us4.a)) {
            Z6(false);
        }
        return false;
    }
}
