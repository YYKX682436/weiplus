package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class SettingsManageFindOtherServiceUI extends com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI {

    /* renamed from: w, reason: collision with root package name */
    public static boolean f160509w;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f160510r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f160511s = "settings_finder_live_switch";

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f160512t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f160513u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f160514v;

    @Override // com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI
    public void V6() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "doReport.");
        java.util.HashMap hashMap = this.f160510r;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue == 3) {
                if (((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q("settings_search_switch")) {
                    checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_search_switch");
                }
                checkBoxPreference = null;
            } else if (intValue == 10) {
                if (((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q("settings_look_switch")) {
                    checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_look_switch");
                }
                checkBoxPreference = null;
            } else if (intValue == 11) {
                if (((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q("settings_finder_switch")) {
                    checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_finder_switch");
                }
                checkBoxPreference = null;
            } else if (intValue == 8) {
                if (((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q("settings_miniprogram_switch")) {
                    checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_miniprogram_switch");
                }
                checkBoxPreference = null;
            } else if (intValue == 7) {
                if (((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q("settings_game_switch")) {
                    checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_game_switch");
                }
                checkBoxPreference = null;
            } else {
                if (intValue == 13 && ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q(this.f160511s)) {
                    checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h(this.f160511s);
                }
                checkBoxPreference = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "doReport. oldDefaultState.get(entrance) = " + hashMap.get(java.lang.Integer.valueOf(intValue)) + ", checkBoxPreference.isChecked() = " + checkBoxPreference.N());
            if (((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue))).intValue() != checkBoxPreference.N()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15185, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(checkBoxPreference.N() ? 1 : 0), 1);
            }
        }
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI
    public void Y6() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference;
        super.Y6();
        java.util.HashMap hashMap = this.f160494f;
        if (hashMap.containsKey(8)) {
            this.f160510r.put(8, (java.lang.Integer) hashMap.get(8));
        }
        if (this.f160497i && ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q("settings_miniprogram_switch") && (checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_miniprogram_switch")) != null) {
            if (this.f160500o) {
                checkBoxPreference.O(true);
                hashMap.put(8, 1);
            } else {
                checkBoxPreference.O(false);
                hashMap.put(8, 0);
            }
        }
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI
    public void Z6() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference;
        super.Z6();
        java.util.HashMap hashMap = this.f160494f;
        if (hashMap.containsKey(11)) {
            this.f160510r.put(11, (java.lang.Integer) hashMap.get(11));
        }
        if (this.f160497i && ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q("settings_finder_switch") && (checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_finder_switch")) != null) {
            if (this.f160500o) {
                checkBoxPreference.O(true);
                hashMap.put(11, 1);
            } else {
                checkBoxPreference.O(false);
                hashMap.put(11, 0);
            }
        }
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI
    public void c7() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference;
        super.c7();
        java.util.HashMap hashMap = this.f160494f;
        if (hashMap.containsKey(10)) {
            this.f160510r.put(10, (java.lang.Integer) hashMap.get(10));
        }
        if (this.f160497i && ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q("settings_look_switch") && (checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_look_switch")) != null) {
            if (this.f160500o) {
                checkBoxPreference.O(true);
                hashMap.put(10, 1);
            } else {
                checkBoxPreference.O(false);
                hashMap.put(10, 0);
            }
        }
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI
    public void d7() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference;
        super.d7();
        java.util.HashMap hashMap = this.f160494f;
        if (hashMap.containsKey(3)) {
            this.f160510r.put(3, (java.lang.Integer) hashMap.get(3));
        }
        if (this.f160497i && ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q("settings_search_switch") && (checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_search_switch")) != null) {
            if (this.f160500o) {
                checkBoxPreference.O(true);
                hashMap.put(3, 1);
            } else {
                checkBoxPreference.O(false);
                hashMap.put(3, 0);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ckm;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI, com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494938c6;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference;
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.lg(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.jlw);
        this.f160512t = findViewById;
        findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aay));
        this.f160513u = (android.widget.Button) findViewById(com.tencent.mm.R.id.g68);
        this.f160514v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ktd);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ("zh_CN".equals(com.tencent.mm.sdk.platformtools.m2.f(this))) {
            arrayList.add("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxz) + "/cgi-bin/micromsg-bin/oshelpcenter?opcode=2&lang=zh_CN&plat=android&pid=1002060&id=180514qe7zqb180514ea6rff&Channel=helpcenter");
        } else {
            arrayList.add("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxz) + "/cgi-bin/micromsg-bin/oshelpcenter?opcode=2&lang=en&plat=android&pid=1003432&id=180323j2ynmi180323afvrzj&Channel=helpcenter");
        }
        java.lang.String charSequence = this.f160514v.getText().toString();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(getString(com.tencent.mm.R.string.io7));
        ((ke0.e) xVar).sj(this, arrayList, charSequence, arrayList2, this.f160514v);
        this.f160513u.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.qg(this));
        Z6();
        b7();
        this.f160511s = ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi();
        java.util.HashMap hashMap = this.f160494f;
        boolean containsKey = hashMap.containsKey(13);
        java.util.HashMap hashMap2 = this.f160510r;
        if (containsKey) {
            hashMap2.put(13, (java.lang.Integer) hashMap.get(13));
        }
        if (this.f160497i) {
            if (((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q(this.f160511s)) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h(this.f160511s);
                if (checkBoxPreference2 != null) {
                    if (this.f160500o) {
                        checkBoxPreference2.O(true);
                        hashMap.put(13, 1);
                    } else {
                        checkBoxPreference2.O(false);
                        hashMap.put(13, 0);
                    }
                }
            }
        }
        c7();
        d7();
        Y6();
        a7();
        if (hashMap.containsKey(7)) {
            hashMap2.put(7, (java.lang.Integer) hashMap.get(7));
        }
        if (this.f160497i && ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).q("settings_game_switch") && (checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_game_switch")) != null) {
            if (this.f160500o) {
                checkBoxPreference.O(true);
                hashMap.put(7, 1);
            } else {
                checkBoxPreference.O(false);
                hashMap.put(7, 0);
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aay));
        hideActionbarLine();
        setMMTitle("");
        this.mController.G0(getResources().getColor(com.tencent.mm.R.color.aay));
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        f160509w = true;
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI, com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        int i17;
        if (!(preference instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference)) {
            return true;
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "click pref key %s", str);
        if (str.equals("settings_search_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoverySearch.k(this, null)) {
                return true;
            }
            i7(checkBoxPreference, checkBoxPreference.N(), true);
            i17 = 3;
        } else if (str.equals("settings_look_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryLooks.k(this, null)) {
                return true;
            }
            i17 = 10;
        } else if (str.equals("settings_finder_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryChannels.k(this, null)) {
                return true;
            }
            i17 = 11;
        } else if (str.equals("settings_miniprogram_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryAppbrand.k(this, null)) {
                return true;
            }
            i17 = 8;
        } else if (str.equals("settings_game_switch")) {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryGame.k(this, null)) {
                return true;
            }
            i17 = 7;
        } else if (!str.equals("settings_finder_live_switch") && !str.equals("settings_finder_live_above_look_switch")) {
            i17 = -1;
        } else {
            if (!com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryFinderLive.k(this, null)) {
                return true;
            }
            i17 = 13;
        }
        boolean N = checkBoxPreference.N();
        if (i17 >= 0) {
            this.f160495g.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(N ? 1 : 0));
        }
        return true;
    }
}
