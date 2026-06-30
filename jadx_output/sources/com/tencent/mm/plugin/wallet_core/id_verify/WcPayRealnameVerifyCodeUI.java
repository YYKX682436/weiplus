package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class WcPayRealnameVerifyCodeUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179267d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179268e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f179269f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f179270g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f179271h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f179272i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f179273m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.a2 f179274n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f179275o = "+86";

    /* renamed from: p, reason: collision with root package name */
    public boolean f179276p = false;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f179277q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI.1
        {
            this.__eventId = 323604482;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
            com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI.this;
            wcPayRealnameVerifyCodeUI.f179277q.dead();
            int i17 = walletRealNameResultNotifyEvent.f54973g.f6120a;
            if (i17 != -1 && i17 != 0) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealNameVerifyCodeUI", "WcPayRealnameVerifyCodeUI finish");
            wcPayRealnameVerifyCodeUI.finish();
            return false;
        }
    };

    public static void U6(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(wcPayRealnameVerifyCodeUI.f179268e.getText()) || !wcPayRealnameVerifyCodeUI.f179267d.n()) {
            wcPayRealnameVerifyCodeUI.f179270g.setEnabled(false);
        } else {
            wcPayRealnameVerifyCodeUI.f179270g.setEnabled(true);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9c;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f179267d = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ppy);
        this.f179268e = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f487755pq0);
        this.f179269f = (android.widget.Button) findViewById(com.tencent.mm.R.id.ppz);
        this.f179270g = (android.widget.Button) findViewById(com.tencent.mm.R.id.ppv);
        this.f179271h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ppu);
        this.f179272i = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.ppw);
        this.f179273m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ppx);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = dimensionPixelSize2;
        this.f179267d.getInfoIv().setLayoutParams(layoutParams);
        this.f179267d.getInfoIv().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView infoIv = this.f179267d.getInfoIv();
        int color = getResources().getColor(com.tencent.mm.R.color.FG_2);
        infoIv.f192041u = com.tencent.mm.R.raw.icons_filled_close2;
        infoIv.f192042v = color;
        this.f179268e.getContentEt().setPadding(this.f179268e.getContentEt().getPaddingLeft(), this.f179268e.getContentEt().getPaddingTop(), 0, this.f179268e.getContentEt().getPaddingBottom());
        this.f179269f.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.r1(this));
        this.f179270g.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.s1(this));
        this.f179267d.setLogicDelegate(new com.tencent.mm.plugin.wallet_core.id_verify.t1(this));
        this.f179267d.setOnInputValidChangeListener(new com.tencent.mm.plugin.wallet_core.id_verify.u1(this));
        this.f179268e.b(new com.tencent.mm.plugin.wallet_core.id_verify.v1(this));
        this.f179272i.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.w1(this));
        this.f179273m.setText(this.f179275o);
        this.f179271h.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.z1(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == 100) {
            java.lang.String stringExtra = intent.getStringExtra("country_name");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealNameVerifyCodeUI", "user canceled this select");
                return;
            }
            java.lang.String str = "+" + intent.getStringExtra("couttry_code");
            this.f179275o = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealNameVerifyCodeUI", "countryName: %s, countryCode: %s", stringExtra, str);
            this.f179273m.setText(this.f179275o);
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478494f));
        hideActionbarLine();
        setBackBtn(new com.tencent.mm.plugin.wallet_core.id_verify.q1(this), com.tencent.mm.R.raw.actionbar_icon_dark_close);
        initView();
        this.f179277q.alive();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.wallet_core.id_verify.a2 a2Var = this.f179274n;
        if (a2Var != null) {
            a2Var.cancel();
        }
        this.f179277q.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet_core.utils.u.class);
    }
}
