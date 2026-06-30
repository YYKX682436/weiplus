package com.tencent.mm.plugin.wallet_payu.bind.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletPayUBankcardManageUI extends com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI {
    @Override // com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI
    public void U6(android.os.Bundle bundle) {
        com.tencent.mm.wallet_core.a.j(this, rt4.f.class, bundle, null);
    }

    @Override // com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI
    public void V6(boolean z17) {
        if (z17) {
            doSceneProgress(new us4.a(), false);
        } else {
            doSceneForceProgress(new us4.a());
        }
    }

    @Override // com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI
    public com.tencent.mm.plugin.wallet.bind.ui.c W6() {
        return new st4.a(this, this.f178549d);
    }

    @Override // com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI
    public void Y6(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("key_bankcard", bankcard);
        com.tencent.mm.wallet_core.a.j(this, rt4.h.class, bundle, null);
    }

    @Override // com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof us4.a)) {
            return false;
        }
        setContentViewVisibility(0);
        this.f178551f.i(this.f178549d, this.f178550e);
        a7();
        Z6();
        return true;
    }
}
