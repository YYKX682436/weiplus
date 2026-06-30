package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes9.dex */
public class LuckyMoneyBusiReceiveUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f146005J = 0;
    public int D;
    public com.tencent.mm.plugin.luckymoney.model.s5 G;
    public com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper H;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f146006g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f146007h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f146008i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f146009m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f146010n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f146011o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f146012p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f146013q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f146014r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f146015s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f146016t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f146017u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f146018v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f146019w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.Button f146020x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f146021y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.CheckBox f146022z;
    public com.tencent.mm.ui.widget.dialog.u3 A = null;
    public java.lang.String B = null;
    public java.lang.String C = null;
    public int E = 0;
    public int F = 0;
    public boolean I = false;

    public void V6() {
        this.A = db5.e1.Q(getContext(), null, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.luckymoney.ui.h0(this));
        int i17 = this.D;
        if (i17 == 3) {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.q5(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 3), false);
        } else if (i17 == 4) {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.q5(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), 4, getIntent().getStringExtra("key_wxapi_sign"), getIntent().getStringExtra("key_wxapi_package_name")), false);
        } else {
            try {
                java.lang.String str = this.B;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                this.C = android.net.Uri.parse(str).getQueryParameter("sendid");
            } catch (java.lang.Exception unused) {
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
                finish();
                com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyBusiReceiveUI", "sendid null & finish");
            } else {
                doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.s5(this.C, this.B, this.D, getIntent().getStringExtra("packageExt")), false);
            }
        }
        W6(0, "");
    }

    public final void W6(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "markResult resultCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_errmsg", str);
        setResult(i17, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.I) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "finish from normalBusiLuckyMoney");
            overridePendingTransition(com.tencent.mm.R.anim.f477902eq, 0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489240bu3;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f146015s = findViewById(com.tencent.mm.R.id.iy_);
        this.f146006g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.iyd);
        this.f146007h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iye);
        this.f146009m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iya);
        this.f146008i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iyi);
        this.f146010n = (android.widget.Button) findViewById(com.tencent.mm.R.id.iyb);
        this.f146011o = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j6h);
        this.f146012p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.iyl);
        this.f146013q = findViewById(com.tencent.mm.R.id.iy9);
        this.f146014r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iy8);
        this.f146016t = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.iym);
        this.f146017u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iyk);
        this.f146018v = findViewById(com.tencent.mm.R.id.iyf);
        this.f146019w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iyg);
        this.f146020x = (android.widget.Button) findViewById(com.tencent.mm.R.id.iyn);
        this.f146021y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iyc);
        this.f146022z = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.iyo);
        this.f146012p.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.i0(this));
        setContentViewVisibility(8);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 2) {
                W6(i18, intent != null ? intent.getStringExtra("key_result_errmsg") : "");
                finish();
            }
        } else if (i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 12, 0, 0, 0, 3, stringExtra);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.n6(stringExtra, this.C, 1, "v1.0"));
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.B = getIntent().getStringExtra("key_native_url");
        this.D = getIntent().getIntExtra("key_way", 5);
        this.F = getIntent().getIntExtra("key_static_from_scene", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nativeurl=");
        java.lang.String str = this.B;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", mWay=");
        sb6.append(this.D);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", sb6.toString());
        V6();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 10, 0, 0, 0, 1);
        initView();
        addSceneEndListener(980);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.A;
        if (u3Var != null && u3Var.isShowing()) {
            this.A.dismiss();
        }
        removeSceneEndListener(980);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent == null || !intent.hasExtra("key_is_realname_verify_process")) {
            return;
        }
        if (intent.getIntExtra("realname_verify_process_ret", 0) == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process succ");
            V6();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process cancel");
            W6(-1, "");
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        com.tencent.mm.plugin.luckymoney.model.h0 h0Var;
        com.tencent.mm.plugin.luckymoney.model.h0 h0Var2;
        int i19;
        com.tencent.mm.plugin.luckymoney.model.h0 h0Var3;
        if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.s5) {
            if (i17 == 0 && i18 == 0) {
                this.G = (com.tencent.mm.plugin.luckymoney.model.s5) m1Var;
                at4.k1 k1Var = new at4.k1();
                k1Var.field_mNativeUrl = this.B;
                com.tencent.mm.plugin.luckymoney.model.s5 s5Var = this.G;
                k1Var.field_hbType = s5Var.f145630y;
                k1Var.field_hbStatus = s5Var.f145622q;
                k1Var.field_receiveStatus = s5Var.f145623r;
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().replace(k1Var);
                com.tencent.mm.plugin.luckymoney.model.s5 s5Var2 = this.G;
                this.C = s5Var2.f145617i;
                this.E = s5Var2.f145630y;
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(13050, java.lang.Integer.valueOf(this.F), 1, this.G.f145628w);
                if (com.tencent.mm.plugin.luckymoney.model.m5.v() && (h0Var3 = this.G.B) != null && h0Var3.f145304d != 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "is not atomic luckymoney, go to LuckyMoneyBusiReceiveUIV2");
                    this.I = true;
                    android.content.Intent intent = getIntent();
                    if (intent == null) {
                        intent = new android.content.Intent();
                    }
                    intent.putExtra("key_sendid", this.C);
                    intent.putExtra("key_type", this.E);
                    intent.putExtra("key_lucky_money_busi_receive_resp", this.G.f145631z);
                    intent.setClass(getContext(), com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUPayUI.class);
                    startActivityForResult(intent, 2);
                    setContentViewVisibility(8);
                    return true;
                }
                this.I = false;
                if (this.G.f145623r == 2) {
                    W6(-1, "");
                    doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.v5(this.C, 11, 0, this.B, "v1.0"), false);
                } else {
                    com.tencent.mm.ui.widget.dialog.u3 u3Var = this.A;
                    if (u3Var != null && u3Var.isShowing()) {
                        this.A.hide();
                    }
                    com.tencent.mm.plugin.luckymoney.model.m5.u(this.f146006g, this.G.f145619n, null, true);
                    com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f146007h, this.G.f145621p);
                    com.tencent.mm.plugin.luckymoney.model.m5.u(this.f146016t, this.G.f145625t, null, false);
                    com.tencent.mm.plugin.luckymoney.model.s5 s5Var3 = this.G;
                    if (s5Var3.f145623r == 1 || (i19 = s5Var3.f145622q) == 4 || i19 == 5 || i19 == 1) {
                        g0Var.d(11701, 11, 0, 0, 0, 3);
                        this.f146008i.setVisibility(4);
                        this.f146009m.setText(this.G.f145624s);
                        this.f146010n.setVisibility(8);
                        this.f146011o.setVisibility(8);
                        if (this.E == 1) {
                            this.f146017u.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.k0(this));
                            this.f146017u.setVisibility(0);
                        } else {
                            this.f146017u.setVisibility(8);
                        }
                    } else {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(s5Var3.f145628w)) {
                            com.tencent.mm.plugin.luckymoney.model.s5 s5Var4 = this.G;
                            java.lang.String str2 = s5Var4.f145628w;
                            if (s5Var4.f145629x == 1) {
                                this.f146022z.setVisibility(8);
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "show checkbox for " + this.G.f145628w);
                                if (this.G.f145626u == 1) {
                                    this.f146022z.setChecked(true);
                                } else {
                                    this.f146022z.setChecked(false);
                                }
                                this.f146022z.setText(this.G.f145627v);
                            }
                        }
                        this.f146010n.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.j0(this));
                        if (com.tencent.mm.sdk.platformtools.t8.K0(this.G.f145624s)) {
                            this.f146008i.setVisibility(8);
                        } else {
                            this.f146008i.setText(this.G.f145624s);
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(this.G.f145620o)) {
                            this.f146009m.setVisibility(8);
                        } else {
                            this.f146009m.setText(this.G.f145620o);
                        }
                    }
                    com.tencent.mm.plugin.luckymoney.model.m5.B(this.f146015s, null);
                    android.view.View contentView = getContentView();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                return true;
            }
        } else if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.r5) {
            this.f146010n.setVisibility(0);
            com.tencent.mm.plugin.luckymoney.model.m5.H(this.f146011o);
            if (i17 == 0 && i18 == 0) {
                W6(-1, "");
                com.tencent.mm.plugin.luckymoney.model.r5 r5Var = (com.tencent.mm.plugin.luckymoney.model.r5) m1Var;
                at4.k1 k1Var2 = new at4.k1();
                k1Var2.field_mNativeUrl = this.B;
                com.tencent.mm.plugin.luckymoney.model.e1 e1Var = r5Var.f145590t;
                k1Var2.field_hbType = e1Var.f145234d;
                k1Var2.field_receiveAmount = e1Var.f145245q;
                k1Var2.field_receiveTime = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.luckymoney.model.e1 e1Var2 = r5Var.f145590t;
                k1Var2.field_hbStatus = e1Var2.f145235e;
                k1Var2.field_receiveStatus = e1Var2.A;
                if (k1Var2.field_receiveAmount > 0) {
                    ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().replace(k1Var2);
                }
                if (com.tencent.mm.plugin.wallet_core.utils.l0.d(r5Var.f145592v)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "should intercept");
                    setContentViewVisibility(8);
                    new com.tencent.mm.plugin.wallet_core.utils.l0(this).b(r5Var.f145592v, new com.tencent.mm.plugin.luckymoney.ui.l0(this));
                    return true;
                }
                if (r5Var.f145583m != 2) {
                    this.f146008i.setVisibility(4);
                    this.f146009m.setText(r5Var.f145584n);
                    this.f146010n.setVisibility(8);
                    this.f146011o.setVisibility(8);
                    if (this.E != 1) {
                        this.f146017u.setVisibility(8);
                        return true;
                    }
                    this.f146017u.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.r0(this, r5Var));
                    this.f146017u.setVisibility(0);
                    return true;
                }
                if (r5Var.f145587q <= 1 || !((h0Var = r5Var.f145588r) == null || h0Var.f145304d == 1)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "can not atomic go detail");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_sendid", r5Var.f145581h);
                    intent2.putExtra("key_static_from_scene", this.F);
                    com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = r5Var.f145591u;
                    if (realnameGuideHelper != null) {
                        intent2.putExtra("key_realname_guide_helper", realnameGuideHelper);
                    }
                    try {
                        intent2.putExtra("key_detail_info", r5Var.f145590t.toByteArray());
                        intent2.putExtra("key_jump_from", 2);
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyBusiReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + e17.getLocalizedMessage());
                    }
                    if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PlayCoinSound", 0) > 0) {
                        z17 = true;
                        intent2.putExtra("play_sound", true);
                    } else {
                        z17 = true;
                    }
                    j45.l.j(getContext(), "luckymoney", ".ui.LuckyMoneyBusiDetailUI", intent2, null);
                    finish();
                    return z17;
                }
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.iyj);
                android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, -findViewById.getHeight());
                translateAnimation.setDuration(400L);
                translateAnimation.setFillAfter(true);
                translateAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.ui.m0(this, findViewById));
                findViewById.startAnimation(translateAnimation);
                this.f146014r.setText(com.tencent.mm.wallet_core.ui.r1.o(r5Var.f145586p / 100.0d));
                this.f146007h.setText(r5Var.f145582i);
                this.f146008i.setVisibility(8);
                this.f146009m.setVisibility(8);
                android.view.View view = this.f146013q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f146010n.setVisibility(8);
                this.f146011o.setVisibility(8);
                this.f146020x.setText(!com.tencent.mm.sdk.platformtools.t8.K0(r5Var.f145589s) ? r5Var.f145589s : getString(com.tencent.mm.R.string.gnx));
                this.f146021y.setVisibility(0);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 12, 0, 0, 0, 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "totalNum:" + r5Var.f145587q);
                if (r5Var.f145587q > 1 || ((h0Var2 = r5Var.f145588r) != null && h0Var2.f145304d == 1)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "can atomic");
                    this.H = r5Var.f145591u;
                    this.f146020x.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.p0(this, r5Var));
                } else {
                    this.f146020x.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.q0(this));
                }
                this.f146020x.setVisibility(0);
                return true;
            }
            if (i18 == 416) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.A;
                if (u3Var2 != null && u3Var2.isShowing()) {
                    this.A.hide();
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiReceiveUI");
                bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                this.f146010n.setBackgroundResource(com.tencent.mm.R.drawable.c3t);
                return com.tencent.mm.plugin.luckymoney.model.m5.d(this, i18, str, m1Var, bundle, false, new com.tencent.mm.plugin.luckymoney.ui.f0(this), new com.tencent.mm.plugin.luckymoney.ui.g0(this), 1005);
            }
        } else {
            if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.n6) {
                if (i17 != 0 || i18 != 0) {
                    db5.e1.T(this, str);
                    return true;
                }
                db5.e1.T(this, getString(com.tencent.mm.R.string.fw6));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 12, 0, 0, 0, 4);
                finish();
                return true;
            }
            if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.q5) {
                if (i17 == 0 && i18 == 0) {
                    doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.s5(this.C, this.B, this.D, getIntent().getStringExtra("packageExt")));
                    return true;
                }
            } else if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.v5) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.A;
                if (u3Var3 != null && u3Var3.isShowing()) {
                    this.A.hide();
                }
                if (i17 == 0 && i18 == 0) {
                    com.tencent.mm.plugin.luckymoney.model.v5 v5Var = (com.tencent.mm.plugin.luckymoney.model.v5) m1Var;
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.setClass(getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.class);
                    try {
                        intent3.putExtra("key_detail_info", v5Var.f145665h.toByteArray());
                        intent3.putExtra("key_jump_from", 2);
                    } catch (java.io.IOException e18) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyBusiReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + e18.getLocalizedMessage());
                    }
                    intent3.putExtra("key_native_url", this.B);
                    intent3.putExtra("key_sendid", this.C);
                    intent3.putExtra("key_static_from_scene", this.F);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent3);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    finish();
                    return true;
                }
            }
        }
        if (i17 == 0 && i18 == 0) {
            return false;
        }
        W6(2, str);
        return false;
    }
}
