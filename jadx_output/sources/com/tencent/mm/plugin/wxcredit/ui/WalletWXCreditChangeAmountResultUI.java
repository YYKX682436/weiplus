package com.tencent.mm.plugin.wxcredit.ui;

/* loaded from: classes9.dex */
public class WalletWXCreditChangeAmountResultUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8o;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.pfd)).setText(com.tencent.mm.wallet_core.ui.r1.m(getInput().getDouble("key_credit_amount")));
        showHomeBtn(false);
        enableBackMenu(false);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new e05.d(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
