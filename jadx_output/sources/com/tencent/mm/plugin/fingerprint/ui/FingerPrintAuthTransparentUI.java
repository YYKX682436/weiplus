package com.tencent.mm.plugin.fingerprint.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class FingerPrintAuthTransparentUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements pz2.b {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f136994s = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Dialog f136997f;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f137000i;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f136995d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k2 f136996e = null;

    /* renamed from: g, reason: collision with root package name */
    public pz2.d f136998g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f136999h = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f137001m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f137002n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f137003o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f137004p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f137005q = "verifyFail";

    /* renamed from: r, reason: collision with root package name */
    public final pz2.c f137006r = new qz2.k(this);

    public static void U6(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        fingerPrintAuthTransparentUI.getClass();
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        if (currentTimeMillis - fingerPrintAuthTransparentUI.f137001m > 1) {
            fingerPrintAuthTransparentUI.f137001m = currentTimeMillis;
            ((android.widget.TextView) fingerPrintAuthTransparentUI.f136995d.findViewById(com.tencent.mm.R.id.o_w)).setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) fingerPrintAuthTransparentUI.f136995d.findViewById(com.tencent.mm.R.id.dho);
            textView.setVisibility(4);
            if (fingerPrintAuthTransparentUI.f137000i == null) {
                fingerPrintAuthTransparentUI.f137000i = android.view.animation.AnimationUtils.loadAnimation(fingerPrintAuthTransparentUI.getContext(), com.tencent.mm.R.anim.f477791bk);
            }
            textView.startAnimation(fingerPrintAuthTransparentUI.f137000i);
            com.tencent.mm.sdk.platformtools.u3.i(new qz2.m(fingerPrintAuthTransparentUI, textView), fingerPrintAuthTransparentUI.f137000i.getDuration());
        }
    }

    public static void V6(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI, boolean z17) {
        re4.n.i(2, fingerPrintAuthTransparentUI.f137002n);
        if (z17) {
            re4.n.g(10, -1000223, -1, "user permanent cancelled");
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled and checked as not show anymore");
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_IN_TRANSPARENT_NEW_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled but will show again");
            re4.n.g(1, -1000223, -1, "user cancelled");
        }
        fingerPrintAuthTransparentUI.finish();
    }

    public static void W6(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        fingerPrintAuthTransparentUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "showIdentifyUI!");
        android.view.View inflate = android.view.LayoutInflater.from(fingerPrintAuthTransparentUI).inflate(com.tencent.mm.R.layout.bae, (android.view.ViewGroup) null);
        fingerPrintAuthTransparentUI.f136995d = inflate;
        android.view.ViewParent parent = inflate.getParent();
        android.view.ViewGroup viewGroup = parent != null ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ((android.widget.ImageView) fingerPrintAuthTransparentUI.f136995d.findViewById(com.tencent.mm.R.id.g5r)).setOnClickListener(new qz2.c(fingerPrintAuthTransparentUI));
        com.tencent.mm.ui.widget.dialog.k2 k2Var = fingerPrintAuthTransparentUI.f136996e;
        if (k2Var != null && k2Var.isShowing()) {
            fingerPrintAuthTransparentUI.f136996e.dismiss();
            fingerPrintAuthTransparentUI.f136996e = null;
        }
        com.tencent.mm.ui.widget.dialog.k2 k2Var2 = new com.tencent.mm.ui.widget.dialog.k2(fingerPrintAuthTransparentUI, com.tencent.mm.R.style.f494794wg);
        fingerPrintAuthTransparentUI.f136996e = k2Var2;
        k2Var2.setContentView(fingerPrintAuthTransparentUI.f136995d);
        fingerPrintAuthTransparentUI.f136996e.setCanceledOnTouchOutside(false);
        fingerPrintAuthTransparentUI.f136996e.setCancelable(true);
        fingerPrintAuthTransparentUI.f136996e.show();
        fingerPrintAuthTransparentUI.f136996e.setOnCancelListener(new qz2.d(fingerPrintAuthTransparentUI));
        db5.e1.a(fingerPrintAuthTransparentUI, fingerPrintAuthTransparentUI.f136996e);
    }

    public final void X6() {
        re4.n.i(3, this.f137002n);
        android.content.Intent intent = getIntent();
        this.f136998g.a(this, new qz2.s(this), intent != null ? intent.getStringExtra("key_pwd1") : "");
        a7(true);
        com.tencent.mm.ui.widget.dialog.k2 k2Var = this.f136996e;
        if (k2Var == null || !k2Var.isShowing()) {
            return;
        }
        this.f136996e.dismiss();
    }

    public final void Y6() {
        this.f137005q = "cgiFail";
        this.f136998g.b(this, "" + this.f136999h, 2);
    }

    public final void Z6() {
        this.f136998g.c(getContext(), new qz2.l(this));
    }

    public void a7(boolean z17) {
        if (z17) {
            this.f136997f = com.tencent.mm.wallet_core.ui.b2.h(this, false, null);
            return;
        }
        android.app.Dialog dialog = this.f136997f;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f136997f.dismiss();
        this.f136997f = null;
    }

    public final void b7(int i17, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = getString(i17);
        }
        db5.e1.E(this, str, "", getString(com.tencent.mm.R.string.kmf), false, new qz2.f(this));
    }

    public final void c7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled");
        ((pz2.a) gm0.j1.s(pz2.a.class)).userCancel();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        pz2.d dVar = this.f136998g;
        if (dVar != null) {
            dVar.clear();
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        a7(false);
        if (i17 != 0) {
            if (i17 != -2) {
                b7(-1, str);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay failed");
            if (android.text.TextUtils.isEmpty(str)) {
                str = getString(com.tencent.mm.R.string.f_k);
            }
            db5.e1.C(this, str, "", getString(com.tencent.mm.R.string.f_n), getString(com.tencent.mm.R.string.f490347sg), false, new qz2.i(this), new qz2.j(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay success");
        doSceneProgress(new ss4.e0(null, 19), false);
        if (!this.f137004p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "use old successpage");
            db5.e1.E(this, getString(com.tencent.mm.R.string.f_m), getString(com.tencent.mm.R.string.f_j), getString(com.tencent.mm.R.string.kuq), false, new qz2.e(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "useLiteApp successpage");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("event_name", "openFingerprintPaySuccess");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.tencent.mm.plugin.lite.w.k(com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID, "pay.notifyAll", jSONObject);
            this.f137005q = "";
            finish();
        } catch (org.json.JSONException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "launch FingerPrintAuthTransparentUI");
        nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
        this.f137004p = ih.a.h("clicfg_android_pay_liteapp_success_page", false) || ((h45.q) i95.n0.c(h45.q.class)).isKindaLitePaying();
        if (!oVar.Je()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "device is not support FingerPrintAuth or load fingerpringauth so failed, finish UI!");
            finish();
            return;
        }
        if (c01.z1.I()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "now account is isPayUPay, finish UI!");
            finish();
            return;
        }
        if (mz2.m0.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "getIsOpenFPFromLocal is true, finish UI!");
            finish();
            return;
        }
        if (!oVar.ja()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "isWxHasFingerPrint is false, finish UI!");
            finish();
            return;
        }
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        this.f136998g = oVar.r1();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_LAST_IS_SEVERE_ERROR_BOOLEAN_SYNC;
        this.f137003o = c17.o(u3Var, false);
        if (!fj6.w() || mz2.m0.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "isReg?:" + fj6.w() + ";isOpenTouch:" + mz2.m0.a());
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "finish FingerPrintAuthTransparentUI, not show the open guide!");
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "show fingerprint auth open guide!");
        ju5.n.c().b();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12924, 1);
        re4.n.f394543a = 0;
        if (!getIntent().getBooleanExtra("key_show_guide", true)) {
            if (!getIntent().getBooleanExtra("isFromKinda", false)) {
                X6();
                return;
            }
            re4.n.i(3, this.f137002n);
            java.lang.String stringExtra = getIntent().getStringExtra("kindaPayPwd");
            if (stringExtra != null) {
                this.f136998g.a(this, new qz2.r(this), stringExtra);
                a7(true);
            }
            this.mController.G0(getResources().getColor(com.tencent.mm.R.color.aaw));
            return;
        }
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_IS_FIRST_SHOWN_BOOLEAN_SYNC;
        if (c18.o(u3Var2, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: first show. no check box");
            com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            c19.x(u3Var2, bool);
            gm0.j1.u().c().x(u3Var, bool);
            db5.e1.C(this, getString(this.f137003o ? com.tencent.mm.R.string.ftl : com.tencent.mm.R.string.ftk), "", getString(com.tencent.mm.R.string.apd), getString(com.tencent.mm.R.string.f490347sg), false, new qz2.n(this), new qz2.o(this));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_COUNT_INT_SYNC, 1);
            this.f137002n = 1;
            re4.n.i(1, 1);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: already shown before. show dialog with check box");
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bah, (android.view.ViewGroup) null);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.f484995g63);
        com.tencent.mm.storage.n3 c27 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_COUNT_INT_SYNC;
        this.f137002n = ((java.lang.Integer) c27.m(u3Var3, null)).intValue() + 1;
        gm0.j1.u().c().x(u3Var3, java.lang.Integer.valueOf(this.f137002n));
        re4.n.i(1, this.f137002n);
        db5.e1.I(this, false, null, inflate, getString(com.tencent.mm.R.string.apd), getString(com.tencent.mm.R.string.f490347sg), new qz2.p(this), new qz2.q(this, checkBox));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.ui.widget.dialog.k2 k2Var = this.f136996e;
        if (k2Var != null && k2Var.isShowing()) {
            this.f136996e.dismiss();
            this.f136996e = null;
        }
        android.view.animation.Animation animation = this.f137000i;
        if (animation != null) {
            animation.cancel();
        }
        if (this.f137004p && !this.f137005q.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "useLiteApp successpage");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("event_name", "openFingerprintPayFail");
                jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, this.f137005q);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "JSONException %s", e17.toString());
            }
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.tencent.mm.plugin.lite.w.k(com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID, "pay.notifyAll", jSONObject);
        }
        a7(false);
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "onPause");
        try {
            android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) getContext().getSystemService("power")).newWakeLock(536870913, "PostLocationService");
            if (newWakeLock != null) {
                yj0.a.c(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                newWakeLock.acquire();
                yj0.a.f(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            }
            c7();
            if (newWakeLock != null) {
                yj0.a.c(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                newWakeLock.release();
                yj0.a.f(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FingerPrintAuthTransparentUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return this.f136998g.onSceneEnd(i17, i18, str, m1Var);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        finish();
    }
}
