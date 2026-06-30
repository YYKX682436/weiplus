package com.tencent.mm.plugin.walletlock.fingerprint.ui;

/* loaded from: classes9.dex */
public class FingerprintWalletLockUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.walletlock.ui.a {
    public static final /* synthetic */ int C = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f181288d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f181289e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f181290f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f181291g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.animation.Animation f181292h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f181293i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f181294m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f181295n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f181296o;

    /* renamed from: p, reason: collision with root package name */
    public fu4.h f181297p;

    /* renamed from: q, reason: collision with root package name */
    public fu4.n f181298q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.walletlock.model.f f181299r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f181300s = "-1";

    /* renamed from: t, reason: collision with root package name */
    public int f181301t = 0;

    /* renamed from: u, reason: collision with root package name */
    public android.app.ProgressDialog f181302u = null;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f181303v = null;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f181304w = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f181305x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f181306y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f181307z = true;
    public int A = -1;
    public int B = -1;

    public static void T6(com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI, int i17, java.lang.String str) {
        fingerprintWalletLockUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "onAuthenFailed errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.walletlock.model.m.c(fingerprintWalletLockUI.B, 2, 1);
        fingerprintWalletLockUI.c7(str);
    }

    public static void U6(com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI, int i17, java.lang.String str) {
        fingerprintWalletLockUI.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.FingerprintWalletLockUI", "onAuthenError errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        fu4.a.f266884a = -1L;
        fingerprintWalletLockUI.V6();
        if (i17 == 3) {
            com.tencent.mm.plugin.walletlock.model.m.c(fingerprintWalletLockUI.B, 2, 2);
            fu4.a.f(java.lang.System.currentTimeMillis(), 0L);
            fingerprintWalletLockUI.f181288d.setText(com.tencent.mm.R.string.knw);
            fingerprintWalletLockUI.f181288d.setTextColor(fingerprintWalletLockUI.getResources().getColor(com.tencent.mm.R.color.a2y));
            return;
        }
        if (i17 == 8) {
            fingerprintWalletLockUI.e7();
        } else {
            fingerprintWalletLockUI.c7(str);
        }
    }

    public final void V6() {
        W6();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f181303v;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        this.f181303v.dismiss();
    }

    public final void W6() {
        android.app.ProgressDialog progressDialog = this.f181302u;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f181302u.dismiss();
    }

    public final void X6() {
        com.tencent.mm.plugin.walletlock.model.n.INSTANCE.h();
    }

