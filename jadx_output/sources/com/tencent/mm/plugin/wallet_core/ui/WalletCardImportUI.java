package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class WalletCardImportUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements qp5.i0, android.widget.TextView.OnEditorActionListener {
    public static final /* synthetic */ int L = 0;
    public android.widget.CheckBox E;
    public android.widget.CheckBox F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f179941d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f179942e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179943f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179944g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179945h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179946i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179947m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179948n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179949o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179950p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179951q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179952r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179953s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179954t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179955u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179956v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.MMScrollView f179957w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179958x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f179959y = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.ElementQuery f179960z = new com.tencent.mm.plugin.wallet_core.model.ElementQuery();
    public com.tencent.mm.plugin.wallet_core.model.Authen A = new com.tencent.mm.plugin.wallet_core.model.Authen();
    public com.tencent.mm.plugin.wallet_core.model.Orders B = null;
    public com.tencent.mm.pluginsdk.wallet.PayInfo C = null;
    public com.tencent.mm.plugin.wallet_core.model.Bankcard D = null;

    /* renamed from: J, reason: collision with root package name */
    public int f179940J = 1;
    public final android.widget.BaseAdapter K = new com.tencent.mm.plugin.wallet_core.ui.d3(this);

    public final boolean U6() {
        boolean z17 = this.E.isChecked();
        if (z17) {
            this.f179941d.setEnabled(true);
            this.f179941d.setClickable(true);
        } else {
            this.f179941d.setEnabled(false);
            this.f179941d.setClickable(false);
        }
        return z17;
    }

    public final void V6() {
        if (U6()) {
            com.tencent.mm.plugin.wallet_core.utils.b1.e();
            this.A = new com.tencent.mm.plugin.wallet_core.model.Authen();
            getInput().putBoolean("key_is_follow_bank_username", this.F.isChecked());
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.D;
            if (bankcard == null || com.tencent.mm.sdk.platformtools.t8.K0(bankcard.Y2)) {
                java.lang.String string = getInput().getString("key_card_id");
                if (this.f179958x.getVisibility() == 0) {
                    string = this.f179958x.getText();
                }
                this.A.f179557v = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
                com.tencent.mm.plugin.wallet_core.model.Authen authen = this.A;
                authen.f179551p = string;
                authen.f179545g = this.f179960z.f179659s;
                authen.f179549n = this.f179940J;
                authen.f179544f = getInput().getString("key_pwd1");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f179945h.getText())) {
                    this.A.f179552q = this.f179945h.getText();
                }
                this.A.f179550o = this.f179949o.getText();
                this.A.f179558w = this.f179950p.getText();
                this.A.f179559x = this.f179951q.getText();
                com.tencent.mm.plugin.wallet_core.model.Authen authen2 = this.A;
                authen2.f179560y = this.G;
                authen2.f179561z = this.H;
                authen2.A = this.I;
                authen2.B = this.f179953s.getText();
                this.A.C = this.f179954t.getText();
                this.A.D = this.f179955u.getText();
                this.A.E = this.f179956v.getText();
                getInput().putString("key_mobile", com.tencent.mm.wallet_core.ui.r1.e0(this.A.f179550o));
                getInput().putBoolean("key_is_oversea", this.f179960z.I == 2);
                this.A.f179548m = this.f179948n.getText();
                this.A.f179547i = this.f179946i.getText();
                this.A.f179553r = this.f179944g.getText();
                java.util.Objects.toString(this.A.f179557v);
                int i17 = this.f179960z.I;
            } else {
                com.tencent.mm.plugin.wallet_core.model.Authen authen3 = this.A;
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.D;
                authen3.F = bankcard2.Y2;
                authen3.f179546h = bankcard2.field_bindSerial;
                authen3.f179545g = bankcard2.field_bankcardType;
                authen3.f179549n = bankcard2.X2;
                authen3.f179544f = getInput().getString("key_pwd1");
                this.A.f179554s = getInput().getString("kreq_token");
            }
            com.tencent.mm.wallet_core.a.g(this);
            if (getNetController().d(this.A, this.B)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCardElmentUI", "process controller deal with!!!");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletCardElmentUI", "error process in the tenpay!!");
            }
        }
    }

    public final boolean W6(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            walletFormView.setVisibility(8);
            return false;
        }
        android.text.method.KeyListener keyListener = walletFormView.getKeyListener();
        walletFormView.setKeyListener(null);
        walletFormView.setEnabled(false);
        walletFormView.setClickable(false);
        walletFormView.setText(str);
        walletFormView.setKeyListener(keyListener);
        walletFormView.setVisibility(0);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.X6():void");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean getCancelable() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5t;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pbb);
        this.f179958x = walletFormView;
        qp5.p.a(walletFormView);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.jms);
        this.f179949o = walletFormView2;
        qp5.p.f(this, walletFormView2);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView3 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.k3n);
        this.f179946i = walletFormView3;
        qp5.p.h(this, walletFormView3);
        this.f179947m = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pby);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView4 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485303h83);
        this.f179948n = walletFormView4;
        qp5.p.e(walletFormView4);
        this.f179943f = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pbk);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView5 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.cpz);
        this.f179945h = walletFormView5;
        qp5.p.c(this, walletFormView5);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView6 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.cqm);
        this.f179944g = walletFormView6;
        qp5.p.d(this, walletFormView6);
        this.f179942e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pek);
        this.f179950p = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.g6v);
        this.f179951q = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ht8);
        this.f179952r = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.a4d);
        this.f179953s = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f482741mo);
        this.f179954t = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f486297ku3);
        this.f179955u = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.l0a);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView7 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.d_j);
        this.f179956v = walletFormView7;
        if (walletFormView7 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView7.setLogicDelegate(new qp5.f());
        }
        this.E = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.f482782nu);
        this.F = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.f482777np);
        this.f179941d = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView = (com.tencent.mm.wallet_core.ui.MMScrollView) findViewById(com.tencent.mm.R.id.f487680pf3);
        this.f179957w = mMScrollView;
        mMScrollView.a(mMScrollView, mMScrollView);
        this.f179957w.setOnSizeChangeListener(new com.tencent.mm.plugin.wallet_core.ui.u2(this));
        this.f179946i.setOnInputValidChangeListener(this);
        this.f179958x.setOnInputValidChangeListener(this);
        this.f179947m.setOnInputValidChangeListener(this);
        this.f179948n.setOnInputValidChangeListener(this);
        this.f179949o.setOnInputValidChangeListener(this);
        this.f179945h.setOnInputValidChangeListener(this);
        this.f179944g.setOnInputValidChangeListener(this);
        this.f179950p.setOnInputValidChangeListener(this);
        this.f179951q.setOnInputValidChangeListener(this);
        this.f179952r.setOnInputValidChangeListener(this);
        this.f179953s.setOnInputValidChangeListener(this);
        this.f179954t.setOnInputValidChangeListener(this);
        this.f179955u.setOnInputValidChangeListener(this);
        this.f179956v.setOnInputValidChangeListener(this);
        this.f179946i.setOnEditorActionListener(this);
        this.f179958x.setOnEditorActionListener(this);
        this.f179947m.setOnEditorActionListener(this);
        this.f179948n.setOnEditorActionListener(this);
        this.f179949o.setOnEditorActionListener(this);
        this.f179945h.setOnEditorActionListener(this);
        this.f179944g.setOnEditorActionListener(this);
        this.f179950p.setOnEditorActionListener(this);
        this.f179951q.setOnEditorActionListener(this);
        this.f179952r.setOnEditorActionListener(this);
        this.f179953s.setOnEditorActionListener(this);
        this.f179954t.setOnEditorActionListener(this);
        this.f179955u.setOnEditorActionListener(this);
        this.f179956v.setOnEditorActionListener(this);
        this.f179943f.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.v2(this));
        this.f179947m.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.w2(this));
        this.E.setChecked(true);
        this.E.setOnCheckedChangeListener(new com.tencent.mm.plugin.wallet_core.ui.x2(this));
        this.F.setChecked(true);
        findViewById(com.tencent.mm.R.id.f482775nn).setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.z2(this));
        this.f179952r.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.a3(this));
        this.f179941d.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.b3(this));
        X6();
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCardElmentUI", "onAcvityResult requestCode:" + i17);
        if (i18 != -1) {
            return;
        }
        if (i17 == 1) {
            this.f179960z = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) intent.getParcelableExtra("elemt_query");
            X6();
        } else if (i17 == 2) {
            java.lang.String stringExtra = intent.getStringExtra("CountryName");
            java.lang.String stringExtra2 = intent.getStringExtra("Country");
            this.G = stringExtra + "|" + stringExtra2;
            java.lang.String stringExtra3 = intent.getStringExtra("ProviceName");
            java.lang.String stringExtra4 = intent.getStringExtra("CityName");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("Contact_City"))) {
                this.H = stringExtra3 + "|" + intent.getStringExtra("Contact_Province");
                this.I = stringExtra4 + "|" + intent.getStringExtra("Contact_City");
                this.f179952r.setText(stringExtra + " " + stringExtra4);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("Contact_Province"))) {
                this.I = this.G;
                this.f179952r.setText(stringExtra);
            } else {
                this.I = stringExtra3 + "|" + intent.getStringExtra("Contact_Province");
                this.f179952r.setText(stringExtra + " " + stringExtra3);
            }
            if ("US".equals(stringExtra2) || "CA".equals(stringExtra2) || this.f179960z.F) {
                this.f179955u.setVisibility(0);
            } else {
                this.f179955u.setVisibility(8);
            }
        }
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.klf);
        this.f179960z = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) getInput().getParcelable("elemt_query");
        this.B = (com.tencent.mm.plugin.wallet_core.model.Orders) getInput().getParcelable("key_orders");
        this.C = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
        this.D = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_import_bankcard");
        if (this.C == null) {
            this.C = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        }
        java.util.Objects.toString(this.C);
        initView();
        this.f179957w.pageScroll(33);
        com.tencent.mm.plugin.wallet_core.utils.b1.d(this, getInput(), 3);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        if (i17 != 1) {
            return super.onCreateDialog(i17);
        }
        com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(this, com.tencent.mm.R.style.f494529pf);
        k2Var.setContentView(com.tencent.mm.R.layout.d6z);
        android.widget.ListView listView = (android.widget.ListView) k2Var.findViewById(com.tencent.mm.R.id.f482735mf);
        listView.setAdapter((android.widget.ListAdapter) this.K);
        listView.setOnItemClickListener(new com.tencent.mm.plugin.wallet_core.ui.c3(this));
        return k2Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 5) {
            V6();
            return false;
        }
        V6();
        return true;
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        android.os.Bundle input = getInput();
        java.util.Objects.toString(this.C);
        if (!(m1Var instanceof ss4.e0)) {
            return false;
        }
        input.putBoolean("intent_bind_end", true);
        com.tencent.mm.wallet_core.a.d(this, input);
        db5.e1.T(this, getString(com.tencent.mm.R.string.kft));
        return true;
    }
}
