package com.tencent.mm.plugin.wxcredit.ui;

/* loaded from: classes9.dex */
public class WalletCheckIdentityUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f188521d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f188522e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f188523f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8q;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.kjx);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.k3n);
        this.f188521d = walletFormView;
        qp5.p.h(this, walletFormView);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485303h83);
        this.f188522e = walletFormView2;
        if (walletFormView2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView2.setLogicDelegate(new qp5.n(1, walletFormView2));
        }
        setEditFocusListener(this.f188522e, 1, false);
        java.lang.String string = getInput().getString("key_pre_name");
        this.f188523f = getInput().getString("key_pre_indentity");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            this.f188521d.getPrefilledTv().setText(string);
            this.f188521d.setHint(getString(com.tencent.mm.R.string.kjm));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f188523f)) {
            this.f188522e.setMaxInputLength(4);
            this.f188522e.getPrefilledTv().setText(this.f188523f);
            this.f188522e.setHint(getString(com.tencent.mm.R.string.kid));
        }
        findViewById(com.tencent.mm.R.id.kao).setOnClickListener(new e05.c(this));
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