    public final void Y6(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "finish with result, resultCode: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        release();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", i18);
        intent.putExtra("key_err_msg", str);
        setResult(i17, intent);
        finish();
        if (i18 == 4 || i18 == 0) {
            com.tencent.mm.autogen.events.WalletLockProtectEvent walletLockProtectEvent = new com.tencent.mm.autogen.events.WalletLockProtectEvent();
            int i19 = i18 == 4 ? 5 : 6;
            am.n10 n10Var = walletLockProtectEvent.f54960g;
            n10Var.f7392a = i19;
            n10Var.f7393b = this;
            walletLockProtectEvent.e();
        }
    }

    public final void Z6() {
        this.f181307z = false;
        com.tencent.mm.sdk.platformtools.u3.i(new gu4.b(this), 200L);
        android.content.Intent intent = (android.content.Intent) getIntent().getParcelableExtra("page_intent");
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "Protected page's intent not found, finish myself only.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "go to protected page");
        com.tencent.mm.plugin.walletlock.model.n nVar = com.tencent.mm.plugin.walletlock.model.n.INSTANCE;
        nVar.j(true);
        nVar.k(true);
        intent.addFlags(131072);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "goToProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "goToProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
    }

    public final void a7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "currentAction: %s", this.f181295n);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f181295n)) {
            finish();
            return;
        }
        java.lang.String str = this.f181295n;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1423990800:
                if (str.equals("next_action.goto_protected_page")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1305462654:
                if (str.equals("action.verify_pattern")) {
                    c17 = 1;
                    break;
                }
                break;
            case -639789777:
                if (str.equals("next_action.switch_on_pattern")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1420518755:
                if (str.equals("action.switch_on_pattern")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                fu4.a.f266884a = android.os.SystemClock.elapsedRealtime();
                Z6();
                return;
            case 1:
            case 3:
                this.f181299r = new gu4.p(this, this);
                this.f181300s = "-1";
                if (this.f181298q == null) {
                    this.f181298q = new fu4.n();
                }
                boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_soter_adopt_to_android12_by_device, 0) == 1 || bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_UseBiometricPrompt_Int, 0) == 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "use biometric prompt: %s", java.lang.Boolean.valueOf(z17));
                if (!z17) {
                    this.f181298q.a(this.f181299r);
                    return;
                }
                d50.n nVar = new d50.n();
                if (this.A == 1) {
                    nVar.f226517a = getString(com.tencent.mm.R.string.ko8);
                    nVar.f226518b = getString(com.tencent.mm.R.string.ko7);
                    nVar.f226519c = getString(com.tencent.mm.R.string.f490347sg);
                } else {
                    nVar.f226517a = getString(com.tencent.mm.R.string.ko8);
                    nVar.f226519c = getString(com.tencent.mm.R.string.f490347sg);
                }
                this.f181298q.b(this.f181299r, nVar);
                return;
            case 2:
                zt5.s sVar = com.tencent.mm.plugin.walletlock.model.l.instance.f181371e;
                if (sVar == null) {
                    c7(getString(com.tencent.mm.R.string.knu));
                    return;
                }
                java.lang.String str2 = sVar.f475629j;
                java.lang.String str3 = sVar.f475630k;
                if (this.f181297p != null) {
                    this.f181302u = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.f493546ko0), false, false, null);
                    fu4.h hVar = this.f181297p;
                    gu4.e eVar = new gu4.e(this);
                    java.lang.String str4 = this.f181296o;
                    fu4.f fVar = (fu4.f) hVar;
                    fVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintLockOpenDelegate", "do open fingerprint lock");
                    fVar.f266890e = eVar;
                    gm0.j1.d().g(new fu4.j(str2, str3, str4));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void b7(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = getString(com.tencent.mm.R.string.kny);
        }
        V6();
        com.tencent.mm.ui.widget.dialog.j0 G = db5.e1.G(this, str, "", true, new gu4.c(this));
        this.f181303v = G;
        G.setCanceledOnTouchOutside(false);
    }

    public final void c7(java.lang.String str) {
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        if (currentTimeMillis - this.f181301t > 1) {
            this.f181301t = currentTimeMillis;
            V6();
            android.widget.TextView textView = this.f181288d;
            if (textView != null) {
                textView.setText(str);
                this.f181288d.setTextColor(getResources().getColor(com.tencent.mm.R.color.a2y));
                this.f181288d.setVisibility(4);
                if (this.f181292h == null) {
                    this.f181292h = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477792bl);
                }
                this.f181288d.startAnimation(this.f181292h);
                com.tencent.mm.sdk.platformtools.u3.i(new gu4.d(this), this.f181292h.getDuration());
            }
        }
    }

    public final void d7() {
        if (this.f181293i.equals("action.verify_pattern")) {
            this.f181288d.setText(com.tencent.mm.R.string.knz);
            this.f181288d.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
            this.f181291g.setVisibility(0);
        } else {
            this.f181288d.setText(com.tencent.mm.R.string.knt);
            this.f181288d.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
            this.f181291g.setVisibility(8);
        }
    }

    public final void e7() {
        W6();
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "mAuthType: %d", java.lang.Integer.valueOf(this.A));
        if (this.A == 2) {
            i0Var.d(com.tencent.mm.R.string.f493551ko5);
            i0Var.f(com.tencent.mm.R.string.koc);
            i0Var.f211821b.E = new gu4.l(this);
            i0Var.e(com.tencent.mm.R.string.f490347sg);
            i0Var.f211821b.F = new gu4.k(this);
        } else {
            i0Var.d(com.tencent.mm.R.string.f493550ko4);
            java.lang.String string = getString(com.tencent.mm.R.string.f490507x1);
            com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
            aVar.f211732v = string;
            aVar.E = new gu4.m(this);
        }
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        this.f181303v = a17;
        a17.setCanceledOnTouchOutside(false);
        this.f181303v.show();
    }

    public final void f7(int i17) {
        android.content.Intent intent = new android.content.Intent();
        if (i17 == 1) {
            intent.putExtra("action", "action.touchlock_verify_by_paypwd");
        } else if (i17 == 2) {
            intent.putExtra("action", "action.touchlock_need_verify_paypwd");
            intent.putExtra("key_wallet_lock_input_new_fp_tips", getString(com.tencent.mm.R.string.f493549ko3));
        }
        intent.putExtra("key_wallet_lock_type", 2);
        j45.l.n(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, i17);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        release();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.baj;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        this.f181288d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484997g65);
        this.f181289e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kr7);
        this.f181290f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484992g60);
        this.f181291g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484994g62);
        this.f181289e.setOnClickListener(new gu4.g(this));
        this.f181290f.setOnClickListener(new gu4.h(this));
        this.f181291g.setOnClickListener(new gu4.i(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerprintWalletLockUI", "data is null");
            return;
        }
        int intExtra = intent.getIntExtra("key_err_code", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "onActivityResult errCode: %d", java.lang.Integer.valueOf(intExtra));
        if (i17 == 1) {
            if (intExtra == 0) {
                Z6();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockReportManager", "idkey report fingerprintlock verify by passwd success");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(713L, 2L, 1L, false);
                return;
            } else {
                if (intExtra == -1) {
                    this.f181307z = false;
                    b7(getString(com.tencent.mm.R.string.koi));
                    return;
                }
                return;
            }
        }
        if (i17 == 2) {
            if (intExtra == 0) {
                fu4.a.a(this.f181300s);
                fu4.a.f266884a = android.os.SystemClock.elapsedRealtime();
                Z6();
                return;
            } else {
                if (intExtra == -1) {
                    this.f181307z = false;
                    b7(getString(com.tencent.mm.R.string.koi));
                    return;
                }
                return;
            }
        }
        if (i17 == 3) {
            if (intExtra == 0) {
                Z6();
                return;
            } else {
                X6();
                Y6(-1, intExtra, "user cancel when set wallet lock");
                return;
            }
        }
        if (i17 == 4) {
            if (intExtra == 0) {
                Z6();
                return;
            } else if (intExtra == -1) {
                this.f181307z = false;
                b7(getString(com.tencent.mm.R.string.f493547ko1));
                return;
            } else {
                X6();
                Y6(-1, intExtra, "user cancel when open gesture");
                return;
            }
        }
        if (i17 == 5) {
            if (intExtra == 0) {
                ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().j(0);
                hu4.i.f285230a = -1L;
                fu4.a.f266884a = -1L;
                dp.a.makeText(this, getString(com.tencent.mm.R.string.knl), 0).show();
                Z6();
                return;
            }
            if (intExtra == -1) {
                this.f181307z = false;
                b7(getString(com.tencent.mm.R.string.knm));
            } else if (intExtra == 4) {
                X6();
                Y6(-1, intExtra, "user cancel when close wallet lock");
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "onBackPressed");
        X6();
        Y6(0, 4, "user click back button");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "onCreate %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        initView();
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent.getStringExtra("action");
        this.f181293i = stringExtra;
        this.f181295n = stringExtra;
        this.f181294m = intent.getStringExtra("next_action");
        this.f181296o = intent.getStringExtra("token");
        this.f181304w = intent.getStringExtra("key_pay_passwd");
        this.B = intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "mAction: %s, mNextAction: %s", this.f181293i, this.f181294m);
        if (!this.f181293i.equals("action.verify_pattern")) {
            if (this.f181293i.equals("action.switch_on_pattern")) {
                this.A = 1;
            }
        } else {
            this.A = 2;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.walletlock.model.m.f181373a = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockReportManager", "wallet lock report create session: %d", java.lang.Long.valueOf(currentTimeMillis));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "FingerprintWalletLockUI onPause");
        V6();
        release();
        this.f181307z = true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "needResume: %b", java.lang.Boolean.valueOf(this.f181307z));
        if (this.f181307z) {
            this.f181297p = new fu4.f();
            this.f181298q = new fu4.n();
            this.f181306y = false;
            ju5.n.c().b();
            this.f181302u = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.f490604zq), false, false, null);
            d7();
            if (this.f181293i.equals("action.switch_on_pattern")) {
                this.f181305x = false;
            } else {
                this.f181305x = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "start prepare, time: %d, isOffline: %b", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Boolean.valueOf(this.f181305x));
            com.tencent.mm.plugin.walletlock.model.l lVar = com.tencent.mm.plugin.walletlock.model.l.instance;
            boolean z17 = re4.g0.c() && wt5.a.n(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (lVar.i() && !z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "user opend fingerprint lock but device not support soter, isSupportFingerprintLock: %b", java.lang.Boolean.valueOf(z17));
                if (hu4.j.g()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "user opened gesture, then switch to gesture");
                    ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().j(1);
                    lVar.l(true);
                    finish();
                    android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.class);
                    intent.addFlags(131072);
                    intent.putExtra("action", "action.verify_pattern");
                    intent.putExtra("next_action", "next_action.goto_protected_page");
                    intent.putExtra("page_intent", (android.content.Intent) getIntent().getParcelableExtra("page_intent"));
                    intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_IS_AUTO_JUMP_TO_GESTURE_WHEN_NOT_SUPPORT_FINGERPRINT_BOOLEAN_SYNC;
                    boolean o17 = c17.o(u3Var, false);
                    if (!o17) {
                        intent.putExtra("verify_title", getString(com.tencent.mm.R.string.kog));
                        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                        gm0.j1.u().c().i(true);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "start gesture protect ui, isShowed: %b", java.lang.Boolean.valueOf(o17));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "startGestureProtect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "startGestureProtect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12097, 8, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "show not support fingerprint dialog");
                    W6();
                    com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                    aVar.f211729s = of5.b.a(this).getString(com.tencent.mm.R.string.ko6);
                    aVar.f211732v = of5.b.a(this).getString(com.tencent.mm.R.string.kod);
                    aVar.E = new gu4.o(this);
                    aVar.G = new gu4.n(this);
                    com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
                    j0Var.e(aVar);
                    com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                    if (d0Var != null) {
                        d0Var.a(j0Var.f211837r);
                    }
                    this.f181303v = j0Var;
                    j0Var.setCanceledOnTouchOutside(false);
                    this.f181303v.w(getString(com.tencent.mm.R.string.knj), false, new gu4.a(this));
                    this.f181303v.show();
                }
            } else if (wt5.a.p(this)) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key_pay_passwd", this.f181304w);
                bundle.putBoolean("key_fp_lock_offline_mode", this.f181305x);
                ((fu4.f) this.f181297p).a(this, new gu4.j(this), bundle);
            } else {
                e7();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "onResume end: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }

    public final void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "fingerprint lock ui release isCancelled: %b", java.lang.Boolean.valueOf(this.f181306y));
        if (this.f181306y) {
            return;
        }
        this.f181306y = true;
        fu4.n nVar = this.f181298q;
        if (nVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintAuthManager", "release fingerprint auth");
            d50.q qVar = nVar.f266906a;
            if (qVar != null) {
                ((ne4.n) qVar).a(true);
            }
        }
        fu4.h hVar = this.f181297p;
        if (hVar != null) {
            fu4.f fVar = (fu4.f) hVar;
            fVar.f266889d = null;
            fVar.f266890e = null;
            fVar.f266893h = true;
            gm0.j1.d().q(1967, fVar);
            gm0.j1.d().q(1548, fVar);
        }
        ju5.n.c().b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(hu4.b.class);
    }
}
