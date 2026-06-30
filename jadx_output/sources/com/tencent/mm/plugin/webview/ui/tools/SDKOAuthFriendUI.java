package com.tencent.mm.plugin.webview.ui.tools;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes15.dex */
public class SDKOAuthFriendUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public java.lang.String A;
    public java.lang.String B;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.j3 f183669d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xv5 f183670e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f183671f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f183672g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f183673h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f183674i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f183675m;

    /* renamed from: n, reason: collision with root package name */
    public int f183676n;

    /* renamed from: o, reason: collision with root package name */
    public long f183677o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f183679q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f183681s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.SendAuth.Options f183683u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f183685w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f183686x;

    /* renamed from: y, reason: collision with root package name */
    public int f183687y;

    /* renamed from: z, reason: collision with root package name */
    public int f183688z;

    /* renamed from: p, reason: collision with root package name */
    public boolean f183678p = false;

    /* renamed from: r, reason: collision with root package name */
    public int f183680r = 2;

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f183682t = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public boolean f183684v = false;

    public static void T6(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI sDKOAuthFriendUI, boolean z17, r45.px4 px4Var) {
        if (z17) {
            sDKOAuthFriendUI.f183682t.add(sDKOAuthFriendUI.f183672g);
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "add scopes to userHasSelectedScopes, userHasSelectedScopes = %s", com.tencent.mm.plugin.webview.model.j3.l(sDKOAuthFriendUI.f183682t));
        } else {
            sDKOAuthFriendUI.getClass();
            if (px4Var.f383460f == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "user disagree + but must agree => cancel");
                sDKOAuthFriendUI.f183669d.d(-4, sDKOAuthFriendUI.f183683u, sDKOAuthFriendUI.f183685w, sDKOAuthFriendUI.f183687y, sDKOAuthFriendUI.f183684v);
                return;
            }
        }
        if (com.tencent.mm.plugin.webview.model.j3.m(sDKOAuthFriendUI.f183670e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "go to SDKOAuthOtherUI");
            sDKOAuthFriendUI.W6(sDKOAuthFriendUI.f183670e, com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI.class, sDKOAuthFriendUI.f183676n);
            com.tencent.mm.plugin.webview.model.j3.g(sDKOAuthFriendUI);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "only page 2");
        if (com.tencent.mm.plugin.webview.model.j3.b(sDKOAuthFriendUI.f183670e, sDKOAuthFriendUI.f183678p).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "go to SDKOAuthAppDataUI");
            sDKOAuthFriendUI.W6(sDKOAuthFriendUI.f183670e, com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI.class, sDKOAuthFriendUI.f183676n);
            com.tencent.mm.plugin.webview.model.j3.g(sDKOAuthFriendUI);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "doAuthDirectly");
        if (sDKOAuthFriendUI.f183682t.size() <= 0) {
            sDKOAuthFriendUI.f183669d.d(-4, sDKOAuthFriendUI.f183683u, sDKOAuthFriendUI.f183685w, sDKOAuthFriendUI.f183687y, sDKOAuthFriendUI.f183684v);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "try to send result, isFromQRCodeScan = %s, scopeSize = %s", java.lang.Boolean.valueOf(sDKOAuthFriendUI.f183678p), java.lang.Integer.valueOf(sDKOAuthFriendUI.f183682t.size()));
        com.tencent.mm.ui.widget.dialog.u3 u3Var = sDKOAuthFriendUI.f183681s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        sDKOAuthFriendUI.f183681s = db5.e1.Q(sDKOAuthFriendUI, null, sDKOAuthFriendUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.webview.ui.tools.n1(sDKOAuthFriendUI));
        if (sDKOAuthFriendUI.f183678p) {
            sDKOAuthFriendUI.f183669d.i(1, sDKOAuthFriendUI.f183682t, sDKOAuthFriendUI.f183676n, sDKOAuthFriendUI.f183679q, null, false);
            return;
        }
        sDKOAuthFriendUI.f183669d.j(1, sDKOAuthFriendUI.f183682t, sDKOAuthFriendUI.f183676n, sDKOAuthFriendUI.f183685w, sDKOAuthFriendUI.f183687y, null, java.lang.Boolean.FALSE, sDKOAuthFriendUI.f183684v);
    }

    public final int U6() {
        return "snsapi_friend".equals(this.f183672g) ? 3 : 4;
    }

    public final void V6() {
        int i17 = getResources().getConfiguration().orientation;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ioq);
        if (findViewById != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.bottomMargin = i17 == 2 ? i65.a.b(this, 12) : i17 == 1 ? i65.a.b(this, 96) : 0;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public final void W6(r45.xv5 xv5Var, java.lang.Class cls, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "startScopeActivity  cls:" + cls);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) cls);
        intent.putExtra("0", this.f183671f);
        intent.putExtra("1", this.f183673h);
        intent.putExtra("4", this.f183674i);
        intent.putExtra("7", this.f183675m);
        intent.putExtra("3", i17);
        intent.putExtra("auth_raw_url", this.f183679q);
        intent.putExtra("has_selected_scope", this.f183682t);
        intent.putExtra("auth_from_scan", this.f183678p);
        intent.putExtra("auth_isoption1", this.f183684v);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f183685w)) {
            intent.putExtra("key_open_sdk_token", this.f183685w);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f183686x)) {
            intent.putExtra("key_open_sdk_pkg_name", this.f183686x);
        }
        intent.putExtra("key_open_sdk_authentication_result", this.f183687y);
        intent.putExtra("key_open_sdk_version", this.f183688z);
        com.tencent.mm.opensdk.modelmsg.SendAuth.Options options = this.f183683u;
        if (options != null && !com.tencent.mm.sdk.platformtools.t8.K0(options.callbackClassName)) {
            android.os.Bundle bundle = new android.os.Bundle();
            this.f183683u.toBundle(bundle);
            intent.putExtra("send_auth_option", bundle);
        }
        try {
            intent.putExtra("2", xv5Var.toByteArray());
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthFriendUI", "SdkOauthAuthorizeResp toByteArray failed");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cio;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        V6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "onCreate");
        super.onCreate(bundle);
        gm0.j1.d().a(1346, this);
        gm0.j1.d().a(1137, this);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        getController().X0(this, b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        getController().E0(b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.hzy)).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.o1(this));
        android.content.Intent intent = getIntent();
        this.f183671f = intent.getStringExtra("0");
        this.f183672g = intent.getStringExtra("auth_scope");
        this.f183673h = intent.getStringExtra("1");
        this.f183682t = new java.util.LinkedList(intent.getStringArrayListExtra("has_selected_scope"));
        try {
            this.f183670e = (r45.xv5) new r45.xv5().parseFrom(intent.getByteArrayExtra("2"));
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthFriendUI", "SdkOauthAuthorizeResp parseFrom byteArray failed");
        }
        this.f183674i = intent.getStringExtra("4");
        this.f183675m = intent.getStringExtra("7");
        this.f183678p = intent.getBooleanExtra("auth_from_scan", false);
        this.f183685w = intent.getStringExtra("key_open_sdk_token");
        this.f183686x = intent.getStringExtra("key_open_sdk_pkg_name");
        this.f183687y = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.f183688z = intent.getIntExtra("key_open_sdk_version", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "pkgName:%s, authenticationResult:%d, openSDKVersion:%d", this.f183686x, java.lang.Integer.valueOf(this.f183687y), java.lang.Integer.valueOf(this.f183688z));
        if (this.f183678p) {
            this.f183680r = 3;
            java.lang.String stringExtra = intent.getStringExtra("auth_raw_url");
            this.f183679q = stringExtra;
            this.f183669d = new com.tencent.mm.plugin.webview.model.j3(this, true, this.f183671f, stringExtra);
        } else {
            this.f183669d = new com.tencent.mm.plugin.webview.model.j3(this, this.f183671f, this.f183673h, this.f183674i, this.f183675m);
        }
        this.f183676n = intent.getIntExtra("3", -1);
        this.f183684v = intent.getBooleanExtra("auth_isoption1", false);
        android.os.Bundle bundleExtra = intent.getBundleExtra("send_auth_option");
        if (bundleExtra != null) {
            com.tencent.mm.opensdk.modelmsg.SendAuth.Options options = new com.tencent.mm.opensdk.modelmsg.SendAuth.Options();
            this.f183683u = options;
            options.fromBundle(bundleExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "options.callbackClassName: " + this.f183683u.callbackClassName + "  options.callbackFlags: " + this.f183683u.callbackFlags);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "SendAuth.options, bundle is null");
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483294a80);
        java.util.Iterator it = this.f183670e.f390513d.iterator();
        while (it.hasNext()) {
            r45.px4 px4Var = (r45.px4) it.next();
            if (px4Var.f383458d.equals(this.f183672g)) {
                textView.setText(px4Var.f383459e);
            }
        }
        textView.getPaint().setFakeBoldText(true);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a7z);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f183670e.f390528v)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(this.f183670e.f390528v);
        }
        com.tencent.mm.plugin.webview.model.j3 j3Var = this.f183669d;
        r45.xv5 xv5Var = this.f183670e;
        j3Var.f182967i = xv5Var.f390530x;
        this.A = xv5Var.f390515f;
        this.B = xv5Var.f390514e;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486109k75);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k7_);
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.raw.native_oauth_default_head_img;
        fVar.f342097u = getResources().getDimension(com.tencent.mm.R.dimen.a9i);
        fVar.f342096t = true;
        n11.a.b().h(this.f183670e.f390515f, imageView, fVar.a());
        textView3.setText(this.f183670e.f390514e);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.ion);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.ios);
        r45.px4 n17 = com.tencent.mm.plugin.webview.model.j3.n(this.f183672g, this.f183670e.f390513d);
        this.f183677o = java.lang.System.currentTimeMillis();
        button.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.p1(this, n17));
        button2.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.q1(this, n17));
        V6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183681s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(1346, this);
        gm0.j1.d().q(1137, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "onDestroy");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f183669d.d(-2, this.f183683u, this.f183685w, this.f183687y, this.f183684v);
        hy4.b.INSTANCE.a(this.f183671f, this.f183677o, 0, this.f183680r, U6(), 1, 0);
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "onPause");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthFriendUI", "onResume");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            hy4.b.INSTANCE.a(this.f183671f, this.f183677o, 2, this.f183680r, U6(), 1, i18);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183681s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var instanceof com.tencent.mm.plugin.webview.model.r1) {
            this.f183669d.r(this, this.f183685w, this.f183688z, this.f183686x, this.f183687y, this.A, this.B, i17, i18, str, m1Var, this.f183683u, this.f183684v);
        } else if (m1Var instanceof com.tencent.mm.plugin.webview.model.p1) {
            this.f183669d.q(i17, i18, str, m1Var, this.f183683u);
        }
    }
}
