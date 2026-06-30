package com.tencent.mm.plugin.qqmail.ui;

/* loaded from: classes8.dex */
public class ReadMailUI extends com.tencent.mm.ui.MMActivity implements android.view.View.OnCreateContextMenuListener {
    public static java.lang.String N = "var mail_css = document.createElement(\"style\");";
    public static java.lang.String P = "";
    public static java.lang.String Q = "";
    public static float R;
    public static int S;
    public boolean A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String G;

    /* renamed from: J, reason: collision with root package name */
    public android.content.SharedPreferences f154924J;
    public java.lang.String K;
    public int L;

    /* renamed from: f, reason: collision with root package name */
    public ks3.b0 f154927f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f154928g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f154929h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f154930i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f154931m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f154932n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f154933o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f154934p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f154935q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f154936r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f154937s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f154938t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f154939u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.qqmail.ui.MailAttachListLinearLayout f154940v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f154941w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f154942x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f154943y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f154944z;

    /* renamed from: d, reason: collision with root package name */
    public long f154925d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154926e = "";
    public long E = -1;
    public int F = 0;
    public int H = 0;
    public int I = 0;
    public final com.tencent.mm.sdk.platformtools.b4 M = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new os3.c4(this), true);

    public static void T6(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI, int i17, int i18) {
        readMailUI.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("kv_report_key", i17);
        bundle.putInt("kv_report_value", i18);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, js3.i.class, null);
    }

    public static void U6(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        readMailUI.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("download_url", readMailUI.C);
        bundle.putString("download_md5", readMailUI.D);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, js3.b.class, new os3.t3(readMailUI));
    }

    public final void V6() {
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, null, js3.e.class, new os3.v3(this));
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, null, js3.g.class, new os3.x3(this));
        if (com.tencent.mm.pluginsdk.model.app.j1.f(this, "com.tencent.androidqqmail")) {
            this.I = 3;
            W6();
            return;
        }
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("QQMAIL", 4);
        this.f154924J = sharedPreferences;
        if (sharedPreferences == null) {
            return;
        }
        long j17 = sharedPreferences.getLong("qqmail_downloadid", -1L);
        this.E = j17;
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCLong(j17), js3.d.class, new os3.z3(this));
    }

    public final void W6() {
        int i17 = this.I;
        if (i17 == 0) {
            this.f154943y.setText(com.tencent.mm.R.string.hrv);
            return;
        }
        if (i17 == 1) {
            this.f154943y.setText(com.tencent.mm.R.string.hrt);
            return;
        }
        if (i17 == 2) {
            this.f154943y.setText(com.tencent.mm.R.string.hru);
            return;
        }
        if (i17 != 3) {
            return;
        }
        int i18 = this.L;
        java.lang.String num = i18 > 99 ? "99+" : i18 > 0 ? java.lang.Integer.toString(i18) : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(num)) {
            this.f154943y.setText(com.tencent.mm.R.string.hrw);
        } else {
            this.f154943y.setText(java.lang.String.format(i65.a.r(this, com.tencent.mm.R.string.hrx), num));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cca;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f154931m = (com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl) findViewById(com.tencent.mm.R.id.lei);
        this.f154933o = (com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl) findViewById(com.tencent.mm.R.id.lej);
        this.f154932n = (com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl) findViewById(com.tencent.mm.R.id.leh);
        this.f154934p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486530lk3);
        this.f154935q = findViewById(com.tencent.mm.R.id.f486532lk5);
        this.f154936r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lk8);
        this.f154937s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lk9);
        this.f154938t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lk7);
        this.f154939u = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486528lk1);
        this.f154940v = (com.tencent.mm.plugin.qqmail.ui.MailAttachListLinearLayout) findViewById(com.tencent.mm.R.id.f486527lk0);
        this.f154929h = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.f486531lk4);
        this.f154930i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.lk6);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        ((yg0.c3) com.tencent.mm.plugin.webview.ui.tools.widget.c2.f187123a).getClass();
        com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView mailMMWebView = new com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView(this, null, 0);
        this.f154928g = mailMMWebView;
        mailMMWebView.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        ((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.ljt)).addView(this.f154928g);
        this.f154944z = findViewById(com.tencent.mm.R.id.j8a);
        this.f154941w = findViewById(com.tencent.mm.R.id.f485832j85);
        this.f154943y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j88);
        this.f154942x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j87);
        this.f154941w.setOnClickListener(new os3.k4(this));
        this.f154934p.setOnClickListener(new os3.m4(this));
        this.f154930i.setOnClickListener(new os3.n4(this));
        this.f154938t.setOnClickListener(new os3.o4(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new os3.u4(this));
        setBackBtn(new os3.v4(this));
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        R = displayMetrics.widthPixels / displayMetrics.scaledDensity;
        S = displayMetrics.heightPixels;
        this.f154928g.getSettings().w(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        this.f154928g.getSettings().N(false);
        this.f154928g.getSettings().r(false);
        this.f154928g.getSettings().y(false);
        this.f154928g.getSettings().H(false);
        this.f154928g.getSettings().P(true);
        this.f154928g.G0();
        ((com.tencent.mm.plugin.webview.ui.tools.widget.e2) this.f154928g).setEmbeddedTitleBarCompat(this.f154944z);
        ((com.tencent.mm.plugin.webview.ui.tools.widget.e2) this.f154928g).setEmbeddedBottomBar(this.f154941w);
        android.content.Intent intent = getContext().getIntent();
        byte[] bArr = new byte[112];
        bArr[25] = 1;
        bArr[16] = 1;
        bArr[57] = 1;
        bArr[63] = 1;
        bArr[61] = 1;
        bArr[70] = 1;
        bArr[68] = 1;
        bArr[82] = 1;
        bArr[111] = 1;
        intent.putExtra("hardcode_jspermission", new com.tencent.mm.protocal.JsapiPermissionWrapper(bArr));
        getContext().setIntent(intent);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f154928g;
        com.tencent.mm.plugin.webview.ui.tools.widget.w1 w1Var = com.tencent.mm.plugin.webview.ui.tools.widget.v1.f187579a;
        os3.y4 y4Var = new os3.y4(this);
        ((yg0.w2) w1Var).getClass();
        mMWebView.setWebViewClient(new com.tencent.mm.plugin.webview.ui.tools.widget.w3(mMWebView, true, y4Var, null));
        if (P.equals("")) {
            try {
                P += com.tencent.mm.sdk.platformtools.t8.e(getAssets().open("mail/lib.js"));
                Q += com.tencent.mm.sdk.platformtools.t8.e(getAssets().open("mail/readmail.js"));
                N += "mail_css.innerHTML=`" + com.tencent.mm.sdk.platformtools.t8.e(getAssets().open("mail/qmail_webview.css")) + "`; document.head.appendChild(mail_css);";
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ReadMailUI", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.e("MicroMsg.ReadMailUI", "evaluateJavascript error " + e17.getMessage());
            }
        }
        registerForContextMenu(this.f154928g);
        new com.tencent.mm.ui.tools.s6(this).c(this.f154928g, this, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154925d = getIntent().getLongExtra("msgid", -1L);
        this.f154926e = getIntent().getStringExtra("talker");
        com.tencent.mars.xlog.Log.i("MicroMsg.ReadMailUI", "onCreate msgId %d, talker: %s", java.lang.Long.valueOf(this.f154925d), this.f154926e);
        initView();
        V6();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("talker", this.f154926e);
        bundle2.putLong("msgid", this.f154925d);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle2, js3.f.class, new os3.g4(this));
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        int i17;
        if ((view instanceof com.tencent.xweb.WebView) && ((i17 = ((com.tencent.xweb.WebView) view).getHitTestResult().f220239a) == 5 || i17 == 8)) {
            return;
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f154928g.setVisibility(8);
        this.f154928g.destroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A) {
            V6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f154928g.stopLoading();
    }
}
