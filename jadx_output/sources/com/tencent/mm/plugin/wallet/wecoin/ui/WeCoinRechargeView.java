package com.tencent.mm.plugin.wallet.wecoin.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WeCoinRechargeView extends com.tencent.mm.ui.MMActivity {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f179184w = 0;

    /* renamed from: d, reason: collision with root package name */
    public ms4.o0 f179185d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f179186e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f179187f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f179188g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f179189h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f179190i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f179191m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f179192n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f179193o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView f179194p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f179195q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f179196r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f179197s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f179198t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f179199u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f179200v;

    public static final void T6(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        ms4.o0 o0Var = weCoinRechargeView.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var.f331095q = true;
        js4.n nVar = new js4.n();
        nVar.f301543a = 0;
        nVar.f301546d = new ns4.i3(weCoinRechargeView);
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(weCoinRechargeView.getContext(), nVar);
    }

    public static final void U6(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        r45.ia7 ia7Var;
        ms4.o0 o0Var = weCoinRechargeView.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        ms4.k0 k0Var = (ms4.k0) o0Var.f331092n.getValue();
        if (k0Var == null || (ia7Var = k0Var.f331056a) == null) {
            return;
        }
        ms4.o0 o0Var2 = weCoinRechargeView.f179185d;
        if (o0Var2 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var2.O6(9);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(weCoinRechargeView.getContext(), 2, 0);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(weCoinRechargeView.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        android.widget.TextView textView = new android.widget.TextView(weCoinRechargeView.getContext());
        linearLayout.addView(textView);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = i65.a.f(weCoinRechargeView.getContext(), com.tencent.mm.R.dimen.f479718db);
        layoutParams.bottomMargin = i65.a.f(weCoinRechargeView.getContext(), com.tencent.mm.R.dimen.f479704cz);
        textView.setTextColor(weCoinRechargeView.getResources().getColor(com.tencent.mm.R.color.f478719fa));
        textView.setTextSize(1, 17.0f);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText(ia7Var.f376896d);
        textView.setLayoutParams(layoutParams);
        android.widget.ScrollView scrollView = new android.widget.ScrollView(weCoinRechargeView.getContext());
        linearLayout.addView(scrollView);
        scrollView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        scrollView.setVerticalScrollBarEnabled(false);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(weCoinRechargeView.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        java.util.Iterator it = ia7Var.f376897e.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.widget.TextView textView2 = new android.widget.TextView(weCoinRechargeView.getContext());
            linearLayout2.addView(textView2);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutParams2.bottomMargin = i65.a.f(weCoinRechargeView.getContext(), com.tencent.mm.R.dimen.f479738dv);
            textView2.setTextColor(weCoinRechargeView.getResources().getColor(com.tencent.mm.R.color.f478872ji));
            textView2.setTextSize(1, 17.0f);
            textView2.setText(str);
            textView2.setLayoutParams(layoutParams2);
        }
        scrollView.addView(linearLayout2);
        z2Var.j(linearLayout);
        z2Var.y(weCoinRechargeView.getString(com.tencent.mm.R.string.l_6));
        z2Var.x(1);
        z2Var.F = new ns4.h3(weCoinRechargeView, z2Var);
        z2Var.C();
    }

    public final void V6(java.lang.Boolean bool) {
        android.widget.Button button = this.f179196r;
        if (button == null) {
            kotlin.jvm.internal.o.o("mWeCoinRechargeButton");
            throw null;
        }
        button.setEnabled(true);
        if (com.tencent.mm.sdk.platformtools.a0.c()) {
            android.widget.Button button2 = this.f179196r;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("mWeCoinRechargeButton");
                throw null;
            }
            button2.setVisibility(4);
        }
        android.widget.Button button3 = this.f179196r;
        if (button3 != null) {
            button3.setOnClickListener(new ns4.l3(this));
        } else {
            kotlin.jvm.internal.o.o("mWeCoinRechargeButton");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487951ce;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.TextView textView;
        setContentViewVisibility(0);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478545af));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.pjy);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f179186e = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ph8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f179187f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.pkk);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f179188g = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ph6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f179195q = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.pkq);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f179197s = (android.widget.TextView) findViewById5;
        java.lang.String E = com.tencent.mm.wallet_core.ui.r1.E(0);
        try {
            textView = this.f179195q;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeCoinRechargeView", "setTypeface() Exception:%s", e17.getMessage());
        }
        if (textView == null) {
            kotlin.jvm.internal.o.o("mWeCoinBalanceView");
            throw null;
        }
        textView.setTypeface(android.graphics.Typeface.createFromAsset(getContext().getAssets(), E));
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f487641pa4);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f179194p = (com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.pcr);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById7;
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f179194p;
        if (wcPayMoneyLoadingView == null) {
            kotlin.jvm.internal.o.o("mBalanceView");
            throw null;
        }
        wcPayMoneyLoadingView.setLoadingPb(progressBar);
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView2 = this.f179194p;
        if (wcPayMoneyLoadingView2 == null) {
            kotlin.jvm.internal.o.o("mBalanceView");
            throw null;
        }
        wcPayMoneyLoadingView2.setPrefixSymbol(getString(com.tencent.mm.R.string.kyi));
        androidx.lifecycle.o mo133getLifecycle = mo133getLifecycle();
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView3 = this.f179194p;
        if (wcPayMoneyLoadingView3 == null) {
            kotlin.jvm.internal.o.o("mBalanceView");
            throw null;
        }
        mo133getLifecycle.a(wcPayMoneyLoadingView3);
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.f487721pk3);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f179189h = (android.widget.LinearLayout) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.f487722pk4);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById9).getPaint(), 0.8f);
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.f487723pk5);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f179190i = (android.widget.LinearLayout) findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.pk6);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f179191m = (android.widget.TextView) findViewById11;
        android.widget.LinearLayout linearLayout = this.f179190i;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("mTutorialClickLl");
            throw null;
        }
        linearLayout.setOnClickListener(new ns4.y2(this));
        android.widget.TextView textView2 = this.f179191m;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("mTutorialClickTv");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.pk7);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f179192n = (android.widget.LinearLayout) findViewById12;
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.pk8);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f179193o = (android.widget.TextView) findViewById13;
        android.widget.LinearLayout linearLayout2 = this.f179192n;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("mCloseClickLl");
            throw null;
        }
        linearLayout2.setOnClickListener(new ns4.z2(this));
        android.widget.TextView textView3 = this.f179193o;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("mCloseClickTv");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        hideActionbarLine();
        setBackBtn(new ns4.a3(this));
        setMMTitle("");
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.pkl);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f179196r = (android.widget.Button) findViewById14;
        getWindow().getDecorView().post(new ns4.b3(this));
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView4 = this.f179194p;
        if (wcPayMoneyLoadingView4 == null) {
            kotlin.jvm.internal.o.o("mBalanceView");
            throw null;
        }
        wcPayMoneyLoadingView4.e("0", false);
        V6(java.lang.Boolean.FALSE);
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.pkn);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f179198t = findViewById15;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById15, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById15.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById15, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.pkp);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.f179199u = (android.widget.TextView) findViewById16;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = this.f179198t;
        if (view == null) {
            kotlin.jvm.internal.o.o("wecoin_subscription_list");
            throw null;
        }
        ((cy1.a) rVar).pk(view, "pay_coin_service_notice");
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view2 = this.f179198t;
        if (view2 != null) {
            ((cy1.a) rVar2).ik(view2, 8, 25955);
        } else {
            kotlin.jvm.internal.o.o("wecoin_subscription_list");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ms4.o0 o0Var = this.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var.O6(8);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        r45.hs3 hs3Var = null;
        androidx.lifecycle.c1 a17 = androidx.lifecycle.k1.a(this, null).a(ms4.o0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ms4.o0 o0Var = (ms4.o0) a17;
        this.f179185d = o0Var;
        o0Var.f331085d.observe(this, new ns4.p2(this));
        ms4.o0 o0Var2 = this.f179185d;
        if (o0Var2 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var2.f331087f.observe(this, new ns4.q2(this));
        ms4.o0 o0Var3 = this.f179185d;
        if (o0Var3 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var3.f331086e.observe(this, new ns4.r2(this));
        ms4.o0 o0Var4 = this.f179185d;
        if (o0Var4 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var4.f331089h.observe(this, new ns4.s2(this));
        ms4.o0 o0Var5 = this.f179185d;
        if (o0Var5 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var5.f331088g.observe(this, new ns4.t2(this));
        ms4.o0 o0Var6 = this.f179185d;
        if (o0Var6 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var6.f331091m.observe(this, new ns4.u2(this));
        ms4.o0 o0Var7 = this.f179185d;
        if (o0Var7 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var7.f331090i.observe(this, new ns4.v2(this));
        ms4.o0 o0Var8 = this.f179185d;
        if (o0Var8 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var8.f331092n.observe(this, new ns4.w2(this));
        ms4.o0 o0Var9 = this.f179185d;
        if (o0Var9 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var9.f331094p.observe(this, new ns4.x2(this));
        ms4.o0 o0Var10 = this.f179185d;
        if (o0Var10 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var10.f331097s.observe(this, new ns4.n2(this));
        ms4.o0 o0Var11 = this.f179185d;
        if (o0Var11 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var11.f331096r.observe(this, new ns4.o2(this));
        ms4.o0 o0Var12 = this.f179185d;
        if (o0Var12 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WECOIN_PAGE_INFO_RESPONSE_STRING_SYNC, "");
        if (!(str == null || str.length() == 0)) {
            r45.hs3 hs3Var2 = new r45.hs3();
            byte[] bytes = str.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            try {
                hs3Var2.parseFrom(bytes);
                hs3Var = hs3Var2;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        if (hs3Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeViewModel", "load wecoin page info snapshot");
            os4.h.k("MicroMsg.WeCoinRechargeViewModel", hs3Var);
            o0Var12.f331087f.postValue(new ms4.j(hs3Var.f376420h, hs3Var.f376417e));
            o0Var12.f331086e.postValue(java.lang.Long.valueOf(hs3Var.f376416d));
            o0Var12.f331088g.postValue(hs3Var.f376421i);
            o0Var12.f331089h.postValue(hs3Var.f376418f);
            o0Var12.f331092n.postValue(new ms4.k0(hs3Var.f376423n, hs3Var.f376424o));
            o0Var12.f331090i.postValue(hs3Var.f376422m);
            o0Var12.f331093o = hs3Var;
            o0Var12.f331094p.postValue(java.lang.Boolean.valueOf(((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).c()));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ms4.o0 o0Var = this.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        r45.hs3 hs3Var = o0Var.f331093o;
        if (hs3Var != null) {
            pm0.v.K(null, new os4.f(hs3Var));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f179185d == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WECOIN_PAGE_HAS_SHOW_TUTORIAL_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        ((java.lang.Boolean) m17).booleanValue();
        ms4.o0 o0Var = this.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        ms4.j0.f331046e.b(this, new ms4.n0(o0Var));
        ms4.o0 o0Var2 = this.f179185d;
        if (o0Var2 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var2.N6(1, 0, "");
        new ks4.f().l().h(new ms4.m0(o0Var2)).f(this);
    }
}
