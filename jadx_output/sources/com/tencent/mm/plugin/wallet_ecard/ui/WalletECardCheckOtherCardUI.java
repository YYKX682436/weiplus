package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class WalletECardCheckOtherCardUI extends com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBaseUI implements qp5.i0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f181019d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f181020e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f181021f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f181022g;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a4x;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f181019d = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.bsr);
        this.f181020e = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.bss);
        this.f181021f = (android.widget.Button) findViewById(com.tencent.mm.R.id.bst);
        qp5.p.a(this.f181019d);
        qp5.p.f(this, this.f181020e);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f181022g)) {
            this.f181019d.setHint(getString(com.tencent.mm.R.string.bt6));
        } else {
            this.f181019d.setHint(getString(com.tencent.mm.R.string.f491077bt5, this.f181022g));
        }
        this.f181020e.setHint(getString(com.tencent.mm.R.string.bt7));
        this.f181019d.setOnInputValidChangeListener(this);
        this.f181020e.setOnInputValidChangeListener(this);
        setEditFocusListener(this.f181019d, 0, false);
        setEditFocusListener(this.f181020e, 0, false);
        this.f181021f.setEnabled(false);
        this.f181021f.setClickable(false);
        this.f181021f.setOnClickListener(new com.tencent.mm.plugin.wallet_ecard.ui.g(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f181022g = getInput().getString("key_true_name", "");
        setMMTitle(getString(com.tencent.mm.R.string.bt8));
        this.mNetSceneMgr.c(385);
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mNetSceneMgr.i(385);
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
        if (this.f181019d.n() && this.f181020e.n()) {
            this.f181021f.setEnabled(true);
            this.f181021f.setClickable(true);
        } else {
            this.f181021f.setEnabled(false);
            this.f181021f.setClickable(false);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
