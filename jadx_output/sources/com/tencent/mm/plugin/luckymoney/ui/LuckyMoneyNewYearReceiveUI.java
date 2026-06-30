package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class LuckyMoneyNewYearReceiveUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {
    public static final /* synthetic */ int P = 0;
    public android.widget.ImageView A;
    public android.widget.ImageView B;
    public android.widget.ImageView C;
    public android.view.View D;
    public com.tencent.mm.emoji.view.BaseEmojiView E;
    public java.lang.String G;
    public com.tencent.mm.storage.f9 I;

    /* renamed from: J, reason: collision with root package name */
    public int f146322J;
    public boolean K;
    public com.tencent.mm.api.IEmojiInfo L;
    public java.lang.String M;
    public final com.tencent.mm.feature.emoji.api.q5 N;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f146323g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f146324h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView f146325i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f146326m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f146327n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f146328o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f146329p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f146330q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f146331r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f146332s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f146333t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f146334u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.MMAnimateView f146335v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f146336w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f146337x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f146338y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f146339z = null;
    public int F = 0;
    public java.lang.String H = "";

    public LuckyMoneyNewYearReceiveUI() {
        new com.tencent.mm.sdk.platformtools.n3();
        this.K = false;
        this.N = new com.tencent.mm.plugin.luckymoney.ui.Cif(this);
    }

    public final void V6(int i17) {
        java.lang.StringBuilder sb6;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() localReceiveStatus:%s newStatus:%s", java.lang.Integer.valueOf(this.f146322J), java.lang.Integer.valueOf(i17));
        com.tencent.mm.storage.f9 f9Var = this.I;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() mEmojiInfo == null");
            return;
        }
        int i18 = this.f146322J;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        if (i18 == 2) {
            return;
        }
        try {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(f9Var.j());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            int indexOf = sb7.indexOf("<localreceivestatus>");
            if (indexOf <= 0 || indexOf >= sb7.length()) {
                int indexOf2 = sb7.indexOf("<emoji>");
                if (indexOf2 <= 0 || indexOf2 >= sb7.length()) {
                    int indexOf3 = sb7.indexOf("<wcpayinfo>");
                    sb8.append("<emoji><localreceivestatus>");
                    sb8.append(i17);
                    sb8.append("</localreceivestatus></emoji>");
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder(sb7.substring(0, indexOf3));
                    java.lang.String trim = sb7.substring(indexOf3).trim();
                    sb9.append((java.lang.CharSequence) sb8);
                    sb9.append(trim);
                    sb6 = sb9;
                } else {
                    sb8.append("<localreceivestatus>");
                    sb8.append(i17);
                    sb8.append("</localreceivestatus>");
                    int i19 = indexOf2 + 7;
                    sb6 = new java.lang.StringBuilder(sb7.substring(0, i19));
                    java.lang.String trim2 = sb7.substring(i19).trim();
                    sb6.append((java.lang.CharSequence) sb8);
                    sb6.append(trim2);
                }
            } else {
                sb6 = new java.lang.StringBuilder(sb7.substring(0, indexOf + 20));
                java.lang.String substring = sb7.substring(indexOf + 21);
                sb6.append(i17);
                sb6.append(substring);
            }
            this.I.d1(sb6.toString());
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.I.getMsgId(), this.I);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() success msgXml:%s", sb6);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() Exception:%s", e17.getMessage());
        }
    }

    public final void W6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.f6(i17, i18, str, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), c01.z1.l(), getIntent().getStringExtra("key_username"), "v1.0", str3), false);
    }

    public final void X6(boolean z17) {
        if (!z17) {
            this.f146337x.setVisibility(0);
            this.f146337x.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.hf(this));
            this.f146338y.setText(getString(com.tencent.mm.R.string.gnf));
        } else {
            this.f146337x.setVisibility(0);
            ((android.widget.RelativeLayout.LayoutParams) this.f146337x.getLayoutParams()).addRule(3, com.tencent.mm.R.id.j4h);
            this.f146338y.setText(getString(com.tencent.mm.R.string.gng));
            this.f146337x.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.rf(this));
        }
    }

    public final void Y6() {
        this.f146336w.setVisibility(8);
        com.tencent.mm.api.IEmojiInfo wi6 = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(this.H);
        this.L = wi6;
        if (wi6 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "showExpression() mEmojiInfo == null ");
            return;
        }
        if (com.tencent.mm.vfs.w6.k(wi6.N0()) > 0 || this.L.k() || this.L.I1()) {
            this.E.setVisibility(0);
            this.E.setEmojiInfo(this.L);
            return;
        }
        this.E.setVisibility(8);
        this.f146334u.setVisibility(0);
        this.f146335v.setImageResource(com.tencent.mm.R.raw.lucky_money_newyear_creat_loading);
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).cj(this.N);
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).Zi(this.L);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.buu;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setActionbarColor(-839716110);
        this.f146324h = findViewById(com.tencent.mm.R.id.j4i);
        this.f146325i = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView) findViewById(com.tencent.mm.R.id.j4e);
        this.f146326m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485757iy4);
        this.f146327n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j4p);
        this.f146328o = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j4f);
        this.f146330q = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j4n);
        this.f146331r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j4l);
        this.f146332s = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j4m);
        this.f146329p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j4o);
        this.f146333t = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j4k);
        this.C = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j3p);
        this.D = findViewById(com.tencent.mm.R.id.j3m);
        this.E = (com.tencent.mm.emoji.view.BaseEmojiView) findViewById(com.tencent.mm.R.id.j3f);
        this.f146336w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485801j42);
        this.f146334u = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j3r);
        this.f146335v = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.f485684im5);
        this.f146337x = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iyp);
        this.f146338y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iyq);
        this.f146336w.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.jf(this));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485805j46);
        this.A = imageView;
        imageView.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.kf(this));
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485804j45);
        this.B = imageView2;
        imageView2.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.lf(this));
        setContentViewVisibility(8);
        this.f146339z = db5.e1.Q(getContext(), null, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.luckymoney.ui.mf(this));
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.G = getIntent().getStringExtra("key_username");
        this.H = getIntent().getStringExtra("key_emoji_md5");
        this.I = pt0.f0.Li(this.G, getIntent().getLongExtra("key_msgid", 0L));
        this.f146322J = getIntent().getIntExtra("key_msg_newyear_localreceivestatus", 0);
        this.M = getIntent().getStringExtra("key_native_url");
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "emojiMd5:" + this.H);
        java.lang.String str = this.M;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        try {
            this.f146323g = parse.getQueryParameter("sendid");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "onCreate() Exception:%s", e17.getMessage());
        }
        initView();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f146323g)) {
            finish();
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyNewYearReceiveUI", "sendid null & finish");
            return;
        }
        doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.l6(1, com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("channelid"), 1), this.f146323g, this.M, 1, "v1.0", ""), false);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f146339z;
        if (u3Var != null) {
            u3Var.show();
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f146339z;
        if (u3Var != null && u3Var.isShowing()) {
            this.f146339z.dismiss();
        }
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).cj(null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.K) {
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var;
        int i27;
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.getType());
        if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.l6)) {
            if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.f6)) {
                return false;
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f146339z;
            if (u3Var != null && u3Var.isShowing()) {
                this.f146339z.dismiss();
            }
            if (i17 != 0 || i18 != 0) {
                if (i18 != 416) {
                    db5.e1.G(this, android.text.TextUtils.isEmpty(str) ? getString(com.tencent.mm.R.string.l0g) : str, null, false, new com.tencent.mm.plugin.luckymoney.ui.qf(this));
                    return true;
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f146339z;
                if (u3Var2 != null && u3Var2.isShowing()) {
                    this.f146339z.dismiss();
                }
                this.K = true;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyNewYearReceiveUI");
                bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                return com.tencent.mm.plugin.luckymoney.model.m5.d(this, i18, str, m1Var, bundle, true, null, null, 1004);
            }
            com.tencent.mm.plugin.luckymoney.model.f6 f6Var = (com.tencent.mm.plugin.luckymoney.model.f6) m1Var;
            if (com.tencent.mm.plugin.wallet_core.utils.l0.d(f6Var.f145290u)) {
                setContentViewVisibility(4);
                com.tencent.mm.plugin.wallet_core.utils.l0 l0Var = new com.tencent.mm.plugin.wallet_core.utils.l0(this);
                l0Var.f180921a = true;
                l0Var.b(f6Var.f145290u, new com.tencent.mm.plugin.wallet_core.utils.b0(l0Var));
                return true;
            }
            int i28 = f6Var.f145286q;
            this.F = i28;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (!(i28 == 1)) {
                android.view.View view = this.D;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.C.setVisibility(0);
            }
            com.tencent.mm.plugin.luckymoney.model.e1 e1Var = f6Var.f145280h;
            this.f146331r.setText(e1Var.f145236f);
            java.lang.String o17 = com.tencent.mm.wallet_core.ui.r1.o(f6Var.f145280h.f145245q / 100.0d);
            this.f146325i.setContentDescription(o17);
            this.f146325i.setFinalText(o17);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = this.f146325i;
            luckyMoneyAutoScrollView.f145971x = new com.tencent.mm.plugin.luckymoney.ui.pf(this, f6Var);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.j(luckyMoneyAutoScrollView));
            if (e1Var.f145235e == 4 && !android.text.TextUtils.isEmpty(f6Var.f145280h.f145236f)) {
                this.f146332s.setVisibility(8);
            }
            X6(false);
            setContentViewVisibility(0);
            com.tencent.mm.plugin.luckymoney.model.m5.B(this.f146324h, null);
            V6(2);
            return true;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f146339z;
            if (u3Var3 != null && u3Var3.isShowing()) {
                this.f146339z.dismiss();
            }
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var3 = (com.tencent.mm.plugin.luckymoney.model.l6) m1Var;
        this.F = l6Var3.K;
        if (l6Var3.f145431x == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is Sender hb!");
            if (l6Var3.f145426s != 4) {
                this.f146333t.setVisibility(8);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var4 = this.f146339z;
            if (u3Var4 != null && u3Var4.isShowing()) {
                this.f146339z.dismiss();
            }
            if (l6Var3.f145426s != 5) {
                java.lang.String o18 = com.tencent.mm.wallet_core.ui.r1.o(l6Var3.f145425r / 100.0d);
                this.f146325i.setContentDescription(o18);
                this.f146325i.setFinalText(o18);
                this.f146325i.a();
                com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f146327n, l6Var3.f145430w);
                this.f146330q.setVisibility(8);
                this.f146333t.setVisibility(0);
                if (l6Var3.f145426s == 4) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(this.f146328o, this.G);
                    V6(2);
                } else {
                    this.f146328o.setVisibility(8);
                }
                this.f146329p.setText(l6Var3.f145428u);
                this.f146329p.setTextSize(1, 16.0f);
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f146333t.getLayoutParams();
                layoutParams.bottomMargin = i65.a.b(this, 82);
                this.f146333t.setLayoutParams(layoutParams);
                this.f146333t.invalidate();
            } else {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.j4g);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setText(l6Var3.f145428u);
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setVisibility(0);
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setTextSize(24.0f);
                X6(true);
                V6(1);
            }
            setContentViewVisibility(0);
            com.tencent.mm.plugin.luckymoney.model.m5.B(this.f146324h, null);
            this.A.setVisibility(0);
            this.B.setVisibility(8);
            i19 = 5;
            l6Var = l6Var3;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is receiver hb!");
            if (!android.text.TextUtils.isEmpty(getIntent().getStringExtra("key_username"))) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(this.f146328o, getIntent().getStringExtra("key_username"));
            } else if (!android.text.TextUtils.isEmpty(l6Var3.f145424q)) {
                com.tencent.mm.plugin.luckymoney.model.m5.b(this.f146328o, l6Var3.f145424q, l6Var3.f145433z);
            }
            this.f146329p.setTextSize(1, 16.0f);
            com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f146329p, l6Var3.f145422o + getString(com.tencent.mm.R.string.f492432gm5));
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f146333t.getLayoutParams();
            layoutParams2.bottomMargin = i65.a.b(this, 30);
            this.f146333t.setLayoutParams(layoutParams2);
            this.f146333t.invalidate();
            this.f146333t.setVisibility(0);
            this.f146330q.setVisibility(8);
            if (l6Var3.f145427t != 0 || (i27 = l6Var3.f145426s) == 4 || i27 == 5 || i27 == 1) {
                i19 = 5;
                l6Var = l6Var3;
                com.tencent.mm.ui.widget.dialog.u3 u3Var5 = this.f146339z;
                if (u3Var5 != null && u3Var5.isShowing()) {
                    this.f146339z.dismiss();
                }
                if (l6Var.f145426s != 5) {
                    java.lang.String o19 = com.tencent.mm.wallet_core.ui.r1.o(l6Var.f145425r / 100.0d);
                    this.f146325i.setContentDescription(o19);
                    this.f146325i.setFinalText(o19);
                    this.f146325i.a();
                    com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f146327n, l6Var.f145430w);
                    V6(2);
                    X6(false);
                } else {
                    this.f146337x.setVisibility(8);
                    android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.j4g);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setText(l6Var.f145428u);
                    ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setVisibility(0);
                    ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j4h)).setTextSize(24.0f);
                    V6(1);
                }
                setContentViewVisibility(0);
                com.tencent.mm.plugin.luckymoney.model.m5.B(this.f146324h, null);
            } else {
                if ("0".equals(l6Var3.C)) {
                    com.tencent.mm.plugin.luckymoney.model.r4 r4Var = this.f145972d;
                    java.lang.String str2 = l6Var3.D;
                    java.lang.String str3 = l6Var3.E;
                    java.lang.String str4 = l6Var3.F;
                    java.lang.String str5 = l6Var3.G;
                    com.tencent.mm.plugin.luckymoney.ui.nf nfVar = new com.tencent.mm.plugin.luckymoney.ui.nf(this, l6Var3);
                    zs4.q qVar = new zs4.q();
                    qVar.f475313e = new java.lang.ref.WeakReference(this);
                    qVar.f475314f = new java.lang.ref.WeakReference(r4Var);
                    java.lang.ref.WeakReference weakReference = qVar.f475313e;
                    if (weakReference == null || weakReference.get() == null) {
                        i19 = 5;
                        l6Var2 = l6Var3;
                    } else {
                        qVar.f475312d = nfVar;
                        java.lang.String str6 = str2 + str3;
                        com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(this);
                        b4Var.f180146d = new zs4.g(qVar, 1005, str4, this);
                        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                        android.text.SpannableString i29 = com.tencent.mm.pluginsdk.ui.span.c0.i(this, str6);
                        android.text.SpannableString spannableString = new android.text.SpannableString(i29);
                        spannableString.setSpan(b4Var, i29.length() - str3.length(), i29.length(), 33);
                        android.widget.TextView textView = new android.widget.TextView(this);
                        textView.setText(spannableString);
                        textView.setTextSize(0, i65.a.h(this, com.tencent.mm.R.dimen.f479853h2));
                        textView.setTextColor(getResources().getColorStateList(com.tencent.mm.R.color.a0c));
                        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                        com.tencent.mm.wallet_core.ui.r1.r0(0, 1, com.tencent.mm.sdk.platformtools.t8.i1(), 1005);
                        i19 = 5;
                        l6Var2 = l6Var3;
                        qVar.f475315g = db5.e1.r(this, "", textView, str5, getString(com.tencent.mm.R.string.f490347sg), new zs4.h(qVar, 1005), new zs4.i(qVar, 1005));
                    }
                } else {
                    i19 = 5;
                    l6Var2 = l6Var3;
                    W6(l6Var2.f145418h, l6Var2.f145419i, l6Var2.f145420m, l6Var2.f145421n, l6Var2.P);
                }
                l6Var = l6Var2;
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f146330q.getLayoutParams();
            layoutParams3.topMargin = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a5_);
            this.f146330q.setLayoutParams(layoutParams3);
            this.f146330q.invalidate();
            this.f146331r.setTextSize(1, 12.0f);
            this.A.setVisibility(8);
            this.B.setVisibility(0);
        }
        int i37 = l6Var.f145426s;
        boolean z18 = (i37 == i19 || i37 == 1) ? false : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "receiveScene.hbStatus is " + l6Var.f145426s + ", isValidStatus is " + z18);
        int i38 = this.F;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        boolean z27 = (i38 == 1) && !com.tencent.mm.sdk.platformtools.t8.K0(this.H);
        if (z27 && z18) {
            android.view.View view2 = this.D;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.C.setVisibility(8);
            Y6();
        } else {
            android.view.View view3 = this.D;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.C.setVisibility(0);
        }
        if (z27 && z18) {
            this.f146327n.setTextSize(1, 21.0f);
            this.f146326m.setTextSize(1, 15.0f);
            this.f146325i.c(getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a58), getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480553a56));
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) this.f146325i.getLayoutParams();
            layoutParams4.topMargin = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480547a50);
            this.f146325i.setLayoutParams(layoutParams4);
            this.f146325i.invalidate();
        } else {
            this.f146327n.setTextSize(1, 21.0f);
            this.f146326m.setTextSize(1, 18.0f);
            this.f146325i.c(getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a59), getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a57));
            this.f146325i.invalidate();
        }
        return true;
    }
}
