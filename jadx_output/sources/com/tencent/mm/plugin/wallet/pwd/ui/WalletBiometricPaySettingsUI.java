package com.tencent.mm.plugin.wallet.pwd.ui;

@db5.a(0)
/* loaded from: classes9.dex */
public class WalletBiometricPaySettingsUI extends com.tencent.mm.wallet_core.ui.WalletPreferenceUI {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f178827g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f178828h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f178829i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f178830m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.ResultReceiver f178831n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f178832o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f178833p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f178834q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f178835r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f178836s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f178837t;

    /* renamed from: u, reason: collision with root package name */
    public pz2.a f178838u;

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI
    public boolean W6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    public final void X6() {
        if (this.f178833p == 1) {
            Z6(this.f178829i, false);
            Z6(this.f178830m, false);
        } else {
            Z6(this.f178828h, false);
        }
        Z6(this.f178827g, true);
    }

    public final boolean Y6(com.tencent.mm.ui.base.preference.Preference preference) {
        return preference.H == com.tencent.mm.R.layout.c0s;
    }

    public final void Z6(com.tencent.mm.ui.base.preference.Preference preference, boolean z17) {
        preference.H = z17 ? com.tencent.mm.R.layout.c0s : com.tencent.mm.R.layout.c0t;
    }

    public final void a7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "show enroll biometric guide: %s", java.lang.Integer.valueOf(i17));
        java.lang.String string = getString(com.tencent.mm.R.string.kur);
        if (i17 == 1) {
            string = getString(com.tencent.mm.R.string.kut);
        }
        db5.e1.y(this, string, "", getString(com.tencent.mm.R.string.kuq), new com.tencent.mm.plugin.wallet.pwd.ui.k(this));
    }

    public final void b7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "start open process: %s", java.lang.Integer.valueOf(i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("open_scene", 1);
        bundle.putInt("key_open_biometric_type", i17);
        com.tencent.mm.wallet_core.a.k(this, com.tencent.soter.core.biometric.FingerprintManagerProxy.FINGERPRINT_SERVICE, "FingerprintAuth", bundle, null);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494970cz;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) getPreferenceScreen();
        com.tencent.mm.ui.base.preference.Preference h17 = h0Var.h("biometric_pay_close");
        this.f178827g = h17;
        h17.E(8);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "fingerprint: %s, faceid: %s", java.lang.Boolean.valueOf(((mz2.a) this.f178838u).a()), java.lang.Boolean.valueOf(((mz2.a) this.f178838u).b()));
        int i17 = this.f178833p;
        if (i17 == 2 || i17 == 3) {
            com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(this);
            this.f178828h = preference;
            preference.C("key_single_open");
            this.f178828h.J(com.tencent.mm.R.string.kgs);
            com.tencent.mm.ui.base.preference.Preference preference2 = this.f178828h;
            preference2.f197785v = false;
            h0Var.d(preference2, 0);
            this.f178828h.E(8);
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.ui.base.preference.Preference preference3 = new com.tencent.mm.ui.base.preference.Preference(this);
            this.f178830m = preference3;
            preference3.C("key_faceid_open");
            this.f178830m.J(com.tencent.mm.R.string.kgt);
            h0Var.d(this.f178830m, 0);
            com.tencent.mm.ui.base.preference.Preference preference4 = new com.tencent.mm.ui.base.preference.Preference(this);
            this.f178829i = preference4;
            preference4.C("key_fingerprint_open");
            this.f178829i.J(com.tencent.mm.R.string.kgu);
            h0Var.d(this.f178829i, 1);
            this.f178830m.E(8);
            this.f178829i.E(8);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (is4.a.b() && is4.a.c()) {
            this.f178833p = 1;
        } else if (is4.a.c()) {
            this.f178833p = 2;
        } else if (is4.a.b()) {
            this.f178833p = 3;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletBiometricPaySettingsUI", "device not support biometric pay!");
            finish();
        }
        int i17 = this.f178833p;
        if (i17 == 1) {
            setMMTitle(com.tencent.mm.R.string.kgr);
        } else if (i17 == 2) {
            setMMTitle(com.tencent.mm.R.string.kuf);
        } else {
            setMMTitle(com.tencent.mm.R.string.kue);
        }
        setBackBtn(new com.tencent.mm.plugin.wallet.pwd.ui.g(this));
        this.f178831n = (android.os.ResultReceiver) getIntent().getParcelableExtra("key_should_update_result_receiver");
        this.f178838u = (pz2.a) gm0.j1.s(pz2.a.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "biometric mode: %s", java.lang.Integer.valueOf(this.f178833p));
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        android.os.ResultReceiver resultReceiver;
        super.onPause();
        if (!this.f178832o || (resultReceiver = this.f178831n) == null) {
            return;
        }
        resultReceiver.send(0, null);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "click key: %s", preference.f197780q);
        this.f178837t = Y6(this.f178827g);
        if (this.f178833p == 1) {
            this.f178835r = Y6(this.f178830m);
            this.f178836s = Y6(this.f178829i);
        } else {
            this.f178834q = Y6(this.f178828h);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "is checked: %s", java.lang.Boolean.valueOf(Y6(preference)));
        if (Y6(preference)) {
            return false;
        }
        this.f178832o = true;
        if ("biometric_pay_close".equals(preference.f197780q)) {
            java.lang.String string = getString(com.tencent.mm.R.string.f_g);
            if (((mz2.a) this.f178838u).b()) {
                string = getString(com.tencent.mm.R.string.c8s);
            }
            db5.e1.K(this, false, string, "", getString(com.tencent.mm.R.string.f490507x1), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet.pwd.ui.i(this, rVar), new com.tencent.mm.plugin.wallet.pwd.ui.j(this));
        } else if ("key_single_open".equals(preference.f197780q)) {
            int i17 = this.f178833p;
            if (i17 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "on click open fingerprint");
                if (this.f178838u.yh()) {
                    b7(1);
                } else {
                    a7(1);
                }
            } else if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "on click open faceid");
                if (this.f178838u.a1()) {
                    b7(2);
                } else {
                    a7(2);
                }
            }
        } else if ("key_fingerprint_open".equals(preference.f197780q)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "on click open fingerprint");
            if (this.f178838u.yh()) {
                b7(1);
            } else {
                a7(1);
            }
        } else if ("key_faceid_open".equals(preference.f197780q)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "on click open faceid");
            if (this.f178838u.a1()) {
                b7(2);
            } else {
                a7(2);
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "update pref check state: %s, %s", java.lang.Boolean.valueOf(((mz2.a) this.f178838u).a()), java.lang.Boolean.valueOf(((mz2.a) this.f178838u).b()));
        if (this.f178833p == 1) {
            if (((mz2.a) this.f178838u).a()) {
                if (this.f178833p == 1) {
                    Z6(this.f178829i, true);
                    Z6(this.f178830m, false);
                    Z6(this.f178827g, false);
                }
            } else if (!((mz2.a) this.f178838u).b()) {
                X6();
            } else if (this.f178833p == 1) {
                Z6(this.f178829i, false);
                Z6(this.f178830m, true);
                Z6(this.f178827g, false);
            }
        } else if (((mz2.a) this.f178838u).a() || ((mz2.a) this.f178838u).b()) {
            int i17 = this.f178833p;
            if (i17 == 2 || i17 == 3) {
                Z6(this.f178828h, true);
                Z6(this.f178827g, false);
            }
        } else {
            X6();
        }
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
    }
}
