package com.tencent.mm.plugin.wxcredit.ui;

/* loaded from: classes8.dex */
public class WalletWXCreditErrDetailUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f188549d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f188550e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f188551f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8t;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f188549d = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_bankcard");
        this.f188550e = getInput().getString("key_repayment_url");
        if (this.f188549d == null) {
            return;
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.pak)).setOnClickListener(new e05.u(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pal);
        this.f188551f = textView;
        textView.setOnClickListener(new e05.v(this));
        this.f188551f.setVisibility(getInput().getBoolean("key_can_unbind", true) ? 0 : 8);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.kg9);
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
