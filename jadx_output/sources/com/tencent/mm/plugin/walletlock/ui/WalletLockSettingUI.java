package com.tencent.mm.plugin.walletlock.ui;

/* loaded from: classes9.dex */
public class WalletLockSettingUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f181380t = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f181381d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f181382e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f181383f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f181384g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f181385h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f181386i;

    /* renamed from: m, reason: collision with root package name */
    public int f181387m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f181388n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f181389o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f181390p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f181391q = true;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f181392r = true;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181393s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletLockProtectEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI.1
        {
            this.__eventId = 1842411039;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletLockProtectEvent walletLockProtectEvent) {
            if (walletLockProtectEvent.f54960g.f7392a != 6) {
                return false;
            }
            com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI.this.finish();
            return false;
        }
    };

    public final void V6(int i17, int i18, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", i18);
        intent.putExtra("key_err_msg", str);
        setResult(i17, intent);
        finish();
    }

    public final void W6() {
        boolean z17;
        boolean z18;
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = this.f181382e;
        if (iconPreference != null && (z18 = this.f181391q)) {
            X6(iconPreference, false, z18);
        }
        com.tencent.mm.ui.base.preference.IconPreference iconPreference2 = this.f181385h;
        if (iconPreference2 != null && (z17 = this.f181392r)) {
            X6(iconPreference2, false, z17);
        }
        com.tencent.mm.ui.base.preference.IconPreference iconPreference3 = this.f181383f;
        if (iconPreference3 != null) {
            X6(iconPreference3, false, true);
        }
        com.tencent.mm.ui.base.preference.IconPreference iconPreference4 = this.f181384g;
        if (iconPreference4 != null) {
            X6(iconPreference4, false, true);
        }
    }

    public final void X6(com.tencent.mm.ui.base.preference.Preference preference, boolean z17, boolean z18) {
        if (preference instanceof com.tencent.mm.ui.base.preference.IconPreference) {
            com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) preference;
            iconPreference.Z(i65.a.b(this, 20), i65.a.b(this, 20));
            if (!z17) {
                iconPreference.S(com.tencent.mm.R.raw.radio_off);
                iconPreference.T(0);
            } else {
                if (z18) {
                    iconPreference.S(com.tencent.mm.R.raw.radio_on);
                } else {
                    iconPreference.S(com.tencent.mm.R.raw.radio_default_on);
                }
                iconPreference.T(0);
            }
        }
    }

    public final void Y6(java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.j0 G = db5.e1.G(this, str, "", true, new com.tencent.mm.plugin.walletlock.ui.g(this));
        this.f181386i = G;
        G.setCanceledOnTouchOutside(false);
        this.f181386i.show();
    }

    public final void Z6() {
        W6();
        com.tencent.mm.plugin.walletlock.model.l lVar = com.tencent.mm.plugin.walletlock.model.l.instance;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "current wallet lock type: %d", java.lang.Integer.valueOf(lVar.h()));
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("TouchLockFunction", 0) != 1) {
            boolean z17 = re4.g0.c() && wt5.a.n(getContext());
            if (lVar.i()) {
                if (!z17) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f181381d).m("wallet_lock_fingerprint", false);
                    this.f181382e.O(getString(com.tencent.mm.R.string.kno));
                    this.f181382e.Q(0);
                    X6(this.f181382e, true, false);
                    this.f181382e.w(false);
                    this.f181382e.U1 = true;
                    this.f181391q = false;
                } else if (this.f181390p) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f181381d).m("wallet_lock_fingerprint", false);
                    X6(this.f181382e, true, true);
                    com.tencent.mm.ui.base.preference.IconPreference iconPreference = this.f181382e;
                    java.lang.String str = getString(com.tencent.mm.R.string.koe) + getString(com.tencent.mm.R.string.knv);
                    android.view.View view = iconPreference.W1;
                    if (view != null) {
                        view.setContentDescription(str);
                    }
                    iconPreference.N1 = str;
                }
            } else if (z17) {
                ((com.tencent.mm.ui.base.preference.h0) this.f181381d).m("wallet_lock_fingerprint", false);
                X6(this.f181382e, false, true);
                com.tencent.mm.ui.base.preference.IconPreference iconPreference2 = this.f181382e;
                java.lang.String str2 = getString(com.tencent.mm.R.string.kof) + getString(com.tencent.mm.R.string.knv);
                android.view.View view2 = iconPreference2.W1;
                if (view2 != null) {
                    view2.setContentDescription(str2);
                }
                iconPreference2.N1 = str2;
            } else {
                ((com.tencent.mm.ui.base.preference.h0) this.f181381d).m("wallet_lock_fingerprint", true);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletLockSettingUI", "FingerprintLock entry is not opened and don't show FingerprintLock entry");
            ((com.tencent.mm.ui.base.preference.h0) this.f181381d).m("wallet_lock_fingerprint", true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "isUserSetGesturePwd: %b", java.lang.Boolean.valueOf(hu4.f.a()));
        if (lVar.h() == 2 || lVar.h() == 3) {
            X6(this.f181383f, false, true);
            ((com.tencent.mm.ui.base.preference.h0) this.f181381d).m("wallet_lock_modify_gesture", true);
            com.tencent.mm.ui.base.preference.IconPreference iconPreference3 = this.f181383f;
            java.lang.String str3 = getString(com.tencent.mm.R.string.kof) + getString(com.tencent.mm.R.string.f493548ko2);
            android.view.View view3 = iconPreference3.W1;
            if (view3 != null) {
                view3.setContentDescription(str3);
            }
            iconPreference3.N1 = str3;
        } else if (lVar.h() != 1) {
            X6(this.f181383f, false, true);
            ((com.tencent.mm.ui.base.preference.h0) this.f181381d).m("wallet_lock_modify_gesture", true);
            com.tencent.mm.ui.base.preference.IconPreference iconPreference4 = this.f181383f;
            java.lang.String str4 = getString(com.tencent.mm.R.string.kof) + getString(com.tencent.mm.R.string.f493548ko2);
            android.view.View view4 = iconPreference4.W1;
            if (view4 != null) {
                view4.setContentDescription(str4);
            }
            iconPreference4.N1 = str4;
        } else if (this.f181390p) {
            X6(this.f181383f, true, true);
            ((com.tencent.mm.ui.base.preference.h0) this.f181381d).m("wallet_lock_modify_gesture", false);
            com.tencent.mm.ui.base.preference.IconPreference iconPreference5 = this.f181383f;
            java.lang.String str5 = getString(com.tencent.mm.R.string.koe) + getString(com.tencent.mm.R.string.f493548ko2);
            android.view.View view5 = iconPreference5.W1;
            if (view5 != null) {
                view5.setContentDescription(str5);
            }
            iconPreference5.N1 = str5;
        }
        if (lVar.h() != 0) {
            X6(this.f181384g, false, true);
        } else if (this.f181390p) {
            X6(this.f181384g, true, true);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494972d1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "onActivityResult requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLockSettingUI", "data is null");
            return;
        }
        int intExtra = intent.getIntExtra("key_err_code", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "wallet lock setting onActivityResult errCode: %d", java.lang.Integer.valueOf(intExtra));
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "request open fingerprint lock onActivityResult");
            if (intExtra == 0) {
                if (this.f181389o) {
                    setResult(i18, intent);
                    finish();
                    return;
                }
                return;
            }
            if (intExtra == 4) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "open fingerprint lock failed");
            Y6(getString(com.tencent.mm.R.string.knr));
            return;
        }
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "request open gesture onActivityResult");
            if (intExtra == 0) {
                if (this.f181389o) {
                    setResult(i18, intent);
                    finish();
                }
                s75.d.b(new com.tencent.mm.plugin.walletlock.ui.f(this), "WalletLockRemoveAuthKey");
                return;
            }
            if (intExtra == 4) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "open gesture lock failed");
            Y6(getString(com.tencent.mm.R.string.f493547ko1));
            return;
        }
        if (i17 == 3) {
            if (intExtra != 0) {
                if (intExtra == 4) {
                    return;
                }
                Y6(getString(com.tencent.mm.R.string.knm));
                return;
            }
            ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().j(0);
            hu4.i.f285230a = -1L;
            fu4.a.f266884a = -1L;
            Z6();
            dp.a.makeText(this, getString(com.tencent.mm.R.string.knl), 0).show();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockReportManager", "idkey report close wallet lock success");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(713L, 3L, 1L, false);
            if (this.f181389o) {
                V6(-1, 0, "close wallet lock ok");
            }
            s75.d.b(new com.tencent.mm.plugin.walletlock.ui.h(this), "WalletLockRemoveAuthKey");
            com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
            wCPaySaftyClickReportStruct.f62116d = 14L;
            wCPaySaftyClickReportStruct.f62117e = 2L;
            wCPaySaftyClickReportStruct.k();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "onBackPressed");
        if (this.f181389o) {
            V6(0, 4, "user cancel setting wallet lock");
        } else {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.walletlock.ui.b(this));
        setMMTitle(com.tencent.mm.R.string.koa);
        this.f181381d = getPreferenceScreen();
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f181381d = preferenceScreen;
        this.f181382e = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("wallet_lock_fingerprint");
        this.f181383f = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f181381d).h("wallet_lock_gesture");
        this.f181384g = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f181381d).h("wallet_lock_close");
        this.f181385h = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f181381d).h("wallet_lock_faceid");
        this.f181382e.Y(0);
        this.f181383f.Y(0);
        this.f181384g.Y(0);
        this.f181385h.Y(0);
        this.f181382e.E(8);
        this.f181383f.E(8);
        this.f181384g.E(8);
        this.f181385h.E(8);
        ((com.tencent.mm.ui.base.preference.h0) this.f181381d).m("wallet_lock_faceid", true);
        com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = (com.tencent.mm.ui.base.preference.PreferenceTitleCategory) ((com.tencent.mm.ui.base.preference.h0) this.f181381d).h("wallet_lock_title");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", " cn wallet open new name ：%s", java.lang.Boolean.TRUE);
        preferenceTitleCategory.L(getString(com.tencent.mm.R.string.ko_));
        this.f181388n = getIntent().getIntExtra("wallet_lock_jsapi_scene", 0);
        int intExtra = getIntent().getIntExtra("key_wallet_lock_setting_scene", -1);
        this.f181387m = intExtra;
        if (intExtra == 1) {
            this.f181389o = true;
            this.f181390p = false;
        } else if (intExtra == 2) {
            this.f181393s.alive();
        }
        com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
        wCPaySaftyClickReportStruct.f62116d = 13L;
        wCPaySaftyClickReportStruct.f62117e = 1L;
        wCPaySaftyClickReportStruct.f62118f = this.f181388n;
        wCPaySaftyClickReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "isNeedFinish: %b, isNeedShowOpenIcon: %b", java.lang.Boolean.valueOf(this.f181389o), java.lang.Boolean.valueOf(this.f181390p));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f181387m == 2) {
            this.f181393s.dead();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f181386i;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        this.f181386i.dismiss();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        boolean equals = "wallet_lock_fingerprint".equals(preference.f197780q);
        com.tencent.mm.plugin.walletlock.model.l lVar = com.tencent.mm.plugin.walletlock.model.l.instance;
        if (equals) {
            W6();
            X6(preference, true, true);
            if (this.f181391q && (!this.f181390p || lVar.h() != 2)) {
                if (!wt5.a.p(this)) {
                    com.tencent.mm.ui.widget.dialog.j0 G = db5.e1.G(this, getString(com.tencent.mm.R.string.f493550ko4), "", true, new com.tencent.mm.plugin.walletlock.ui.c(this));
                    this.f181386i = G;
                    G.setCanceledOnTouchOutside(false);
                } else if (!this.f181390p || lVar.h() != 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "request open fingerprint lock");
                    ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().d(this, 2, 1);
                }
            }
            return true;
        }
        if ("wallet_lock_faceid".equals(preference.f197780q)) {
            W6();
            X6(preference, true, true);
            if (this.f181392r && (!this.f181390p || lVar.h() != 3)) {
                if (!wt5.a.o(this, 2)) {
                    com.tencent.mm.ui.widget.dialog.j0 G2 = db5.e1.G(this, getString(com.tencent.mm.R.string.f493550ko4), "", true, new com.tencent.mm.plugin.walletlock.ui.c(this));
                    this.f181386i = G2;
                    G2.setCanceledOnTouchOutside(false);
                } else if (!this.f181390p || lVar.h() == 3) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "request open faceid lock");
                    ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().d(this, 3, 4);
                }
            }
            return true;
        }
        if ("wallet_lock_gesture".equals(preference.f197780q)) {
            W6();
            X6(preference, true, true);
            if (lVar.h() != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "request open gesture lock");
                ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().d(this, 1, 2);
            }
            return true;
        }
        if ("wallet_lock_close".equals(preference.f197780q)) {
            db5.e1.C(getContext(), getString(com.tencent.mm.R.string.knk), "", getString(com.tencent.mm.R.string.f490358sq), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.walletlock.ui.d(this, preference), new com.tencent.mm.plugin.walletlock.ui.e(this));
            return true;
        }
        if (!"wallet_lock_modify_gesture".equals(preference.f197780q)) {
            return false;
        }
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().g(this);
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Z6();
    }
}
