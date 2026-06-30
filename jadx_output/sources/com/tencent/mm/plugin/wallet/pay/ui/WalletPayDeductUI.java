package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class WalletPayDeductUI extends com.tencent.mm.ui.base.preference.MMPreference implements android.view.View.OnClickListener, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f178694d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f178695e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f178696f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f178697g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f178698h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f178699i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f178700m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f178701n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f178703p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f178704q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f178705r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f178706s;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f178709v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f178710w;

    /* renamed from: o, reason: collision with root package name */
    public android.app.Dialog f178702o = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f178707t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f178708u = 0;

    public void V6() {
        java.util.ArrayList arrayList = this.f178697g;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int size = this.f178697g.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178694d).m(((com.tencent.mm.ui.base.preference.Preference) this.f178697g.get(i17)).f197780q, false);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f178694d).notifyDataSetChanged();
    }

    public void W6(boolean z17) {
        if (z17) {
            android.view.View findViewById = findViewById(android.R.id.list);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f178695e.S.f179728i == 1) {
                this.f178706s.setVisibility(0);
            } else {
                this.f178706s.setVisibility(8);
            }
            V6();
            if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                this.f178699i.setVisibility(8);
                this.f178698h.setText(com.tencent.mm.R.string.kkr);
            } else {
                this.f178699i.setVisibility(0);
                this.f178699i.setText(com.tencent.mm.R.string.kkq);
                this.f178698h.setText(com.tencent.mm.R.string.kko);
            }
        } else {
            java.util.ArrayList arrayList2 = this.f178697g;
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = this.f178697g.size();
                for (int i17 = 0; i17 < size; i17++) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f178694d).m(((com.tencent.mm.ui.base.preference.Preference) this.f178697g.get(i17)).f197780q, true);
                }
            }
            android.view.View findViewById2 = findViewById(android.R.id.list);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f178706s.setVisibility(8);
            this.f178699i.setVisibility(8);
            this.f178698h.setText(com.tencent.mm.R.string.kkp);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayDeductUI", "isCheck=" + this.f178696f.f211363x);
    }

    public final void X6() {
        at4.x1 Ai = vr4.f1.wi().Ai();
        if (this.f178705r == null) {
            this.f178705r = Ai.l(null, null, true, true, true);
        }
        if (this.f178705r == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayDeductUI", "no bank card!");
            finish();
            return;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(this.f178705r.field_desc);
        com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(getContext());
        b4Var.f180146d = new com.tencent.mm.plugin.wallet.pay.ui.a0(this, at4.l1.a(false));
        spannableString.setSpan(b4Var, 0, spannableString.length(), 18);
        this.f178700m.setText(spannableString);
        this.f178700m.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d7r;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f178699i = (android.widget.TextView) getContentView().findViewById(com.tencent.mm.R.id.ait);
        this.f178698h = (android.widget.Button) getContentView().findViewById(com.tencent.mm.R.id.kao);
        this.f178706s = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.krh);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.crj)).setText(this.f178695e.S.f179723d);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.obc)).setText(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f178695e.M).get(0)).f179707h);
        com.tencent.mm.wallet_core.ui.WalletTextView walletTextView = (com.tencent.mm.wallet_core.ui.WalletTextView) findViewById(com.tencent.mm.R.id.f484348dz2);
        walletTextView.setTypeface(0);
        walletTextView.setText(com.tencent.mm.wallet_core.ui.r1.l(this.f178695e.f179681m));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f484346dz0)).setText(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f178695e.M).get(0)).f179709m + "");
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gc7);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cri);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f178695e.S.f179732p)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.f178695e.S.f179732p);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f178695e.S.f179733q)) {
                textView2.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(this.f178695e.S.f179733q, true));
            }
        }
        this.f178700m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.crl);
        this.f178701n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483338ad5);
        com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo deductInfo = this.f178695e.S;
        boolean z17 = deductInfo.f179725f == 1;
        this.f178707t = z17;
        this.f178708u = deductInfo.f179729m;
        this.f178709v = deductInfo.f179730n;
        this.f178710w = deductInfo.f179731o;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayDeductUI", "open: %s, show_type: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f178708u));
        if (this.f178708u == 0) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.btf);
            this.f178696f = mMSwitchBtn;
            mMSwitchBtn.setCheck(this.f178707t);
            this.f178696f.setSwitchListener(new com.tencent.mm.plugin.wallet.pay.ui.y(this));
            W6(this.f178707t);
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f178709v)) {
                this.f178698h.setText(this.f178709v);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f178710w)) {
                this.f178699i.setText(this.f178710w);
                this.f178699i.setVisibility(0);
            }
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.crh);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V6();
        }
        int i17 = this.f178695e.S.f179728i;
        if (this.f178695e.S.f179728i == 1) {
            gm0.j1.i();
            this.f178704q = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_DEDUCT_CHANGE_WORDING_STRING, "");
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_DEDUCT_SELECT_WORDING_STRING, "");
            this.f178703p = str;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(this.f178703p)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayDeductUI", "need do pay manager");
                this.f178702o = com.tencent.mm.wallet_core.ui.b2.h(getContext(), false, null);
                gs4.p pVar = new gs4.p();
                gm0.j1.i();
                gm0.j1.n().f273288b.g(pVar);
            } else {
                this.f178701n.setText(this.f178704q);
                X6();
            }
        } else {
            this.f178706s.setVisibility(8);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f178695e.S.f179726g)) {
            textView.setVisibility(8);
        } else {
            java.lang.String string = getString(com.tencent.mm.R.string.kkm);
            java.lang.String string2 = getString(com.tencent.mm.R.string.kkn);
            java.lang.String string3 = getString(com.tencent.mm.R.string.kkl, string, string2);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i18 = com.tencent.mm.pluginsdk.ui.span.c0.i(this, string3);
            com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(getContext());
            android.text.SpannableString spannableString = new android.text.SpannableString(i18);
            spannableString.setSpan(b4Var, i18.length() - string2.length(), i18.length(), 33);
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
            textView.setText(spannableString);
            textView.setOnClickListener(this);
            textView.setVisibility(0);
        }
        this.f178698h.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        if (id6 == com.tencent.mm.R.id.kao) {
            android.content.Intent intent = new android.content.Intent();
            if (this.f178708u == 0) {
                intent.putExtra("auto_deduct_flag", this.f178696f.f211363x ? 1 : 0);
            } else {
                intent.putExtra("auto_deduct_flag", this.f178695e.S.f179725f);
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f178705r;
            if (bankcard != null) {
                intent.putExtra("deduct_bank_type", bankcard.field_bankcardType);
                intent.putExtra("deduct_bind_serial", this.f178705r.field_bindSerial);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayDeductUI", "deduct bankType: %s", this.f178705r.field_bankcardType);
            }
            setResult(-1, intent);
            finish();
        } else if (id6 == com.tencent.mm.R.id.gc7 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f178695e.S.f179726g)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", this.f178695e.S.f179726g);
            intent2.putExtra("showShare", false);
            com.tencent.mm.wallet_core.ui.r1.T(getContext(), intent2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f178694d = getPreferenceScreen();
        getSupportActionBar().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.tencent.mm.R.color.aaw)));
        android.view.View j17 = getSupportActionBar().j();
        if (j17 != null) {
            android.view.View findViewById = j17.findViewById(com.tencent.mm.R.id.d0v);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a9e));
            }
            android.view.View findViewById2 = j17.findViewById(android.R.id.text2);
            if (findViewById2 != null && (findViewById2 instanceof android.widget.TextView)) {
                ((android.widget.TextView) findViewById2).setTextColor(getResources().getColor(com.tencent.mm.R.color.aaw));
            }
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        if (fp.h.c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        } else {
            getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.BW_90));
        }
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPayDeductUI", "intent is null");
            finish();
            return;
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) intent.getParcelableExtra("orders");
        this.f178695e = orders;
        if (orders == null || orders.S == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPayDeductUI", "Orders data or deductInfo is null   : " + this.f178695e);
            finish();
        }
        java.util.List list = this.f178695e.S.f179727h;
        if (list != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.size() != 0) {
                if (this.f178697g == null) {
                    int size = arrayList.size();
                    this.f178697g = new java.util.ArrayList();
                    for (int i17 = 0; i17 < size; i17++) {
                        com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo deductShowInfo = (com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo) arrayList.get(i17);
                        if (deductShowInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(deductShowInfo.f179734d)) {
                            com.tencent.mm.plugin.wallet_core.ui.k0 k0Var = new com.tencent.mm.plugin.wallet_core.ui.k0(this);
                            k0Var.L(deductShowInfo.f179734d);
                            if (deductShowInfo.f179736f > 0) {
                                k0Var.N = getResources().getColor(com.tencent.mm.R.color.f479308vo);
                                java.lang.String str = deductShowInfo.f179735e;
                                com.tencent.mm.plugin.wallet.pay.ui.b0 b0Var = new com.tencent.mm.plugin.wallet.pay.ui.b0(this, deductShowInfo);
                                k0Var.M = str;
                                k0Var.P = true;
                                k0Var.S = b0Var;
                            } else {
                                k0Var.M = deductShowInfo.f179735e;
                                k0Var.P = false;
                            }
                            k0Var.C("deduct_info_" + i17);
                            this.f178697g.add(k0Var);
                            ((com.tencent.mm.ui.base.preference.h0) this.f178694d).d(k0Var, -1);
                            ((com.tencent.mm.ui.base.preference.h0) this.f178694d).m(k0Var.f197780q, true);
                        }
                    }
                }
                setResult(0);
                setBackBtn(new com.tencent.mm.plugin.wallet.pay.ui.x(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
                gm0.j1.i();
                gm0.j1.n().f273288b.a(385, this);
                initView();
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WalletPayDeductUI", "showinfos is null or length is 0");
        setResult(0);
        setBackBtn(new com.tencent.mm.plugin.wallet.pay.ui.x(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, this);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(385, this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayDeductUI", "errType: %d, errCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if ((m1Var instanceof gs4.p) && i17 == 0 && i18 == 0) {
            gm0.j1.i();
            this.f178704q = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_DEDUCT_CHANGE_WORDING_STRING, getString(com.tencent.mm.R.string.kvi));
            gm0.j1.i();
            this.f178703p = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_DEDUCT_SELECT_WORDING_STRING, getString(com.tencent.mm.R.string.kvk));
            this.f178701n.setText(this.f178704q);
            X6();
        }
        android.app.Dialog dialog = this.f178702o;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
