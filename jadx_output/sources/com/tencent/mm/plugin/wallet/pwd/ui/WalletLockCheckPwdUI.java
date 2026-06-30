package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class WalletLockCheckPwdUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f178904n = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ScrollView f178905d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f178906e;

    /* renamed from: f, reason: collision with root package name */
    public ss4.x f178907f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f178908g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f178909h;

    /* renamed from: i, reason: collision with root package name */
    public int f178910i = -1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f178911m;

    public final void U6(int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", i18);
        setResult(i17, intent);
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void cleanUiData(int i17) {
        super.cleanUiData(i17);
        this.f178906e.a();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5z;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        setResult(i18, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockCheckPwdUI", "onBackPressed");
        U6(-1, 4);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setMMTitle("");
        hideActionbarLine();
        this.f178910i = getIntent().getIntExtra("key_wallet_lock_type", -1);
        this.f178911m = getIntent().getStringExtra("action");
        this.f178906e = (com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) findViewById(com.tencent.mm.R.id.hdh);
        this.f178908g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pes);
        this.f178909h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pen);
        this.f178905d = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.pgr);
        com.tencent.mm.wallet_core.ui.r1.d(this.f178908g);
        this.f178908g.setText(com.tencent.mm.R.string.l1s);
        java.lang.String stringExtra = getIntent().getStringExtra("key_wallet_lock_input_new_fp_tips");
        int i17 = this.f178910i;
        if (i17 == 2) {
            if (this.f178911m.equals("action.touchlock_verify_by_paypwd")) {
                this.f178908g.setText(com.tencent.mm.R.string.l1s);
            } else {
                this.f178908g.setText(com.tencent.mm.R.string.f493631l21);
            }
            if (this.f178911m.equals("action.touchlock_need_verify_paypwd") && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                this.f178909h.setText(stringExtra);
            }
        } else if (i17 == 1) {
            this.f178908g.setText(com.tencent.mm.R.string.l1s);
        }
        this.f178906e.setOnInputValidListener(new com.tencent.mm.plugin.wallet.pwd.ui.d1(this));
        setTenpayKBStateListener(new com.tencent.mm.plugin.wallet.pwd.ui.f1(this));
        hideKeyboardPushDownBtn();
        setEditFocusListener(this.f178906e, 0, false);
        showTenpayKB();
        setBackBtn(new com.tencent.mm.plugin.wallet.pwd.ui.c1(this));
        int i18 = android.os.Build.VERSION.SDK_INT;
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        window.getDecorView().setSystemUiVisibility(8192);
        getContentView().setFitsSystemWindows(true);
        if (com.tencent.mm.wallet_core.ui.r1.P()) {
            getWindow().addFlags(8192);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) || i18 < 31) {
                return;
            }
            try {
                if (b3.l.checkSelfPermission(getContext(), "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                    getWindow().setHideOverlayWindows(true);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockCheckPwdUI", "no permission");
                    jx3.f.INSTANCE.kvStat(28867, "100");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLockCheckPwdUI", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onProgressFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f178906e;
        if (editHintPasswdView != null) {
            editHintPasswdView.a();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockCheckPwdUI", "WalletLockCheckPwdUI errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof ss4.x) {
            ss4.x xVar = (ss4.x) m1Var;
            if (i17 == 0 && i18 == 0) {
                if ("next_action.switch_on_pattern".equals(getIntent().getStringExtra("next_action"))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockCheckPwdUI", "start to open wallet lock after check pwd");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("action", "action.switch_on_pattern");
                    intent.putExtra("next_action", "next_action.switch_on_pattern");
                    intent.putExtra("token", xVar.f412141e);
                    intent.putExtra("type", xVar.f412142f);
                    intent.putExtra("key_wallet_lock_type", this.f178910i);
                    intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
                    if (this.f178910i == 2) {
                        intent.putExtra("key_pay_passwd", this.f178906e.getText());
                    }
                    com.tencent.mm.autogen.events.StartWalletLockUIEvent startWalletLockUIEvent = new com.tencent.mm.autogen.events.StartWalletLockUIEvent();
                    am.rx rxVar = startWalletLockUIEvent.f54861g;
                    rxVar.f7851b = intent;
                    rxVar.f7850a = this;
                    rxVar.f7852c = 1;
                    startWalletLockUIEvent.e();
                } else {
                    java.lang.String str2 = xVar.f412141e;
                    java.lang.String str3 = xVar.f412142f;
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_err_code", 0);
                    intent2.putExtra("key_token", str2);
                    intent2.putExtra("key_type", str3);
                    setResult(-1, intent2);
                    finish();
                }
                return true;
            }
            if (i17 == 1000 && i18 == 3) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("key_err_code", -1);
                intent3.putExtra("key_token", (java.lang.String) null);
                intent3.putExtra("key_type", (java.lang.String) null);
                setResult(-1, intent3);
                finish();
                return true;
            }
        } else {
            if (m1Var instanceof gs4.v) {
                if (i17 == 0 && i18 == 0) {
                    U6(-1, 0);
                } else {
                    U6(-1, -1);
                }
                return true;
            }
            if (m1Var instanceof gs4.e) {
                if (i17 == 0 && i18 == 0) {
                    U6(-1, 0);
                } else {
                    U6(-1, -1);
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet_core.utils.w.class);
    }
}
