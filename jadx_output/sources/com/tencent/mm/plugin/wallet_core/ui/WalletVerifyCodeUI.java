package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class WalletVerifyCodeUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements qp5.i0 {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f180112f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f180113g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f180114h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f180115i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Authen f180116m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f180117n;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f180120q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f180121r;

    /* renamed from: d, reason: collision with root package name */
    public final int f180110d = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f180111e = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f180118o = false;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.u9 f180119p = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f180122s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f180123t = true;

    /* renamed from: u, reason: collision with root package name */
    public at4.t f180124u = new at4.t();

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.model.s0 f180125v = new com.tencent.mm.plugin.wallet_core.ui.t9(this);

    public void U6() {
        android.os.Bundle input = getInput();
        java.lang.String string = getInput().getString("key_pwd1");
        java.lang.String text = this.f180111e.getText();
        this.f180115i = text;
        at4.z0 z0Var = new at4.z0();
        z0Var.f14023b = string;
        z0Var.f14035n = this.f180114h;
        z0Var.f14024c = text;
        java.lang.String string2 = getInput().getString("kreq_token");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string2 == null) {
            string2 = "";
        }
        z0Var.f14025d = string2;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) input.getParcelable("key_bankcard");
        if (bankcard != null) {
            z0Var.f14026e = bankcard.field_bankcardType;
            z0Var.f14027f = bankcard.field_bindSerial;
            java.lang.String str = bankcard.field_arrive_type;
            z0Var.f14029h = str != null ? str : "";
        } else {
            java.lang.String string3 = getInput().getString("key_bank_type");
            z0Var.f14026e = string3;
            if (com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                z0Var.f14026e = getInput().getString("key_bind_card_type", "");
            }
        }
        java.lang.String string4 = input.getString("key_bind_card_user_token", null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
            z0Var.f14036o = 1;
            z0Var.f14037p = string4;
        }
        java.util.Objects.toString(z0Var.f14035n);
        input.putString("key_verify_code", this.f180115i);
        com.tencent.mm.wallet_core.a.g(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "do verify result : " + getNetController().d(this.f180115i, z0Var));
    }

    public java.lang.String V6() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard;
        java.lang.String string = getInput().getString("key_mobile");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        return (!com.tencent.mm.sdk.platformtools.t8.K0(string) || (bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_bankcard")) == null) ? string : bankcard.field_mobile;
    }

    public void W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "get verify code!");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f180114h;
        objArr[0] = java.lang.Integer.valueOf((payInfo == null || payInfo.f192109e == 0) ? 2 : 1);
        objArr[1] = java.lang.Integer.valueOf(this.f180118o ? 2 : 1);
        g0Var.d(10706, objArr);
        this.f180118o = true;
        this.f180112f.setClickable(false);
        this.f180112f.setEnabled(false);
        com.tencent.mm.plugin.wallet_core.ui.u9 u9Var = this.f180119p;
        if (u9Var != null) {
            u9Var.cancel();
            this.f180119p = null;
        }
        com.tencent.mm.plugin.wallet_core.ui.u9 u9Var2 = new com.tencent.mm.plugin.wallet_core.ui.u9(this, this.f180110d, 1000L);
        this.f180119p = u9Var2;
        u9Var2.start();
        if (getNetController().f(this.f180115i) || resend(false)) {
            return;
        }
        com.tencent.mm.plugin.wallet_core.model.Authen authen = (com.tencent.mm.plugin.wallet_core.model.Authen) getInput().getParcelable("key_authen");
        this.f180116m = authen;
        if (authen == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletVertifyCodeUI", "error authen is null");
        } else {
            com.tencent.mm.plugin.wallet_core.utils.b1.e();
        }
    }

    public final void X6() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_bankcard");
        java.lang.String V6 = V6();
        if (com.tencent.mm.sdk.platformtools.t8.K0(V6) && bankcard != null) {
            V6 = bankcard.field_mobile;
            getInput().putString("key_mobile", V6);
        }
        this.f180121r.setText(getString(com.tencent.mm.R.string.kxb, V6));
        java.lang.CharSequence tips = getTips(0);
        if (com.tencent.mm.sdk.platformtools.t8.J0(tips)) {
            this.f180120q.setText(java.lang.String.format(getString(com.tencent.mm.R.string.l0m), V6));
        } else {
            this.f180120q.setText(tips);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "do finish: %s", new com.tencent.mm.sdk.platformtools.z3());
        super.finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean getCancelable() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8l;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_bankcard");
        this.f180120q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aiq);
        this.f180121r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.air);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.aid);
        this.f180111e = walletFormView;
        walletFormView.setOnInputValidChangeListener(this);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.gr6);
        this.f180112f = button;
        button.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.k9(this, bankcard));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.aia);
        this.f180113g = button2;
        button2.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.l9(this));
        X6();
        this.f180112f.setClickable(false);
        this.f180112f.setEnabled(false);
        com.tencent.mm.plugin.wallet_core.ui.u9 u9Var = this.f180119p;
        if (u9Var != null) {
            u9Var.cancel();
            this.f180119p = null;
        }
        com.tencent.mm.plugin.wallet_core.ui.u9 u9Var2 = new com.tencent.mm.plugin.wallet_core.ui.u9(this, this.f180110d, 1000L);
        this.f180119p = u9Var2;
        u9Var2.start();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aip);
        boolean z17 = getInput().getBoolean("key_is_changing_balance_phone_num");
        boolean z18 = getInput().getBoolean("key_need_show_switch_phone", false);
        if (!z17 || z18) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
        int i17 = payInfo != null ? payInfo.f192109e : 0;
        if (z18) {
            textView.setText(com.tencent.mm.R.string.l0s);
            textView.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.m9(this, bankcard));
        } else {
            if (g17 != null) {
                if ((g17.f213801c.getInt("key_pay_flag", 0) == 3) && i17 != 11 && i17 != 21) {
                    if (bankcard.v0() || bankcard.D0()) {
                        java.lang.String string = getInput().getString("key_verify_tail_wording", getString(com.tencent.mm.R.string.l0s));
                        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                            string = getString(com.tencent.mm.R.string.l0s);
                        }
                        textView.setText(string);
                        textView.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.p9(this, bankcard));
                    } else {
                        textView.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.o9(this, bankcard));
                    }
                }
            }
            textView.setText(c01.z1.I() ? getString(com.tencent.mm.R.string.l0p) : getString(com.tencent.mm.R.string.l0o));
            textView.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.q9(this));
        }
        this.f180111e.requestFocus();
        java.lang.String string2 = getInput().getString("key_QADNA_URL");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            addIconOptionMenu(0, com.tencent.mm.R.drawable.chy, new com.tencent.mm.plugin.wallet_core.ui.r9(this, string2));
        }
        setBackBtn(new com.tencent.mm.plugin.wallet_core.ui.s9(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        boolean booleanExtra = getIntent().getBooleanExtra("key_need_confirm_finish", false);
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f180114h;
        if ((payInfo == null || !payInfo.f192112h) && !booleanExtra) {
            return super.needConfirmFinish();
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "on create");
        setMMTitle(com.tencent.mm.R.string.f493626l11);
        this.f180114h = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
        this.f180117n = getInput().getString("key_bank_phone");
        this.f180124u = new at4.t(getInput());
        boolean z17 = false;
        this.f180118o = false;
        initView();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f180114h;
        objArr[0] = java.lang.Integer.valueOf((payInfo == null || payInfo.f192109e == 0) ? 2 : 1);
        objArr[1] = java.lang.Integer.valueOf(this.f180118o ? 2 : 1);
        g0Var.d(10706, objArr);
        com.tencent.mm.plugin.wallet_core.utils.b1.e();
        com.tencent.mm.plugin.wallet_core.utils.b1.d(this, getInput(), 4);
        at4.t tVar = this.f180124u;
        if (tVar.f13963b != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(tVar.f13964c)) {
            z17 = true;
        }
        if (z17) {
            g0Var.d(13731, 5);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180124u.f13966e.f213948a)) {
                setMMTitle(this.f180124u.f13966e.f213948a);
            }
            android.widget.TextView textView = this.f180120q;
            if (textView != null) {
                textView.setText(getString(com.tencent.mm.R.string.l0t));
            }
            if (this.f180113g != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f180124u.f13966e.f213949b)) {
                this.f180113g.setText(this.f180124u.f13966e.f213949b);
            }
        }
        this.mNetSceneMgr.c(fe1.o.CTRL_INDEX);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.mNetSceneMgr.i(fe1.o.CTRL_INDEX);
        super.onDestroy();
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
        if (this.f180111e.c(null)) {
            this.f180113g.setEnabled(true);
            this.f180113g.setClickable(true);
        } else {
            this.f180113g.setEnabled(false);
            this.f180113g.setClickable(false);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        X6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onPreSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "onPreSceneEnd %s %s", java.lang.Integer.valueOf(i18), m1Var);
        if ((m1Var instanceof com.tencent.mm.wallet_core.model.t0) && i18 == 0) {
            this.f180122s = true;
            db5.t7.makeText(this, com.tencent.mm.R.string.f493584ku2, 0).show();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "tag it isCertInstalled ok");
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onSceneEnd(int r9, int r10, java.lang.String r11, com.tencent.mm.modelbase.m1 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.tencent.mm.wallet_core.model.t0
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1c
            if (r10 == 0) goto L1b
            com.tencent.mm.wallet_core.model.t0 r12 = (com.tencent.mm.wallet_core.model.t0) r12
            boolean r9 = r12.f213990f
            if (r9 == 0) goto L1b
            androidx.appcompat.app.AppCompatActivity r9 = r8.getContext()
            com.tencent.mm.plugin.wallet_core.ui.i9 r10 = new com.tencent.mm.plugin.wallet_core.ui.i9
            r10.<init>(r8)
            db5.e1.G(r9, r11, r1, r2, r10)
        L1b:
            return r3
        L1c:
            if (r9 != 0) goto Ld4
            if (r10 != 0) goto Ld4
            com.tencent.mm.wallet_core.h r9 = com.tencent.mm.wallet_core.a.g(r8)
            boolean r10 = r12 instanceof ss4.e0
            java.lang.String r11 = "MicroMsg.WalletVertifyCodeUI"
            if (r10 == 0) goto L51
            android.os.Bundle r10 = r8.getInput()
            java.lang.String r0 = "intent_bind_end"
            r10.putBoolean(r0, r3)
            if (r9 == 0) goto L4b
            java.lang.String r10 = "realname_verify_process"
            java.lang.String r0 = r9.e()
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L4b
            r10 = 2131779145(0x7f105e49, float:1.9189839E38)
            java.lang.String r10 = r8.getString(r10)
            db5.e1.T(r8, r10)
        L4b:
            java.lang.String r10 = "query bound bank card resp!"
            com.tencent.mars.xlog.Log.i(r11, r10)
            goto L6d
        L51:
            boolean r10 = r9.t(r8, r1)
            if (r10 == 0) goto L6d
            ss4.e0 r10 = new ss4.e0
            java.lang.String r0 = r8.getPayReqKey()
            r1 = 13
            r10.<init>(r0, r1)
            r8.doSceneForceProgress(r10)
            java.lang.String r10 = "to query bound bank card!"
            com.tencent.mars.xlog.Log.i(r11, r10)
            r10 = r2
            goto L6e
        L6d:
            r10 = r3
        L6e:
            boolean r0 = r12 instanceof ss4.w
            if (r0 == 0) goto L91
            com.tencent.mm.plugin.report.service.g0 r0 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = com.tencent.mm.plugin.wallet_core.utils.b1.f180853a
            long r4 = r4 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            int r4 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r4}
            r4 = 10707(0x29d3, float:1.5004E-41)
            r0.d(r4, r1)
        L91:
            com.tencent.mm.plugin.wallet_core.model.Authen r0 = r8.f180116m
            if (r0 == 0) goto Lae
            boolean r0 = r12 instanceof com.tencent.mm.wallet_core.tenpay.model.o
            if (r0 == 0) goto Lae
            com.tencent.mm.wallet_core.tenpay.model.o r12 = (com.tencent.mm.wallet_core.tenpay.model.o) r12
            java.lang.String r12 = r12.getToken()
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r12)
            if (r0 != 0) goto Lae
            android.os.Bundle r0 = r8.getInput()
            java.lang.String r1 = "kreq_token"
            r0.putString(r1, r12)
        Lae:
            if (r10 == 0) goto Ld4
            java.lang.String r10 = "forwardProcess1 and finish!"
            com.tencent.mars.xlog.Log.i(r11, r10)
            android.os.Bundle r10 = r8.getInput()
            com.tencent.mm.wallet_core.a.d(r8, r10)
            if (r9 == 0) goto Lcb
            java.lang.String r9 = r9.e()
            java.lang.String r10 = "PayProcess"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lcb
            goto Ld3
        Lcb:
            java.lang.String r9 = "finish self"
            com.tencent.mars.xlog.Log.i(r11, r9)
            r8.finish()
        Ld3:
            return r3
        Ld4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):boolean");
    }
}
