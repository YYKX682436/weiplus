package com.tencent.mm.plugin.login_exdevice.ui;

/* loaded from: classes12.dex */
public class LoginAsExDeviceUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f144970y = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f144971d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f144972e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f144973f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f144974g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f144975h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f144976i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f144977m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f144978n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f144979o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f144980p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ProgressBar f144981q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f144982r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f144983s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f144984t = false;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f144985u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f144986v;

    /* renamed from: w, reason: collision with root package name */
    public int f144987w;

    /* renamed from: x, reason: collision with root package name */
    public final x51.c1 f144988x;

    public LoginAsExDeviceUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f144985u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewExWindowCloseEvent>(a0Var) { // from class: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI.8
            {
                this.__eventId = 1684674094;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WebViewExWindowCloseEvent webViewExWindowCloseEvent) {
                com.tencent.mm.autogen.events.WebViewExWindowCloseEvent webViewExWindowCloseEvent2 = webViewExWindowCloseEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.LoginAsExDeviceUI", "WebViewExWindowCloseEvent callback : %s", webViewExWindowCloseEvent2.f54984g.f7220a);
                if (webViewExWindowCloseEvent2.f54984g.f7220a.equals("continue_check")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LoginAsExDeviceUI", "continue check");
                    com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI = com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI.this;
                    loginAsExDeviceUI.f144984t = false;
                    loginAsExDeviceUI.T6();
                }
                return false;
            }
        };
        this.f144986v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewUIDestroyEvent>(a0Var) { // from class: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI.9
            {
                this.__eventId = -1681666147;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WebViewUIDestroyEvent webViewUIDestroyEvent) {
                com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI = com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI.this;
                com.tencent.mars.xlog.Log.i("MicroMsg.LoginAsExDeviceUI", "WebViewUIDestroyEventEventListener!! %s", java.lang.Boolean.valueOf(loginAsExDeviceUI.f144984t));
                if (loginAsExDeviceUI.f144984t) {
                    loginAsExDeviceUI.f144984t = false;
                    android.view.View view = loginAsExDeviceUI.f144974g;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = loginAsExDeviceUI.f144976i;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = loginAsExDeviceUI.f144975h;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    loginAsExDeviceUI.V6(0L);
                }
                return false;
            }
        };
        this.f144987w = 200;
        this.f144988x = new x51.c1();
    }

    public final void T6() {
        long j17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginAsExDeviceUI", "doCheckLogin %s", new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mm.plugin.login_exdevice.ui.a aVar = new com.tencent.mm.plugin.login_exdevice.ui.a(this);
        int i17 = this.f144987w;
        if (i17 > 2000) {
            j17 = 2000;
        } else {
            int i18 = i17 + 200;
            this.f144987w = i18;
            j17 = i18;
        }
        com.tencent.mm.sdk.platformtools.u3.i(aVar, j17);
    }

    public final void U6() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f144982r) && this.f144983s != null) {
            this.f144973f.setText(com.tencent.mm.R.string.ghs);
            android.widget.ImageView imageView = this.f144972e;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        this.f144973f.setVisibility(0);
        android.widget.ImageView imageView2 = this.f144972e;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        this.f144973f.setText(com.tencent.mm.R.string.gha);
        this.f144973f.setOnClickListener(new com.tencent.mm.plugin.login_exdevice.ui.b(this));
    }

    public final void V6(long j17) {
        this.f144979o.setVisibility(8);
        this.f144971d.setVisibility(8);
        this.f144981q.setVisibility(0);
        android.widget.ImageView imageView = this.f144972e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.login_exdevice.ui.g(this), j17);
    }

    public final void W6() {
        this.f144982r = null;
        this.f144983s = null;
        this.f144971d.setImageResource(com.tencent.mm.R.drawable.byz);
        this.f144971d.setOnClickListener(new com.tencent.mm.plugin.login_exdevice.ui.h(this));
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        int i17 = getResources().getConfiguration().orientation;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return i17 == 2 ? com.tencent.mm.R.layout.bsw : com.tencent.mm.R.layout.bsv;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ipc);
        this.f144974g = findViewById;
        this.f144971d = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.ioi);
        this.f144981q = (android.widget.ProgressBar) this.f144974g.findViewById(com.tencent.mm.R.id.uvs);
        this.f144973f = (android.widget.Button) this.f144974g.findViewById(com.tencent.mm.R.id.ioh);
        this.f144972e = (android.widget.ImageView) this.f144974g.findViewById(com.tencent.mm.R.id.lfh);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f485704ip5);
        this.f144975h = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ioe);
        this.f144976i = findViewById3;
        this.f144977m = (android.widget.ImageView) findViewById3.findViewById(com.tencent.mm.R.id.ioy);
        this.f144978n = (android.widget.TextView) this.f144976i.findViewById(com.tencent.mm.R.id.ioz);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.b5o);
        this.f144979o = button;
        button.setOnClickListener(new com.tencent.mm.plugin.login_exdevice.ui.e(this));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        hideActionbarLine();
        setMMTitle("");
        setBackBtn(new com.tencent.mm.plugin.login_exdevice.ui.f(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
        if (!com.tencent.mm.sdk.platformtools.t8.N0(null, null, null, null)) {
            throw null;
        }
        V6(0L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.app.w7.b(0);
        initView();
        this.f144985u.alive();
        this.f144986v.alive();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f144985u.dead();
        this.f144986v.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        com.tencent.mm.app.w7.b(-1);
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477830co);
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f144988x.c(this, i17, strArr, iArr);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(502, this);
        gm0.j1.d().a(503, this);
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
        gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.c.CTRL_INDEX, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04ab  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r32, int r33, java.lang.String r34, com.tencent.mm.modelbase.m1 r35) {
        /*
            Method dump skipped, instructions count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        gm0.j1.d().q(502, this);
        gm0.j1.d().q(503, this);
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.c.CTRL_INDEX, this);
        super.onStop();
    }
}
