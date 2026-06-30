package com.tencent.mm.plugin.fingerprint.ui;

/* loaded from: classes9.dex */
public class FingerPrintAuthUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements pz2.b {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f137007o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f137008d;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.Animation f137011g;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f137009e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f137010f = false;

    /* renamed from: h, reason: collision with root package name */
    public int f137012h = 0;

    /* renamed from: i, reason: collision with root package name */
    public pz2.d f137013i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f137014m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f137015n = false;

    public final void U6(java.lang.String str, int i17) {
        this.f137010f = false;
        com.tencent.mm.sdk.platformtools.u3.h(new qz2.z(this, str, i17));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.baf;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthUI", "open fingerprintpay success");
            doSceneProgress(new ss4.e0(null, 19), false);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new qz2.v(this, false));
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthUI", "open fingerprintpay failed");
            db5.e1.t(this, getString(com.tencent.mm.R.string.f_k), "", new qz2.c0(this));
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getString(com.tencent.mm.R.string.hef));
        this.f137008d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hdu);
        nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
        pz2.d r17 = oVar.r1();
        this.f137013i = r17;
        if (r17 == null) {
            U6(getString(com.tencent.mm.R.string.f_k), -1);
            return;
        }
        setBackBtn(new qz2.t(this));
        android.os.Bundle e17 = com.tencent.mm.wallet_core.a.e(this);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthUI", "contextdata is null,for that reason program can't get user pwd");
            U6(getString(com.tencent.mm.R.string.f_k), -1);
            re4.n.g(1000, -1000223, -1, "contextdata is null,for that reason program can't get user pwd");
            return;
        }
        java.lang.String string = e17.getString("pwd");
        if (android.text.TextUtils.isEmpty(string)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthUI", "get user pwd error");
            U6(getString(com.tencent.mm.R.string.f_k), -1);
            re4.n.g(1000, -1000223, -1, "get user pwd error");
        } else {
            if (!oVar.ja()) {
                U6(getString(com.tencent.mm.R.string.kut), -1);
                return;
            }
            if (oVar.Je()) {
                com.tencent.mm.sdk.platformtools.u3.h(new qz2.v(this, true));
                ju5.n.c().b();
                this.f137013i.a(this, new qz2.u(this), string);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthUI", "device is not support FingerPrintAuth");
            }
            this.f137014m = e17.getBoolean("key_show_succ_toast");
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthUI", "hy: fingerprint auth ui on destroy");
        android.view.animation.Animation animation = this.f137011g;
        if (animation != null) {
            animation.cancel();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f137015n = true;
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) getContext().getSystemService("power")).newWakeLock(536870913, "PostLocationService");
        if (newWakeLock != null) {
            yj0.a.c(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            newWakeLock.acquire();
            yj0.a.f(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthUI", "hy: user cancelled");
        ((pz2.a) gm0.j1.s(pz2.a.class)).userCancel();
        if (newWakeLock != null) {
            yj0.a.c(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            newWakeLock.release();
            yj0.a.f(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f137015n = false;
        if (this.f137010f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthUI", "request Identify2");
            this.f137013i.c(getContext(), new qz2.w(this));
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (this.f137013i.onSceneEnd(i17, i18, str, m1Var)) {
            return true;
        }
        if (!(m1Var instanceof ss4.e0)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new qz2.v(this, false));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_process_result_code", -1);
        com.tencent.mm.wallet_core.a.c(this, bundle, 0);
        if (this.f137014m) {
            dp.a.makeText(this, com.tencent.mm.R.string.f_l, 0).show();
        }
        return true;
    }
}
