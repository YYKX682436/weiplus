package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class SettingsAddMeUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160305g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f160306h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f160307i;

    /* renamed from: m, reason: collision with root package name */
    public int f160308m;

    /* renamed from: n, reason: collision with root package name */
    public long f160309n;

    /* renamed from: o, reason: collision with root package name */
    public long f160310o;

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 3;
    }

    public final void X6(boolean z17, int i17, int i18) {
        if (z17) {
            this.f160307i = i17 | this.f160307i;
        } else {
            this.f160307i = (~i17) & this.f160307i;
        }
        this.f160306h.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    public final void Y6(boolean z17, long j17, int i17) {
        if (z17) {
            this.f160309n = j17 | this.f160309n;
        } else {
            this.f160309n = (~j17) & this.f160309n;
        }
        this.f160306h.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public com.tencent.mm.ui.base.preference.h0 createAdapter(android.content.SharedPreferences sharedPreferences) {
        return new com.tencent.mm.ui.base.preference.b(this, getListView(), sharedPreferences);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494929bv;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        boolean z17;
        setMMTitle(com.tencent.mm.R.string.ip_);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.r6(this));
        ((com.tencent.mm.ui.base.preference.h0) this.f160305g).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f160305g).g(com.tencent.mm.R.xml.f494929bv);
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(9, null);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160305g).h("settings_find_me_by_QQ");
        checkBoxPreference.f197785v = false;
        if (com.tencent.mm.sdk.platformtools.f9.MeSetPrivacyAddByQQ.h() || num == null || num.intValue() == 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160305g).v(checkBoxPreference);
        } else {
            int i17 = this.f160307i;
            if ((8 & i17) != 0) {
                if ((i17 & 16) != 0) {
                    z17 = false;
                    checkBoxPreference.O(z17);
                }
            }
            z17 = true;
            checkBoxPreference.O(z17);
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160305g).h("settings_find_me_by_mobile");
        checkBoxPreference2.f197785v = false;
        if (str == null || str.length() <= 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160305g).v(checkBoxPreference2);
        } else {
            checkBoxPreference2.O(!((this.f160307i & 512) != 0));
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160305g).h("settings_find_me_by_weixin");
        checkBoxPreference3.f197785v = false;
        if ((512 & this.f160308m) != 0) {
            checkBoxPreference3.O(false);
        } else {
            checkBoxPreference3.O(true);
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160305g).h("settings_find_me_by_google");
        checkBoxPreference4.O(!((this.f160307i & 524288) != 0));
        checkBoxPreference4.f197785v = false;
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(208903, null);
        if (!com.tencent.mm.sdk.platformtools.t8.P0(this) || android.text.TextUtils.isEmpty(str2)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160305g).v(checkBoxPreference4);
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference5 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160305g).h("settings_add_me_by_chatroom");
        checkBoxPreference5.f197785v = false;
        if ((this.f160309n & 1) != 0) {
            checkBoxPreference5.O(false);
        } else {
            checkBoxPreference5.O(true);
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference6 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160305g).h("settings_add_me_by_qrcode");
        checkBoxPreference6.f197785v = false;
        if ((this.f160309n & 2) != 0) {
            checkBoxPreference6.O(false);
        } else {
            checkBoxPreference6.O(true);
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference7 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160305g).h("settings_add_me_by_namecard");
        checkBoxPreference7.f197785v = false;
        if ((this.f160309n & 4) != 0) {
            checkBoxPreference7.O(false);
        } else {
            checkBoxPreference7.O(true);
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference8 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160305g).h("settings_add_me_by_others");
        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_OTHER_SEARCH_METHODS_VISIBLE_CLIENT_GRAY_BOOLEAN_SYNC, false)) {
            checkBoxPreference8.G(com.tencent.mm.R.string.p9p);
            checkBoxPreference8.f197785v = false;
            checkBoxPreference8.O((this.f160310o & 140737488355328L) == 0);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f160305g).w("settings_add_me_by_others");
        }
        if (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160305g).w("settings_find_me_title");
            ((com.tencent.mm.ui.base.preference.h0) this.f160305g).w("settings_find_me_by_weixin");
            ((com.tencent.mm.ui.base.preference.h0) this.f160305g).w("settings_find_me_by_mobile");
            ((com.tencent.mm.ui.base.preference.h0) this.f160305g).w("settings_find_me_by_QQ");
            ((com.tencent.mm.ui.base.preference.h0) this.f160305g).w("settings_find_me_by_google");
            ((com.tencent.mm.ui.base.preference.h0) this.f160305g).w("settings_add_me_by_namecard");
            ((com.tencent.mm.ui.base.preference.h0) this.f160305g).w("settings_add_me_by_others");
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160305g).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160305g = getPreferenceScreen();
        this.f160308m = c01.z1.o();
        this.f160307i = c01.z1.p();
        this.f160309n = c01.z1.j();
        this.f160310o = c01.z1.i();
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(this.f160307i));
        gm0.j1.u().c().w(40, java.lang.Integer.valueOf(this.f160308m));
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f160309n));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f160310o));
        java.util.HashMap hashMap = this.f160306h;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = intValue;
            p53Var.f382762e = intValue2;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
        W6(this.f160305g, "settings_find_me_by_QQ");
        W6(this.f160305g, "settings_find_me_by_weixin");
        W6(this.f160305g, "settings_find_me_by_mobile");
        W6(this.f160305g, "settings_find_me_by_google");
        W6(this.f160305g, "settings_add_me_by_chatroom");
        W6(this.f160305g, "settings_add_me_by_qrcode");
        W6(this.f160305g, "settings_add_me_by_namecard");
        W6(this.f160305g, "settings_add_me_by_others");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAddMeUI", str + " item has been clicked!");
        boolean z17 = true;
        if (str.equals("settings_find_me_by_QQ")) {
            boolean z18 = !((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_find_me_by_QQ")).N();
            X6(z18, 8, 2);
            X6(z18, 16, 3);
        } else {
            boolean equals = str.equals("settings_find_me_by_weixin");
            java.util.HashMap hashMap = this.f160306h;
            if (equals) {
                boolean z19 = !((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_find_me_by_weixin")).N();
                if (z19) {
                    this.f160308m |= 512;
                } else {
                    this.f160308m &= -513;
                }
                hashMap.put(25, java.lang.Integer.valueOf(z19 ? 1 : 2));
            } else if (str.equals("settings_find_me_by_mobile")) {
                X6(!((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_find_me_by_mobile")).N(), 512, 8);
            } else if (str.equals("settings_find_me_by_google")) {
                X6(!((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_find_me_by_google")).N(), 524288, 30);
            } else if (str.equals("settings_add_me_by_chatroom")) {
                Y6(!((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_add_me_by_chatroom")).N(), 1L, 38);
            } else if (str.equals("settings_add_me_by_qrcode")) {
                Y6(!((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_add_me_by_qrcode")).N(), 2L, 39);
            } else if (str.equals("settings_add_me_by_namecard")) {
                Y6(!((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_add_me_by_namecard")).N(), 4L, 40);
            } else if (str.equals("settings_add_me_by_others")) {
                boolean z27 = !((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_add_me_by_others")).N();
                if (z27) {
                    this.f160310o |= 140737488355328L;
                } else {
                    this.f160310o &= -140737488355329L;
                }
                hashMap.put(105, java.lang.Integer.valueOf(z27 ? 1 : 2));
            } else {
                z17 = false;
            }
        }
        W6(this.f160305g, preference.f197780q);
        return z17;
    }
}
