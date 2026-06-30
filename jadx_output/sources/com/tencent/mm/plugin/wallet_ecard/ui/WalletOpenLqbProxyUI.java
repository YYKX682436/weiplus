package com.tencent.mm.plugin.wallet_ecard.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletOpenLqbProxyUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.d f181036d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(4);
        this.f181036d = new com.tencent.mm.plugin.wallet.balance.ui.lqt.d(this);
        com.tencent.mm.wallet_core.h process = getProcess();
        if (process != null) {
            int i17 = getInput().getInt("key_open_scene", 0);
            java.lang.String string = getInput().getString("key_open_extra_data");
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenLqbProxyUI", "WalletOpenLqbProxyUI onCreate, openScene: %s, extraData: %s", java.lang.Integer.valueOf(i17), string);
            if (i17 == 3) {
                getNetController().d(java.lang.Integer.valueOf(i17), string);
            } else {
                process.f(this, getInput());
                finish();
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
