package com.tencent.mm.plugin.wallet_core.id_verify;

@db5.a(3)
/* loaded from: classes9.dex */
public class WcPayRealnameVerifyIdInputUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    public static final /* synthetic */ int X = 0;
    public com.tencent.mm.plugin.wallet_core.id_verify.p3 A;
    public com.tencent.mm.plugin.wallet_core.id_verify.model.Profession[] B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String[] E;
    public r45.sc6 G;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f179279J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int P;
    public int Q;
    public int R;
    public java.lang.String S;
    public final com.tenpay.android.wechat.TenpaySecureEncrypt T;
    public int U;
    public int V;
    public final com.tencent.mm.sdk.event.IListener W;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179280d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179281e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179282f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179283g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179284h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179285i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179286m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179287n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179288o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179289p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179290q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179291r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f179292s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.c0 f179293t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f179294u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f179295v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.o f179296w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f179297x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f179298y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f179299z;
    public final java.util.List F = new java.util.ArrayList();
    public final java.lang.String[] H = new java.lang.String[100];

    static {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 88);
    }

    public WcPayRealnameVerifyIdInputUI() {
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = this.H;
            if (i17 >= strArr.length) {
                this.I = 0;
                this.f179279J = 0;
                this.K = 0;
                this.L = 0;
                this.M = 0;
                this.N = 0;
                this.P = 0;
                this.Q = 0;
                this.R = 0;
                this.S = "";
                this.T = new com.tenpay.android.wechat.TenpaySecureEncrypt();
                this.W = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.1
                    {
                        this.__eventId = 323604482;
                    }

                    @Override // com.tencent.mm.sdk.event.IListener
                    public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
                        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.this;
                        wcPayRealnameVerifyIdInputUI.W.dead();
                        int i18 = walletRealNameResultNotifyEvent.f54973g.f6120a;
                        if (i18 != -1 && i18 != 0) {
                            return false;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "WcPayRealnameVerifyIdInputUI finish");
                        wcPayRealnameVerifyIdInputUI.finish();
                        return false;
                    }
                };
                return;
            }
            strArr[i17] = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkh, java.lang.Integer.valueOf(i17));
            i17++;
        }
    }

    public static void U6(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        if (wcPayRealnameVerifyIdInputUI.f179280d.getContentEt().hasFocus()) {
            wcPayRealnameVerifyIdInputUI.f179280d.getContentEt().clearFocus();
        }
        if (wcPayRealnameVerifyIdInputUI.f179282f.getContentEt().hasFocus()) {
            wcPayRealnameVerifyIdInputUI.f179282f.getContentEt().clearFocus();
        }
    }

    public final void V6(ys4.g gVar) {
        com.tencent.mm.wallet_core.h process = getProcess();
        android.os.Bundle input = getInput();
        java.lang.String str = gVar.f465232d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "NetSceneRealNameVerify response succ");
        if (process != null) {
            input.putString("key_real_name_token", str);
            input.putString("key_country_code", (java.lang.String) this.A.f179464i.getValue());
            input.putString("key_province_code", (java.lang.String) this.A.f179465m.getValue());
            input.putString("key_city_code", (java.lang.String) this.A.f179466n.getValue());
            input.putParcelable("key_profession", (android.os.Parcelable) this.A.f179469q.getValue());
            input.putBoolean("realname_verify_process_need_bind_card", gVar.f465233e);
            input.putBoolean("realname_verify_process_need_face", gVar.f465234f);
            input.putLong("realname_verify_process_face_scene", gVar.f465235g);
            input.putString("realname_verify_process_face_package", gVar.f465236h);
            input.putString("realname_verify_process_face_package_sign", gVar.f465237i);
            input.putString("realname_verify_process_add_bank_word", gVar.f465238m);
            input.putString("realname_verify_process_req_key", gVar.f465243r);
            com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle realNameBundle = new com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle();
            realNameBundle.f179423d = (java.lang.String) this.A.f179459d.getValue();
            realNameBundle.f179424e = this.C;
            realNameBundle.f179425f = this.D;
            realNameBundle.f179426g = ((r45.mj5) this.A.f179461f.getValue()).f380583d.f376866d;
            realNameBundle.f179427h = this.f179281e.getText();
            realNameBundle.f179428i = (com.tencent.mm.plugin.wallet_core.id_verify.model.Profession) this.A.f179469q.getValue();
            realNameBundle.f179429m = (java.lang.String) this.A.f179464i.getValue();
            realNameBundle.f179430n = (java.lang.String) this.A.f179465m.getValue();
            realNameBundle.f179431o = (java.lang.String) this.A.f179466n.getValue();
            realNameBundle.f179432p = (java.lang.String) this.A.f179467o.getValue();
            realNameBundle.f179433q = ((java.lang.Integer) this.A.f179473u.getValue()).intValue();
            realNameBundle.D = (java.lang.String) this.A.f179471s.getValue();
            realNameBundle.E = this.I;
            realNameBundle.F = this.f179279J;
            realNameBundle.G = this.K;
            realNameBundle.f179434r = (java.lang.String) this.A.f179472t.getValue();
            realNameBundle.f179435s = this.L;
            realNameBundle.f179436t = this.M;
            realNameBundle.f179437u = this.N;
            realNameBundle.f179438v = this.f179289p.getText();
            realNameBundle.f179439w = this.P;
            realNameBundle.f179440x = this.Q;
            realNameBundle.f179441y = this.R;
            realNameBundle.f179442z = (java.lang.String) this.A.f179475w.getValue();
            realNameBundle.A = (java.lang.String) this.A.f179476x.getValue();
            realNameBundle.B = this.S;
            realNameBundle.C = (java.lang.String) this.A.f179468p.getValue();
            realNameBundle.H = (java.lang.String) this.A.f179477y.getValue();
            realNameBundle.I = getString(com.tencent.mm.R.string.j1n).equals(this.A.f179460e.getValue()) ? 1 : 2;
            input.putParcelable("realname_verify_process_bundle", realNameBundle);
            process.o(this, 0, input);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9d;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f179280d = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pq9);
        this.f179291r = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pqc);
        this.f179281e = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pq7);
        this.f179282f = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pq6);
        this.f179285i = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f487760pq5);
        this.f179286m = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f487759pq4);
        this.f179287n = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f487758pq3);
        this.f179288o = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pq_);
        this.f179289p = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f487757pq2);
        this.f179283g = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pqb);
        this.f179284h = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f487756pq1);
        this.f179290q = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pq8);
        this.f179292s = (android.widget.Button) findViewById(com.tencent.mm.R.id.pqa);
        this.f179294u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pqe);
        this.f179295v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pqd);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f179297x)) {
            this.f179294u.setText(this.f179297x);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f179298y)) {
            this.f179295v.setText(this.f179298y);
            this.f179295v.setVisibility(0);
        }
        this.f179280d.setFilterChar("\\x20\\t\\r\\n".toCharArray());
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = dimensionPixelSize2;
        r45.sc6 sc6Var = this.G;
        if (sc6Var == null || com.tencent.mm.sdk.platformtools.t8.K0(sc6Var.f385628d)) {
            this.f179280d.getInfoIv().setLayoutParams(layoutParams);
            this.f179280d.getInfoIv().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView infoIv = this.f179280d.getInfoIv();
            int color = getResources().getColor(com.tencent.mm.R.color.FG_2);
            infoIv.f192041u = com.tencent.mm.R.raw.icons_filled_close2;
            infoIv.f192042v = color;
            this.f179280d.b(new com.tencent.mm.plugin.wallet_core.id_verify.e3(this));
        } else {
            this.f179280d.setText(this.G.f385628d);
            com.tencent.mm.plugin.wallet_core.id_verify.p3 p3Var = this.A;
            p3Var.f179459d.setValue(this.G.f385628d);
            this.f179280d.setContentTextColor(getResources().getColor(com.tencent.mm.R.color.FG_2));
            this.f179280d.setInputEnable(false);
            this.f179280d.getInfoIv().setImageResource(com.tencent.mm.R.raw.icons_outlined_info);
            this.f179280d.getInfoIv().setmUserSetImageIconColor(getResources().getColor(com.tencent.mm.R.color.FG_2));
            this.f179280d.getInfoIv().setVisibility(0);
            this.f179280d.getInfoIv().setClickable(true);
            this.f179280d.setOnInfoIvClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.a3(this));
        }
        this.f179281e.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.f3(this));
        this.f179281e.getInfoIv().setClickable(false);
        this.f179281e.getContentEt().setInputType(131073);
        this.f179282f.getInfoIv().setLayoutParams(layoutParams);
        this.f179282f.getInfoIv().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView infoIv2 = this.f179282f.getInfoIv();
        int color2 = getResources().getColor(com.tencent.mm.R.color.FG_2);
        infoIv2.f192041u = com.tencent.mm.R.raw.icons_filled_close2;
        infoIv2.f192042v = color2;
        qp5.p.e(this.f179282f);
        this.f179282f.b(new com.tencent.mm.plugin.wallet_core.id_verify.g3(this));
        this.f179291r.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.i3(this));
        this.f179285i.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.k3(this));
        this.f179285i.getInfoIv().setClickable(false);
        this.f179285i.getContentEt().setClickable(false);
        this.f179285i.getContentEt().setFocusable(false);
        this.f179286m.getContentEt().setClickable(false);
        this.f179286m.getContentEt().setFocusable(false);
        this.f179285i.getContentEt().setInputType(131073);
        this.f179286m.getContentEt().setInputType(131073);
        this.f179286m.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.m3(this));
        this.f179286m.getInfoIv().setClickable(false);
        this.f179290q.setInputType(3);
        this.f179290q.b(new com.tencent.mm.plugin.wallet_core.id_verify.n3(this));
        this.f179287n.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.c2(this));
        this.f179287n.getInfoIv().setClickable(false);
        this.f179289p.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.e2(this));
        this.f179289p.getInfoIv().setClickable(false);
        this.f179288o.getContentEt().setFocusable(true);
        this.f179288o.getContentEt().setClickable(true);
        this.f179288o.getContentEt().setEnabled(true);
        this.f179288o.getContentEt().setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.f2(this));
        this.f179288o.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.g2(this));
        this.f179288o.getInfoIv().setClickable(false);
        this.f179283g.getContentEt().setInputType(131073);
        this.f179283g.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.h2(this));
        this.f179283g.getInfoIv().setClickable(false);
        this.f179284h.getContentEt().setInputType(131073);
        this.f179284h.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.i2(this));
        this.f179284h.getInfoIv().setClickable(false);
        this.f179292s.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.j2(this));
        this.f179280d.p();
        this.A.f179463h.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.l2(this));
        this.A.f179461f.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.m2(this));
        this.A.f179471s.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.n2(this));
        this.A.f179472t.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.q2(this));
        this.A.f179460e.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.r2(this));
        this.A.f179473u.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.s2(this));
        this.A.f179474v.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.t2(this));
        this.A.f179467o.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.u2(this));
        this.A.f179468p.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.v2(this));
        this.A.f179476x.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.w2(this));
        this.A.f179469q.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.x2(this));
        this.A.f179470r.observe(this, new com.tencent.mm.plugin.wallet_core.id_verify.y2(this));
        java.util.ArrayList arrayList = (java.util.ArrayList) this.F;
        if (arrayList.size() > 0) {
            com.tencent.mm.plugin.wallet_core.id_verify.p3 p3Var2 = this.A;
            p3Var2.f179461f.setValue((r45.mj5) arrayList.get(0));
        } else {
            rp5.b logicDelegate = this.f179282f.getLogicDelegate();
            if (logicDelegate instanceof qp5.n) {
                ((qp5.n) logicDelegate).f(-1);
            }
        }
        com.tencent.mm.wallet_core.ui.r1.b(new com.tencent.mm.wallet_core.ui.formview.WalletFormView[]{this.f179280d, this.f179281e, this.f179282f, this.f179283g, this.f179284h, this.f179285i, this.f179286m, this.f179287n, this.f179288o, this.f179289p, this.f179290q, this.f179291r}, 10);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "[onActivityResult] requestCode：%s, resultCode：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1) {
            if (i18 != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "no area choose!");
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("CountryName");
            java.lang.String stringExtra2 = intent.getStringExtra("ProviceName");
            java.lang.String stringExtra3 = intent.getStringExtra("CityName");
            java.lang.String stringExtra4 = intent.getStringExtra("Country");
            java.lang.String stringExtra5 = intent.getStringExtra("Contact_Province");
            java.lang.String stringExtra6 = intent.getStringExtra("Contact_City");
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "[onActivityResult] country: %s , province：%s , city：%s， countryCode：%s， provinceCode：%s ， cityCode：%s", stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                sb6.append(stringExtra);
                sb6.append(" ");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                sb6.append(stringExtra2);
                sb6.append(" ");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                sb6.append(stringExtra3);
            }
            com.tencent.mm.plugin.wallet_core.id_verify.p3 p3Var = this.A;
            java.lang.String sb7 = sb6.toString();
            p3Var.f179464i.setValue(stringExtra4);
            p3Var.f179465m.setValue(stringExtra5);
            p3Var.f179466n.setValue(stringExtra6);
            p3Var.f179467o.setValue(sb7);
            return;
        }
        if (i17 == 2) {
            if (i18 != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "no choose!");
                return;
            } else {
                this.A.f179469q.setValue((com.tencent.mm.plugin.wallet_core.id_verify.model.Profession) intent.getParcelableExtra("key_select_profession"));
                return;
            }
        }
        if (i17 == 3 && i18 == 100) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("country_name"))) {
                return;
            }
            java.lang.String stringExtra7 = intent.getStringExtra("iso_code");
            java.lang.String stringExtra8 = intent.getStringExtra("country_name");
            this.S = intent.getStringExtra("couttry_code");
            com.tencent.mm.plugin.wallet_core.id_verify.p3 p3Var2 = this.A;
            p3Var2.f179475w.setValue(stringExtra7);
            p3Var2.f179476x.setValue(stringExtra8);
            return;
        }
        if (i17 != 4 || i18 != -1 || intent == null) {
            if (i17 != 5) {
                super.onActivityResult(i17, i18, intent);
                return;
            } else {
                if (i18 == -1) {
                    getProcess().f(this, getInput());
                    return;
                }
                return;
            }
        }
        java.lang.String stringExtra9 = intent.getStringExtra("key_countrycode");
        java.lang.String stringExtra10 = intent.getStringExtra("key_provincecode");
        java.lang.String stringExtra11 = intent.getStringExtra("key_citycode");
        java.lang.String stringExtra12 = intent.getStringExtra("key_zone");
        java.lang.String stringExtra13 = intent.getStringExtra("key_address");
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "[onActivityResult] countryCode:%s , provinceCode：%s , cityCode：%s， zone：%s， detailAddress：%s ", stringExtra9, stringExtra10, stringExtra11, stringExtra12, stringExtra13);
        com.tencent.mm.plugin.wallet_core.id_verify.p3 p3Var3 = this.A;
        p3Var3.f179464i.setValue(stringExtra9);
        p3Var3.f179465m.setValue(stringExtra10);
        p3Var3.f179466n.setValue(stringExtra11);
        p3Var3.f179467o.setValue(stringExtra12);
        this.A.f179468p.setValue(stringExtra13);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478494f));
        hideActionbarLine();
        setMMTitle("");
        this.U = getInput().getInt("entry_scene", -1);
        this.V = getInput().getInt("realname_entry_scene", 0);
        this.mNetSceneMgr.c(1616);
        this.W.alive();
        this.A = (com.tencent.mm.plugin.wallet_core.id_verify.p3) androidx.lifecycle.k1.a(this, null).a(com.tencent.mm.plugin.wallet_core.id_verify.p3.class);
        java.lang.String string = getInput().getString("realname_verify_process_get_wording_cache");
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                r45.lm3 lm3Var = (r45.lm3) new r45.lm3().parseFrom(string.getBytes(s46.a.f403001a));
                ((java.util.ArrayList) this.F).addAll(lm3Var.E);
                this.f179297x = lm3Var.F;
                this.f179298y = lm3Var.G;
                this.G = lm3Var.I;
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WcPayRealnameVerifyIdInputUI", e17, "", new java.lang.Object[0]);
        }
        initView();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "do get user ext info");
        doSceneForceProgress(new ys4.k(null));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mNetSceneMgr.i(1616);
        this.W.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        getInput().getInt("key_err_code");
        super.onNewIntent(intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ys4.k) {
            ys4.k kVar = (ys4.k) m1Var;
            this.B = kVar.f465251f;
            this.E = kVar.f465252g;
        } else if ((m1Var instanceof ys4.g) && i17 == 0 && i18 == 0) {
            ys4.g gVar = (ys4.g) m1Var;
            at4.y0 y0Var = gVar.f465239n;
            if (!((y0Var == null && gVar.f465240o == null) ? false : true)) {
                V6(gVar);
            } else if (gVar.f465240o != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "NetSceneRealNameVerify show underAgeMidDialog");
                at4.h0 h0Var = gVar.f465240o;
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 1, 0);
                z2Var.m(h0Var.f13867c, h0Var.f13868d);
                com.tencent.mm.plugin.wallet_core.id_verify.c3 c3Var = new com.tencent.mm.plugin.wallet_core.id_verify.c3(this, z2Var);
                com.tencent.mm.plugin.wallet_core.id_verify.d3 d3Var = new com.tencent.mm.plugin.wallet_core.id_verify.d3(this, z2Var, gVar);
                z2Var.D = c3Var;
                z2Var.E = d3Var;
                android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489642d95, (android.view.ViewGroup) null);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gwd)).setText(h0Var.f13865a);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gw8)).setText(h0Var.f13866b);
                z2Var.j(inflate);
                z2Var.C();
                com.tencent.mm.wallet_core.ui.r1.r0(20, 1, com.tencent.mm.sdk.platformtools.t8.i1(), this.U);
            } else if (y0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "NetSceneRealNameVerify show juveniles dialog");
                at4.y0 y0Var2 = gVar.f465239n;
                db5.e1.A(this, y0Var2.f14013a, "", y0Var2.f14015c, y0Var2.f14014b, new com.tencent.mm.plugin.wallet_core.id_verify.z2(this, gVar), new com.tencent.mm.plugin.wallet_core.id_verify.b3(this));
            }
            return true;
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet_core.utils.u.class);
    }
}
