package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(1)
/* loaded from: classes9.dex */
public class WalletPwdConfirmUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f180075d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f180076e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f180077f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f180078g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f180079h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f180080i = false;

    /* renamed from: m, reason: collision with root package name */
    public int f180081m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f180082n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f180083o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f180084p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f180085q;

    public WalletPwdConfirmUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f180082n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.1
            {
                this.__eventId = 323604482;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
                com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI = com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.this;
                walletPwdConfirmUI.f180082n.dead();
                int i17 = walletRealNameResultNotifyEvent.f54973g.f6120a;
                if (i17 != -1 && i17 != 0) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("WalletPwdConfirmUI", "WalletPwdConfirmUI finish");
                walletPwdConfirmUI.finish();
                return false;
            }
        };
        this.f180083o = false;
        this.f180084p = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.wallet_core.ui.i7(this), false);
        this.f180085q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPwdConfirmDoSecondaryProgressCallbackEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.7
            {
                this.__eventId = -1940712853;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletPwdConfirmDoSecondaryProgressCallbackEvent walletPwdConfirmDoSecondaryProgressCallbackEvent) {
                if (walletPwdConfirmDoSecondaryProgressCallbackEvent instanceof com.tencent.mm.autogen.events.WalletPwdConfirmDoSecondaryProgressCallbackEvent) {
                    com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI = com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.this;
                    walletPwdConfirmUI.f180083o = false;
                    walletPwdConfirmUI.U6();
                }
                return false;
            }
        };
    }

    public final void U6() {
        android.os.Bundle input = getInput();
        input.putBoolean("intent_bind_end", true);
        com.tencent.mm.wallet_core.a.d(this, input);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean getCancelable() {
        return false;
    }

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
        this.f180078g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pes);
        this.f180079h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pen);
        com.tencent.mm.wallet_core.ui.r1.d(this.f180078g);
        if (getProcess() != null) {
            "ModifyPwdProcess".equals(getProcess().e());
        }
        this.f180079h.setText(com.tencent.mm.R.string.kzp);
        this.f180076e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hdj);
        if (com.tencent.mm.sdk.platformtools.t8.J0(getTips(0))) {
            this.f180076e.setText(com.tencent.mm.R.string.f490441v5);
        } else {
            this.f180076e.setText(com.tencent.mm.R.string.kzs);
        }
        this.f180076e.setVisibility(0);
        this.f180076e.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.f7(this));
        this.f180076e.setEnabled(false);
        this.f180076e.setClickable(false);
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = (com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) findViewById(com.tencent.mm.R.id.hdh);
        this.f180075d = editHintPasswdView;
        qp5.p.b(editHintPasswdView);
        this.f180075d.setEditTextMaxLength(6);
        if (this.f180080i) {
            this.f180075d.setEncrType(this.f180081m);
        }
        this.f180075d.setOnInputValidListener(new com.tencent.mm.plugin.wallet_core.ui.g7(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.aiq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hideKeyboardPushDownBtn();
        setEditFocusListener(this.f180075d, 0, false);
        showTenpayKB();
        setTenpayKBStateListener(new com.tencent.mm.plugin.wallet_core.ui.h7(this, (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.root_view)));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return !(getProcess() instanceof com.tencent.mm.plugin.wallet_core.id_verify.a);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitle("");
        this.f180077f = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
        android.os.Bundle input = getInput();
        if (input != null) {
            boolean z17 = input.getBoolean("isNeedSm2Encrypt", false);
            this.f180080i = z17;
            if (z17) {
                int i17 = input.getInt("Sm2EncryptType", 1);
                this.f180081m = i17;
                com.tencent.mars.xlog.Log.i("Micromsg.WalletPwdConfirmUI", "pwd encrypt type need smc, type:%d", java.lang.Integer.valueOf(i17));
            }
        }
        initView();
        com.tencent.mm.plugin.wallet_core.utils.b1.d(this, getInput(), 6);
        setBackBtn(new com.tencent.mm.plugin.wallet_core.ui.e7(this));
        if (com.tencent.mm.wallet_core.ui.r1.P()) {
            getWindow().addFlags(8192);
        }
        this.f180082n.alive();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f180082n.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f180085q.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onProgressFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f180075d.requestFocus();
        super.onResume();
        this.f180085q.alive();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        getInput().putString("key_pwd1", this.f180075d.getText());
        if (m1Var instanceof ss4.e0) {
            if (!this.f180083o) {
                U6();
            }
        } else if (com.tencent.mm.wallet_core.a.g(this) == null || !com.tencent.mm.wallet_core.a.g(this).t(this, null)) {
            com.tencent.mm.wallet_core.a.d(this, getInput());
        } else {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f180077f;
            doSceneForceProgress(new ss4.e0(payInfo != null ? payInfo.f192114m : "", 22));
            com.tencent.mm.autogen.events.WalletPwdConfirmDoSecondaryProgressEvent walletPwdConfirmDoSecondaryProgressEvent = new com.tencent.mm.autogen.events.WalletPwdConfirmDoSecondaryProgressEvent();
            if (com.tencent.mm.sdk.event.d.f192370d.c(com.tencent.mm.autogen.events.WalletPwdConfirmDoSecondaryProgressEvent.class)) {
                this.f180083o = true;
                walletPwdConfirmDoSecondaryProgressEvent.e();
            }
            this.f180084p.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet_core.utils.u.class);
    }
}
