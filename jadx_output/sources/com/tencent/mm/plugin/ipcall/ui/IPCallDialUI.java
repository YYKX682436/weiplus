package com.tencent.mm.plugin.ipcall.ui;

@db5.a(3)
/* loaded from: classes8.dex */
public class IPCallDialUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.ipcall.ui.n, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.DialPad f142589d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f142590e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f142591f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f142592g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f142593h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f142594i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageButton f142595m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f142596n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.o f142597o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f142598p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f142599q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f142600r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f142601s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f142602t;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f142606x;

    /* renamed from: y, reason: collision with root package name */
    public p83.b f142607y;

    /* renamed from: z, reason: collision with root package name */
    public p83.c f142608z;

    /* renamed from: u, reason: collision with root package name */
    public int f142603u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f142604v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f142605w = -1;
    public final com.tencent.mm.sdk.event.IListener A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateCountryCodeEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.ipcall.ui.IPCallDialUI.2
        {
            this.__eventId = -53647664;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.UpdateCountryCodeEvent updateCountryCodeEvent) {
            com.tencent.mm.autogen.events.UpdateCountryCodeEvent updateCountryCodeEvent2 = updateCountryCodeEvent;
            if (!(updateCountryCodeEvent2 instanceof com.tencent.mm.autogen.events.UpdateCountryCodeEvent)) {
                return false;
            }
            updateCountryCodeEvent2.f54914g.getClass();
            com.tencent.mm.plugin.ipcall.ui.IPCallDialUI iPCallDialUI = com.tencent.mm.plugin.ipcall.ui.IPCallDialUI.this;
            if (iPCallDialUI.f142597o == null || com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                return false;
            }
            iPCallDialUI.f142597o.c(null);
            return false;
        }
    };

    public final void T6() {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.RECORD_AUDIO", 80, null, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        if (a17) {
            setMMTitle(com.tencent.mm.R.string.g3l);
            setVolumeControlStream(1);
            this.f142589d = (com.tencent.mm.plugin.ipcall.ui.DialPad) findViewById(com.tencent.mm.R.id.cyt);
            this.f142590e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483954ck0);
            this.f142591f = findViewById(com.tencent.mm.R.id.cjy);
            this.f142592g = (android.widget.EditText) findViewById(com.tencent.mm.R.id.kuz);
            this.f142593h = findViewById(com.tencent.mm.R.id.kuy);
            this.f142594i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cyx);
            this.f142595m = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.cyd);
            this.f142596n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483956ck2);
            com.tencent.mm.plugin.ipcall.ui.o oVar = new com.tencent.mm.plugin.ipcall.ui.o(this, this.f142592g, this.f142590e, this.f142593h, this.f142589d, this.f142595m, this.f142594i, this.f142591f, this.f142596n, (android.widget.TextView) findViewById(com.tencent.mm.R.id.cyg));
            this.f142597o = oVar;
            oVar.f142949a = this;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142599q)) {
                this.f142597o.e(this.f142599q, -1);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142601s)) {
                this.f142597o.c(this.f142601s);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142599q) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f142601s)) {
                this.f142597o.b();
            }
            this.f142597o.d(this.f142606x);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blr;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142597o;
        oVar.getClass();
        if (i17 != 100 || i18 != 100) {
            if (i17 == 1001 && i18 == -1) {
                intent.getBooleanExtra("IPCallTalkUI_TalkIsOverdue", false);
                com.tencent.mm.ui.MMActivity mMActivity = oVar.f142957i;
                mMActivity.setResult(-1, intent);
                mMActivity.finish();
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("country_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        oVar.f142959k = stringExtra;
        java.lang.String concat = "+".concat(stringExtra2);
        oVar.f142960l = concat;
        oVar.f142950b.setText(concat);
        java.lang.String a17 = oVar.a(stringExtra2.replace("+", ""), oVar.f142961m);
        oVar.f142961m = a17;
        oVar.e(a17, -1);
        oVar.f142966r = false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.A.alive();
        c01.d9.e().a(807, this);
        c01.d9.e().a(746, this);
        getWindow().addFlags(131072);
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.q1(this), com.tencent.mm.R.raw.actionbar_quit_webview_icon);
        this.f142598p = getIntent().getStringExtra("IPCallTalkUI_nickname");
        this.f142599q = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
        this.f142600r = getIntent().getStringExtra("IPCallTalkUI_contactId");
        this.f142601s = getIntent().getStringExtra("IPCallTalkUI_countryCode");
        this.f142602t = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
        int intExtra = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
        this.f142603u = intExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "onCreate nickName:%s, phoneNumber:%s, contactId:%s, countryCode:%s, toUserName:%s, dialScene:%d", this.f142598p, this.f142599q, this.f142600r, this.f142601s, this.f142602t, java.lang.Integer.valueOf(intExtra));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142599q)) {
            this.f142599q = t83.f.i(this.f142599q);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f142601s)) {
            if (!t83.c.m(this.f142599q)) {
                this.f142601s = t83.f.f();
            } else {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(t83.c.a(this.f142599q))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "country code exist, directly go to talk ui.");
                    this.f142604v = 4;
                    android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI.class);
                    intent.putExtra("IPCallTalkUI_contactId", this.f142600r);
                    intent.putExtra("IPCallTalkUI_countryCode", this.f142601s);
                    intent.putExtra("IPCallTalkUI_nickname", this.f142598p);
                    intent.putExtra("IPCallTalkUI_phoneNumber", this.f142599q);
                    intent.putExtra("IPCallTalkUI_dialScene", this.f142603u);
                    intent.putExtra("IPCallTalkUI_countryType", this.f142604v);
                    startActivityForResult(intent, 1001);
                    finish();
                    return;
                }
                this.f142599q = t83.c.o(this.f142599q);
                this.f142601s = t83.f.f();
            }
        }
        if (this.f142603u != 1) {
            this.f142605w = 0;
            this.f142604v = 3;
            this.f142607y = new p83.b(this.f142599q, this.f142601s, "", com.tencent.mm.sdk.platformtools.t8.d0(this), this.f142603u);
            c01.d9.e().g(this.f142607y);
        } else {
            this.f142605w = -1;
            this.f142604v = 4;
        }
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142597o;
        if (oVar != null) {
            oVar.f142949a = null;
        }
        this.A.dead();
        c01.d9.e().q(807, this);
        c01.d9.e().q(746, this);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 80) {
            return;
        }
        if (iArr[0] == 0) {
            T6();
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.ipcall.ui.r1(this), new com.tencent.mm.plugin.ipcall.ui.s1(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        p83.b bVar;
        int i19;
        if (!(m1Var instanceof p83.b)) {
            if (m1Var instanceof p83.c) {
                if (i17 == 0 && i18 == 0) {
                    this.f142606x = ((p83.c) m1Var).f352735e.f379782e;
                } else {
                    this.f142606x = null;
                }
                com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142597o;
                if (oVar != null) {
                    oVar.d(this.f142606x);
                    return;
                }
                return;
            }
            return;
        }
        if (i17 == 0 && i18 == 0 && m1Var == (bVar = this.f142607y)) {
            r45.je5 je5Var = bVar.f352732e;
            if (je5Var != null) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(je5Var.f377767f);
                r45.je5 je5Var2 = this.f142607y.f352732e;
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "Response Result:%d,PureNumber:%s,CountryCode:%s", valueOf, je5Var2.f377765d, je5Var2.f377766e);
            }
            if (this.f142605w == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "NetSceneIPCallCheckNumber onSceneEnd, mCheckNumberStatus = userModify, ignore");
                return;
            }
            boolean z17 = true;
            this.f142605w = 1;
            this.f142604v = 1;
            r45.je5 je5Var3 = this.f142607y.f352732e;
            if (je5Var3 != null && je5Var3.f377767f == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "check error show error dialog");
                return;
            }
            if (je5Var3 == null || ((i19 = je5Var3.f377767f) != 1 && i19 != 0)) {
                z17 = false;
            }
            if (z17) {
                if (je5Var3 == null || com.tencent.mm.sdk.platformtools.t8.K0(je5Var3.f377766e)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "response country code is empty, ignore");
                } else if (this.f142597o != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "response country code:%s, old country code:%s", this.f142607y.f352732e.f377766e, this.f142601s);
                    java.lang.String str2 = this.f142607y.f352732e.f377766e;
                    this.f142601s = str2;
                    this.f142597o.c(str2);
                }
            }
            r45.je5 je5Var4 = this.f142607y.f352732e;
            if (je5Var4 == null || com.tencent.mm.sdk.platformtools.t8.K0(je5Var4.f377765d) || this.f142597o == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "response number:%s, old number:%s", this.f142607y.f352732e.f377765d, this.f142599q);
            java.lang.String str3 = this.f142607y.f352732e.f377765d;
            this.f142599q = str3;
            this.f142597o.e(str3, -1);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f142608z = new p83.c();
        c01.d9.e().g(this.f142608z);
    }
}
