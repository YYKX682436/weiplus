package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class SettingsAccountInfoUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f160286n = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/cgi-bin/readtemplate?check=false&t=weixin_faq_verifyaccount&platform=android&lang=%s";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160287g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f160288h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f160289i = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160290m = "";

    public SettingsAccountInfoUI() {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sparseIntArray.put(0, com.tencent.mm.R.string.iqc);
        sparseIntArray.put(-82, com.tencent.mm.R.string.inx);
        sparseIntArray.put(-83, com.tencent.mm.R.string.inu);
        sparseIntArray.put(-84, com.tencent.mm.R.string.inv);
        sparseIntArray.put(-85, com.tencent.mm.R.string.inq);
        sparseIntArray.put(-86, com.tencent.mm.R.string.iny);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 2;
    }

    public final java.lang.String X6(boolean z17, boolean z18) {
        return z18 ? getString(com.tencent.mm.R.string.p9n) : getString(com.tencent.mm.R.string.p9m);
    }

    public final void Y6() {
        boolean z17 = false;
        if (!(com.tencent.mm.ui.bk.A() || c01.z1.x())) {
            if (((is.f) ((js.r0) i95.n0.c(js.r0.class))).Zi(c01.z1.r())) {
                if (((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ui(getContext(), false)) {
                    ((com.tencent.mm.ui.base.preference.SummaryTextPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160287g).h("settings_fingerprint_title")).H(X6(true, ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ni(c01.z1.r())));
                    z17 = true;
                }
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160287g).m("settings_fingerprint_title", !z17);
    }

    public final void Z6() {
        if (((com.tencent.mm.ui.base.preference.h0) this.f160287g).h("settings_manage_login_device") == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsAccountInfoUI", "safedevicesate preference is null");
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160287g).m("settings_manage_login_device", false);
        if (c01.z1.e() != 1) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160287g).m("settings_manage_login_device", true);
        }
    }

    public final void a7() {
        if (com.tencent.mm.sdk.platformtools.f9.MeSetSecurityVoicePrint.h() || com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) != 1) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160287g).m("settings_voiceprint_title", true);
            return;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsAccountInfoUI", "update voiceprint dot, account not ready!");
            return;
        }
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160287g).h("settings_voiceprint_title");
        int q17 = gm0.j1.u().c().q(40, 0);
        boolean z17 = (65536 & q17) != 0;
        int i17 = q17 & 131072;
        iconPreference.H(X6(z17, i17 != 0));
        if (((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_NEW_SHOW_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue() && i17 == 0) {
            iconPreference.V = getString(com.tencent.mm.R.string.f490501wv);
            iconPreference.W = com.tencent.mm.R.drawable.asx;
            iconPreference.a0(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAccountInfoUI", "show voiceprint dot");
            ((com.tencent.mm.ui.base.preference.h0) this.f160287g).notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean autoRefresh() {
        return true;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        Z6();
        Y6();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494934c2;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f493019ip1);
        this.f160287g = getPreferenceScreen();
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.ckf, null);
        this.f160288h = inflate;
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mmq)).setText(getString(com.tencent.mm.R.string.irg));
        ((com.tencent.mm.ui.base.MMLimitedClearEditText) this.f160288h.findViewById(com.tencent.mm.R.id.mmp)).getEditText().setInputType(129);
        if (c01.z1.e() != 1) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160287g).m("settings_manage_login_device", true);
        }
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.o6(this));
        rn3.i.Di().k((com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160287g).h("settings_more_safe"));
        this.f160290m = getIntent().getStringExtra("highlight_item_id");
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        new r45.nn3().b().l().h(new gm5.a() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI$$b
            @Override // gm5.a
            public final java.lang.Object call(java.lang.Object obj) {
                r45.on3 on3Var;
                r45.iu5 iu5Var;
                int i17;
                com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
                java.lang.String str = com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.f160286n;
                com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI settingsAccountInfoUI = com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.this;
                settingsAccountInfoUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAccountInfoUI", "GetSafetyInfoRespsonse cgiBack, errType:%s, errCode:%s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
                if (fVar.f70615a == 0 && (on3Var = (r45.on3) fVar.f70618d) != null && (iu5Var = on3Var.f382377d) != null) {
                    boolean z17 = iu5Var.f377342e;
                    boolean z18 = iu5Var.f377343f;
                    int o17 = c01.z1.o();
                    if (z17) {
                        int i18 = 65536 | o17;
                        i17 = z18 ? 131072 | i18 : (-131073) & i18;
                    } else {
                        i17 = (-65537) & o17;
                    }
                    if (i17 != o17) {
                        c01.b9.f37069c.d("last_login_use_voice", i17 + "");
                        gm0.j1.u().c().z(40, i17);
                        settingsAccountInfoUI.a7();
                        ((com.tencent.mm.ui.base.preference.h0) settingsAccountInfoUI.f160287g).notifyDataSetChanged();
                    }
                }
                return fVar;
            }
        });
        initView();
        gm0.j1.u().c().a(this);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.u().c().e(this);
        this.f160289i.removeCallbacksAndMessages(null);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAccountInfoUI", str + " item has been clicked!");
        c01.z1.r();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (str.equals("settings_about_vuser_about")) {
            com.tencent.mm.sdk.platformtools.t8.b1(getContext(), java.lang.String.format(f160286n, com.tencent.mm.sdk.platformtools.m2.d()));
        } else if (str.equals("settings_independent_password")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("kintent_hint", getString(com.tencent.mm.R.string.itc));
            startActivity(com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class, intent);
        } else if (str.equals("settings_manage_login_device")) {
            j45.l.h(this, "account", ".security.ui.MySafeDeviceListUI");
        } else if (str.equals("settings_security_center")) {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("WeChatSafeCenterUrl");
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAccountInfoUI", "safe center url %s", d17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                d17 = getString(com.tencent.mm.R.string.l8n) + com.tencent.mm.sdk.platformtools.m2.d();
            }
            androidx.appcompat.app.AppCompatActivity context = getContext();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", d17);
            intent2.putExtra("showShare", true);
            intent2.putExtra("show_bottom", false);
            intent2.putExtra("needRedirect", false);
            intent2.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
            intent2.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
            j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent2, null);
        } else if (str.equals("settings_voiceprint_title")) {
            if (com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1 && (gm0.j1.u().c().q(40, 0) & 131072) == 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_NEW_SHOW_BOOLEAN, java.lang.Boolean.FALSE);
                ((com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160287g).h("settings_voiceprint_title")).a0(8);
                ((com.tencent.mm.ui.base.preference.h0) this.f160287g).notifyDataSetChanged();
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAccountInfoUI", "unset setting account info new show");
            }
            j45.l.h(getContext(), "voiceprint", "com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI");
        } else if (str.equals("settings_facedect_title")) {
            com.tencent.mm.autogen.events.RequestStartFaceManageEvent requestStartFaceManageEvent = new com.tencent.mm.autogen.events.RequestStartFaceManageEvent();
            requestStartFaceManageEvent.f54701g.f7740a = this;
            requestStartFaceManageEvent.e();
            boolean z17 = requestStartFaceManageEvent.f54702h.f7836a;
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAccountInfoUI", "hy: is start to face settings succ: %b", java.lang.Boolean.valueOf(z17));
            if (!z17) {
                db5.t7.makeText(getContext(), getString(com.tencent.mm.R.string.c7s), 0).show();
            }
        } else if (str.equals("settings_trust_friend")) {
            startActivity(com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.class);
        } else if (str.equals("settings_more_safe")) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().j(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_SETTINGS_MORE_SAFE_STRING_SYNC);
            rn3.i.Di().a(52);
            startActivity(com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI.class);
        } else if (str.equals("settings_no_pwd_title")) {
            android.content.Intent intent3 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
            pf5.j0.a(intent3, q14.d.class);
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent3);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAccountInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/setting/ui/setting/SettingsAccountInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_fingerprint_title")) {
            android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAccountInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAccountInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160287g).h("settings_more_safe");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean z17 = false;
        if (bk0.a.g().d(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_SETTINGS_MORE_SAFE_STRING_SYNC)) {
            iconPreference.c0(0);
        } else {
            iconPreference.c0(8);
        }
        Z6();
        Y6();
        ((com.tencent.mm.ui.base.preference.h0) this.f160287g).m("settings_facedect_title", true);
        if (!(com.tencent.mm.ui.bk.A() || c01.z1.x())) {
            if (((is.f) ((js.r0) i95.n0.c(js.r0.class))).bj(c01.z1.r())) {
                ((com.tencent.mm.ui.base.preference.SummaryTextPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160287g).h("settings_no_pwd_title")).H(X6(true, ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ri()));
                z17 = true;
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160287g).m("settings_no_pwd_title", !z17);
        a7();
        if (((is.f) ((js.r0) i95.n0.c(js.r0.class))).cj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAccountInfoUI", "show trusted friend entry");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAccountInfoUI", "hide trusted friend entry");
            ((com.tencent.mm.ui.base.preference.h0) this.f160287g).m("settings_trust_friend", true);
        }
        com.tencent.mm.ui.base.preference.PluginTextPreference pluginTextPreference = (com.tencent.mm.ui.base.preference.PluginTextPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160287g).h("settings_about_vusertitle");
        com.tencent.mm.plugin.setting.ui.setting.SelfVuserPreference selfVuserPreference = (com.tencent.mm.plugin.setting.ui.setting.SelfVuserPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160287g).h("settings_about_vuserinfo");
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160287g).h("settings_about_vuser_about");
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66049, null));
        if (q17 != 0) {
            pluginTextPreference.R = 8;
            pluginTextPreference.P = pluginTextPreference.f197770d.getString(com.tencent.mm.R.string.bjb);
            selfVuserPreference.L = new android.graphics.drawable.BitmapDrawable(getResources(), c01.n8.b() != null ? com.tencent.mm.sdk.platformtools.j.a(((xf4.d) c01.n8.b()).b(q17, true), 2.0f) : null);
            selfVuserPreference.M = (java.lang.String) gm0.j1.u().c().l(66050, null);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f160287g).v(pluginTextPreference);
            ((com.tencent.mm.ui.base.preference.h0) this.f160287g).v(selfVuserPreference);
            ((com.tencent.mm.ui.base.preference.h0) this.f160287g).v(h17);
        }
        com.tencent.mm.ui.base.preference.TextPreference textPreference = (com.tencent.mm.ui.base.preference.TextPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160287g).h("settings_security_center_tip");
        if (textPreference != null) {
            java.lang.CharSequence text = getText(com.tencent.mm.R.string.ixy);
            textPreference.M = text;
            textPreference.L = 3;
            android.widget.TextView textView = textPreference.N;
            if (textView != null) {
                textView.setText(text);
                textPreference.N.setGravity(textPreference.L);
            }
        }
        super.onResume();
        this.f160289i.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                final com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI settingsAccountInfoUI = com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.this;
                java.lang.String str = settingsAccountInfoUI.f160290m;
                if (str == null || str.isEmpty()) {
                    return;
                }
                final com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) settingsAccountInfoUI.f160287g).h(settingsAccountInfoUI.f160290m);
                if (h18 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SettingsAccountInfoUI", "cannot find pref: " + settingsAccountInfoUI.f160290m);
                    return;
                }
                if (!((com.tencent.mm.ui.base.preference.h0) settingsAccountInfoUI.f160287g).q(settingsAccountInfoUI.f160290m)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SettingsAccountInfoUI", "pref is hide: " + settingsAccountInfoUI.f160290m);
                } else if (h18 instanceof com.tencent.mm.ui.base.preference.SummaryTextPreference) {
                    int color = settingsAccountInfoUI.getResources().getColor(com.tencent.mm.R.color.ahd);
                    android.view.View view = ((com.tencent.mm.ui.base.preference.SummaryTextPreference) h18).N;
                    if (view != null) {
                        view.setBackgroundColor(color);
                    }
                    settingsAccountInfoUI.f160289i.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.String str2 = com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.f160286n;
                            com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI settingsAccountInfoUI2 = com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.this;
                            settingsAccountInfoUI2.getClass();
                            com.tencent.mm.ui.base.preference.SummaryTextPreference summaryTextPreference = (com.tencent.mm.ui.base.preference.SummaryTextPreference) h18;
                            int color2 = settingsAccountInfoUI2.getResources().getColor(com.tencent.mm.R.color.ahk);
                            android.view.View view2 = summaryTextPreference.N;
                            if (view2 != null) {
                                view2.setBackgroundColor(color2);
                            }
                        }
                    }, 1000L);
                    settingsAccountInfoUI.f160290m = "";
                }
            }
        }, 500L);
    }
}
