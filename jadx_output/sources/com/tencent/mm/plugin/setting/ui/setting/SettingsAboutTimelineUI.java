package com.tencent.mm.plugin.setting.ui.setting;

@java.lang.Deprecated
/* loaded from: classes4.dex */
public class SettingsAboutTimelineUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160282e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f160281d = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f160283f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f160284g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160285h = true;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494928bu;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f160282e = getPreferenceScreen();
        setMMTitle(com.tencent.mm.R.string.iwh);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.n6(this));
        this.f160281d = c01.z1.r();
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ForbidSnsStranger", 0) == 0;
        this.f160285h = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutTimelineUI", "showStranger:%s", java.lang.Boolean.valueOf(z17));
        if (this.f160285h) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160282e).m("timeline_stranger_show", false);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f160282e).m("timeline_stranger_show", true);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160282e).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f160283f || p94.w0.c() == null) {
            return;
        }
        r45.cb6 P0 = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).P0(this.f160281d, this.f160284g);
        if (P0 == null) {
            return;
        }
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(51, P0));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (str.equals("timline_outside_permiss")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("k_sns_tag_id", 4L);
            intent.putExtra("k_sns_from_settings_about_sns", 1);
            j45.l.j(this, "sns", ".ui.SnsBlackDetailUI", intent, null);
        }
        if (str.equals("timeline_black_permiss")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("k_sns_tag_id", 5L);
            intent2.putExtra("k_sns_from_settings_about_sns", 2);
            j45.l.j(this, "sns", ".ui.SnsTagDetailUI", intent2, null);
        }
        if (!str.equals("timeline_stranger_show")) {
            return false;
        }
        this.f160284g = !this.f160284g;
        if (p94.w0.c() != null) {
            ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).C1(this.f160281d, this.f160284g);
        }
        this.f160283f = true;
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference;
        super.onResume();
        r45.cb6 cb6Var = new r45.cb6();
        if (p94.w0.c() != null) {
            cb6Var = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(this.f160281d);
        }
        if (cb6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsAboutTimelineUI", "userinfo is null");
        } else {
            int i17 = cb6Var.f371431g;
            if (this.f160285h && (checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160282e).h("timeline_stranger_show")) != null) {
                this.f160284g = (i17 & 1) > 0;
                android.content.SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
                if (this.f160284g) {
                    checkBoxPreference.O(false);
                    sharedPreferences.edit().putBoolean("timeline_stranger_show", false).commit();
                } else {
                    checkBoxPreference.O(true);
                    sharedPreferences.edit().putBoolean("timeline_stranger_show", true).commit();
                }
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160282e).notifyDataSetChanged();
    }
}
