package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class WalletOpenFingerprintPayRedirectUI extends com.tencent.mm.pluginsdk.ui.AutoLoginActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f181115d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f181116e = false;

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public void X6(com.tencent.mm.pluginsdk.ui.p pVar, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, loginResult = " + pVar);
        int ordinal = pVar.ordinal();
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: login ok.");
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new ss4.e0(null, 19));
            android.app.Dialog dialog = this.f181115d;
            if (dialog != null) {
                dialog.dismiss();
                this.f181115d = null;
            }
            this.f181115d = com.tencent.mm.wallet_core.ui.b2.i(this, true, false, new com.tencent.mm.plugin.wallet_index.ui.b0(this));
            return;
        }
        if (ordinal == 1 || ordinal == 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin fail, loginResult = " + pVar);
            a7(1, false, "");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, unknown login result = " + pVar);
        }
        a7(2, true, getString(com.tencent.mm.R.string.kea));
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    public final void a7(int i17, boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: redirect to open fingerprint failed. errCode: %d", java.lang.Integer.valueOf(i17));
        android.app.Dialog dialog = this.f181115d;
        if (dialog != null && dialog.isShowing()) {
            this.f181115d.dismiss();
            this.f181115d = null;
        }
        if (z17) {
            db5.e1.G(this, str, "", false, new com.tencent.mm.plugin.wallet_index.ui.c0(this));
        } else {
            finish();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, this);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(385, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ss4.e0) {
            if (this.f181116e) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: is already handled");
                return;
            }
            this.f181116e = true;
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query failed. inform fail.");
                a7(3, true, getString(com.tencent.mm.R.string.kea));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query ok. start judge.");
            at4.x1 Ai = vr4.f1.wi().Ai();
            if (Ai == null || !Ai.w()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not open wechat payment. hint bind bankcard");
                a7(5, true, getString(com.tencent.mm.R.string.klw));
            } else if (!is4.a.c() || wo.v1.f447826f.f447868b != 1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not support wechat fp pay or not allow");
                a7(6, true, getString(com.tencent.mm.R.string.kly));
            } else {
                ((h45.q) i95.n0.c(h45.q.class)).startUseCase("paySettingsUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.plugin.wallet_index.ui.d0(this));
                finish();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        android.app.Dialog dialog = this.f181115d;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f181115d.dismiss();
        this.f181115d = null;
    }
}
