package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes9.dex */
public class LuckyMoneyBusiReceiveUIV2 extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {
    public static final java.lang.String H = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.l0g);
    public com.tencent.mm.plugin.luckymoney.model.s5 C;
    public android.widget.ImageView D;
    public android.widget.TextView E;
    public int F;
    public android.widget.ImageView G;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f146023g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f146024h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f146025i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f146026m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f146027n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f146028o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f146029p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f146030q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f146031r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f146032s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f146033t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f146034u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f146036w;

    /* renamed from: y, reason: collision with root package name */
    public int f146038y;

    /* renamed from: z, reason: collision with root package name */
    public long f146039z;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f146035v = null;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f146037x = null;
    public int A = 0;
    public int B = 0;

    public final void V6() {
        boolean z17;
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do receive hb");
        X6();
        com.tencent.mm.plugin.luckymoney.model.s5 s5Var = this.C;
        if (s5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "ReceiveScene == null");
            W6(0, "");
            return;
        }
        if (s5Var.f145623r == 2) {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.v5(this.f146037x, 11, 0, this.f146035v, "v1.0"), false);
            return;
        }
        com.tencent.mm.plugin.luckymoney.model.m5.u(this.f146027n, s5Var.f145619n, null, true);
        com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f146028o, this.C.f145621p);
        com.tencent.mm.plugin.luckymoney.model.s5 s5Var2 = this.C;
        if (s5Var2.f145623r == 1 || (i17 = s5Var2.f145622q) == 4 || i17 == 5 || i17 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 11, 0, 0, 0, 3);
            this.f146032s.setVisibility(8);
            this.f146034u.setVisibility(8);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.C.f145624s)) {
                this.f146030q.setVisibility(8);
            } else {
                this.f146030q.setText(this.C.f145624s);
                this.f146030q.setVisibility(0);
                this.f146030q.setSingleLine(false);
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f146026m.getLayoutParams();
            layoutParams.bottomMargin = com.tencent.mm.sdk.platformtools.j.d(getContext(), 30.0f);
            this.f146026m.setLayoutParams(layoutParams);
            z17 = true;
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(s5Var2.f145624s)) {
                this.f146029p.setText(this.C.f145624s);
                this.f146029p.setVisibility(0);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.C.f145620o)) {
                com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f146030q, this.C.f145620o);
                this.f146030q.setVisibility(0);
                this.f146029p.setVisibility(8);
            }
            this.f146032s.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.x0(this));
            z17 = false;
        }
        if (c01.z1.r().equals(this.f146036w) || (this.A == 1 && z17)) {
            if (this.A == 1) {
                this.f146031r.setText(com.tencent.mm.R.string.f492416gk1);
            }
            android.view.View view = this.f146026m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f146026m.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.y0(this));
        } else {
            android.view.View view2 = this.f146026m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_receive_envelope_url");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_receive_envelope_md5");
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_receive_envelope_widget_url");
        java.lang.String stringExtra4 = getIntent().getStringExtra("key_receive_envelope_widget_md5");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f146025i.getLayoutParams();
            layoutParams2.topMargin = com.tencent.mm.sdk.platformtools.j.d(getContext(), 118.0f);
            this.f146025i.setLayoutParams(layoutParams2);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "has envelopeUrl");
            r45.wv3 wv3Var = new r45.wv3();
            r45.xv3 xv3Var = new r45.xv3();
            wv3Var.f389501g = xv3Var;
            xv3Var.f390479f = stringExtra;
            xv3Var.f390482i = stringExtra2;
            xv3Var.f390485o = stringExtra3;
            xv3Var.f390486p = stringExtra4;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "render envelope");
            ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).aj(this.D, wv3Var, null, 0, 0, 0);
            this.D.setVisibility(0);
            if (this.F == 2) {
                this.E.setVisibility(0);
            } else {
                this.E.setVisibility(8);
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f146025i.getLayoutParams();
            layoutParams3.topMargin = com.tencent.mm.sdk.platformtools.j.d(getContext(), 88.0f);
            this.f146025i.setLayoutParams(layoutParams3);
            com.tencent.mm.plugin.luckymoney.model.m5.D(this.f146030q);
            com.tencent.mm.plugin.luckymoney.model.m5.D(this.f146029p);
            com.tencent.mm.plugin.luckymoney.model.m5.D(this.f146028o);
            r45.xv3 xv3Var2 = wv3Var.f389501g;
            gb3.m.a(2, xv3Var2 != null ? xv3Var2.f390479f : "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.f389501g.f390485o) || com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.f389501g.f390486p)) {
                this.G.setVisibility(8);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f146033t.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = i65.a.b(getContext(), 24);
                    this.f146033t.setLayoutParams(marginLayoutParams);
                }
            } else {
                this.G.post(new com.tencent.mm.plugin.luckymoney.ui.z0(this));
                ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).bj(this.G, wv3Var, null, 0, 0);
                this.G.setVisibility(0);
                com.tencent.mm.plugin.luckymoney.model.m5.A(this.G);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) this.f146033t.getLayoutParams();
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = 0;
                    this.f146033t.setLayoutParams(marginLayoutParams2);
                }
            }
        }
        if (com.tencent.mm.ui.bk.C()) {
            this.f146024h.setBackgroundResource(com.tencent.mm.R.color.BW_0_Alpha_0_8);
            com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_8));
        } else {
            this.f146024h.setBackgroundResource(com.tencent.mm.R.color.f479354x8);
            com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.f479354x8));
        }
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(contentView, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f146023g;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.luckymoney.model.m5.A(this.f146023g);
    }

    public final void W6(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "finishByResult resultCode: %d  errMsg:%s", java.lang.Integer.valueOf(i17), str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_errmsg", str);
        setResult(i17, intent);
        finish();
    }

    public final void X6() {
        android.widget.Button button = this.f146032s;
        if (button == null) {
            return;
        }
        fo3.s.INSTANCE.Tc(button.getId());
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (o17 == null || o17.length() <= 0 || !(o17.equals("zh_CN") || o17.equals("zh_TW") || o17.equals("zh_HK"))) {
            this.f146032s.setBackgroundResource(com.tencent.mm.R.drawable.amv);
            this.f146032s.setText(com.tencent.mm.R.string.gmm);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bv6;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f146023g = findViewById(com.tencent.mm.R.id.j69);
        this.f146024h = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j66);
        this.f146025i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j6u);
        this.f146027n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j67);
        this.f146028o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j68);
        this.f146029p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6_);
        this.f146030q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6c);
        this.f146031r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6d);
        this.f146026m = findViewById(com.tencent.mm.R.id.j6e);
        this.f146032s = (android.widget.Button) findViewById(com.tencent.mm.R.id.j6g);
        this.f146034u = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j6h);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.j6f);
        this.f146033t = weImageView;
        weImageView.setEnableColorFilter(false);
        this.f146033t.setImageResource(com.tencent.mm.R.drawable.alt);
        this.f146033t.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.s0(this));
        this.D = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j5v);
        this.E = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6i);
        this.G = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j5z);
        this.f146029p.setLines(2);
        androidx.core.widget.a0.c(this.f146029p, 1);
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        this.f145973e = false;
        overridePendingTransition(0, 0);
        setTheme(com.tencent.mm.R.style.f494400m2);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        this.f146035v = getIntent().getStringExtra("key_native_url");
        this.f146039z = getIntent().getLongExtra("key_msgid", 0L);
        this.f146038y = getIntent().getIntExtra("key_way", 5);
        this.B = getIntent().getIntExtra("key_static_from_scene", 0);
        this.f146036w = getIntent().getStringExtra("key_username");
        this.f146037x = getIntent().getStringExtra("key_sendid");
        this.A = getIntent().getIntExtra("key_type", 0);
        this.F = getIntent().getIntExtra("key_material_flag", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "mSendId：%s, nativeurl：%s  mWay：%s mSenderName：%s", this.f146037x, this.f146035v, java.lang.Integer.valueOf(this.f146038y), this.f146036w);
        java.lang.String stringExtra = getIntent().getStringExtra("key_lucky_money_busi_receive_resp");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "respStr is null");
            W6(0, "");
        } else {
            try {
                this.C = com.tencent.mm.plugin.luckymoney.model.g5.c(new org.json.JSONObject(stringExtra));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "parse failed :%s", e17.toString());
                W6(0, "");
            }
            com.tencent.mm.plugin.luckymoney.model.s5 s5Var = this.C;
            s5Var.f145616h = this.f146035v;
            s5Var.f145618m = this.f146038y;
            s5Var.f145617i = this.f146037x;
        }
        initView();
        V6();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent == null || !intent.hasExtra("key_is_realname_verify_process")) {
            return;
        }
        if (intent.getIntExtra("realname_verify_process_ret", 0) == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "new intent from realname verify process：succ");
            V6();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "new intent from realname verify process：cancel");
            W6(-1, "");
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "onsceneend, errtype: %s, errcode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        boolean z17 = m1Var instanceof com.tencent.mm.plugin.luckymoney.model.s5;
        java.lang.String str3 = H;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do receive hb resp");
            str2 = str3;
        } else {
            str2 = str3;
            if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.r5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do open hb resp");
                this.f146032s.setVisibility(0);
                com.tencent.mm.plugin.luckymoney.model.m5.H(this.f146034u);
                this.f146032s.setClickable(true);
                X6();
                if (i17 != 0 || i18 != 0) {
                    if (i18 != 416) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do open hb fail", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                        db5.e1.T(this, !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : str2);
                        W6(2, !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : str2);
                        return true;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go to real name");
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUPayUI");
                    bundle.putString("realname_verify_process_jump_plugin", "wallet_payu");
                    this.f146032s.setBackgroundResource(com.tencent.mm.R.drawable.c3t);
                    return com.tencent.mm.plugin.luckymoney.model.m5.d(this, i18, str, m1Var, bundle, false, new com.tencent.mm.plugin.luckymoney.ui.v0(this), new com.tencent.mm.plugin.luckymoney.ui.w0(this), 1005);
                }
                com.tencent.mm.plugin.luckymoney.ui.up.a(getContext(), com.tencent.mm.R.string.f492414gj5);
                com.tencent.mm.plugin.luckymoney.model.r5 r5Var = (com.tencent.mm.plugin.luckymoney.model.r5) m1Var;
                at4.k1 k1Var = new at4.k1();
                k1Var.field_mNativeUrl = this.f146035v;
                com.tencent.mm.plugin.luckymoney.model.e1 e1Var = r5Var.f145590t;
                k1Var.field_hbType = e1Var.f145234d;
                k1Var.field_receiveAmount = e1Var.f145245q;
                k1Var.field_receiveTime = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.luckymoney.model.e1 e1Var2 = r5Var.f145590t;
                k1Var.field_hbStatus = e1Var2.f145235e;
                k1Var.field_receiveStatus = e1Var2.A;
                if (k1Var.field_receiveAmount > 0) {
                    ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().replace(k1Var);
                }
                if (com.tencent.mm.plugin.wallet_core.utils.l0.d(r5Var.f145592v)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "should intercept");
                    setContentViewVisibility(8);
                    new com.tencent.mm.plugin.wallet_core.utils.l0(this).b(r5Var.f145592v, new com.tencent.mm.plugin.luckymoney.ui.t0(this));
                    return true;
                }
                if (r5Var.f145583m == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go luckymoney detail - open");
                    android.content.Intent intent = getIntent();
                    if (intent == null) {
                        intent = new android.content.Intent();
                    }
                    intent.setClass(getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
                    intent.putExtra("key_lucky_money_can_received", true);
                    gb3.l.b(this.f146037x, r5Var.f145590t);
                    intent.putExtra("key_jump_from", 2);
                    intent.putExtra("key_native_url", this.f146035v);
                    intent.putExtra("key_sendid", r5Var.f145581h);
                    intent.putExtra("key_static_from_scene", this.B);
                    intent.putExtra("key_hb_kind", 2);
                    if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PlayCoinSound", 0) > 0) {
                        intent.putExtra("play_sound", true);
                    }
                    com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = r5Var.f145591u;
                    if (realnameGuideHelper != null) {
                        intent.putExtra("key_realname_guide_helper", realnameGuideHelper);
                    }
                    intent.putExtra("key_username", this.f146036w);
                    intent.putExtra("key_from_username", getIntent().getStringExtra("key_from_username"));
                    intent.putExtra("key_msgid", this.f146039z);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 12, 0, 0, 0, 1);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    W6(-1, "");
                    return true;
                }
                this.f146032s.setBackgroundResource(com.tencent.mm.R.drawable.caz);
                this.f146032s.setText(com.tencent.mm.R.string.gmj);
                this.f146032s.setOnClickListener(null);
                this.f146032s.setVisibility(8);
                this.f146034u.setVisibility(8);
                if (com.tencent.mm.sdk.platformtools.t8.K0(r5Var.f145590t.L)) {
                    this.f146029p.setVisibility(8);
                } else {
                    this.f146029p.setText(r5Var.f145590t.L);
                    this.f146029p.setVisibility(0);
                }
                this.f146030q.setText(r5Var.f145590t.f145236f);
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f146026m.getLayoutParams();
                layoutParams.bottomMargin = com.tencent.mm.sdk.platformtools.j.d(getContext(), 30.0f);
                this.f146026m.setLayoutParams(layoutParams);
                if (!c01.z1.r().equals(this.f146036w) && this.A != 1) {
                    android.view.View view = this.f146026m;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return true;
                }
                android.view.View view2 = this.f146026m;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f146026m.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.u0(this, r5Var));
                return true;
            }
            if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.v5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do detail hb resp");
                if (i17 != 0 || i18 != 0) {
                    db5.e1.T(this, !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : str2);
                    W6(2, !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : str2);
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go luckymoney detail - detail");
                com.tencent.mm.plugin.luckymoney.model.v5 v5Var = (com.tencent.mm.plugin.luckymoney.model.v5) m1Var;
                gb3.l.b(this.f146037x, v5Var.f145665h);
                android.content.Intent intent2 = getIntent();
                if (intent2 == null) {
                    intent2 = new android.content.Intent();
                }
                intent2.setClass(getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
                intent2.putExtra("key_lucky_money_can_received", true);
                intent2.putExtra("key_jump_from", 2);
                intent2.putExtra("key_native_url", this.f146035v);
                intent2.putExtra("key_sendid", this.f146037x);
                intent2.putExtra("key_anim_slide", true);
                intent2.putExtra("key_username", this.f146036w);
                java.lang.String stringExtra = getIntent().getStringExtra("key_from_username");
                com.tencent.mm.plugin.luckymoney.model.e1 e1Var3 = v5Var.f145665h;
                if (e1Var3 != null && !com.tencent.mm.sdk.platformtools.t8.K0(e1Var3.Q)) {
                    stringExtra = v5Var.f145665h.Q;
                }
                intent2.putExtra("key_from_username", stringExtra);
                intent2.putExtra("key_way", this.f146038y);
                intent2.putExtra("key_msgid", this.f146039z);
                intent2.putExtra("key_static_from_scene", this.B);
                intent2.putExtra("key_hb_kind", 2);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent2);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                W6(-1, "");
                return true;
            }
        }
        if (i17 == 0 && i18 == 0) {
            return false;
        }
        db5.e1.T(this, !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : str2);
        W6(2, !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : str2);
        return false;
    }
}
