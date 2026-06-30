package com.tencent.mm.plugin.wallet.loan;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletLoanCheckPwdUI extends com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI {
    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI, com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getProcess() != null) {
            setBackBtn(new ur4.b(this));
        }
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ss4.y) || (i17 == 0 && i18 == 0)) {
            return super.onSceneEnd(i17, i18, str, m1Var);
        }
        return false;
    }
}
