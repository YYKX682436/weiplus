package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class SettingsTranslateLanguageUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f160715n = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest f160716d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f160717e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f160718f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160719g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f160720h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160721i;

    /* renamed from: m, reason: collision with root package name */
    public k14.g0 f160722m;

    public final void V6() {
        if (this.f160722m != null) {
            gm0.j1.d().d(this.f160722m);
            this.f160722m.f303337h = null;
        }
        this.f160722m = null;
    }

    public final void W6() {
        this.f160716d = null;
        try {
            android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("BundleKey_SettingsTranslateLanguageParams");
            if (parcelableExtra != null) {
                this.f160716d = (com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest) parcelableExtra;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsTranslateLanguageUI", e17, "initSettingsRequest", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String[] strArr;
        java.lang.String[] stringArray;
        java.lang.String str;
        super.onCreate(bundle);
        W6();
        setMMTitle(com.tencent.mm.R.string.lxy);
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI.f160715n;
                com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI settingsTranslateLanguageUI = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI.this;
                settingsTranslateLanguageUI.hideVKB();
                settingsTranslateLanguageUI.finish();
                return true;
            }
        });
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.lxx), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI$$b
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                final com.tencent.mm.plugin.account.ui.f3 f3Var;
                int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI.f160715n;
                final com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI settingsTranslateLanguageUI = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI.this;
                com.tencent.mm.ui.base.preference.r preferenceScreen = settingsTranslateLanguageUI.getPreferenceScreen();
                if (preferenceScreen == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SettingsTranslateLanguageUI", "save translate language failed, preferenceScreen is null.");
                } else {
                    java.util.ArrayList arrayList = (java.util.ArrayList) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).j();
                    if (arrayList.isEmpty()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SettingsTranslateLanguageUI", "save translate language failed, preferences is empty.");
                    } else {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) it.next();
                            if ((preference instanceof com.tencent.mm.plugin.account.ui.LanguagePreference) && (f3Var = ((com.tencent.mm.plugin.account.ui.LanguagePreference) preference).L) != null && f3Var.f73841d) {
                                break;
                            }
                        }
                    }
                }
                f3Var = null;
                if (f3Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SettingsTranslateLanguageUI", "on save clicked, but selectedLanguageInfo is null.");
                    return true;
                }
                com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI.f160715n;
                        final com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI settingsTranslateLanguageUI2 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI.this;
                        settingsTranslateLanguageUI2.getClass();
                        com.tencent.mm.modelbase.u0 u0Var = new com.tencent.mm.modelbase.u0() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI$$d
                            @Override // com.tencent.mm.modelbase.u0
                            public final void onSceneEnd(final int i19, final int i27, final java.lang.String str2, final com.tencent.mm.modelbase.m1 m1Var) {
                                int i28 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI.f160715n;
                                final com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI settingsTranslateLanguageUI3 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI.this;
                                settingsTranslateLanguageUI3.getClass();
                                com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI$$e
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i29 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI.f160715n;
                                        com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI settingsTranslateLanguageUI4 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI.this;
                                        settingsTranslateLanguageUI4.getClass();
                                        com.tencent.mm.modelbase.m1 m1Var2 = m1Var;
                                        if (m1Var2 instanceof k14.g0) {
                                            ((k14.g0) m1Var2).f303337h = null;
                                            int i37 = i19;
                                            int i38 = i27;
                                            if (i37 == 0 && i38 == 0) {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTranslateLanguageUI", "onTranslateLanguageSynced, sync successful.");
                                            } else if (!com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                                                com.tencent.mars.xlog.Log.e("MicroMsg.SettingsTranslateLanguageUI", "onTranslateLanguageSynced, sync failed, network not connected.");
                                            } else if (i37 == 1 || i37 == 2 || i37 == 7 || i37 == 8) {
                                                com.tencent.mars.xlog.Log.e("MicroMsg.SettingsTranslateLanguageUI", "onTranslateLanguageSynced, sync failed: network error, errType: " + i37 + ", errCode: " + i38 + ", errMsg: " + str2);
                                            }
                                            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTranslateLanguageUI", "onTranslateLanguageSynced, lastTranslateLanguageCode: " + settingsTranslateLanguageUI4.f160719g + ", newTranslateLanguageCode: " + settingsTranslateLanguageUI4.f160720h);
                                            k14.g0 g0Var = settingsTranslateLanguageUI4.f160722m;
                                            if (g0Var != null) {
                                                g0Var.f303337h = null;
                                                settingsTranslateLanguageUI4.f160722m = null;
                                            }
                                            com.tencent.mm.ui.widget.dialog.u3 u3Var = settingsTranslateLanguageUI4.f160721i;
                                            if (u3Var != null && u3Var.isShowing()) {
                                                settingsTranslateLanguageUI4.f160721i.dismiss();
                                            }
                                            com.tencent.mm.sdk.platformtools.m2.r(settingsTranslateLanguageUI4, settingsTranslateLanguageUI4.f160720h);
                                            ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).aj(settingsTranslateLanguageUI4.f160716d, new wd0.l2(settingsTranslateLanguageUI4.f160719g, settingsTranslateLanguageUI4.f160720h));
                                        }
                                        settingsTranslateLanguageUI4.finish();
                                    }
                                });
                            }
                        };
                        if (settingsTranslateLanguageUI2.f160721i == null) {
                            settingsTranslateLanguageUI2.f160721i = db5.e1.Q(settingsTranslateLanguageUI2, null, settingsTranslateLanguageUI2.getString(com.tencent.mm.R.string.ggc), true, false, null);
                        }
                        if (!settingsTranslateLanguageUI2.f160721i.isShowing()) {
                            settingsTranslateLanguageUI2.f160721i.show();
                        }
                        settingsTranslateLanguageUI2.f160719g = com.tencent.mm.sdk.platformtools.m2.q(settingsTranslateLanguageUI2);
                        java.lang.String str2 = f3Var.f73840c;
                        settingsTranslateLanguageUI2.f160720h = str2;
                        boolean k17 = com.tencent.mm.sdk.platformtools.m2.k(str2);
                        if (com.tencent.mm.sdk.platformtools.m2.k(str2)) {
                            str2 = com.tencent.mm.sdk.platformtools.m2.d();
                        }
                        if (settingsTranslateLanguageUI2.f160722m != null) {
                            settingsTranslateLanguageUI2.V6();
                        }
                        k14.g0 g0Var = new k14.g0(k17, str2);
                        settingsTranslateLanguageUI2.f160722m = g0Var;
                        g0Var.f303337h = u0Var;
                        if (gm0.j1.d().h(settingsTranslateLanguageUI2.f160722m, 0)) {
                            return;
                        }
                        settingsTranslateLanguageUI2.V6();
                    }
                });
                return true;
            }
        }, null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(0, false);
        if (this.f160718f == null) {
            this.f160718f = com.tencent.mm.sdk.platformtools.m2.q(this);
        }
        this.f160719g = com.tencent.mm.sdk.platformtools.m2.q(this);
        java.util.List list = this.f160717e;
        if (list == null) {
            this.f160717e = new java.util.ArrayList();
        } else {
            ((java.util.ArrayList) list).clear();
        }
        java.lang.String str2 = this.f160719g;
        if (com.tencent.mm.sdk.platformtools.x9.c()) {
            strArr = com.tencent.mm.sdk.platformtools.l2.f192819b;
            stringArray = getResources().getStringArray(com.tencent.mm.R.array.f478008w);
        } else {
            strArr = com.tencent.mm.sdk.platformtools.l2.f192818a;
            stringArray = getResources().getStringArray(com.tencent.mm.R.array.f478007v);
        }
        if (strArr.length != stringArray.length) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsTranslateLanguageUI", "languageCodes not paired with languageNames, languageCodes: " + java.util.Arrays.toString(strArr) + ", languageNames: " + java.util.Arrays.toString(stringArray));
        } else {
            for (int i17 = 0; i17 < strArr.length; i17++) {
                java.lang.String str3 = strArr[i17];
                java.lang.String str4 = stringArray[i17];
                boolean equals = android.text.TextUtils.equals(str2, str3);
                if (com.tencent.mm.sdk.platformtools.m2.k(str3)) {
                    str4 = getString(com.tencent.mm.R.string.f490579bs1);
                    str = com.tencent.mm.sdk.platformtools.m2.b(this, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), com.tencent.mm.R.array.f478007v, null);
                } else {
                    str = null;
                }
                com.tencent.mm.plugin.account.ui.f3 f3Var = new com.tencent.mm.plugin.account.ui.f3(str4, "", str3, equals);
                f3Var.f73839b = str;
                ((java.util.ArrayList) this.f160717e).add(f3Var);
            }
        }
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        if (preferenceScreen == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsTranslateLanguageUI", "reload preferences failed, preferenceScreen is null.");
            return;
        }
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) preferenceScreen;
        h0Var.t();
        java.util.List list2 = this.f160717e;
        if (list2 == null || ((java.util.ArrayList) list2).isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsTranslateLanguageUI", "no available translate language to display.");
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f160717e).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.account.ui.f3 f3Var2 = (com.tencent.mm.plugin.account.ui.f3) it.next();
            if (f3Var2 != null) {
                com.tencent.mm.plugin.account.ui.LanguagePreference languagePreference = new com.tencent.mm.plugin.account.ui.LanguagePreference(this, null);
                languagePreference.M(f3Var2);
                h0Var.d(languagePreference, -1);
            }
        }
        h0Var.d(new com.tencent.mm.ui.base.preference.PreferenceCategory(this), -1);
        h0Var.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        V6();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        W6();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.account.ui.f3 f3Var;
        if (!(preference instanceof com.tencent.mm.plugin.account.ui.LanguagePreference) || (f3Var = ((com.tencent.mm.plugin.account.ui.LanguagePreference) preference).L) == null) {
            return false;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f160717e).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.account.ui.f3) it.next()).f73841d = false;
        }
        f3Var.f73841d = true;
        enableOptionMenu(0, !android.text.TextUtils.equals(this.f160718f, f3Var.f73840c));
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).notifyDataSetChanged();
        }
        return true;
    }
}
