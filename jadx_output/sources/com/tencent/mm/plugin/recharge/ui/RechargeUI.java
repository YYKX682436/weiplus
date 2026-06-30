package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class RechargeUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.recharge.ui.l, com.tencent.mm.modelbase.u0, y60.e {
    public static final /* synthetic */ int G = 0;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.ui.MallEditText f155132q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f155133r;

    /* renamed from: u, reason: collision with root package name */
    public int f155136u;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f155122d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f155123e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f155124f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f155125g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f155126h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f155127i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f155128m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f155129n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.ui.g1 f155130o = null;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.ui.g1 f155131p = null;

    /* renamed from: s, reason: collision with root package name */
    public android.app.Dialog f155134s = null;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.mall.MallFunction f155135t = null;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.model.MallRechargeProduct f155137v = null;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f155138w = null;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.mall.MallNews f155139x = null;

    /* renamed from: y, reason: collision with root package name */
    public boolean f155140y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f155141z = true;
    public final java.util.Map A = new java.util.HashMap();
    public final com.tencent.mm.sdk.event.IListener F = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.recharge.ui.RechargeUI.18
        {
            this.__eventId = 520089918;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
            com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent2 = walletPayResultEvent;
            boolean z17 = false;
            if (walletPayResultEvent2 instanceof com.tencent.mm.autogen.events.WalletPayResultEvent) {
                am.s10 s10Var = walletPayResultEvent2.f54965g;
                if (s10Var.f7865e) {
                    com.tencent.mars.xlog.Log.f("MicroMsg.MallRechargeUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                } else {
                    z17 = true;
                    if (s10Var.f7863c == -1) {
                        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = com.tencent.mm.plugin.recharge.ui.RechargeUI.this;
                        if (!rechargeUI.f155140y) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MallRechargeUI", "MallRecharge pay result : ok");
                            us3.e.Ai().wi(rechargeUI.f155132q.getInputRecord());
                            rechargeUI.finish();
                            rechargeUI.f155140y = true;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MallRechargeUI", "MallRecharge pay result : cancel");
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.f("MicroMsg.MallRechargeUI", "mismatched event");
            }
            return z17;
        }
    };

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.lang.String str2 = this.f155138w;
        if (str2 != null && str.equals(str2)) {
            this.f155128m.post(new com.tencent.mm.plugin.recharge.ui.w0(this, bitmap));
        }
    }

    public final boolean T6() {
        com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct;
        com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct2;
        com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText = this.f155132q;
        boolean z17 = mallEditText.getVisibility() != 0 || (!com.tencent.mm.sdk.platformtools.t8.K0(mallEditText.getText()) && mallEditText.f155095s);
        if (!z17 || (mallRechargeProduct2 = this.f155137v) == null || !mallRechargeProduct2.a()) {
            if (!z17 && (mallRechargeProduct = this.f155137v) != null) {
                mallRechargeProduct.getClass();
            }
            this.f155122d.setEnabled(false);
            this.f155122d.setClickable(false);
            return false;
        }
        if (Z6()) {
            com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct3 = this.f155137v;
            if (mallRechargeProduct3.f155082s) {
                U6(new vs3.e(mallRechargeProduct3.f155081r, this.f155135t.f179819d, mallRechargeProduct3.f155072f, mallRechargeProduct3.f155071e, X6(), W6()));
            }
        }
        hideVKB();
        this.f155122d.setEnabled(true);
        this.f155122d.setClickable(true);
        return true;
    }

    public final void U6(com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 497 || m1Var.getType() == 1555) {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(m1Var);
            return;
        }
        if (!this.f155141z) {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(m1Var);
            return;
        }
        android.app.Dialog dialog = this.f155134s;
        if (dialog == null || (dialog != null && !dialog.isShowing())) {
            this.f155134s = com.tencent.mm.wallet_core.ui.b2.h(getContext(), true, new com.tencent.mm.plugin.recharge.ui.q0(this, m1Var));
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(m1Var);
    }

    public final java.lang.String V6(int i17, java.lang.String str, java.lang.String str2) {
        return i17 + "-" + str + "-" + str2;
    }

    public final java.lang.String W6() {
        return vs3.b.a(this.f155132q.getText());
    }

    public final java.lang.String X6() {
        return "mobile=" + vs3.b.a(this.f155132q.getText());
    }

    public final java.util.List Y6(int i17, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            boolean z17 = false;
            for (int i18 = 0; i18 < list.size(); i18++) {
                com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct = (com.tencent.mm.plugin.recharge.model.MallRechargeProduct) list.get(i18);
                if (mallRechargeProduct.f155081r == i17) {
                    arrayList.add(mallRechargeProduct);
                    if (mallRechargeProduct.f155080q) {
                        if (z17) {
                            mallRechargeProduct.f155080q = false;
                        }
                        z17 = true;
                    }
                }
            }
            if (!z17 && arrayList.size() > 0) {
                ((com.tencent.mm.plugin.recharge.model.MallRechargeProduct) arrayList.get(0)).f155080q = true;
            }
        }
        return arrayList;
    }

    public final boolean Z6() {
        com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct = this.f155137v;
        return !((java.util.HashMap) this.A).containsKey(V6(mallRechargeProduct.f155081r, mallRechargeProduct.f155072f, W6()));
    }

    public void a7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f155132q.getText()) || this.f155132q.a()) {
            this.f155132q.setInfoTvImageResource(com.tencent.mm.R.drawable.awi);
        } else {
            this.f155132q.setInfoTvImageResource(com.tencent.mm.R.drawable.f481913aj3);
        }
    }

    public final void b7(java.util.List list) {
        if (list == null) {
            this.f155131p.c(new java.util.ArrayList());
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = false;
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct = (com.tencent.mm.plugin.recharge.model.MallRechargeProduct) list.get(i17);
            if (mallRechargeProduct.f155081r == 2) {
                com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct2 = this.f155137v;
                if (mallRechargeProduct2 != null && mallRechargeProduct.f155072f.equals(mallRechargeProduct2.f155072f)) {
                    mallRechargeProduct.f155080q = true;
                    z17 = true;
                }
                arrayList.add(mallRechargeProduct);
            }
        }
        if (!z17 && arrayList.size() > 0) {
            ((com.tencent.mm.plugin.recharge.model.MallRechargeProduct) arrayList.get(0)).f155080q = true;
        }
        this.f155131p.c(arrayList);
    }

    public final void c7() {
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews;
        java.util.Objects.toString(this.f155137v);
        com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct = this.f155137v;
        if (mallRechargeProduct != null) {
            this.f155133r.setText(mallRechargeProduct.f155073g);
            android.widget.TextView textView = this.f155125g;
            com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct2 = this.f155137v;
            textView.setText(!mallRechargeProduct2.a() ? getString(com.tencent.mm.R.string.gss) : (mallRechargeProduct2.f155075i != mallRechargeProduct2.f155076m || (Z6() && this.f155137v.f155082s)) ? "" : java.lang.String.format(getString(com.tencent.mm.R.string.gsv), java.lang.Float.valueOf(mallRechargeProduct2.f155075i)));
        }
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews2 = this.f155139x;
        if (mallNews2 == null || (mallNews = this.f155135t.f179827o) == null || !mallNews2.equals(mallNews) || "1".equals(this.f155139x.f179831d)) {
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews3 = this.f155135t.f179827o;
            if (mallNews3 == null || com.tencent.mm.sdk.platformtools.t8.K0(mallNews3.f179838n)) {
                this.f155127i.setVisibility(8);
            } else {
                this.f155138w = this.f155135t.f179827o.f179838n;
                y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                xs3.a aVar = new xs3.a(this.f155138w);
                ((x60.e) fVar).getClass();
                this.f155128m.setImageBitmap(x51.w0.d(aVar));
                this.f155127i.setVisibility(0);
            }
        } else {
            this.f155127i.setVisibility(8);
            this.f155139x.toString();
        }
        this.f155124f.setVisibility(4);
        if (!T6()) {
            this.f155123e.setText("");
        } else if (this.f155137v != null && !Z6()) {
            this.f155123e.setText(this.f155137v.f155074h);
            this.f155123e.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
        }
        java.lang.String string = getString(com.tencent.mm.R.string.gsk);
        if (!android.text.TextUtils.isEmpty(this.C)) {
            string = this.C;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B)) {
            addTextOptionMenu(0, string, new com.tencent.mm.plugin.recharge.ui.f1(this));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.D)) {
            this.f155126h.setVisibility(8);
        } else {
            this.f155126h.setVisibility(0);
        }
        if (android.text.TextUtils.isEmpty(this.E)) {
            return;
        }
        this.f155126h.setText(this.E);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cct;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public void hideVKB() {
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(this.f155135t.f179820e);
        setBackBtn(new com.tencent.mm.plugin.recharge.ui.x0(this));
        this.f155123e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j_j);
        this.f155124f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jau);
        this.f155125g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jaw);
        this.f155122d = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f155129n = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j9x);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jav);
        this.f155126h = textView;
        textView.setOnClickListener(new com.tencent.mm.plugin.recharge.ui.y0(this));
        this.f155122d.setOnClickListener(new com.tencent.mm.plugin.recharge.ui.z0(this));
        com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText = (com.tencent.mm.plugin.recharge.ui.MallEditText) findViewById(com.tencent.mm.R.id.j_0);
        this.f155132q = mallEditText;
        mallEditText.setInfoTvOnClickListener(new com.tencent.mm.plugin.recharge.ui.a1(this));
        this.f155133r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j_o);
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_product_list");
        java.util.List Y6 = Y6(0, parcelableArrayListExtra);
        java.util.List Y62 = Y6(2, parcelableArrayListExtra);
        java.util.ArrayList arrayList = (java.util.ArrayList) Y6;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) Y62;
        this.f155136u = arrayList.size() > arrayList2.size() ? arrayList.size() : arrayList2.size();
        com.tencent.mm.plugin.recharge.ui.g1 g1Var = new com.tencent.mm.plugin.recharge.ui.g1(this, null);
        this.f155130o = g1Var;
        g1Var.c(Y6);
        com.tencent.mm.plugin.recharge.ui.g1 g1Var2 = new com.tencent.mm.plugin.recharge.ui.g1(this, null);
        this.f155131p = g1Var2;
        g1Var2.c(Y62);
        this.f155129n.setOnClickListener(new com.tencent.mm.plugin.recharge.ui.b1(this));
        this.f155127i = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.jar);
        this.f155128m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.jat);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.jas)).setOnClickListener(new com.tencent.mm.plugin.recharge.ui.c1(this));
        this.f155127i.setOnClickListener(new com.tencent.mm.plugin.recharge.ui.d1(this));
        this.f155132q.setOnInputValidChangeListener(this);
        this.f155132q.setOnClickListener(new com.tencent.mm.plugin.recharge.ui.e1(this));
        a7();
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        c7();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r12, int r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recharge.ui.RechargeUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f155135t = (com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) intent.getParcelableExtra("key_func_info");
        java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_product_list");
        this.f155141z = !intent.getBooleanExtra("key_is_hide_progress", false);
        com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = this.f155135t;
        if (mallFunction == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MallRechargeUI", "function info is null");
            db5.t7.makeText(this, "function info is null", 1).show();
            return;
        }
        if (parcelableArrayListExtra == null) {
            java.lang.String str = mallFunction.f179820e;
            U6(new vs3.f(mallFunction.f179819d));
        } else {
            this.f155137v = com.tencent.mm.plugin.recharge.ui.n.a(parcelableArrayListExtra);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MallRechargeUI", "onCreate()");
        this.f155139x = bt4.f.b().f(this.f155135t.f179819d);
        initView();
    }

    @Override // android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        if (i17 != 1) {
            return db5.e1.F(this, getString(com.tencent.mm.R.string.gsu), "", true);
        }
        int color = getResources().getColor(com.tencent.mm.R.color.aa7);
        int color2 = getResources().getColor(com.tencent.mm.R.color.aaq);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.ccp, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.lmk);
        com.tencent.mm.ui.ListViewInScrollView listViewInScrollView = (com.tencent.mm.ui.ListViewInScrollView) inflate.findViewById(com.tencent.mm.R.id.lmo);
        com.tencent.mm.ui.ListViewInScrollView listViewInScrollView2 = (com.tencent.mm.ui.ListViewInScrollView) inflate.findViewById(com.tencent.mm.R.id.lms);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.lml);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lmn);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.lmp);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.lmr);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.f486551ln4);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479906ik) * this.f155136u) + 4;
        relativeLayout.setLayoutParams(layoutParams);
        listViewInScrollView.setAdapter((android.widget.ListAdapter) this.f155130o);
        listViewInScrollView.setOnItemClickListener(new com.tencent.mm.plugin.recharge.ui.s0(this));
        listViewInScrollView2.setAdapter((android.widget.ListAdapter) this.f155131p);
        listViewInScrollView2.setOnItemClickListener(new com.tencent.mm.plugin.recharge.ui.t0(this));
        inflate.findViewById(com.tencent.mm.R.id.lmm).setOnClickListener(new com.tencent.mm.plugin.recharge.ui.u0(this, findViewById, textView2, color2, listViewInScrollView, findViewById2, textView3, color, listViewInScrollView2, textView));
        inflate.findViewById(com.tencent.mm.R.id.lmq).setOnClickListener(new com.tencent.mm.plugin.recharge.ui.v0(this, findViewById2, textView3, color2, listViewInScrollView2, findViewById, textView2, color, listViewInScrollView, textView));
        if (this.f155130o.getCount() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = null;
        aVar.L = inflate;
        aVar.G = null;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var == null) {
            return j0Var;
        }
        d0Var.a(j0Var.f211837r);
        return j0Var;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.F.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.storage.l.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.storage.m.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1555, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.storage.l.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.storage.m.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1555, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct;
        android.app.Dialog dialog = this.f155134s;
        if (dialog != null && dialog.isShowing() && m1Var.getType() != 497) {
            this.f155134s.dismiss();
            this.f155134s = null;
        }
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof vs3.d) {
                return;
            }
            if (!(m1Var instanceof vs3.e)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = getString(com.tencent.mm.R.string.l0g);
                }
                db5.e1.G(this, str, null, false, new com.tencent.mm.plugin.recharge.ui.r0(this));
                return;
            }
            if (i18 == 100) {
                this.f155122d.setEnabled(true);
                this.f155122d.setClickable(true);
            } else {
                this.f155122d.setEnabled(false);
                this.f155122d.setClickable(false);
            }
            vs3.e eVar = (vs3.e) m1Var;
            b7(eVar.f439887g);
            this.f155124f.setText(str);
            this.f155124f.setVisibility(0);
            this.f155124f.setTextColor(getResources().getColor(com.tencent.mm.R.color.a2y));
            this.f155123e.setText(eVar.f439889i);
            this.f155123e.setTextColor(getResources().getColor(com.tencent.mm.R.color.a2y));
            return;
        }
        if (m1Var instanceof vs3.f) {
            vs3.f fVar = (vs3.f) m1Var;
            java.util.ArrayList arrayList = fVar.f439895f;
            if (arrayList != null) {
                com.tencent.mm.plugin.recharge.model.MallRechargeProduct a17 = com.tencent.mm.plugin.recharge.ui.n.a(arrayList);
                this.f155137v = a17;
                java.util.Objects.toString(a17);
            }
            this.B = fVar.f439897h;
            this.C = fVar.f439898i;
            this.D = fVar.f439899m;
            this.E = fVar.f439900n;
            java.util.Objects.toString(arrayList);
            c7();
            java.util.List Y6 = Y6(0, arrayList);
            java.util.List Y62 = Y6(2, arrayList);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) Y6;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) Y62;
            this.f155136u = arrayList2.size() > arrayList3.size() ? arrayList2.size() : arrayList3.size();
            this.f155130o.c(Y6);
            this.f155131p.c(Y62);
            return;
        }
        if (!(m1Var instanceof vs3.e)) {
            if (m1Var instanceof vs3.h) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = ((vs3.h) m1Var).f439922f;
                payInfo.f192109e = 6;
                payInfo.f192110f = 100;
                h45.a0.f(this, payInfo, 2);
                this.F.alive();
                return;
            }
            if (m1Var instanceof vs3.d) {
                vs3.d dVar = (vs3.d) m1Var;
                com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct2 = this.f155137v;
                if (mallRechargeProduct2 == null || !mallRechargeProduct2.f155073g.equals(dVar.f439883g) || !W6().equals(dVar.f439882f)) {
                    this.f155122d.setEnabled(true);
                    this.f155122d.setClickable(true);
                    this.f155124f.setText((java.lang.CharSequence) null);
                    return;
                }
                com.tencent.mm.modelbase.o oVar = dVar.f439881e;
                if (((r45.r33) oVar.f70711b.f70700a).f384500d != 0) {
                    this.f155122d.setEnabled(false);
                    this.f155122d.setClickable(false);
                    this.f155124f.setText(((r45.r33) oVar.f70711b.f70700a).f384501e);
                    this.f155124f.setVisibility(0);
                    this.f155124f.setTextColor(getResources().getColor(com.tencent.mm.R.color.a2y));
                    return;
                }
                return;
            }
            return;
        }
        java.util.Objects.toString(this.f155137v);
        vs3.e eVar2 = (vs3.e) m1Var;
        com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct3 = this.f155137v;
        if (mallRechargeProduct3 != null && (str2 = mallRechargeProduct3.f155072f) != null && (mallRechargeProduct = eVar2.f439886f) != null) {
            boolean equals = str2.equals(mallRechargeProduct.f155072f);
            java.lang.String str3 = eVar2.f439891n;
            int i19 = eVar2.f439890m;
            if ((equals && W6().equals(str3)) || i19 != 2) {
                com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct4 = eVar2.f439886f;
                com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct5 = this.f155137v;
                mallRechargeProduct5.f155071e = mallRechargeProduct4.f155071e;
                mallRechargeProduct5.f155070d = mallRechargeProduct4.f155070d;
                mallRechargeProduct5.f155072f = mallRechargeProduct4.f155072f;
                mallRechargeProduct5.f155073g = mallRechargeProduct4.f155073g;
                mallRechargeProduct5.f155074h = mallRechargeProduct4.f155074h;
                mallRechargeProduct5.f155075i = mallRechargeProduct4.f155075i;
                mallRechargeProduct5.f155076m = mallRechargeProduct4.f155076m;
                mallRechargeProduct5.f155077n = mallRechargeProduct4.f155077n;
                mallRechargeProduct5.f155078o = mallRechargeProduct4.f155078o;
                mallRechargeProduct5.f155079p = mallRechargeProduct4.f155079p;
                mallRechargeProduct5.f155081r = mallRechargeProduct4.f155081r;
                mallRechargeProduct5.f155080q = true;
                ((java.util.HashMap) this.A).put(V6(i19, mallRechargeProduct4.f155072f, str3), 1);
                c7();
                this.f155124f.setText(str);
                this.f155124f.setVisibility(0);
                this.f155124f.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479210sy));
            }
        }
        if (eVar2.f439890m == 2) {
            com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct6 = this.f155137v;
            if (mallRechargeProduct6 != null && mallRechargeProduct6.f155072f.equals(eVar2.f439892o) && W6().equals(eVar2.f439891n)) {
                com.tencent.mm.modelbase.o oVar2 = eVar2.f439885e;
                if (((r45.rh3) oVar2.f70711b.f70700a).f384865e == 0 && this.f155137v.f155072f.equals(eVar2.f439886f.f155072f)) {
                    java.lang.String str4 = this.f155137v.f155070d;
                    java.lang.String W6 = W6();
                    com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct7 = this.f155137v;
                    U6(new vs3.d(str4, W6, mallRechargeProduct7.f155073g, mallRechargeProduct7.f155071e, X6()));
                } else {
                    this.f155122d.setEnabled(false);
                    this.f155122d.setClickable(false);
                    this.f155124f.setText(((r45.rh3) oVar2.f70711b.f70700a).f384866f);
                    this.f155124f.setVisibility(0);
                    this.f155124f.setTextColor(getResources().getColor(com.tencent.mm.R.color.a2y));
                }
            } else {
                this.f155122d.setEnabled(true);
                this.f155122d.setClickable(true);
                this.f155124f.setText((java.lang.CharSequence) null);
            }
        }
        b7(eVar2.f439887g);
        java.util.Objects.toString(this.f155137v);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public void showVKB() {
        android.view.View currentFocus;
        this.f155132q.setInfoTvImageResource(com.tencent.mm.R.drawable.f481913aj3);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.showSoftInput(currentFocus, 2);
    }
}
