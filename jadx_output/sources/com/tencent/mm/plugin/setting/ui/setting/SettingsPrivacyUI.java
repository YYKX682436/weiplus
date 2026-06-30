package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class SettingsPrivacyUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f160610y = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160611g;

    /* renamed from: h, reason: collision with root package name */
    public int f160612h;

    /* renamed from: i, reason: collision with root package name */
    public long f160613i;

    /* renamed from: m, reason: collision with root package name */
    public long f160614m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f160615n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160616o = "";

    /* renamed from: p, reason: collision with root package name */
    public boolean f160617p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f160618q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f160619r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f160620s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f160621t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f160622u = true;

    /* renamed from: v, reason: collision with root package name */
    public r45.mf6 f160623v = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f160624w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f160625x = 0;

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 2;
    }

    public final void X6(android.widget.LinearLayout linearLayout, int i17, int i18, boolean z17, android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = (android.widget.TextView) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cbx, null);
        textView.setText(i17);
        textView.setTag(java.lang.Integer.valueOf(i18));
        linearLayout.addView(textView);
        textView.setOnClickListener(onClickListener);
        if (z17) {
            textView.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_on, 0, 0, 0);
        }
    }

    public final boolean Y6(boolean z17, int i17, int i18) {
        if (z17) {
            this.f160612h = i17 | this.f160612h;
        } else {
            this.f160612h = (~i17) & this.f160612h;
        }
        this.f160615n.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(z17 ? 1 : 2));
        return true;
    }

    public final void Z6() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference;
        r45.cb6 cb6Var = new r45.cb6();
        r45.mf6 Ai = ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Ai();
        if (p94.w0.c() != null) {
            cb6Var = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(this.f160616o);
        }
        if (cb6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingPrivacy", "userinfo is null");
            return;
        }
        this.f160617p = (c01.z1.n() & 32768) == 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSnsOpenEntrance ");
        sb6.append(this.f160617p);
        sb6.append(", install true, flag ");
        sb6.append((32768 & c01.z1.n()) == 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingPrivacy", sb6.toString());
        if (this.f160617p) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160611g).m("settings_story_notify", false);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f160611g).m("settings_story_notify", true);
        }
        if (this.f160617p && (checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160611g).h("settings_story_notify")) != null) {
            checkBoxPreference.f197785v = false;
            boolean z17 = Ai.f380460d == 0;
            this.f160622u = z17;
            if (z17) {
                checkBoxPreference.O(true);
            } else {
                checkBoxPreference.O(false);
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160611g).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public com.tencent.mm.ui.base.preference.h0 createAdapter(android.content.SharedPreferences sharedPreferences) {
        return new com.tencent.mm.ui.base.preference.b(this, getListView(), sharedPreferences);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494926bs;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.ioy);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.fl(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingPrivacy", "init function status: " + java.lang.Integer.toBinaryString(this.f160612h) + "extStatus: " + java.lang.Long.toBinaryString(this.f160613i) + " FinderSetting: " + java.lang.Long.toBinaryString(this.f160614m));
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160611g).h("settings_need_verify");
        checkBoxPreference.f197785v = false;
        checkBoxPreference.O((this.f160612h & 32) != 0);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160611g).h("settings_recommend_mobilefriends_to_me");
        checkBoxPreference2.f197785v = false;
        if (str == null || str.length() <= 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160611g).v(checkBoxPreference2);
        } else {
            checkBoxPreference2.O(!((this.f160612h & 256) != 0));
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160611g).h("settings_find_google_contact");
        checkBoxPreference3.f197785v = false;
        checkBoxPreference3.O(!((this.f160612h & 1048576) != 0));
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(208903, null);
        if (!com.tencent.mm.sdk.platformtools.t8.P0(this) || android.text.TextUtils.isEmpty(str2)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160611g).v(checkBoxPreference3);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160611g).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160611g = getPreferenceScreen();
        this.f160612h = c01.z1.p();
        this.f160613i = c01.z1.j();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        this.f160614m = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L);
        this.f160616o = c01.z1.r();
        r45.mf6 Ai = ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Ai();
        this.f160623v = Ai;
        this.f160622u = Ai.f380460d == 0;
        this.f160625x = getIntent().getIntExtra("enter_scene", 0);
        initView();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14098, 9);
        int i17 = this.f160625x;
        if (i17 == 1 || i17 == 2) {
            r45.cb6 cb6Var = new r45.cb6();
            if (p94.w0.c() != null) {
                cb6Var = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(this.f160616o);
            }
            if (cb6Var != null) {
                int i18 = cb6Var.f371431g;
                int i19 = cb6Var.f371432h;
                this.f160618q = i19 == 4320 && (i18 & 4096) > 0;
                this.f160619r = i19 == 72 && (i18 & 4096) > 0;
                this.f160621t = i19 == 720 && (i18 & 4096) > 0;
                this.f160620s = (i18 & 2048) > 0;
            }
            r45.cb6 cb6Var2 = new r45.cb6();
            if (p94.w0.c() != null) {
                cb6Var2 = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(this.f160616o);
            }
            if (cb6Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SettingPrivacy", "userinfo is null");
            } else {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_RECENT_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue();
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_RECENT_RED_DOT_DID_SHOW_ID_INT;
                if (intValue > ((java.lang.Integer) c17.m(u3Var, 0)).intValue()) {
                    gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue));
                    Z6();
                }
                androidx.appcompat.app.AppCompatActivity context = getContext();
                com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490347sg);
                aVar.f211709a = of5.b.a(context).getString(com.tencent.mm.R.string.bdn);
                android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bxx, null);
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.nua);
                android.view.View.OnClickListener elVar = new com.tencent.mm.plugin.setting.ui.setting.el(this, linearLayout);
                X6(linearLayout, com.tencent.mm.R.string.bdp, 1, this.f160618q, elVar);
                X6(linearLayout, com.tencent.mm.R.string.bdq, 3, this.f160621t, elVar);
                X6(linearLayout, com.tencent.mm.R.string.bdr, 0, this.f160619r, elVar);
                X6(linearLayout, com.tencent.mm.R.string.bdo, 2, (this.f160618q || this.f160619r || this.f160621t) ? false : true, elVar);
                aVar.L = inflate;
                com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                j0Var.e(aVar);
                com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f211837r);
                }
                linearLayout.setTag(j0Var);
                j0Var.show();
                addDialog(j0Var);
            }
        }
        boolean el6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        boolean z17 = !((c01.z1.j() & 34359738368L) != 0);
        boolean z18 = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingPrivacy", "[isShowFinderEntrance] show:%s open:%s, isTeenModeAndNothing:%s", java.lang.Boolean.valueOf(el6), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (el6 && z17 && !z18) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160611g).m("setting_privacy_video_item", false);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f160611g).m("setting_privacy_video_item", true);
        }
        com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct();
        userPrivacySettingClientReportStruct.f61522d = 1L;
        userPrivacySettingClientReportStruct.k();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(this.f160612h));
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f160613i));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, java.lang.Long.valueOf(this.f160614m));
        java.util.HashMap hashMap = this.f160615n;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = intValue;
            p53Var.f382762e = intValue2;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingPrivacy", str + " item has been clicked!");
        getDefaultSharedPreferences();
        boolean z17 = true;
        if (str.equals("settings_need_verify")) {
            Y6(((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_need_verify")).N(), 32, 4);
        } else if (str.equals("settings_recommend_mobilefriends_to_me")) {
            Y6(!((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_recommend_mobilefriends_to_me")).N(), 256, 7);
        } else if (str.equals("settings_about_blacklist")) {
            c01.s7 a17 = c01.t7.a(getString(com.tencent.mm.R.string.fsb));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("filter_type", a17.a());
            intent.putExtra("titile", getString(com.tencent.mm.R.string.ix6));
            intent.putExtra("list_attr", 32768);
            ((com.tencent.mm.app.y7) f14.g.b()).A(this, intent);
        } else if (str.equals("setting_privacy_chatting_item")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(268435456);
            intent2.putExtra("intent_status_show_bottom_tips", getString(com.tencent.mm.R.string.f491013bk5));
            intent2.setClassName(this, "com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("setting_privacy_sns_item")) {
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI.class);
            intent3.putExtra("need_matte_high_light_item", getIntent().getStringExtra("need_matte_high_light_item"));
            intent3.putExtra("enter_scene", getIntent().getIntExtra("enter_scene", 0));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("setting_privacy_video_item")) {
            android.content.Intent intent4 = new android.content.Intent();
            intent4.addFlags(268435456);
            intent4.putExtra("intent_status_from_privacy_to_video_setting", true);
            j45.l.j(this, "finder", ".ui.FinderManagementUI", intent4, null);
        } else if (str.equals("setting_privacy_watch_item")) {
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("intent_status_from_privacy_to_tophistory_setting", true);
            com.tencent.mm.plugin.websearch.l2.i(this, ".ui.home.TopStorySettingUI", intent5);
        } else if (str.equals("setting_privacy_wx_sport_item")) {
            android.content.Intent intent6 = new android.content.Intent();
            intent6.setClassName(this, "com.tencent.mm.ui.contact.privacy.SportBlackListUI");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent6);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_find_google_contact")) {
            Y6(!((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_find_google_contact")).N(), 1048576, 29);
        } else if (str.equals("settings_add_me_way")) {
            android.content.Intent intent7 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI.class);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent7);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            if (str.equals("settings_auth_manage")) {
                if (com.tencent.mm.sdk.platformtools.f9.MeSetPrivacyPermissions.k(this, null)) {
                    android.content.Intent intent8 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI.class);
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(intent8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList5.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (str.equals("settings_story_notify")) {
                boolean z18 = !this.f160622u;
                this.f160622u = z18;
                if (z18) {
                    this.f160623v.f380460d = 0;
                } else {
                    this.f160623v.f380460d = 1;
                }
                ze4.f fVar = (ze4.f) i95.n0.c(ze4.f.class);
                java.lang.String str2 = this.f160616o;
                r45.mf6 mf6Var = this.f160623v;
                ((ye4.e) fVar).getClass();
                nf4.g g17 = ef4.w.f252468t.g();
                if (str2 != null && mf6Var != null) {
                    nf4.f y07 = g17.y0(str2);
                    y07.field_userInfo = mf6Var.toByteArray();
                    g17.b1(y07);
                }
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(71, this.f160623v));
                Z6();
            } else if (str.equals("settings_ad_manage")) {
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_oversea_admanage_url_android, "", true);
                android.content.Intent intent9 = new android.content.Intent();
                intent9.putExtra("rawUrl", java.lang.String.format(Zi, com.tencent.mm.sdk.platformtools.m2.f(this), com.tencent.mm.sdk.platformtools.m2.e()));
                intent9.putExtra("showShare", false);
                intent9.putExtra("show_bottom", false);
                j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent9, null);
            }
            z17 = false;
        }
        W6(rVar, preference.f197780q);
        return z17;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f160612h = c01.z1.p();
        this.f160613i = c01.z1.j();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        this.f160614m = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L);
        Z6();
        if (!this.f160624w) {
            java.lang.String stringExtra = getIntent().getStringExtra("need_matte_high_light_item");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                int o17 = ((com.tencent.mm.ui.base.preference.h0) this.f160611g).o(stringExtra);
                setSelection(o17 - 3);
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.setting.ui.setting.cl(this, o17), 10L);
            }
            this.f160624w = true;
        }
        W6(this.f160611g, "settings_need_verify");
        W6(this.f160611g, "settings_recommend_mobilefriends_to_me");
        W6(this.f160611g, "settings_about_blacklist");
        W6(this.f160611g, "setting_privacy_chatting_item");
        W6(this.f160611g, "setting_privacy_sns_item");
        W6(this.f160611g, "setting_privacy_video_item");
        W6(this.f160611g, "setting_privacy_watch_item");
        W6(this.f160611g, "setting_privacy_wx_sport_item");
        W6(this.f160611g, "settings_find_google_contact");
        W6(this.f160611g, "settings_add_me_way");
        W6(this.f160611g, "settings_auth_manage");
        W6(this.f160611g, "settings_story_notify");
        W6(this.f160611g, "settings_ad_manage");
    }
}
