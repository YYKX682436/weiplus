package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class SettingDarkMode extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160195g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160196h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f160197i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f160198m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f160199n;

    /* renamed from: o, reason: collision with root package name */
    public int f160200o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f160201p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f160202q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f160203r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f160204s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f160205t;

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 3;
    }

    public final void X6(boolean z17) {
        if (com.tencent.mm.ui.bk.F()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160195g).m("manual_title", z17);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f160195g).m("manual_title", true);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160195g).m("dark_mode", z17);
        ((com.tencent.mm.ui.base.preference.h0) this.f160195g).m("normal_mode", z17);
    }

    public final void Y6() {
        if (this.f160203r) {
            if (com.tencent.mm.ui.bk.I()) {
                com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("dark_mode_follow_system_need_report", true);
                return;
            }
            if (this.f160205t != this.f160197i) {
                this.f160200o = 4;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18893, java.lang.Integer.valueOf(this.f160200o), java.lang.Integer.valueOf(this.f160201p), 2, java.lang.Integer.valueOf(this.f160202q), java.lang.Integer.valueOf(com.tencent.mm.ui.bk.F() ? 1 : 0));
            com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "dark mode kvReport logID:%s, action:%s, dark:%s, mode:%s", 18893, java.lang.Integer.valueOf(this.f160200o), java.lang.Integer.valueOf(this.f160201p), java.lang.Integer.valueOf(this.f160202q));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494925br;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(getString(com.tencent.mm.R.string.iqf));
        this.f160195g = getPreferenceScreen();
        if (!com.tencent.mm.ui.bk.F()) {
            com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("dark_mode_follow_system", false);
            com.tencent.mm.ui.bk.x0();
        }
        boolean C = com.tencent.mm.ui.bk.C();
        this.f160196h = C;
        this.f160204s = C;
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("dark_mode_follow_system_need_report", false);
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getBoolean("dark_mode_follow_system", true);
        this.f160197i = z17;
        this.f160205t = z17;
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160195g).h("follow_system");
        this.f160198m = (com.tencent.mm.ui.base.preference.SelectPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160195g).h("dark_mode");
        this.f160199n = (com.tencent.mm.ui.base.preference.SelectPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160195g).h("normal_mode");
        if (!com.tencent.mm.ui.bk.F()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160195g).m("follow_system", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f160195g).m("manual_title", true);
        } else if (checkBoxPreference != null) {
            checkBoxPreference.O(this.f160197i);
            checkBoxPreference.S(this.f160197i);
            checkBoxPreference.f197785v = false;
        }
        if (this.f160197i) {
            X6(true);
        } else {
            X6(false);
            if (this.f160196h) {
                this.f160198m.P = true;
                this.f160199n.P = false;
            } else {
                this.f160199n.P = true;
                this.f160198m.P = false;
            }
        }
        java.lang.String str = this.f160204s ? "dark_mode" : "normal_mode";
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.B3(new t14.z("select_view_dark_mode", str, 4));
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160195g).notifyDataSetChanged();
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.y2(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.setting.ui.setting.z2(this), null, com.tencent.mm.ui.fb.GREEN);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int, boolean] */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        ?? r17 = 1;
        this.f160203r = true;
        if (str.equals("follow_system")) {
            if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N()) {
                this.f160200o = 4;
                this.f160201p = com.tencent.mm.ui.bk.E(getResources()) ? 1 : 0;
                this.f160202q = 1;
                this.f160205t = true;
                X6(true);
            } else {
                this.f160200o = 4;
                this.f160201p = this.f160196h ? 1 : 0;
                this.f160202q = 2;
                this.f160205t = false;
                X6(false);
                if (this.f160196h) {
                    this.f160198m.P = true;
                    this.f160199n.P = false;
                } else {
                    this.f160199n.P = true;
                    this.f160198m.P = false;
                }
            }
            this.f160204s = this.f160196h;
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        } else {
            boolean z17 = this.f160196h;
            if (str.equals("dark_mode")) {
                this.f160198m.P = true;
                this.f160199n.P = false;
                ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
            } else if (str.equals("normal_mode")) {
                this.f160198m.P = false;
                this.f160199n.P = true;
                ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
                r17 = 0;
            } else {
                r17 = z17;
            }
            this.f160200o = 2;
            this.f160201p = r17;
            this.f160202q = 2;
            this.f160204s = r17;
        }
        return false;
    }
}
