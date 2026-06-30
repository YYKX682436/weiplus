package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(1)
/* loaded from: classes9.dex */
public class WalletSetPasswordUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f180096d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f180097e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f180098f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ScrollView f180099g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f180100h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.1
        {
            this.__eventId = 323604482;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
            com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI walletSetPasswordUI = com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.this;
            walletSetPasswordUI.f180100h.dead();
            int i17 = walletRealNameResultNotifyEvent.f54973g.f6120a;
            if (i17 != -1 && i17 != 0) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("WalletSetPasswordUI", "WalletSetPasswordUI finish");
            walletSetPasswordUI.finish();
            return false;
        }
    };

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8c;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f180099g = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.root_view);
        this.f180097e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pes);
        this.f180098f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pen);
        com.tencent.mm.wallet_core.ui.r1.d(this.f180097e);
        if (getInput().getBoolean("key_is_forgot_process", false) && !com.tencent.mm.sdk.platformtools.t8.K0(getInput().getString("key_identity")) && getInput().getInt("key_id_type", -1) != -1 && !com.tencent.mm.sdk.platformtools.t8.K0(getInput().getString("key_true_name"))) {
            this.f180098f.setVisibility(4);
        }
        if ((getProcess() == null || !"ModifyPwdProcess".equals(getProcess().e())) && getProcess() != null && "ResetPwdProcessByToken".equals(getProcess().e())) {
            java.lang.String string = getInput().getString("key_pwd_title");
            java.lang.String string2 = getInput().getString("key_pwd_desc");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                this.f180097e.setText(string);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                this.f180098f.setText(string2);
                this.f180098f.setVisibility(0);
            }
        }
        if (getInput().getInt("key_err_code", 0) == -1002) {
            this.f180098f.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478532ac));
            this.f180098f.setText(c01.z1.I() ? getString(com.tencent.mm.R.string.kzr) : getString(com.tencent.mm.R.string.kzq));
            getInput().putInt("key_err_code", 0);
        }
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = (com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) findViewById(com.tencent.mm.R.id.hdh);
        this.f180096d = editHintPasswdView;
        qp5.p.b(editHintPasswdView);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.aiq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletSetPasswordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/WalletSetPasswordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f180096d.setOnInputValidListener(new com.tencent.mm.plugin.wallet_core.ui.w8(this));
        setTenpayKBStateListener(new com.tencent.mm.plugin.wallet_core.ui.y8(this));
        hideKeyboardPushDownBtn();
        setEditFocusListener(this.f180096d, 0, false);
        showTenpayKB();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return !(getProcess() instanceof com.tencent.mm.plugin.wallet_core.id_verify.a);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitle("");
        initView();
        com.tencent.mm.plugin.wallet_core.utils.b1.d(this, getInput(), 5);
        setBackBtn(new com.tencent.mm.plugin.wallet_core.ui.v8(this));
        if (com.tencent.mm.wallet_core.ui.r1.P()) {
            getWindow().addFlags(8192);
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) && android.os.Build.VERSION.SDK_INT >= 31) {
                try {
                    if (b3.l.checkSelfPermission(getContext(), "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                        getWindow().setHideOverlayWindows(true);
                    } else {
                        com.tencent.mars.xlog.Log.i("WalletSetPasswordUI", "no permission");
                        jx3.f.INSTANCE.kvStat(28867, "100");
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("WalletSetPasswordUI", e17, "", new java.lang.Object[0]);
                    return;
                }
            }
        }
        this.f180100h.alive();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f180100h.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f180096d.requestFocus();
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet_core.utils.u.class);
    }
}
