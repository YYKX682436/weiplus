package com.tencent.mm.plugin.honey_pay.ui;

/* loaded from: classes9.dex */
public class HoneyPayReceiveCardUI extends com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI {
    public static final /* synthetic */ int E = 0;
    public int C;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f142365f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f142366g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f142367h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f142368i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f142369m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f142370n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f142371o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f142372p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f142373q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f142374r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f142375s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f142376t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.CheckBox f142377u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f142378v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f142379w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f142380x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f142381y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f142382z;
    public java.lang.String A = "";
    public boolean B = false;
    public final com.tencent.mm.pluginsdk.ui.span.z D = new v73.g1(this);

    public final void V6(r45.tg5 tg5Var) {
        W6(tg5Var);
        r45.cx3 cx3Var = tg5Var.f386407f;
        if (cx3Var != null) {
            setMMTitle(cx3Var.f371892p);
        }
        this.f142381y.setBannerData(tg5Var.f386411m);
        this.f142381y.setBgColor(getResources().getColor(com.tencent.mm.R.color.f478526a7));
        this.f142381y.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
    }

    public final void W6(r45.tg5 tg5Var) {
        r45.cx3 cx3Var = tg5Var.f386407f;
        if (cx3Var == null) {
            return;
        }
        this.f142370n.setText(cx3Var.f371896t);
        android.widget.TextView textView = this.f142372p;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        java.lang.String str = cx3Var.f371893q;
        float textSize = this.f142372p.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        android.widget.TextView textView2 = this.f142372p;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        java.lang.String str2 = cx3Var.f371893q;
        float textSize2 = this.f142372p.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str2, textSize2));
        android.text.SpannableString spannableString = new android.text.SpannableString(getString(com.tencent.mm.R.string.fxf) + " " + com.tencent.mm.wallet_core.ui.r1.m(cx3Var.f371885f / 100));
        com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan wcPayTextApppearanceSpan = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(null, 0, -1, null, null);
        wcPayTextApppearanceSpan.f180847d = com.tencent.mm.wallet_core.ui.r1.F(this, 4);
        spannableString.setSpan(wcPayTextApppearanceSpan, getString(com.tencent.mm.R.string.fxf).length(), spannableString.length(), 18);
        this.f142373q.setText(spannableString);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("click_help", true);
        this.f142374r.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).ij(getContext(), cx3Var.f371895s, (int) this.f142374r.getTextSize(), 1, bundle));
        this.f142374r.setClickable(true);
        this.f142374r.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        if (com.tencent.mm.sdk.platformtools.t8.K0(tg5Var.f386408g)) {
            this.f142368i.setVisibility(8);
        } else {
            com.tencent.mm.plugin.wallet_core.ui.d7 d7Var = new com.tencent.mm.plugin.wallet_core.ui.d7(7, new v73.j1(this, tg5Var), true);
            android.text.SpannableString spannableString2 = new android.text.SpannableString(tg5Var.f386408g);
            spannableString2.setSpan(d7Var, 0, spannableString2.length(), 18);
            com.tencent.mm.wallet_core.ui.r1.d(this.f142368i);
            this.f142368i.setText(spannableString2);
            this.f142368i.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
            this.f142368i.setClickable(true);
        }
        java.lang.String string = getString(com.tencent.mm.R.string.fxq, com.tencent.mm.wallet_core.ui.r1.h(cx3Var.f371884e, 10), cx3Var.f371892p);
        android.widget.TextView textView3 = this.f142367h;
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context3 = this.f142367h.getContext();
        float textSize3 = this.f142367h.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, string, textSize3));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f142365f, cx3Var.f371884e, 0.06f);
        com.tencent.mm.wallet_core.ui.r1.t0(this.f142366g, cx3Var.f371884e, 10);
        com.tencent.mm.wallet_core.ui.r1.t0(this.f142375s, cx3Var.f371884e, 10);
        int i17 = cx3Var.f371897u;
        if (i17 == 1) {
            this.f142371o.setText(com.tencent.mm.R.string.fwv);
        } else if (i17 == 2) {
            this.f142371o.setText(com.tencent.mm.R.string.fxg);
        } else {
            android.widget.TextView textView4 = this.f142371o;
            le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String I = com.tencent.mm.wallet_core.ui.r1.I(c01.z1.l(), 16);
            float textSize4 = this.f142371o.getTextSize();
            ((ke0.e) xVar4).getClass();
            textView4.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, I, textSize4));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(cx3Var.f371894r)) {
            this.f142380x.setImageResource(u73.h.d(cx3Var.f371897u));
        } else {
            this.f142380x.b(cx3Var.f371894r, 0, 0, u73.h.d(cx3Var.f371897u));
        }
        if (!tg5Var.f386412n) {
            this.B = false;
            this.f142376t.setVisibility(8);
            return;
        }
        this.B = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24522, 2, 1);
        this.f142376t.setVisibility(0);
        r45.xw3 xw3Var = tg5Var.f386413o;
        java.lang.String str3 = xw3Var.f390555d;
        java.lang.String str4 = xw3Var.f390556e;
        java.lang.String str5 = xw3Var.f390557f;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return;
        }
        r45.xw3 xw3Var2 = tg5Var.f386413o;
        this.A = xw3Var2.f390556e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(xw3Var2.f390555d);
        int length = sb6.length();
        sb6.append(tg5Var.f386413o.f390556e);
        this.f142378v.setText(sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.K0(tg5Var.f386413o.f390556e)) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.w0(this.f142378v, sb6.toString(), length, sb6.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new v73.f1(this, tg5Var), true), this);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bjv;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f142365f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h4o);
        this.f142366g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h4t);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485276h51);
        this.f142371o = textView;
        com.tencent.mm.wallet_core.ui.r1.d(textView);
        this.f142367h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h4u);
        this.f142375s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h4x);
        this.f142368i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h4p);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.h4y);
        this.f142369m = button;
        com.tencent.mm.ui.bk.r0(button.getPaint(), 0.8f);
        this.f142370n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h4z);
        this.f142372p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485277h52);
        this.f142373q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h4r);
        this.f142374r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h4q);
        this.f142380x = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.h4w);
        this.f142381y = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f142376t = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.h4m);
        this.f142377u = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.h4l);
        this.f142378v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h4n);
        this.f142379w = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h4s);
        this.f142369m.setOnClickListener(new v73.h1(this));
        if (com.tencent.mm.ui.bk.C()) {
            this.f142379w.setImageResource(com.tencent.mm.R.raw.honey_pay_bank_logo_dm);
            this.f142369m.setTextColor(getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            this.f142377u.setBackgroundResource(com.tencent.mm.R.drawable.agk);
        } else {
            this.f142379w.setImageResource(com.tencent.mm.R.raw.honey_pay_bank_logo);
            this.f142369m.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478526a7));
            this.f142377u.setBackgroundResource(com.tencent.mm.R.drawable.agj);
        }
    }

    @Override // com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f142261e = com.tencent.mm.R.color.aaw;
        super.onCreate(bundle);
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).wi(this.D);
        addSceneEndListener(2613);
        addSceneEndListener(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_NO_EXIF);
        this.f142382z = getIntent().getStringExtra("key_card_no");
        this.C = getIntent().getIntExtra("key_scene", 0);
        initView();
        int i17 = this.C;
        java.lang.String str = this.f142260d;
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.i(str, "qry user detail");
            r73.m mVar = new r73.m(this.f142382z);
            mVar.K(this);
            doSceneProgress(mVar, true);
            return;
        }
        r45.tg5 tg5Var = new r45.tg5();
        try {
            tg5Var.parseFrom(getIntent().getByteArrayExtra("key_qry_response"));
            V6(tg5Var);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i(str, "qry user detail");
            r73.m mVar2 = new r73.m(this.f142382z);
            mVar2.K(this);
            doSceneProgress(mVar2, true);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(this.D);
        removeSceneEndListener(2613);
        removeSceneEndListener(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_NO_EXIF);
        if (this.B) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24522, 2, 3);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof r73.m) {
            r73.m mVar = (r73.m) m1Var;
            if (mVar.f214031i || mVar.f214032m) {
                return true;
            }
            W6(mVar.f393178r);
            return true;
        }
        if (!(m1Var instanceof r73.e)) {
            return true;
        }
        r73.e eVar = (r73.e) m1Var;
        eVar.O(new v73.i1(this, eVar));
        if (eVar.f214032m) {
            if (eVar.f393168r.f370760f != null) {
                com.tencent.mars.xlog.Log.i(this.f142260d, "do real name");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayReceiveCardUI");
                u73.h.i(this, bundle, eVar.f393168r.f370760f, false);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 5L, 1L);
        }
        if (!eVar.f214031i) {
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 5L, 1L);
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(v73.k1.class);
    }
}
