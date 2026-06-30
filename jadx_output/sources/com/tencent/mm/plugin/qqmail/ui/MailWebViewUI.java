package com.tencent.mm.plugin.qqmail.ui;

/* loaded from: classes8.dex */
public class MailWebViewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f154908i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f154909d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154910e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f154911f;

    /* renamed from: g, reason: collision with root package name */
    public final hs3.j f154912g = new os3.z2(this);

    /* renamed from: h, reason: collision with root package name */
    public final k55.k f154913h = new k55.k(this);

    public static void T6(com.tencent.mm.plugin.qqmail.ui.MailWebViewUI mailWebViewUI, java.lang.String str) {
        mailWebViewUI.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.QQMail.WebViewUI", "dealGetContentWidthScheme fail, url is null");
        } else {
            mailWebViewUI.f154909d.post(new os3.e3(mailWebViewUI, com.tencent.mm.sdk.platformtools.t8.P(str.substring(33), 480)));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cbi;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("singleColumn", false));
        com.tencent.mm.ui.widget.MMWebView a17 = al5.l2.a(getContext());
        this.f154909d = a17;
        a17.setBackgroundDrawable(i65.a.i(this, com.tencent.mm.R.color.f479461zy));
        ((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.cg7)).addView(this.f154909d);
        this.f154909d.getSettings().E(true);
        if (valueOf.booleanValue()) {
            this.f154909d.getSettings().F(android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        }
        this.f154909d.getSettings().v(8);
        this.f154909d.getSettings().N(true);
        this.f154909d.getSettings().r(true);
        this.f154909d.setWebViewClient(new os3.b3(this));
        this.f154909d.setWebChromeClient(new os3.c3(this));
        this.f154909d.G0();
        setBackBtn(new os3.d3(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154911f = new com.tencent.mm.sdk.platformtools.n3();
        initView();
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra != null) {
            setMMTitle(stringExtra);
        }
        this.f154913h.a(new os3.a3(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f154909d.setVisibility(8);
        this.f154909d.destroy();
        this.f154909d = null;
        this.f154913h.d();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        this.f154909d.stopLoading();
        super.onStop();
    }
}
