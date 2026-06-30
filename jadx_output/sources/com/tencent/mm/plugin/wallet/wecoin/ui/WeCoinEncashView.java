package com.tencent.mm.plugin.wallet.wecoin.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class WeCoinEncashView extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.ref.WeakReference f179148v = new java.lang.ref.WeakReference(null);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f179149d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f179150e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179151f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f179152g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ScrollView f179153h;

    /* renamed from: i, reason: collision with root package name */
    public ms4.n f179154i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f179155m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f179156n;

    /* renamed from: p, reason: collision with root package name */
    public int f179158p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f179159q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f179160r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f179161s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f179162t;

    /* renamed from: o, reason: collision with root package name */
    public final int f179157o = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1);

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f179163u = new ns4.s0(this);

    public final void V6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "check enable: %s", java.lang.Boolean.valueOf(z17));
        if (z17 && this.f179156n) {
            this.mWcKeyboard.e(true);
        } else {
            this.mWcKeyboard.e(false);
        }
    }

    public final void W6(r45.qb7 qb7Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "startCheckPwdUI, params " + qb7Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 93);
        if (qb7Var == null) {
            ms4.n nVar = this.f179154i;
            if (nVar != null) {
                nVar.N6("", null, 0, this);
                return;
            } else {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", qb7Var.f383812d);
        intent.putExtra("timeStamp", qb7Var.f383815g);
        intent.putExtra("nonceStr", qb7Var.f383817i);
        intent.putExtra("packageExt", qb7Var.f383813e);
        intent.putExtra("signtype", qb7Var.f383814f);
        intent.putExtra("paySignature", qb7Var.f383816h);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        j45.l.o(this, "wallet_core", ".ui.WalletCheckPwdUI", intent, 3001, false);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487949cc;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.TextView tipsTv;
        setBackBtn(new ns4.a1(this));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a07));
        hideActionbarLine();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hdp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f179151f = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dg_);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f179149d = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.j8i);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f179150e = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ohf);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f179152g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ixe);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f179153h = (android.widget.ScrollView) findViewById5;
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = this.f179151f;
        if (walletFormView == null) {
            kotlin.jvm.internal.o.o("mInputMoneyText");
            throw null;
        }
        walletFormView.getTitleTv().setText("¥");
        android.widget.TextView textView = this.f179152g;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
            throw null;
        }
        textView.setText("");
        android.widget.TextView textView2 = this.f179152g;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
            throw null;
        }
        textView2.setClickable(true);
        android.widget.TextView textView3 = this.f179152g;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
            throw null;
        }
        textView3.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.iu9)).getPaint(), 0.8f);
        setMMTitle(com.tencent.mm.R.string.f493490kf5);
        this.f179158p = 1;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.cpq);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById6;
        this.f179159q = viewGroup;
        viewGroup.setOnClickListener(new ns4.b1(this));
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.cpr);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f179160r = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.cps);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f179161s = (android.widget.TextView) findViewById8;
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.mm.R.id.pok);
        this.mWcKeyboard = wcPayKeyboard;
        android.view.ViewGroup.LayoutParams layoutParams = wcPayKeyboard.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(12);
        this.mWcKeyboard.setLayoutParams(layoutParams2);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = this.f179151f;
        if (walletFormView2 == null) {
            kotlin.jvm.internal.o.o("mInputMoneyText");
            throw null;
        }
        setWPKeyboard(walletFormView2.getContentEt(), false, false);
        ms4.n nVar = this.f179154i;
        if (nVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        java.lang.String str = nVar.f331071h;
        java.lang.String str2 = (str == null || str.length() == 0) ^ true ? str : null;
        if (str2 != null && (tipsTv = this.mWcKeyboard.getTipsTv()) != null) {
            tipsTv.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).qj(this, str2, 14, false, 1, null));
            tipsTv.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            tipsTv.setTypeface(null, 0);
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2 = this.mWcKeyboard;
            wcPayKeyboard2.f213816t.setVisibility(0);
            wcPayKeyboard2.s();
        }
        this.mWcKeyboard.setActionText(getString(com.tencent.mm.R.string.f493490kf5));
        if (fp.h.b(27)) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView3 = this.f179151f;
            if (walletFormView3 == null) {
                kotlin.jvm.internal.o.o("mInputMoneyText");
                throw null;
            }
            walletFormView3.p();
        }
        android.view.ViewGroup viewGroup2 = this.f179150e;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("mainContent");
            throw null;
        }
        viewGroup2.setOnTouchListener(new ns4.z0(this));
        V6(false);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView4 = this.f179151f;
        if (walletFormView4 == null) {
            kotlin.jvm.internal.o.o("mInputMoneyText");
            throw null;
        }
        walletFormView4.b(new ns4.d1(this));
        setTenpayKBStateListener(new ns4.e1(this));
        ns4.g1 g1Var = new ns4.g1(this);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView5 = this.f179151f;
        if (walletFormView5 == null) {
            kotlin.jvm.internal.o.o("mInputMoneyText");
            throw null;
        }
        walletFormView5.getContentEt().setOnEditorActionListener(new ns4.f1(g1Var));
        long longExtra = getIntent().getLongExtra("wecoin_income_balance", 0L);
        if (longExtra > 0) {
            java.lang.String string = getString(com.tencent.mm.R.string.l9m, java.lang.Double.valueOf(os4.h.c(longExtra + "", "100", 2)));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int length = string.length();
            android.text.SpannableString spannableString = new android.text.SpannableString(string + ' ' + getString(com.tencent.mm.R.string.l9n));
            spannableString.setSpan(new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new ns4.l1(this, longExtra), true), length, spannableString.length(), 18);
            this.f179155m = spannableString;
            android.widget.TextView textView4 = this.f179152g;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView4.setText(spannableString);
        }
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.f487682pf5);
        if (findViewById9 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById9, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById9.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById9, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.bek);
        if (findViewById10 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById10, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById10.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById10, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isHandleAutoShowNormalStWcKb() {
        this.mWcKeyboard.o();
        return this.mWcKeyboard.o();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "onActivityResult() requestCode:%s, resultCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        super.onActivityResult(i17, i18, intent);
        if (i17 == 3001) {
            if (i18 != -1) {
                if (i18 == 0) {
                    ms4.n nVar = this.f179154i;
                    if (nVar == null) {
                        kotlin.jvm.internal.o.o("mViewModel");
                        throw null;
                    }
                    nVar.P6(5);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 94);
                    return;
                }
                return;
            }
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("token") : null;
            this.f179162t = stringExtra;
            if (stringExtra == null || stringExtra.length() == 0) {
                ms4.n nVar2 = this.f179154i;
                if (nVar2 == null) {
                    kotlin.jvm.internal.o.o("mViewModel");
                    throw null;
                }
                nVar2.P6(5);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 94);
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 95);
            java.lang.String str = this.f179162t;
            if (str != null) {
                ms4.n nVar3 = this.f179154i;
                if (nVar3 != null) {
                    nVar3.N6(str, null, 0, this);
                } else {
                    kotlin.jvm.internal.o.o("mViewModel");
                    throw null;
                }
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.c1 a17 = androidx.lifecycle.k1.a(this, new ms4.o(getIntent().getByteArrayExtra("WECOIN_TAX_CUT_ENTRANCE_INFO"), getIntent().getIntExtra("WECOIN_BUSINESS_ID", 1))).a(ms4.n.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ms4.n nVar = (ms4.n) a17;
        nVar.f331072i = this;
        this.f179154i = nVar;
        nVar.f331068e = getIntent().getIntExtra("WECOIN_ENCASH_SCENE", 0);
        ms4.n nVar2 = this.f179154i;
        if (nVar2 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        nVar2.f331069f = getIntent().getIntExtra("WECOIN_ENCASH_BIZ_TYPE", 0);
        ms4.n nVar3 = this.f179154i;
        if (nVar3 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        nVar3.f331070g = getIntent().getStringExtra("WECOIN_ENCASH_BIZ_ACCT_ID");
        ms4.n nVar4 = this.f179154i;
        if (nVar4 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        nVar4.f331071h = getIntent().getStringExtra("WECOIN_ENCASH_KEYBOARD_TIPS");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initModel encashScene:");
        ms4.n nVar5 = this.f179154i;
        if (nVar5 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        sb6.append(nVar5.f331068e);
        sb6.append(", biz_type:");
        ms4.n nVar6 = this.f179154i;
        if (nVar6 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        sb6.append(nVar6.f331069f);
        sb6.append(", biz_acct_id:");
        ms4.n nVar7 = this.f179154i;
        if (nVar7 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        sb6.append(nVar7.f331070g);
        sb6.append(", keyboardTips:");
        ms4.n nVar8 = this.f179154i;
        if (nVar8 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        sb6.append(nVar8.f331071h);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", sb6.toString());
        initView();
        ms4.n nVar9 = this.f179154i;
        if (nVar9 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        nVar9.f331081u.observe(this, new ns4.t0(this));
        ms4.n nVar10 = this.f179154i;
        if (nVar10 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        nVar10.f331073m.observe(this, new ns4.u0(this));
        ms4.n nVar11 = this.f179154i;
        if (nVar11 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        nVar11.f331074n.observe(this, new ns4.v0(this));
        ms4.n nVar12 = this.f179154i;
        if (nVar12 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        nVar12.f331075o.observe(this, new ns4.w0(this));
        ms4.n nVar13 = this.f179154i;
        if (nVar13 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        nVar13.f331076p.observe(this, new ns4.x0(this));
        ms4.n nVar14 = this.f179154i;
        if (nVar14 != null) {
            nVar14.f331080t = (com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData) getIntent().getParcelableExtra("wecoin_enter_encash_business_kv_data");
        } else {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.sdk.platformtools.u3.l(this.f179163u);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.widget.dialog.l
    public void onDialogDismiss(android.app.Dialog dialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "onDialogDismiss()");
        if (this.f179158p == 2 && isHandleAutoShowNormalStWcKb()) {
            com.tencent.mm.sdk.platformtools.u3.i(this.f179163u, 300L);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i17, event)) {
            return super.onKeyUp(i17, event);
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "onPause()");
        if (this.mWcKeyboard.p()) {
            return;
        }
        this.f179158p = 3;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "onResume()");
        if (this.f179158p == 3 && isHandleAutoShowNormalStWcKb()) {
            com.tencent.mm.sdk.platformtools.u3.i(this.f179163u, 300L);
        }
        this.f179158p = 2;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return true;
    }
}
