package com.tencent.mm.plugin.remittance.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class RemittanceBusiResultUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    public static final /* synthetic */ int A1 = 0;
    public java.lang.String A;
    public double B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public int F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;
    public java.lang.String K;
    public com.tencent.mm.plugin.remittance.model.BusiRemittanceResp L;
    public r45.vo M;
    public int N;
    public android.os.ResultReceiver Q;
    public android.widget.LinearLayout R;
    public android.widget.LinearLayout S;
    public int W;
    public java.lang.String X;
    public a36.c Y;
    public com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget Z;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f157165d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f157166e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f157167f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f157168g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f157169h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f157170i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f157172m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f157173n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f157174o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f157175p;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.ViewGroup f157176p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f157177p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f157178q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f157179r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f157180s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f157181t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f157182u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f157183v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f157184w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f157185x;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.ViewGroup f157186x0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f157188y;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.ViewGroup f157189y0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f157191z;

    /* renamed from: J, reason: collision with root package name */
    public boolean f157164J = false;
    public boolean P = false;
    public final java.lang.Runnable T = new com.tencent.mm.plugin.remittance.ui.t1(this);
    public final r45.k6 U = new r45.k6();
    public final r45.yr V = new r45.yr();

    /* renamed from: l1, reason: collision with root package name */
    public boolean f157171l1 = false;

    /* renamed from: x1, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f157187x1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI.2
        {
            this.__eventId = 520089918;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "receive pay result event, do finish");
            int i17 = walletPayResultEvent.f54965g.f7862b;
            if (i17 != 1000 && i17 != 1001) {
                return false;
            }
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI.this.finish();
            return false;
        }
    };

    /* renamed from: y1, reason: collision with root package name */
    public boolean f157190y1 = true;

    /* renamed from: z1, reason: collision with root package name */
    public final java.lang.Runnable f157192z1 = new com.tencent.mm.plugin.remittance.ui.z1(this);

    public final boolean U6(android.view.View view) {
        return view == null || view.getVisibility() == 8;
    }

    public final void V6() {
        if (!com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.e(this.Y)) {
            this.Z.setVisibility(8);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "setAwardWidget, mTransId: %s", this.D);
        this.Z.n(this, this.Y, this.D, true, (android.widget.ImageView) findViewById(com.tencent.mm.R.id.aai));
        this.Z.g();
        this.Z.setVisibility(0);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.aai);
        imageView.post(new com.tencent.mm.plugin.remittance.ui.v1(this, imageView, (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.mcr)));
        Z6(this.Z);
    }

    public final void W6(com.tencent.mm.plugin.remittance.model.r rVar) {
        r45.ep epVar;
        java.lang.String str;
        this.f157186x0.setVisibility(8);
        this.f157176p0.setVisibility(8);
        this.f157189y0.setVisibility(8);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ohi);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ohj);
        if (rVar == null || (epVar = rVar.f156986e) == null || epVar.f373634i.size() <= 0) {
            return;
        }
        java.util.LinkedList linkedList = rVar.f156986e.f373634i;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = linkedList;
        objArr[1] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
        objArr[2] = java.lang.Long.valueOf(rVar.f156986e.f373633h);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "discountInfoList: %s, size: %s received_amount: %s", objArr);
        int size = linkedList.size();
        if (linkedList.size() > 0) {
            this.f157186x0.removeAllViews();
            this.f157176p0.setOnClickListener(null);
            if (size > 1) {
                str = rVar.f156986e.f373637o;
                this.f157190y1 = true;
                findViewById.setOnClickListener(new com.tencent.mm.plugin.remittance.ui.x1(this, findViewById));
                this.f157176p0.setOnClickListener(new com.tencent.mm.plugin.remittance.ui.y1(this, findViewById));
            } else {
                str = "";
            }
            if (size == 1 && linkedList.get(0) != null) {
                str = (java.lang.String) linkedList.get(0);
            }
            for (int i17 = 0; i17 < linkedList.size(); i17++) {
                java.lang.String str2 = (java.lang.String) linkedList.get(i17);
                android.widget.TextView textView2 = new android.widget.TextView(getContext());
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams.bottomMargin = i65.a.b(this, 6);
                textView2.setLayoutParams(layoutParams);
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478526a7));
                textView2.setText(str2);
                this.f157186x0.addView(textView2);
            }
            this.f157186x0.setVisibility(0);
            this.f157176p0.setVisibility(0);
        } else {
            str = "";
        }
        if (this.f157190y1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(str.concat(" "));
            if (size > 1) {
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ohk);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ohk);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView.setText(spannableString);
            this.f157176p0.setVisibility(8);
        }
    }

    public final void X6(com.tencent.mm.plugin.remittance.model.r rVar) {
        java.lang.String I;
        this.f157184w.removeAllViews();
        com.tencent.mm.plugin.remittance.model.BusiRemittanceResp busiRemittanceResp = this.L;
        if (busiRemittanceResp != null && !com.tencent.mm.sdk.platformtools.t8.K0(busiRemittanceResp.f156767s)) {
            I = this.L.f156767s;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f157185x)) {
            I = com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(this.A), 6);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.K)) {
                I = getString(com.tencent.mm.R.string.hyz, I, this.K);
            }
        } else {
            I = com.tencent.mm.wallet_core.ui.r1.I(this.f157185x, 6);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.K)) {
                I = getString(com.tencent.mm.R.string.hyz, I, this.K);
            }
        }
        if (U6(this.f157179r) && U6(this.f157180s) && U6(this.f157189y0) && U6(this.f157181t) && U6(this.f157182u) && !com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.e(this.Y) && U6(findViewById(com.tencent.mm.R.id.ohj)) && U6(this.f157176p0)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.a_v, (android.view.ViewGroup) this.f157184w, false);
            this.f157184w.addView(viewGroup);
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) viewGroup.findViewById(com.tencent.mm.R.id.lut);
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f486523lj2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.X)) {
                if (this.W == 1) {
                    cdnImageView.setRoundCorner(true);
                }
                cdnImageView.setUrl(this.X);
            } else if (this.W == 1) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(cdnImageView, this.A);
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(cdnImageView, this.A, null);
            }
            textView.setText(I);
        } else {
            this.f157184w.addView((android.view.ViewGroup) getLayoutInflater().inflate(com.tencent.mm.R.layout.cdz, (android.view.ViewGroup) this.f157184w, false));
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.lut);
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486523lj2);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.hxf);
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486522lj1);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, I));
            cdnImageView2.setVisibility(0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.X)) {
                if (this.W == 1) {
                    cdnImageView2.setRoundCorner(true);
                }
                cdnImageView2.setUrl(this.X);
            } else if (this.W == 1) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(cdnImageView2, this.A);
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(cdnImageView2, this.A, null);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setVisibility(8);
            if (rVar != null) {
                if (rVar.f156986e.f373636n == 1) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    textView3.setVisibility(0);
                    textView3.setText(com.tencent.mm.wallet_core.ui.r1.m(rVar.f156986e.f373633h / 100.0d));
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    textView3.setVisibility(8);
                }
            }
        }
        Z6(this.f157184w);
    }

    public final void Y6(com.tencent.mm.plugin.remittance.model.r rVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(rVar.f156986e.f373638p)) {
            this.f157181t.setVisibility(8);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(rVar.f156986e.f373639q)) {
            this.f157170i.setTextColor(getResources().getColor(com.tencent.mm.R.color.a09));
        } else {
            this.f157170i.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(rVar.f156986e.f373639q, true));
        }
        this.f157170i.setText(rVar.f156986e.f373638p);
        this.f157181t.setVisibility(0);
    }

    public final void Z6(android.view.View view) {
        com.tencent.mm.ui.tools.k8.b(this, (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.mcr), findViewById(com.tencent.mm.R.id.b2x), findViewById(com.tencent.mm.R.id.f483020uh), findViewById(com.tencent.mm.R.id.auj), 32, 0.0f, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "finish this %s %s", this, new com.tencent.mm.sdk.platformtools.z3());
        if (this.f157171l1) {
            return;
        }
        super.finish();
        this.f157171l1 = true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489390ce0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f157165d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486524lj3);
        this.f157166e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lit);
        this.f157167f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.liu);
        this.f157168g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486521lj0);
        this.f157169h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.liw);
        this.f157170i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.liy);
        this.f157179r = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.liz);
        this.f157180s = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.liv);
        this.f157181t = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.lix);
        this.f157172m = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.lio);
        this.f157173n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.liq);
        this.f157174o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lip);
        this.f157175p = (android.widget.Button) findViewById(com.tencent.mm.R.id.lim);
        this.f157182u = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.lin);
        this.f157178q = (android.widget.Button) findViewById(com.tencent.mm.R.id.lir);
        this.f157183v = findViewById(com.tencent.mm.R.id.mza);
        this.f157184w = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.lug);
        this.R = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.dma);
        this.S = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.lis);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.kra)).getPaint(), 0.8f);
        this.f157166e.setText(com.tencent.mm.wallet_core.ui.r1.o(this.B));
        this.f157166e.setTextSize(1, 48.0f);
        this.f157167f.setTextSize(1, 48.0f);
        com.tencent.mm.sdk.platformtools.u3.i(this.f157192z1, 500L);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f157188y)) {
            this.f157179r.setVisibility(8);
        } else {
            this.f157168g.setText(this.f157188y);
            this.f157179r.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f157191z)) {
            this.f157180s.setVisibility(8);
        } else {
            this.f157169h.setText(this.f157191z);
            this.f157180s.setVisibility(0);
        }
        this.f157178q.setOnClickListener(new com.tencent.mm.plugin.remittance.ui.u1(this));
        this.Z = (com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget) findViewById(com.tencent.mm.R.id.a_t);
        this.f157176p0 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.d0g);
        this.f157186x0 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.d0e);
        this.f157189y0 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f486212km3);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "onBackPressed()");
        if (this.F == 65 && this.Q != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS");
            this.Q.send(-1, null);
        } else if (this.E == 71) {
            new com.tencent.mm.autogen.events.BusiF2fPaySuccEvent().e();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1537);
        addSceneEndListener(1680);
        addSceneEndListener(2504);
        addSceneEndListener(4587);
        this.f157187x1.alive();
        if (fp.h.c(21)) {
            if (fp.h.c(23)) {
                getWindow().setStatusBarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
            } else {
                getWindow().setStatusBarColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_93));
            }
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        setBackBtn(null);
        showHomeBtn(false);
        enableBackMenu(false);
        this.f157185x = getIntent().getStringExtra("key_mch_name");
        this.L = (com.tencent.mm.plugin.remittance.model.BusiRemittanceResp) getIntent().getParcelableExtra("BusiRemittanceResp");
        this.B = getIntent().getDoubleExtra("key_money", 0.0d);
        this.A = getIntent().getStringExtra("key_rcver_name");
        this.K = getIntent().getStringExtra("key_rcver_true_name");
        this.f157188y = getIntent().getStringExtra("key_rcv_desc");
        this.f157191z = getIntent().getStringExtra("key_pay_desc");
        this.C = getIntent().getStringExtra("key_f2f_id");
        this.D = getIntent().getStringExtra("key_trans_id");
        this.H = getIntent().getStringExtra("key_rcvr_open_id");
        this.I = getIntent().getStringExtra("key_check_sign");
        getIntent().getStringExtra("key_pay_desc");
        getIntent().getStringExtra("key_rcv_desc");
        getIntent().getIntExtra("key_scan_sceen", 0);
        this.E = getIntent().getIntExtra("key_channel", 0);
        this.G = getIntent().getStringExtra("key_succ_page_extend");
        java.lang.String stringExtra = getIntent().getStringExtra("key_succ_fault_config");
        r45.vo voVar = new r45.vo();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(stringExtra);
            voVar.f388402d = jSONObject.optInt("flag");
            voVar.f388403e = jSONObject.optInt("succpage_first_delay_ms");
            voVar.f388404f = jSONObject.optInt("succpage_max_retry_cnt");
            voVar.f388405g = jSONObject.optInt("succpage_retry_waiting_ms");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBusiF2fPlaceOrder", "createBusiF2FFaultConfigFromJSONObject() Exception: %s", e17.getMessage());
        }
        this.M = voVar;
        this.Q = (android.os.ResultReceiver) getIntent().getParcelableExtra("key_open_result_receiver");
        int intExtra = getIntent().getIntExtra("pay_scene", 0);
        this.F = intExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "mPayScene:%s", java.lang.Integer.valueOf(intExtra));
        int i17 = this.F;
        r45.yr yrVar = this.V;
        if (i17 == 65) {
            try {
                yrVar.parseFrom(getIntent().getByteArrayExtra("AfterPlaceOrderCommReqC2C"));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemittanceBusiResultUI", e18, "parse reqC2C failed", new java.lang.Object[0]);
            }
        } else {
            try {
                this.U.parseFrom(getIntent().getByteArrayExtra("AfterPlaceOrderCommReq"));
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemittanceBusiResultUI", e19, "parse req failed", new java.lang.Object[0]);
            }
        }
        this.W = getIntent().getIntExtra("key_succ_show_avatar_type", 0);
        getIntent().getIntExtra("key_succ_show_avatar_show", 0);
        this.X = getIntent().getStringExtra("key_succ_show_avatar_url");
        this.f157177p1 = getIntent().getStringExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
        this.f157164J = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "fetch data");
        if (this.F == 65) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS，do NetSceneC2CSuccPage");
            doSceneProgress(new com.tencent.mm.plugin.remittance.model.i0(yrVar));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "fetchData() mBusiF2FFaultConfig.flag:%s mBusiF2FFaultConfig.succpage_first_delay_ms:%s", java.lang.Integer.valueOf(this.M.f388402d), java.lang.Integer.valueOf(this.M.f388403e));
            int i18 = this.M.f388402d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (i18 == 1) {
                com.tencent.mm.sdk.platformtools.u3.i(this.T, r0.f388403e);
            } else {
                doSceneProgress(new com.tencent.mm.plugin.remittance.model.r(this.U, this.G, 0, 0, 0L));
            }
        }
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1537);
        removeSceneEndListener(1680);
        removeSceneEndListener(2504);
        removeSceneEndListener(4587);
        this.f157187x1.dead();
        if (this.Y != null) {
            this.Z.j();
        }
        com.tencent.mm.sdk.platformtools.u3.l(this.f157192z1);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f157164J) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBusiResultUI", "do act qry");
            doSceneProgress(new com.tencent.mm.plugin.remittance.model.k(this.C, this.D, this.H, (int) java.lang.Math.round(this.B * 100.0d), null, this.I), false);
            this.f157164J = false;
        }
        if (this.Y != null) {
            this.Z.k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02be  */
    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onSceneEnd(int r17, int r18, java.lang.String r19, com.tencent.mm.modelbase.m1 r20) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):boolean");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity
    public void setContentViewVisibility(int i17) {
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
