package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class SettingsPluginsUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f160607f = new com.tencent.mm.plugin.setting.ui.setting.al();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160608d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f160609e;

    public final void V6() {
        ((com.tencent.mm.ui.base.preference.h0) this.f160608d).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f160608d).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(this, null), -1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        boolean s17 = c01.z1.s();
        if (!s17) {
            s17 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BindQQSwitch"), 1) == 1;
        }
        if (!s17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "summerqq BindQQSwitch off");
        }
        com.tencent.mm.sdk.platformtools.f9 f9Var = com.tencent.mm.sdk.platformtools.f9.HomePluginQQMail;
        if (!f9Var.h() && s17) {
            j45.l.g("qqmail");
            com.tencent.mm.plugin.preference.PluginPreference pluginPreference = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
            if (pluginPreference.M("qqmail")) {
                pluginPreference.L(pluginPreference.M);
                if ((c01.z1.n() & 1) == 0) {
                    arrayList.add(pluginPreference);
                } else if (u11.c.d()) {
                    arrayList2.add(pluginPreference);
                }
            }
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigQQAssistant()) == 1 && !c01.e2.a0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "add QQAssistant to Settings");
            com.tencent.mm.plugin.preference.PluginPreference pluginPreference2 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
            pluginPreference2.N("gh_051d9102de63", getString(com.tencent.mm.R.string.nfj));
            pluginPreference2.L(pluginPreference2.M);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_051d9102de63", true);
            if (n17 != null) {
                if (n17.r2()) {
                    arrayList.add(pluginPreference2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "QQAssistant installed");
                } else {
                    arrayList2.add(pluginPreference2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "QQAssistant uninstalled");
                }
            }
        }
        if (!f9Var.h()) {
            j45.l.g("readerapp");
            if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                com.tencent.mm.plugin.preference.PluginPreference pluginPreference3 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
                if (pluginPreference3.M("newsapp")) {
                    pluginPreference3.L(pluginPreference3.M);
                    if ((c01.z1.n() & 524288) == 0) {
                        arrayList.add(pluginPreference3);
                    } else if (u11.c.d()) {
                        arrayList2.add(pluginPreference3);
                    }
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.f9.MeSetSecurityFacebook.h()) {
            com.tencent.mm.plugin.preference.PluginPreference pluginPreference4 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
            if (pluginPreference4.M("facebookapp")) {
                pluginPreference4.L(pluginPreference4.M);
                if ((c01.z1.n() & 8192) == 0) {
                    arrayList.add(pluginPreference4);
                } else if (u11.c.c()) {
                    arrayList2.add(pluginPreference4);
                }
            }
        }
        j45.l.g("masssend");
        if (!c01.z1.x()) {
            com.tencent.mm.plugin.preference.PluginPreference pluginPreference5 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
            if (pluginPreference5.M("masssendapp")) {
                pluginPreference5.L(pluginPreference5.M);
                if ((c01.z1.n() & 65536) == 0) {
                    arrayList.add(pluginPreference5);
                } else {
                    arrayList2.add(pluginPreference5);
                }
            }
        }
        com.tencent.mm.plugin.preference.PluginPreference pluginPreference6 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
        pluginPreference6.N("gh_43f2581f6fd6", getString(com.tencent.mm.R.string.c5n));
        pluginPreference6.L(pluginPreference6.M);
        ((ue4.w) ((ve4.e) i95.n0.c(ve4.e.class))).getClass();
        if (com.tencent.mm.plugin.sport.model.c0.e()) {
            arrayList.add(pluginPreference6);
        } else {
            arrayList2.add(pluginPreference6);
        }
        boolean e17 = rn3.i.Ai().e(1);
        this.f160609e = e17;
        pluginPreference6.R = e17;
        com.tencent.mm.plugin.preference.PluginPreference pluginPreference7 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
        pluginPreference7.N("gh_3dfda90e39d6", getString(com.tencent.mm.R.string.bvz));
        pluginPreference7.L(pluginPreference7.M);
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_3dfda90e39d6", true);
        if (n18 != null ? n18.r2() : false) {
            arrayList.add(pluginPreference7);
        } else {
            arrayList2.add(pluginPreference7);
        }
        com.tencent.mm.plugin.preference.PluginPreference pluginPreference8 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
        pluginPreference8.N("gh_b4af18eac3d5", getString(com.tencent.mm.R.string.hkx));
        pluginPreference8.L(pluginPreference8.M);
        com.tencent.mm.storage.z3 n19 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_b4af18eac3d5", true);
        if (n19 != null ? n19.r2() : false) {
            arrayList.add(pluginPreference8);
        }
        com.tencent.mm.plugin.preference.PluginPreference pluginPreference9 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
        pluginPreference9.N("gh_f0a92aa7146c", getString(com.tencent.mm.R.string.hkw));
        pluginPreference9.L(pluginPreference9.M);
        com.tencent.mm.storage.z3 n27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_f0a92aa7146c", true);
        if (n27 != null ? n27.r2() : false) {
            arrayList.add(pluginPreference9);
        } else {
            gm0.j1.i();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SETTING_PLUGIN_SHOW_PAY_COLLECTION_FLAG_INT_SYNC, 0)).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "SETTING_PLUGIN_SHOW_PAY_COLLECTION Flag :%s", java.lang.Integer.valueOf(intValue));
            if (intValue == 1) {
                arrayList2.add(pluginPreference9);
            }
        }
        com.tencent.mm.plugin.preference.PluginPreference pluginPreference10 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
        pluginPreference10.N("gh_e087bb5b95e6", getString(com.tencent.mm.R.string.hkv));
        pluginPreference10.L(pluginPreference10.M);
        com.tencent.mm.storage.z3 n28 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_e087bb5b95e6", true);
        if (n28 != null ? n28.r2() : false) {
            arrayList.add(pluginPreference10);
        } else {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_add_pay_business_collection_open_config, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "addPayBusinessCollection openConfig ：%s ", java.lang.Boolean.valueOf(fj6));
            if (fj6) {
                arrayList2.add(pluginPreference10);
            }
        }
        if (1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minishop_plugin_enabled, 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "addMiniShopHelperIfNeed, not need");
        } else {
            com.tencent.mm.plugin.preference.PluginPreference pluginPreference11 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
            pluginPreference11.N("gh_579db1f2cf89", getString(com.tencent.mm.R.string.fuv));
            pluginPreference11.L(pluginPreference11.M);
            com.tencent.mm.storage.z3 n29 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_579db1f2cf89", true);
            if (n29 != null ? n29.r2() : false) {
                arrayList.add(pluginPreference11);
            } else {
                int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SETTING_PLUGIN_SHOW_MINI_SHOP_HELPER_FLAG_INT_SYNC, 0)).intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "addMiniShopHelperIfNeed, USERINFO_SETTING_PLUGIN_SHOW_MINI_SHOP_HELPER_FLAG_INT_SYNC: " + intValue2);
                if (1 == intValue2) {
                    arrayList2.add(pluginPreference11);
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.f9.HomePluginWeGame.h() && !((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mm.plugin.preference.PluginPreference pluginPreference12 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
            pluginPreference12.N("gh_25d9ac85a4bc", getString(com.tencent.mm.R.string.fvy));
            pluginPreference12.L(pluginPreference12.M);
            com.tencent.mm.storage.z3 n37 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_25d9ac85a4bc", true);
            if (n37 != null ? n37.r2() : false) {
                arrayList.add(pluginPreference12);
            } else {
                arrayList2.add(pluginPreference12);
            }
        }
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LinkedinPluginClose");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17) || com.tencent.mm.sdk.platformtools.t8.P(d17, 0) == 0) {
            com.tencent.mm.plugin.preference.PluginPreference pluginPreference13 = new com.tencent.mm.plugin.preference.PluginPreference(this, null);
            if (pluginPreference13.M("linkedinplugin")) {
                pluginPreference13.L(pluginPreference13.M);
                boolean z17 = (c01.z1.n() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0;
                boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) gm0.j1.u().c().l(286721, null));
                if (z17 && z18) {
                    arrayList.add(pluginPreference13);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            com.tencent.mm.ui.base.preference.PluginTextPreference pluginTextPreference = new com.tencent.mm.ui.base.preference.PluginTextPreference(this);
            pluginTextPreference.N = com.tencent.mm.R.raw.setting_plugin_install;
            pluginTextPreference.P = pluginTextPreference.f197770d.getString(com.tencent.mm.R.string.iwp);
            ((com.tencent.mm.ui.base.preference.h0) this.f160608d).d(pluginTextPreference, -1);
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SETTING_PLUGIN_SWITCH_NAMES_STRING, "");
        java.util.Iterator it = arrayList.iterator();
        com.tencent.mm.plugin.preference.PluginPreference pluginPreference14 = null;
        while (it.hasNext()) {
            com.tencent.mm.plugin.preference.PluginPreference pluginPreference15 = (com.tencent.mm.plugin.preference.PluginPreference) it.next();
            pluginPreference15.T = 1.0f;
            if (str.contains(pluginPreference15.L)) {
                pluginPreference15.R = true;
                if (pluginPreference14 == null) {
                    pluginPreference14 = pluginPreference15;
                }
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f160608d).d(pluginPreference15, -1);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160608d).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(this, null), -1);
        com.tencent.mm.ui.base.preference.PluginTextPreference pluginTextPreference2 = new com.tencent.mm.ui.base.preference.PluginTextPreference(this);
        pluginTextPreference2.N = com.tencent.mm.R.raw.setting_plugin_uninstall;
        pluginTextPreference2.P = pluginTextPreference2.f197770d.getString(com.tencent.mm.R.string.iwv);
        ((com.tencent.mm.ui.base.preference.h0) this.f160608d).d(pluginTextPreference2, -1);
        if (arrayList2.isEmpty()) {
            com.tencent.mm.plugin.setting.ui.setting.PluginEmptyTextPreference pluginEmptyTextPreference = new com.tencent.mm.plugin.setting.ui.setting.PluginEmptyTextPreference(this, null, 0);
            pluginEmptyTextPreference.M = getString(com.tencent.mm.R.string.iwj);
            ((com.tencent.mm.ui.base.preference.h0) this.f160608d).d(pluginEmptyTextPreference, -1);
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.preference.PluginPreference pluginPreference16 = (com.tencent.mm.plugin.preference.PluginPreference) it6.next();
            pluginPreference16.T = 0.5f;
            if (str.contains(pluginPreference16.L)) {
                pluginPreference16.R = true;
                if (pluginPreference14 == null) {
                    pluginPreference14 = pluginPreference16;
                }
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f160608d).d(pluginPreference16, -1);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160608d).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(this, null), -1);
        if (pluginPreference14 != null) {
            setSelection(((com.tencent.mm.ui.base.preference.h0) this.f160608d).o(pluginPreference14.f197780q));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494949ch;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iwi);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.bl(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160608d = getPreferenceScreen();
        initView();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(14098, 5);
        g0Var.d(12846, 1);
        c01.n8.a().c("gh_43f2581f6fd6", 23);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0069, code lost:
    
        if (r7.equals("qqmail") == false) goto L12;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x006d. Please report as an issue. */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r r7, com.tencent.mm.ui.base.preference.Preference r8) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI.onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeLongClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference, android.view.View view) {
        return super.onPreferenceTreeLongClick(rVar, preference, view);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_f0a92aa7146c", true);
        boolean r27 = n17 != null ? n17.r2() : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "needGetReceipAssistPlugin result：%s", java.lang.Boolean.valueOf(r27));
        if (!r27) {
            gm0.j1.d().a(2745, this);
            gm0.j1.d().g(new k14.a0());
        }
        if (1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minishop_plugin_enabled, 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "fetchMiniShopHelperPluginShowStatusIfNeed, not need");
        } else {
            com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_579db1f2cf89", true);
            boolean r28 = n18 != null ? true ^ n18.r2() : true;
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "fetchMiniShopHelperPluginShowStatusIfNeed, needFetch: " + r28);
            if (r28) {
                gm0.j1.d().a(4158, this);
                gm0.j1.d().g(new k14.z());
            }
        }
        V6();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        if (!(m1Var instanceof k14.a0)) {
            if (m1Var instanceof k14.z) {
                gm0.j1.d().q(4158, this);
                if (i17 != 0 && i18 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SettingsPluginsUI", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                    return;
                }
                if (((k14.z) m1Var).f303421f) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "need to show unstall MiniShopHelperPlugin");
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_PLUGIN_SHOW_MINI_SHOP_HELPER_FLAG_INT_SYNC, 1);
                } else {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_PLUGIN_SHOW_MINI_SHOP_HELPER_FLAG_INT_SYNC, 0);
                }
                V6();
                return;
            }
            return;
        }
        gm0.j1.d().q(2745, this);
        if (i17 != 0 && i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsPluginsUI", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        r45.rm3 rm3Var = ((k14.a0) m1Var).f303298f;
        if (rm3Var == null) {
            rm3Var = new r45.rm3();
        }
        if (rm3Var.f385011d == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginsUI", "need to show unstall ReceipAssistPlugin");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_PLUGIN_SHOW_PAY_COLLECTION_FLAG_INT_SYNC, 1);
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_PLUGIN_SHOW_PAY_COLLECTION_FLAG_INT_SYNC, 0);
        }
        V6();
    }
}
