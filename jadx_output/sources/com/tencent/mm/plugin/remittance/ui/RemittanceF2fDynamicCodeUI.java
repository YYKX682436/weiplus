package com.tencent.mm.plugin.remittance.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class RemittanceF2fDynamicCodeUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    public static final /* synthetic */ int I = 0;
    public android.widget.LinearLayout A;
    public android.widget.ImageView B;
    public android.widget.LinearLayout C;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f157391d;

    /* renamed from: e, reason: collision with root package name */
    public int f157392e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f157393f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f157394g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f157395h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f157396i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f157397m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f157398n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f157399o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f157400p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f157401q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f157402r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f157403s;

    /* renamed from: t, reason: collision with root package name */
    public int f157404t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f157405u;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f157408x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f157409y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.Button f157410z;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f157406v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f157407w = false;
    public boolean D = false;
    public long E = 0;
    public long F = 0;
    public final com.tencent.mm.sdk.platformtools.b4 G = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.remittance.ui.q6(this, null), true);
    public final y60.e H = new com.tencent.mm.plugin.remittance.ui.j6(this);

    public static void U6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI) {
        remittanceF2fDynamicCodeUI.B.setImageBitmap(ww1.r.a(remittanceF2fDynamicCodeUI, remittanceF2fDynamicCodeUI.f157403s, remittanceF2fDynamicCodeUI.f157393f, remittanceF2fDynamicCodeUI.f157391d.L, remittanceF2fDynamicCodeUI.f157401q, true, com.tencent.mm.sdk.platformtools.j.d(remittanceF2fDynamicCodeUI, 197.0f), remittanceF2fDynamicCodeUI.H, remittanceF2fDynamicCodeUI.f157407w, remittanceF2fDynamicCodeUI.f157404t, 0.0f, true));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(remittanceF2fDynamicCodeUI.f157405u)) {
            remittanceF2fDynamicCodeUI.f157408x.setText(remittanceF2fDynamicCodeUI.f157405u);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceF2fDynamicCodeUI.f157402r)) {
            remittanceF2fDynamicCodeUI.C.setVisibility(8);
        } else {
            remittanceF2fDynamicCodeUI.f157409y.setText(remittanceF2fDynamicCodeUI.f157402r);
            remittanceF2fDynamicCodeUI.C.setVisibility(0);
        }
        remittanceF2fDynamicCodeUI.A.removeAllViews();
        if (!remittanceF2fDynamicCodeUI.f157406v.isEmpty()) {
            for (r45.sn0 sn0Var : remittanceF2fDynamicCodeUI.f157406v) {
                com.tencent.mm.plugin.remittance.ui.F2fDynamicCodeItemLayout f2fDynamicCodeItemLayout = new com.tencent.mm.plugin.remittance.ui.F2fDynamicCodeItemLayout(remittanceF2fDynamicCodeUI);
                java.lang.String str = sn0Var.f385854d;
                java.lang.String str2 = sn0Var.f385855e;
                f2fDynamicCodeItemLayout.f157098d.setText(str);
                f2fDynamicCodeItemLayout.f157099e.setText(str2);
                remittanceF2fDynamicCodeUI.A.addView(f2fDynamicCodeItemLayout, new android.widget.LinearLayout.LayoutParams(-1, -2));
            }
        }
        remittanceF2fDynamicCodeUI.A.requestLayout();
    }

    public static void V6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI, int i17) {
        remittanceF2fDynamicCodeUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceF2fDynamicCodeUI", "send pay: %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.autogen.events.F2fDynamicStartPayEvent f2fDynamicStartPayEvent = new com.tencent.mm.autogen.events.F2fDynamicStartPayEvent();
        am.e9 e9Var = f2fDynamicStartPayEvent.f54222g;
        e9Var.f6545d = remittanceF2fDynamicCodeUI;
        e9Var.f6544c = i17;
        e9Var.f6543b = 1;
        e9Var.f6542a = remittanceF2fDynamicCodeUI.f157403s;
        f2fDynamicStartPayEvent.e();
    }

    public boolean W6() {
        return getIntent().getBooleanExtra("from_patch_ui", false);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ce7;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (W6()) {
            this.f157408x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486671m30);
            this.f157409y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m2z);
            this.f157410z = (android.widget.Button) findViewById(com.tencent.mm.R.id.m2y);
            this.B = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.m2w);
            this.A = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m2x);
            this.C = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.nek);
            ((com.tencent.mm.wallet_core.ui.WalletTextView) findViewById(com.tencent.mm.R.id.kqo)).setText(getString(com.tencent.mm.R.string.i1_, com.tencent.mm.wallet_core.ui.r1.m(this.f157392e / 100.0d)));
            this.f157410z.setOnClickListener(new com.tencent.mm.plugin.remittance.ui.l6(this));
            this.B.setOnLongClickListener(new com.tencent.mm.plugin.remittance.ui.m6(this));
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (W6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceF2fDynamicCodeUI", "onActivityResult requestCode:%s resultCode:%s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
            if (i17 != 1) {
                if (i17 == 5) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceF2fDynamicCodeUI", "back from H5 cashier, finish");
                    finish();
                    return;
                }
                return;
            }
            com.tencent.mm.autogen.events.RemittanceBusiUIF2fDynamicActivityResultEvent remittanceBusiUIF2fDynamicActivityResultEvent = new com.tencent.mm.autogen.events.RemittanceBusiUIF2fDynamicActivityResultEvent();
            boolean z17 = i18 == -1;
            am.qq qqVar = remittanceBusiUIF2fDynamicActivityResultEvent.f54675g;
            qqVar.f7738a = z17;
            if (intent != null) {
                qqVar.f7739b = intent.getIntExtra("key_pay_reslut_type", 3);
            } else {
                qqVar.f7739b = 3;
            }
            remittanceBusiUIF2fDynamicActivityResultEvent.e();
            if (i18 == -1) {
                setResult(-1, intent);
                finish();
            } else if (com.tencent.mm.wallet_core.model.b2.b(intent)) {
                setResult(0, intent);
                finish();
            } else {
                if (com.tencent.mm.wallet_core.model.b2.c(intent)) {
                    return;
                }
                com.tencent.mm.autogen.events.F2fDynamicResultEvent f2fDynamicResultEvent = new com.tencent.mm.autogen.events.F2fDynamicResultEvent();
                f2fDynamicResultEvent.f54221g.getClass();
                f2fDynamicResultEvent.e();
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (W6()) {
            if (getSupportActionBar() != null) {
                getSupportActionBar().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.tencent.mm.R.color.f479485a34)));
                android.view.View j17 = getSupportActionBar().j();
                if (j17 != null) {
                    android.view.View findViewById = j17.findViewById(com.tencent.mm.R.id.d0v);
                    if (findViewById != null) {
                        findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
                    }
                    android.view.View findViewById2 = j17.findViewById(android.R.id.text1);
                    if (findViewById2 != null && (findViewById2 instanceof android.widget.TextView)) {
                        ((android.widget.TextView) findViewById2).setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
                    }
                }
            }
            android.view.Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.f479485a34));
            if (fp.h.c(21) && !fp.h.c(23)) {
                getWindow().setStatusBarColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_93));
            }
            setBackBtn(new com.tencent.mm.plugin.remittance.ui.k6(this), com.tencent.mm.R.raw.back_icon_normal_black);
            addSceneEndListener(2736);
            setMMTitle(com.tencent.mm.R.string.hys);
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) getIntent().getParcelableExtra("key_pay_info");
            this.f157391d = payInfo;
            if (payInfo == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceF2fDynamicCodeUI", "payinfo is null");
                finish();
            }
            setContentViewVisibility(4);
            this.f157392e = this.f157391d.f192122u.getInt("extinfo_key_15");
            this.f157393f = this.f157391d.f192122u.getString("extinfo_key_1");
            this.f157400p = this.f157391d.f192122u.getString("extinfo_key_2");
            this.f157396i = this.f157391d.f192122u.getString("extinfo_key_17");
            this.f157397m = this.f157391d.f192122u.getString("extinfo_key_18");
            this.f157394g = getIntent().getStringExtra("key_rcvr_open_id");
            this.f157398n = getIntent().getStringExtra("key_mch_info");
            this.f157395h = getIntent().getStringExtra("key_transfer_qrcode_id");
            this.f157401q = getIntent().getStringExtra("key_mch_photo");
            getIntent().getStringExtra("show_paying_wording");
            this.f157402r = getIntent().getStringExtra("dynamic_code_spam_wording");
            this.f157407w = getIntent().getBooleanExtra("show_avatar_type", false);
            this.f157399o = com.tencent.mm.wallet_core.ui.r1.x(this.f157393f);
            initView();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (W6()) {
            removeSceneEndListener(2736);
        }
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        y60.e eVar = this.H;
        ((x60.e) fVar).getClass();
        x51.w0.e(eVar);
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (W6()) {
            this.G.d();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.remittance.ui.s1.d();
        com.tencent.mm.plugin.remittance.ui.r1.f157911a.a(this);
        if (W6()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.E;
            this.F = j17 <= 0 ? 0L : com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL - (currentTimeMillis - j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceF2fDynamicCodeUI", "last time: %s, delay: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.F));
            if (this.F < 0) {
                this.F = 0L;
            }
            this.G.c(this.F, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!W6() || !(m1Var instanceof com.tencent.mm.plugin.remittance.model.v)) {
            return true;
        }
        this.D = false;
        com.tencent.mm.plugin.remittance.model.v vVar = (com.tencent.mm.plugin.remittance.model.v) m1Var;
        setContentViewVisibility(0);
        vVar.O(new com.tencent.mm.plugin.remittance.ui.i6(this, vVar));
        return true;
    }
}
