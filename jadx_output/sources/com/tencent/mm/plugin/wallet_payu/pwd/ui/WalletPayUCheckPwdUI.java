package com.tencent.mm.plugin.wallet_payu.pwd.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletPayUCheckPwdUI extends com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI {
    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f179979d;
        if (editHintPasswdView != null) {
            editHintPasswdView.setEncrType(-10);
        }
    }
}
