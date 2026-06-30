package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public final class SettingFingerprintHomeUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f160206o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f160207d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f160208e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f160209f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f160210g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f160211h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f160212i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f160213m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160214n;

    public final void T6(boolean z17, boolean z18) {
        rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] current safe request", new java.lang.Object[0]);
        wd0.f[] fVarArr = wd0.f.f444711d;
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).wi(getLifecycleAsyncScope(), z18 ? 2 : 1, null, new com.tencent.mm.plugin.setting.ui.setting.m3(z18, this));
    }

    public final void U6(java.lang.String str) {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.A = false;
        aVar.f211729s = str;
        aVar.f211732v = getContext().getString(com.tencent.mm.R.string.f490454vi);
        aVar.E = com.tencent.mm.plugin.setting.ui.setting.n3.f161345d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }

    public final void V6(boolean z17, boolean z18) {
        rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "current click the switch button, state is " + z17, new java.lang.Object[0]);
        if (!z18) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("switch_status_before", java.lang.Integer.valueOf(!z17 ? 1 : 0));
            hashMap.put("switch_status_after", java.lang.Integer.valueOf(z17 ? 1 : 0));
            java.lang.String str = com.tencent.mm.plugin.setting.ui.setting.ub.f161603a;
            if (str == null) {
                str = "";
            }
            hashMap.put("fingerprint_session_id", str);
            ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ai("fingerprint_login_switch", "view_clk", hashMap);
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = getString(com.tencent.mm.R.string.p9d);
        e4Var.f211780g = 2;
        this.f160213m = e4Var.c();
        if (z17) {
            boolean o17 = wt5.a.o(getContext(), 1);
            rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] has fingerprint " + o17, new java.lang.Object[0]);
            if (!o17) {
                com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f160213m;
                if (f4Var != null) {
                    f4Var.dismiss();
                }
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
                u1Var.g(getString(com.tencent.mm.R.string.p98));
                u1Var.a(false);
                u1Var.n(getString(com.tencent.mm.R.string.p9a));
                u1Var.j(getString(com.tencent.mm.R.string.p9_));
                u1Var.l(new com.tencent.mm.plugin.setting.ui.setting.o3(this));
                u1Var.q(false);
                return;
            }
            com.tencent.mm.plugin.setting.ui.setting.vb vbVar = com.tencent.mm.plugin.setting.ui.setting.vb.f161639a;
            if (!vbVar.b()) {
                com.tencent.mm.ui.widget.dialog.f4 f4Var2 = this.f160213m;
                if (f4Var2 != null) {
                    f4Var2.dismiss();
                }
                java.lang.String string = getString(com.tencent.mm.R.string.p9e, vbVar.a());
                kotlin.jvm.internal.o.f(string, "getString(...)");
                U6(string);
                return;
            }
        }
        this.f160212i = true;
        T6(true, z17);
    }

    public final void W6() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        if (((vd0.v1) j1Var).Ni(r17)) {
            android.widget.Button button = this.f160207d;
            if (button == null) {
                kotlin.jvm.internal.o.o("openBtn");
                throw null;
            }
            button.setVisibility(8);
            android.widget.Button button2 = this.f160208e;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("closeBtn");
                throw null;
            }
            button2.setVisibility(0);
            android.widget.TextView textView = this.f160209f;
            if (textView == null) {
                kotlin.jvm.internal.o.o("updateBtn");
                throw null;
            }
            textView.setVisibility(0);
            android.widget.TextView textView2 = this.f160210g;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView2.setText(getString(com.tencent.mm.R.string.p9h));
            android.widget.TextView textView3 = this.f160211h;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("descTV");
                throw null;
            }
            textView3.setVisibility(4);
        } else {
            android.widget.Button button3 = this.f160207d;
            if (button3 == null) {
                kotlin.jvm.internal.o.o("openBtn");
                throw null;
            }
            button3.setVisibility(0);
            android.widget.Button button4 = this.f160208e;
            if (button4 == null) {
                kotlin.jvm.internal.o.o("closeBtn");
                throw null;
            }
            button4.setVisibility(8);
            android.widget.TextView textView4 = this.f160209f;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("updateBtn");
                throw null;
            }
            textView4.setVisibility(4);
            android.widget.TextView textView5 = this.f160210g;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView5.setText(getString(com.tencent.mm.R.string.p9g));
            android.widget.TextView textView6 = this.f160211h;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("descTV");
                throw null;
            }
            textView6.setVisibility(0);
        }
        android.widget.TextView textView7 = this.f160210g;
        if (textView7 == null) {
            kotlin.jvm.internal.o.o("titleTV");
            throw null;
        }
        com.tencent.mm.ui.bk.s0(textView7.getPaint());
        android.widget.TextView textView8 = this.f160209f;
        if (textView8 != null) {
            com.tencent.mm.ui.bk.s0(textView8.getPaint());
        } else {
            kotlin.jvm.internal.o.o("updateBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.end;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1) {
            com.tencent.mm.feature.setting.api.BindFingerprintCallback bindFingerprintCallback = intent != null ? (com.tencent.mm.feature.setting.api.BindFingerprintCallback) intent.getParcelableExtra("bind_result") : null;
            if (bindFingerprintCallback == null || bindFingerprintCallback.f67814e != 0) {
                rk0.c.b("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] result is ok, but param is null", new java.lang.Object[0]);
                return;
            }
            rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] bind result(callback) is errType: " + bindFingerprintCallback.f67813d + ", errCode: " + bindFingerprintCallback.f67814e + ", errMsg: " + bindFingerprintCallback.f67815f + ",res is " + bindFingerprintCallback.f67816g, new java.lang.Object[0]);
            js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
            js.a aVar = js.a.WCAccountLogoutEntry_Fingerprint;
            is.f fVar = (is.f) r0Var;
            fVar.getClass();
            com.tencent.mm.sdk.platformtools.o4 Ui = fVar.Ui();
            if (Ui != null) {
                Ui.A(fVar.Ni(aVar), Integer.MAX_VALUE);
            }
            java.lang.String stringExtra = intent.getStringExtra("fingerprint_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            ((vd0.v1) j1Var).aj(true, stringExtra, r17);
            return;
        }
        if (i18 != 0) {
            return;
        }
        if (intent == null) {
            rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] result is canceled", new java.lang.Object[0]);
            return;
        }
        rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] result is verify error", new java.lang.Object[0]);
        com.tencent.mm.feature.setting.api.BindFingerprintCallback bindFingerprintCallback2 = (com.tencent.mm.feature.setting.api.BindFingerprintCallback) intent.getParcelableExtra("bind_result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fingerprint login] bind result(callback) is errType: ");
        sb6.append(bindFingerprintCallback2 != null ? java.lang.Integer.valueOf(bindFingerprintCallback2.f67813d) : null);
        sb6.append(", errCode: ");
        sb6.append(bindFingerprintCallback2 != null ? java.lang.Integer.valueOf(bindFingerprintCallback2.f67814e) : null);
        sb6.append(", errMsg: ");
        sb6.append(bindFingerprintCallback2 != null ? bindFingerprintCallback2.f67815f : null);
        sb6.append(",res is ");
        sb6.append(bindFingerprintCallback2 != null ? bindFingerprintCallback2.f67816g : null);
        rk0.c.c("MicroMsg.SettingFingerprintHomeUI", sb6.toString(), new java.lang.Object[0]);
        if (bindFingerprintCallback2 != null) {
            if (bindFingerprintCallback2.f67815f.length() > 0) {
                ((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(getContext(), bindFingerprintCallback2.f67813d, bindFingerprintCallback2.f67814e, bindFingerprintCallback2.f67815f);
                return;
            }
        }
        if (intent.getIntExtra("verify_result", 0) == 1022) {
            com.tencent.mm.plugin.setting.ui.setting.vb.f161640b = java.lang.System.currentTimeMillis() / 1000;
            java.lang.String string = getString(com.tencent.mm.R.string.p9e, com.tencent.mm.plugin.setting.ui.setting.vb.f161639a.a());
            kotlin.jvm.internal.o.f(string, "getString(...)");
            U6(string);
            return;
        }
        if (this.f160214n) {
            java.lang.String string2 = getString(com.tencent.mm.R.string.p9j);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            U6(string2);
        } else {
            java.lang.String string3 = getString(com.tencent.mm.R.string.p9c);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            U6(string3);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kio);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f160207d = (android.widget.Button) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483758bz2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f160208e = (android.widget.Button) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.vki);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f160209f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f160210g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.cut);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f160211h = (android.widget.TextView) findViewById5;
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.f3(this));
        this.f160214n = false;
        android.widget.Button button = this.f160207d;
        if (button == null) {
            kotlin.jvm.internal.o.o("openBtn");
            throw null;
        }
        button.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.g3(this));
        android.widget.Button button2 = this.f160208e;
        if (button2 == null) {
            kotlin.jvm.internal.o.o("closeBtn");
            throw null;
        }
        button2.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.h3(this));
        android.widget.TextView textView = this.f160209f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("updateBtn");
            throw null;
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.i3(this));
        if (com.tencent.mm.plugin.setting.ui.setting.ub.f161603a == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            long n17 = j62.e.g().n();
            if (n17 == 0) {
                str = "0";
            } else if (n17 > 0) {
                str = java.lang.Long.toString(n17, 10);
            } else {
                char[] cArr = new char[64];
                long j17 = (n17 >>> 1) / 5;
                long j18 = 10;
                int i17 = 63;
                cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
                while (j17 > 0) {
                    i17--;
                    cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                    j17 /= j18;
                }
                str = new java.lang.String(cArr, i17, 64 - i17);
            }
            sb6.append(str);
            sb6.append('_');
            sb6.append(java.lang.System.currentTimeMillis());
            com.tencent.mm.plugin.setting.ui.setting.ub.f161603a = sb6.toString();
        }
        wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        boolean Ni = ((vd0.v1) j1Var).Ni(r17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FingerPrintSettingPage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 29254);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this, kz5.c1.k(new jz5.l("fingerprint_login_status", java.lang.Boolean.valueOf(Ni)), new jz5.l("fingerprint_session_id", com.tencent.mm.plugin.setting.ui.setting.ub.f161603a)));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.setting.ui.setting.ub.f161603a = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        W6();
        if (this.f160212i) {
            this.f160212i = false;
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            boolean Ni = ((vd0.v1) j1Var).Ni(r17);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = getString(com.tencent.mm.R.string.p9d);
            e4Var.f211780g = 2;
            this.f160213m = e4Var.c();
            if (!Ni || this.f160214n) {
                T6(false, true);
            } else {
                T6(false, false);
            }
        }
    }
}
