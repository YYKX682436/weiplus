package com.tencent.mm.plugin.wxcredit.ui;

/* loaded from: classes9.dex */
public class WalletWXCreditOpenNotifyUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8u;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.l2l);
        showHomeBtn(false);
        enableBackMenu(false);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new e05.w(this));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.pfd)).setText(com.tencent.mm.wallet_core.ui.r1.m(getInput().getDouble("key_total_amount")));
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        button.setOnClickListener(new e05.x(this));
        button.setVisibility(getInput().getBoolean("key_can_upgrade_amount", true) ? 0 : 8);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.u().c().w(196658, java.lang.Boolean.FALSE);
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
