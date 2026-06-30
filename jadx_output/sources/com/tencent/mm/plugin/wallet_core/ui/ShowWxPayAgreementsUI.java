package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes7.dex */
public class ShowWxPayAgreementsUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f179848d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f179849e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f179850f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f179851g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179852h;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowWxPayAgreementsUI", "onRefreshed");
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cni;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15236, 1);
        getSupportActionBar().o();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        getIntent().getIntExtra("agreement_type", 0);
        com.tencent.mm.ui.widget.MMWebView mMWebView = (com.tencent.mm.ui.widget.MMWebView) getContentView().findViewById(com.tencent.mm.R.id.f482792o4);
        mMWebView.getClass();
        this.f179848d = mMWebView;
        mMWebView.getSettings().E(true);
        this.f179848d.addJavascriptInterface(new com.tencent.mm.plugin.wallet_core.ui.q0(null), "privacyPageTools");
        this.f179849e = (android.widget.Button) findViewById(com.tencent.mm.R.id.f482789o1);
        this.f179850f = (android.widget.Button) findViewById(com.tencent.mm.R.id.f482786ny);
        this.f179852h = getIntent().getStringExtra("agreement_content");
        this.f179851g = findViewById(com.tencent.mm.R.id.f482778nq);
        if (com.tencent.mm.ui.bk.C()) {
            this.f179851g.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.raw.wxpay_agreement_bg_dark));
        } else {
            this.f179851g.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.raw.wxpay_agreement_bg_normal));
        }
        this.f179850f.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.o0(this));
        this.f179849e.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.p0(this));
        this.f179848d.setWebViewClient(new com.tencent.mm.plugin.wallet_core.ui.m0(this));
        if (getContext().getApplicationInfo().targetSdkVersion >= 29) {
            this.f179848d.loadData(android.util.Base64.encodeToString(this.f179852h.getBytes(), 0), "text/html; charset=UTF-8", "base64");
        } else {
            this.f179848d.loadData(this.f179852h, "text/html; charset=UTF-8", null);
        }
        zg0.h3 h3Var = (zg0.h3) i95.n0.c(zg0.h3.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((yg0.g4) h3Var).getClass();
        int a17 = hy4.b0.a(context);
        if (a17 < 1 || a17 > 8) {
            a17 = 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowWxPayAgreementsUI", "localSetFontSize, fontSize = " + a17);
        switch (a17) {
            case 1:
                this.f179848d.getSettings().O(80);
                return;
            case 2:
                this.f179848d.getSettings().O(100);
                return;
            case 3:
                this.f179848d.getSettings().O(110);
                return;
            case 4:
                this.f179848d.getSettings().O(112);
                return;
            case 5:
                this.f179848d.getSettings().O(112);
                return;
            case 6:
                this.f179848d.getSettings().O(140);
                return;
            case 7:
                this.f179848d.getSettings().O(155);
                return;
            case 8:
                this.f179848d.getSettings().O(165);
                return;
            default:
                this.f179848d.getSettings().O(100);
                return;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f179848d;
        if (mMWebView != null) {
            mMWebView.destroy();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
