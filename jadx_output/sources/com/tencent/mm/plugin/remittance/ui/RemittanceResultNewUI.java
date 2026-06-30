package com.tencent.mm.plugin.remittance.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class RemittanceResultNewUI extends com.tencent.mm.plugin.remittance.ui.RemittanceResultUI {
    public static int[] A;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f157569e;

    /* renamed from: f, reason: collision with root package name */
    public int f157570f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f157571g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f157572h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f157573i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f157574m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f157575n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f157576o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f157577p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f157578q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f157579r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f157580s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f157581t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f157582u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget f157583v;

    /* renamed from: w, reason: collision with root package name */
    public a36.c f157584w;

    /* renamed from: x, reason: collision with root package name */
    public r45.zv f157585x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f157586y = false;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f157587z = new com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.AnonymousClass1(com.tencent.mm.app.a0.f53288d);

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 520089918;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "receive pay result event, do finish");
            int i17 = walletPayResultEvent.f54965g.f7862b;
            if (i17 != 1000 && i17 != 1001) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "doEndRemittance");
            com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI remittanceResultNewUI = com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.this;
            com.tencent.mm.wallet_core.h process = remittanceResultNewUI.getProcess();
            if (process != null) {
                process.z(remittanceResultNewUI);
            }
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.remittance.ui.a8(this), 100L);
            return false;
        }
    }

    public static int W6(android.content.Context context, java.lang.String str, int i17) {
        int b17 = i65.a.b(context, 16);
        if (A == null) {
            A = com.tencent.mm.sdk.platformtools.d2.f(context);
        }
        boolean z17 = false;
        int b18 = ((A[0] - i65.a.b(context, 88)) - i17) / b17;
        int length = str.length();
        int i18 = length / b18;
        if (i18 > 2 || (i18 == 2 && length % b18 > 0)) {
            z17 = true;
        }
        return z17 ? (b18 * 2) - 5 : str.length();
    }

    public final void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "doEndRemittance");
        getProcess().f(this, getInput());
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.remittance.ui.e8(this), 100L);
    }

    public final void Y6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "endRemittance");
        if (!getInput().containsKey("key_realname_guide_helper")) {
            X6();
            return;
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) getInput().getParcelable("key_realname_guide_helper");
        if (realnameGuideHelper != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceResultUI");
            bundle.putString("realname_verify_process_jump_plugin", "remittance");
            realnameGuideHelper.a(this, bundle, new com.tencent.mm.plugin.remittance.ui.c8(this), null);
            realnameGuideHelper.c(this, bundle, new com.tencent.mm.plugin.remittance.ui.d8(this), null, false);
            getInput().remove("key_realname_guide_helper");
        }
    }

    public final android.view.View Z6() {
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f157569e;
        if (orders == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(orders.f179682n > 0.0d);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "need set charge fee: %s", objArr);
        if (this.f157569e.f179682n <= 0.0d) {
            return null;
        }
        java.lang.String string = getString(com.tencent.mm.R.string.f492829i13);
        com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f157569e;
        java.lang.String n17 = com.tencent.mm.wallet_core.ui.r1.n(orders2.f179682n, orders2.f179681m);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.a_s, this.f157578q, false);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.odf);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.a_4);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.cut);
        textView.setText(string);
        imageView.setVisibility(8);
        textView2.setText(n17);
        this.f157578q.addView(viewGroup);
        return viewGroup;
    }

    public final android.view.ViewGroup a7(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "setF2FNameView");
        if (z17) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.a_v, this.f157578q, false);
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) viewGroup.findViewById(com.tencent.mm.R.id.lut);
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f486523lj2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f157571g) || this.f157573i.f192122u == null) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(cdnImageView, this.f157571g, 0.06f);
            } else {
                int d17 = com.tencent.mm.sdk.platformtools.j.d(this, 56.0f);
                cdnImageView.setRoundCorner(true);
                cdnImageView.b(this.f157573i.f192122u.getString("extinfo_key_27"), d17, d17, com.tencent.mm.R.drawable.bhm);
            }
            textView.setText(str);
            this.f157578q.addView(viewGroup);
            return viewGroup;
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.a_u, this.f157578q, false);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) viewGroup2.findViewById(com.tencent.mm.R.id.lut);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.f486523lj2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f157571g) || this.f157573i.f192122u == null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(cdnImageView2, this.f157571g, 0.06f);
        } else {
            int d18 = com.tencent.mm.sdk.platformtools.j.d(this, 28.0f);
            cdnImageView2.setRoundCorner(true);
            cdnImageView2.b(this.f157573i.f192122u.getString("extinfo_key_27"), d18, d18, com.tencent.mm.R.drawable.bhm);
        }
        textView2.setText(str);
        this.f157578q.addView(viewGroup2);
        return viewGroup2;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "finish this %s %s", this, new com.tencent.mm.sdk.platformtools.z3());
        if (this.f157586y) {
            return;
        }
        super.finish();
        this.f157586y = true;
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceResultUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cef;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        boolean z17;
        android.view.ViewGroup viewGroup;
        android.os.Bundle bundle;
        android.view.ViewGroup viewGroup2 = null;
        setBackBtn(null);
        showHomeBtn(false);
        enableBackMenu(false);
        this.f157574m = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.dmb);
        this.f157575n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484275dm5);
        this.f157576o = (com.tencent.mm.wallet_core.ui.WalletTextView) findViewById(com.tencent.mm.R.id.f484273dm3);
        this.f157577p = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.dm9);
        this.f157578q = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.dm_);
        this.f157579r = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.kdn);
        this.f157580s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kdm);
        this.f157581t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kdh);
        this.f157582u = (com.tencent.mm.wallet_core.ui.WalletTextView) findViewById(com.tencent.mm.R.id.kdg);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f487393oj0)).setOnClickListener(new com.tencent.mm.plugin.remittance.ui.b8(this));
        this.f157583v = (com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget) findViewById(com.tencent.mm.R.id.a_t);
        java.lang.String x17 = com.tencent.mm.wallet_core.ui.r1.x(this.f157571g);
        int i17 = this.f157570f;
        if (i17 == 31 || i17 == 5) {
            this.f157581t.setText(com.tencent.mm.wallet_core.ui.r1.w(this.f157569e.f179681m));
            this.f157582u.setText(com.tencent.mm.wallet_core.ui.r1.o(this.f157569e.f179678h));
            if (this.f157570f == 31) {
                java.lang.String string = getString(com.tencent.mm.R.string.f492832i16, x17);
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    this.f157580s.setVisibility(8);
                } else {
                    android.widget.TextView textView = this.f157580s;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    float textSize = this.f157580s.getTextSize();
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string, textSize));
                }
            } else {
                android.os.Bundle bundle2 = this.f157573i.f192122u;
                z17 = bundle2 != null && bundle2.getBoolean("extinfo_key_10");
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "isEmojiReward: %s", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    this.f157580s.setText(getString(com.tencent.mm.R.string.i07));
                } else {
                    java.util.List list = this.f157569e.M;
                    if (list != null && ((java.util.ArrayList) list).get(0) != null && !android.text.TextUtils.isEmpty(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f157569e.M).get(0)).f179706g)) {
                        this.f157580s.setText(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f157569e.M).get(0)).f179706g);
                    }
                }
            }
            this.f157579r.setVisibility(0);
            if (this.f157569e.f179682n > 0.0d) {
                Z6();
                ((android.view.ViewGroup.MarginLayoutParams) this.f157577p.getLayoutParams()).topMargin = i65.a.b(this, 20);
                this.f157577p.setVisibility(0);
                this.f157578q.setVisibility(0);
            }
        } else {
            byte[] byteArray = getInput().getByteArray("key_succpage_resp");
            if (byteArray != null) {
                r45.zv zvVar = new r45.zv();
                this.f157585x = zvVar;
                try {
                    zvVar.parseFrom(byteArray);
                    this.f157584w = this.f157585x.f392384g;
                } catch (java.lang.Exception e17) {
                    this.f157585x = null;
                    this.f157584w = null;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemittanceResultNewUI", e17, "parse f2FPaySucPageResp error: %s", e17.getMessage());
                }
            }
            java.lang.String x18 = com.tencent.mm.wallet_core.ui.r1.x(this.f157571g);
            this.f157575n.setText(com.tencent.mm.wallet_core.ui.r1.w(this.f157569e.f179681m));
            this.f157576o.setText(com.tencent.mm.wallet_core.ui.r1.o(this.f157569e.f179678h));
            this.f157578q.removeAllViews();
            int i18 = this.f157570f;
            if (i18 == 32 || i18 == 33 || i18 == 48) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(x18) && (bundle = this.f157573i.f192122u) != null) {
                    x18 = bundle.getString("extinfo_key_28");
                }
                android.os.Bundle bundle3 = this.f157573i.f192122u;
                java.lang.String string2 = bundle3 != null ? bundle3.getString("extinfo_key_2") : "";
                if (x18 != null && x18.length() > 10) {
                    x18 = x18.substring(0, 10) + "...";
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(x18)) {
                        string2 = x18 + "(" + com.tencent.mm.wallet_core.ui.r1.y(string2) + ")";
                    }
                    x18 = string2;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "setF2FReceiverRemarkView");
                java.lang.String string3 = this.f157573i.f192122u.getString("extinfo_key_3");
                java.lang.String string4 = this.f157573i.f192122u.getString("extinfo_key_8");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                    viewGroup = null;
                } else {
                    viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.a_t, this.f157578q, false);
                    android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.odf);
                    android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.cut);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                        textView2.setText(getString(com.tencent.mm.R.string.b9v));
                    } else {
                        textView2.setText(string4);
                    }
                    textView3.setText(string3);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "setF2FPayerRemarkView");
                java.lang.String string5 = this.f157573i.f192122u.getString("extinfo_key_6");
                java.lang.String string6 = this.f157573i.f192122u.getString("extinfo_key_7");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string6)) {
                    viewGroup2 = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.a_t, this.f157578q, false);
                    android.widget.TextView textView4 = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.odf);
                    android.widget.TextView textView5 = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.cut);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(string5)) {
                        textView4.setText(getString(com.tencent.mm.R.string.b9u));
                    } else {
                        textView4.setText(string5);
                    }
                    textView5.setText(string6);
                }
                android.view.ViewGroup viewGroup3 = viewGroup2;
                android.view.View Z6 = Z6();
                z17 = viewGroup == null && viewGroup3 == null && Z6 == null;
                this.f157577p.setVisibility(0);
                this.f157578q.setVisibility(0);
                if (com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.e(this.f157584w)) {
                    java.lang.String str = ((java.util.ArrayList) this.f157569e.M).size() > 0 ? ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f157569e.M).get(0)).f179714r : "";
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "transId: %s", str);
                    this.f157583v.n(this, this.f157584w, str, true, (android.widget.ImageView) findViewById(com.tencent.mm.R.id.aai));
                    this.f157583v.g();
                    this.f157583v.setVisibility(0);
                    a7(x18, false);
                } else {
                    this.f157583v.setVisibility(8);
                    a7(x18, z17);
                }
                if (viewGroup != null) {
                    this.f157578q.addView(viewGroup);
                }
                if (viewGroup3 != null) {
                    this.f157578q.addView(viewGroup3);
                }
                if (Z6 != null) {
                    this.f157578q.addView(Z6);
                }
            }
            this.f157574m.setVisibility(0);
        }
        ((mz2.j2) ((mz2.e1) i95.n0.c(mz2.e1.class))).Ai(this);
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceResultUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        super.onCreate(bundle);
        if (fp.h.c(21)) {
            if (fp.h.c(23)) {
                getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
            } else {
                getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.BW_90));
            }
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        this.f157587z.alive();
        this.f157569e = (com.tencent.mm.plugin.wallet_core.model.Orders) getInput().getParcelable("key_orders");
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
        this.f157573i = payInfo;
        if (payInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceResultNewUI", "payInfo is null!!!");
            finish();
            return;
        }
        android.os.Bundle bundle2 = payInfo.f192122u;
        if (bundle2 != null) {
            this.f157572h = bundle2.getBoolean("extinfo_key_4");
            str = this.f157573i.f192122u.getString("extinfo_key_1");
            str2 = this.f157573i.f192122u.getString("extinfo_key_16");
        } else {
            str = "";
            str2 = str;
        }
        int i17 = this.f157573i.f192109e;
        this.f157570f = i17;
        this.f157571g = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "payScene: %s", java.lang.Integer.valueOf(i17));
        initView();
        if (this.f157570f == 31) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultNewUI", "transId: %s", str2);
            kw3.p.Ai().Di().d(str2, this.f157571g, "");
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, getString(com.tencent.mm.R.string.f490359sr));
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceResultUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f157587z.dead();
        if (com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.e(this.f157584w)) {
            this.f157583v.j();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            Y6();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.e(this.f157584w)) {
            this.f157583v.k();
        }
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceResultUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.e(this.f157584w) ? this.f157583v.l(i17, i18, str, m1Var) : super.onSceneEnd(i17, i18, str, m1Var);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity
    public void setContentViewVisibility(int i17) {
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/remittance/ui/RemittanceResultNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
