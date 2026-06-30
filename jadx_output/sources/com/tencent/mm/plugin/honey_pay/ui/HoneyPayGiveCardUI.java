package com.tencent.mm.plugin.honey_pay.ui;

/* loaded from: classes9.dex */
public class HoneyPayGiveCardUI extends com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI {
    public r45.tw4 A;
    public java.lang.String B;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ScrollView f142316f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f142317g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f142318h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f142319i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f142320m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f142321n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f142322o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f142323p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f142324q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f142325r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f142326s;

    /* renamed from: t, reason: collision with root package name */
    public long f142327t = 100000;

    /* renamed from: u, reason: collision with root package name */
    public long f142328u = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f142329v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f142330w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f142331x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f142332y;

    /* renamed from: z, reason: collision with root package name */
    public int f142333z;

    public static boolean V6(com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(honeyPayGiveCardUI.f142317g.getText())) {
            honeyPayGiveCardUI.W6(false);
            honeyPayGiveCardUI.X6(false);
            honeyPayGiveCardUI.f142321n.setEnabled(false);
            return false;
        }
        int i07 = com.tencent.mm.wallet_core.ui.r1.i0(honeyPayGiveCardUI.f142317g.getText(), "100");
        long j17 = i07;
        if (j17 < honeyPayGiveCardUI.f142328u) {
            honeyPayGiveCardUI.X6(true);
            honeyPayGiveCardUI.f142321n.setEnabled(false);
            return false;
        }
        if (j17 > honeyPayGiveCardUI.f142327t) {
            honeyPayGiveCardUI.W6(true);
            honeyPayGiveCardUI.f142321n.setEnabled(false);
            return false;
        }
        if (i07 == 0) {
            honeyPayGiveCardUI.f142321n.setEnabled(false);
            return false;
        }
        honeyPayGiveCardUI.W6(false);
        honeyPayGiveCardUI.X6(false);
        honeyPayGiveCardUI.f142321n.setEnabled(true);
        return true;
    }

    public final void W6(boolean z17) {
        if (!z17 || this.f142320m.isShown()) {
            if (z17 || !this.f142320m.isShown()) {
                return;
            }
            this.f142320m.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477834cs));
            this.f142320m.setVisibility(8);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.wallet_core.model.c2.b());
        sb6.append(com.tencent.mm.wallet_core.ui.r1.i("" + this.f142327t, "100", 2, java.math.RoundingMode.HALF_UP).toString());
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.B)) {
            this.f142320m.setText(getString(com.tencent.mm.R.string.fx9, sb7));
        } else {
            this.f142320m.setText(this.B);
        }
        this.f142320m.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477814c8));
        this.f142320m.setVisibility(0);
        android.widget.TextView textView = (android.widget.TextView) ((v73.k0) component(v73.k0.class)).findViewById(com.tencent.mm.R.id.h3v);
        textView.announceForAccessibility(textView.getText());
    }

    public final void X6(boolean z17) {
        if (!z17 || this.f142320m.isShown()) {
            if (z17 || !this.f142320m.isShown()) {
                return;
            }
            this.f142320m.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477834cs));
            this.f142320m.setVisibility(8);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.wallet_core.model.c2.b());
        sb6.append(com.tencent.mm.wallet_core.ui.r1.j("" + this.f142328u, "100", 2, java.math.RoundingMode.HALF_UP));
        this.f142320m.setText(getString(com.tencent.mm.R.string.fxc, sb6.toString()));
        this.f142320m.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477814c8));
        this.f142320m.setVisibility(0);
        android.widget.TextView textView = (android.widget.TextView) ((v73.k0) component(v73.k0.class)).findViewById(com.tencent.mm.R.id.h3v);
        textView.announceForAccessibility(textView.getText());
    }

    public final void Y6() {
        this.f142323p.setVisibility(0);
        this.f142325r.setVisibility(8);
        this.f142325r.setText(this.f142331x);
        this.f142325r.setSelection(this.f142331x.length());
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String string = getString(com.tencent.mm.R.string.fxe);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        java.lang.String str = this.f142331x;
        float textSize = this.f142323p.getTextSize();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize);
        spannableStringBuilder.append((java.lang.CharSequence) j17);
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        spannableStringBuilder.append((java.lang.CharSequence) string);
        spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7(1, new v73.h0(this)), j17.length() + 1, spannableStringBuilder.length(), 34);
        this.f142323p.setText(spannableStringBuilder);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bjq;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f142316f = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.h3u);
        this.f142317g = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.h3s);
        this.f142319i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h3n);
        this.f142320m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h3v);
        this.f142318h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h3l);
        this.f142321n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h3o);
        this.f142322o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h3p);
        this.f142323p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h3x);
        this.f142325r = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.h3w);
        this.f142326s = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f142318h, this.f142330w, 0.06f);
        java.lang.String h17 = com.tencent.mm.wallet_core.ui.r1.h(this.f142330w, 10);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142329v)) {
            h17 = java.lang.String.format("%s(%s)", h17, this.f142329v);
        }
        android.widget.TextView textView = this.f142319i;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        float textSize = this.f142319i.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, h17, textSize));
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f142317g.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setPadding(0, 0, 0, 0);
        }
        this.f142317g.getTitleTv().setText(com.tencent.mm.wallet_core.model.c2.b());
        this.f142317g.b(new v73.z(this));
        this.f142317g.setOnClickListener(new v73.a0(this));
        this.f142322o.setOnClickListener(new v73.b0(this));
        this.f142321n.setClickable(true);
        this.f142321n.setOnClickListener(new v73.c0(this));
        this.f142323p.setClickable(true);
        this.f142323p.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        this.f142325r.setOnEditorActionListener(new v73.d0(this));
        this.f142325r.setOnFocusChangeListener(new v73.e0(this));
        Y6();
        setTenpayKBStateListener(new v73.f0(this));
        setEditFocusListener(this.f142317g, 2, false);
        this.f142317g.postDelayed(new v73.g0(this), 100L);
        this.f142324q = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.h3t);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f142332y)) {
            this.f142324q.setImageResource(u73.h.d(this.f142333z));
        } else {
            this.f142324q.b(this.f142332y, 0, 0, u73.h.d(this.f142333z));
        }
        this.f142326s.setBannerData(this.A);
        this.f142326s.setBgColor(getResources().getColor(com.tencent.mm.R.color.f478526a7));
        this.f142326s.setTextColor(getResources().getColor(com.tencent.mm.R.color.aaw));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f142261e = com.tencent.mm.R.color.f479234tm;
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(com.tencent.mm.R.color.aaw);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        this.f142327t = getIntent().getLongExtra("key_max_credit_line", 0L);
        this.B = getIntent().getStringExtra("key_over_max_limit_warning");
        this.f142328u = getIntent().getLongExtra("key_min_credit_line", 0L);
        this.f142329v = getIntent().getStringExtra("key_true_name");
        this.f142330w = getIntent().getStringExtra("key_username");
        this.f142331x = getIntent().getStringExtra("key_wishing");
        this.f142332y = getIntent().getStringExtra("key_icon_url");
        this.f142333z = getIntent().getIntExtra("key_cardtype", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("key_notice_item");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra);
        java.lang.String str = this.f142260d;
        if (!K0) {
            try {
                r45.tw4 tw4Var = new r45.tw4();
                tw4Var.parseFrom(android.util.Base64.decode(stringExtra, 2));
                this.A = tw4Var;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
            }
        }
        if (this.f142333z == 0) {
            com.tencent.mars.xlog.Log.w(str, "error card type!!");
            finish();
        }
        initView();
        setMMTitle(com.tencent.mm.R.string.fwz);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(v73.k0.class);
    }
}
