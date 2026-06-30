package com.tencent.mm.plugin.webview.ui.tools;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes15.dex */
public class SDKOAuthAppDataUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.j3 f183649d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xv5 f183650e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.l1 f183651f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f183652g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f183653h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f183654i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f183655m;

    /* renamed from: n, reason: collision with root package name */
    public long f183656n;

    /* renamed from: o, reason: collision with root package name */
    public int f183657o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f183659q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f183661s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.SendAuth.Options f183662t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.e1 f183663u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f183664v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f183665w;

    /* renamed from: x, reason: collision with root package name */
    public r45.aw6 f183666x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f183667y;

    /* renamed from: p, reason: collision with root package name */
    public boolean f183658p = false;

    /* renamed from: r, reason: collision with root package name */
    public int f183660r = 2;

    /* renamed from: z, reason: collision with root package name */
    public boolean f183668z = false;

    public static void T6(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI sDKOAuthAppDataUI, boolean z17) {
        java.lang.String str;
        sDKOAuthAppDataUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthAppDataUI", "accept go  MPGdprPolicyUtil.checkPolicy");
        if (z17) {
            sDKOAuthAppDataUI.f183651f.f185625f.f371257f = 1;
        } else {
            sDKOAuthAppDataUI.f183651f.f185625f.f371257f = 2;
        }
        boolean z18 = sDKOAuthAppDataUI.f183650e.f390521o;
        try {
            com.tencent.mm.protobuf.g gVar = new com.tencent.mm.protobuf.g(sDKOAuthAppDataUI.f183651f.f185625f.toByteArray());
            com.tencent.mm.ui.widget.dialog.u3 u3Var = sDKOAuthAppDataUI.f183661s;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            sDKOAuthAppDataUI.f183661s = db5.e1.Q(sDKOAuthAppDataUI, null, sDKOAuthAppDataUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.webview.ui.tools.f1(sDKOAuthAppDataUI));
            java.util.LinkedList linkedList = sDKOAuthAppDataUI.f183667y;
            int i17 = sDKOAuthAppDataUI.f183657o;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("用户操作结果：1\n已授权选项：");
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append(", \n");
            }
            sb6.append("用户头像id：");
            sb6.append(i17);
            sb6.append("\n");
            java.lang.String str2 = "";
            try {
                r45.c36 c36Var = new r45.c36();
                c36Var.parseFrom(gVar.g());
                java.util.Iterator it6 = c36Var.f371255d.iterator();
                while (it6.hasNext()) {
                    r45.yv6 yv6Var = (r45.yv6) it6.next();
                    str2 = str2 + java.lang.String.format("status_id: %s, status_value: %s\n", java.lang.Integer.valueOf(yv6Var.f391428d), java.lang.Integer.valueOf(yv6Var.f391429e));
                }
                str2 = str2 + "submit_value: " + c36Var.f371257f + "\n";
                str = str2 + "isHaveGameCenterPage: " + valueOf + "\n";
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDKOauthUtil", "parse proto fail, %s", e17.getMessage());
                str = str2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthAppDataUI", "auth result: %s", ((java.lang.Object) sb6) + str);
            if (sDKOAuthAppDataUI.f183658p) {
                sDKOAuthAppDataUI.f183649d.i(1, sDKOAuthAppDataUI.f183667y, sDKOAuthAppDataUI.f183657o, sDKOAuthAppDataUI.f183659q, gVar, z18);
            } else {
                sDKOAuthAppDataUI.f183649d.j(1, sDKOAuthAppDataUI.f183667y, sDKOAuthAppDataUI.f183657o, sDKOAuthAppDataUI.A, sDKOAuthAppDataUI.C, gVar, java.lang.Boolean.valueOf(z18), sDKOAuthAppDataUI.f183668z);
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthAppDataUI", "ByteString create failed");
        }
    }

    public final void U6() {
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById(com.tencent.mm.R.id.a7y);
        mMNeat7extView.b(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).nj(getContext(), this.f183666x.f370318f.f371110d, (int) mMNeat7extView.getTextSize()));
        mMNeat7extView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(mMNeat7extView, new com.tencent.mm.pluginsdk.ui.span.y0(mMNeat7extView.getContext())));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cin;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthAppDataUI", "onCreate");
        super.onCreate(bundle);
        gm0.j1.d().a(1346, this);
        gm0.j1.d().a(1137, this);
        android.content.Intent intent = getIntent();
        this.f183667y = new java.util.LinkedList(intent.getStringArrayListExtra("has_selected_scope"));
        this.f183652g = intent.getStringExtra("0");
        this.f183653h = intent.getStringExtra("1");
        try {
            this.f183650e = (r45.xv5) new r45.xv5().parseFrom(intent.getByteArrayExtra("2"));
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthAppDataUI", "SdkOauthAuthorizeResp parseFrom byteArray failed");
        }
        this.f183654i = intent.getStringExtra("4");
        this.f183655m = intent.getStringExtra("7");
        boolean booleanExtra = intent.getBooleanExtra("auth_from_scan", false);
        this.f183658p = booleanExtra;
        if (booleanExtra) {
            this.f183660r = 3;
            java.lang.String stringExtra = intent.getStringExtra("auth_raw_url");
            this.f183659q = stringExtra;
            this.f183649d = new com.tencent.mm.plugin.webview.model.j3(this, true, this.f183652g, stringExtra);
        } else {
            this.f183649d = new com.tencent.mm.plugin.webview.model.j3(this, this.f183652g, this.f183653h, this.f183654i, this.f183655m);
        }
        this.f183657o = intent.getIntExtra("3", -1);
        this.f183668z = intent.getBooleanExtra("auth_isoption1", false);
        this.A = intent.getStringExtra("key_open_sdk_token");
        this.B = intent.getStringExtra("key_open_sdk_pkg_name");
        this.C = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.D = intent.getIntExtra("key_open_sdk_version", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthAppDataUI", "pkgName:%s, authenticationResult:%d, openSDKVersion:%d", this.B, java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(this.D));
        r45.xv5 xv5Var = this.f183650e;
        this.E = xv5Var.f390515f;
        this.F = xv5Var.f390514e;
        android.os.Bundle bundleExtra = intent.getBundleExtra("send_auth_option");
        if (bundleExtra != null) {
            com.tencent.mm.opensdk.modelmsg.SendAuth.Options options = new com.tencent.mm.opensdk.modelmsg.SendAuth.Options();
            this.f183662t = options;
            options.fromBundle(bundleExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthAppDataUI", "options.callbackClassName: " + this.f183662t.callbackClassName + "  options.callbackFlags: " + this.f183662t.callbackFlags);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthAppDataUI", "SendAuth.options, bundle is null");
        }
        com.tencent.mm.protobuf.g gVar = this.f183650e.A;
        if (gVar != null && gVar.f192156a.length > 0) {
            r45.lq3 lq3Var = new r45.lq3();
            try {
                lq3Var.parseFrom(gVar.g());
                this.f183664v = lq3Var.f379720d;
                this.f183665w = lq3Var.f379721e;
                this.f183666x = lq3Var.f379722f;
            } catch (java.io.IOException unused2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthAppDataUI", "GetUserGrantInfoBuffer parseFrom byteArray failed");
            }
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.hzy)).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.g1(this));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486108k74);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k78);
        textView.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView.getPaint().setStrokeWidth(0.8f);
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.raw.native_oauth_default_head_img;
        fVar.f342097u = getResources().getDimension(com.tencent.mm.R.dimen.a9i);
        fVar.f342096t = true;
        fVar.f342078b = true;
        fVar.f342083g = ap3.g.a();
        n11.a.b().h(this.f183666x.f370316d.f371874d, imageView, fVar.a());
        textView.setText(this.f183666x.f370316d.f371875e);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.k79)).setText(this.f183666x.f370316d.f371876f);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a7x);
        textView2.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView2.getPaint().setStrokeWidth(0.8f);
        textView2.setText(this.f183666x.f370316d.f371877g);
        this.f183651f = new com.tencent.mm.plugin.webview.ui.tools.l1(this, getContext(), this.f183666x.f370317e.f392414d, this.f183650e);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f483298a84);
        recyclerView.setAdapter(this.f183651f);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
        linearLayoutManager.Q(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        U6();
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.iom);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.ior);
        this.f183656n = java.lang.System.currentTimeMillis();
        button.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.h1(this));
        button2.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.i1(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183661s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(1346, this);
        gm0.j1.d().q(1137, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthAppDataUI", "onDestroy");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        hy4.b.INSTANCE.a(this.f183652g, this.f183656n, 0, this.f183660r, 5, 1, 0);
        this.f183649d.d(-2, this.f183662t, this.A, this.C, this.f183668z);
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthAppDataUI", "onPause");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthAppDataUI", "onResume");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            hy4.b.INSTANCE.a(this.f183652g, this.f183656n, 2, this.f183660r, 5, 1, i18);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183661s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var instanceof com.tencent.mm.plugin.webview.model.r1) {
            this.f183649d.r(this, this.A, this.D, this.B, this.C, this.E, this.F, i17, i18, str, m1Var, this.f183662t, this.f183668z);
        } else if (m1Var instanceof com.tencent.mm.plugin.webview.model.p1) {
            this.f183649d.q(i17, i18, str, m1Var, this.f183662t);
        }
    }
}
