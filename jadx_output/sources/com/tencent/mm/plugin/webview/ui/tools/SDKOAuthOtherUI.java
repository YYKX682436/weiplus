package com.tencent.mm.plugin.webview.ui.tools;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes15.dex */
public class SDKOAuthOtherUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.j3 f183697d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xv5 f183698e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.c2 f183699f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f183700g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f183701h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f183702i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f183703m;

    /* renamed from: n, reason: collision with root package name */
    public int f183704n;

    /* renamed from: o, reason: collision with root package name */
    public long f183705o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f183707q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f183709s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.SendAuth.Options f183710t;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f183712v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f183713w;

    /* renamed from: x, reason: collision with root package name */
    public int f183714x;

    /* renamed from: y, reason: collision with root package name */
    public int f183715y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f183716z;

    /* renamed from: p, reason: collision with root package name */
    public boolean f183706p = false;

    /* renamed from: r, reason: collision with root package name */
    public int f183708r = 2;

    /* renamed from: u, reason: collision with root package name */
    public boolean f183711u = false;
    public java.util.LinkedList B = new java.util.LinkedList();

    public final void T6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "accept go  MPGdprPolicyUtil.checkPolicy");
        if (z17) {
            java.util.LinkedList linkedList = this.B;
            com.tencent.mm.plugin.webview.ui.tools.c2 c2Var = this.f183699f;
            c2Var.getClass();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            int i17 = 0;
            while (true) {
                java.util.LinkedList linkedList3 = c2Var.f184026d;
                if (i17 >= linkedList3.size()) {
                    break;
                }
                r45.px4 px4Var = (r45.px4) linkedList3.get(i17);
                int i18 = px4Var.f383460f;
                if (i18 == 2 || i18 == 3) {
                    linkedList2.add(px4Var.f383458d);
                }
                i17++;
            }
            linkedList.addAll(linkedList2);
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "add scopes to userHasSelectedScopes, userHasSelectedScopes = %s", com.tencent.mm.plugin.webview.model.j3.l(this.B));
        }
        if (!com.tencent.mm.plugin.webview.model.j3.b(this.f183698e, this.f183706p).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "doAuthDirectly");
            if (this.B.size() <= 0) {
                this.f183697d.d(-4, this.f183710t, this.f183712v, this.f183714x, this.f183711u);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "try to send result, isFromQRCodeScan = %s, scopeSize = %s", java.lang.Boolean.valueOf(this.f183706p), java.lang.Integer.valueOf(this.B.size()));
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183709s;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f183709s = db5.e1.Q(this, null, getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.webview.ui.tools.w1(this));
            if (this.f183706p) {
                this.f183697d.i(1, this.B, this.f183704n, this.f183707q, null, false);
                return;
            }
            this.f183697d.j(1, this.B, this.f183704n, this.f183712v, this.f183714x, null, java.lang.Boolean.FALSE, this.f183711u);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "go to SDKOAuthAppDataUI");
        r45.xv5 xv5Var = this.f183698e;
        java.util.LinkedList linkedList4 = this.B;
        int i19 = this.f183704n;
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "startScopeActivity  cls:" + com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI.class);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI.class);
        intent.putExtra("0", this.f183700g);
        intent.putExtra("1", this.f183701h);
        intent.putExtra("4", this.f183702i);
        intent.putExtra("7", this.f183703m);
        intent.putExtra("3", i19);
        intent.putExtra("auth_raw_url", this.f183707q);
        intent.putExtra("auth_from_scan", this.f183706p);
        intent.putExtra("has_selected_scope", linkedList4);
        intent.putExtra("auth_isoption1", this.f183711u);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f183712v)) {
            intent.putExtra("key_open_sdk_token", this.f183712v);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f183713w)) {
            intent.putExtra("key_open_sdk_pkg_name", this.f183713w);
        }
        intent.putExtra("key_open_sdk_authentication_result", this.f183714x);
        intent.putExtra("key_open_sdk_version", this.f183715y);
        com.tencent.mm.opensdk.modelmsg.SendAuth.Options options = this.f183710t;
        if (options != null && !com.tencent.mm.sdk.platformtools.t8.K0(options.callbackClassName)) {
            android.os.Bundle bundle = new android.os.Bundle();
            this.f183710t.toBundle(bundle);
            intent.putExtra("send_auth_option", bundle);
        }
        try {
            intent.putExtra("2", xv5Var.toByteArray());
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthOtherUI", "SdkOauthAuthorizeResp toByteArray failed");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/util/LinkedList;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/util/LinkedList;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.webview.model.j3.g(this);
    }

    public final void U6() {
        int i17 = getResources().getConfiguration().orientation;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ioq);
        if (findViewById != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.bottomMargin = i17 == 2 ? i65.a.b(this, 12) : i17 == 1 ? i65.a.b(this, 96) : 0;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cip;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "onCreate");
        super.onCreate(bundle);
        gm0.j1.d().a(1346, this);
        gm0.j1.d().a(1137, this);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        getController().X0(this, b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        getController().E0(b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.hzy)).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.x1(this));
        android.content.Intent intent = getIntent();
        this.f183700g = intent.getStringExtra("0");
        this.f183701h = intent.getStringExtra("1");
        try {
            this.f183698e = (r45.xv5) new r45.xv5().parseFrom(intent.getByteArrayExtra("2"));
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthOtherUI", "SdkOauthAuthorizeResp parseFrom byteArray failed");
        }
        this.f183702i = intent.getStringExtra("4");
        this.f183703m = intent.getStringExtra("7");
        boolean z17 = false;
        this.f183706p = intent.getBooleanExtra("auth_from_scan", false);
        this.B = new java.util.LinkedList(intent.getStringArrayListExtra("has_selected_scope"));
        if (this.f183706p) {
            this.f183708r = 3;
            java.lang.String stringExtra = intent.getStringExtra("auth_raw_url");
            this.f183707q = stringExtra;
            this.f183697d = new com.tencent.mm.plugin.webview.model.j3(this, true, this.f183700g, stringExtra);
        } else {
            this.f183697d = new com.tencent.mm.plugin.webview.model.j3(this, this.f183700g, this.f183701h, this.f183702i, this.f183703m);
        }
        this.f183704n = intent.getIntExtra("3", -1);
        this.f183711u = intent.getBooleanExtra("auth_isoption1", false);
        this.f183712v = intent.getStringExtra("key_open_sdk_token");
        this.f183713w = intent.getStringExtra("key_open_sdk_pkg_name");
        this.f183714x = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.f183715y = intent.getIntExtra("key_open_sdk_version", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "pkgName:%s, authenticationResult:%d, openSDKVersion:%d", this.f183713w, java.lang.Integer.valueOf(this.f183714x), java.lang.Integer.valueOf(this.f183715y));
        android.os.Bundle bundleExtra = intent.getBundleExtra("send_auth_option");
        if (bundleExtra != null) {
            com.tencent.mm.opensdk.modelmsg.SendAuth.Options options = new com.tencent.mm.opensdk.modelmsg.SendAuth.Options();
            this.f183710t = options;
            options.fromBundle(bundleExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "options.callbackClassName: " + this.f183710t.callbackClassName + "  options.callbackFlags: " + this.f183710t.callbackFlags);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "SendAuth.options, bundle is null");
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483297a83);
        textView.setText(com.tencent.mm.R.string.h8g);
        textView.getPaint().setFakeBoldText(true);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a7z);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f183698e.f390528v)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(this.f183698e.f390528v);
        }
        com.tencent.mm.plugin.webview.model.j3 j3Var = this.f183697d;
        r45.xv5 xv5Var = this.f183698e;
        j3Var.f182967i = xv5Var.f390530x;
        this.f183716z = xv5Var.f390515f;
        this.A = xv5Var.f390514e;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.k76);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k7a);
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.raw.native_oauth_default_head_img;
        fVar.f342097u = getResources().getDimension(com.tencent.mm.R.dimen.a9i);
        fVar.f342096t = true;
        n11.a.b().h(this.f183698e.f390515f, imageView, fVar.a());
        textView3.setText(this.f183698e.f390514e);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f483296a82);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f183698e.f390513d.iterator();
        while (it.hasNext()) {
            r45.px4 px4Var = (r45.px4) it.next();
            if (!px4Var.f383458d.equals("snsapi_userinfo") && !px4Var.f383458d.equals("snsapi_login") && !px4Var.f383458d.equals("group_sns_login") && !px4Var.f383458d.equals("snsapi_friend")) {
                linkedList.add(px4Var);
                if (px4Var.f383460f == 3) {
                    z17 = true;
                }
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.c2 c2Var = new com.tencent.mm.plugin.webview.ui.tools.c2(this, linkedList);
        this.f183699f = c2Var;
        listView.setAdapter((android.widget.ListAdapter) c2Var);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.iop);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.iou);
        int intExtra = intent.getIntExtra("5", -2);
        int intExtra2 = intent.getIntExtra("6", -2);
        this.f183705o = java.lang.System.currentTimeMillis();
        button.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.y1(this, intExtra, intExtra2));
        button2.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.z1(this, z17, intExtra, intExtra2));
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183709s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(1346, this);
        gm0.j1.d().q(1137, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "onDestroy");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        hy4.b.INSTANCE.a(this.f183700g, this.f183705o, 0, this.f183708r, 4, 1, 0);
        this.f183697d.d(-2, this.f183710t, this.f183712v, this.f183714x, this.f183711u);
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "onPause");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthOtherUI", "onResume");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            hy4.b.INSTANCE.a(this.f183700g, this.f183705o, 2, this.f183708r, 4, 1, i18);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183709s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var instanceof com.tencent.mm.plugin.webview.model.r1) {
            this.f183697d.r(this, this.f183712v, this.f183715y, this.f183713w, this.f183714x, this.f183716z, this.A, i17, i18, str, m1Var, this.f183710t, this.f183711u);
        } else if (m1Var instanceof com.tencent.mm.plugin.webview.model.p1) {
            this.f183697d.q(i17, i18, str, m1Var, this.f183710t);
        }
    }
}
