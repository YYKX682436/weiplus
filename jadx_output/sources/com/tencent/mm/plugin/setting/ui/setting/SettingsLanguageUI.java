package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class SettingsLanguageUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160479g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f160480h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160481i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160482m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160483n = false;

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 3;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.irr);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.Cif(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.irq), new com.tencent.mm.plugin.setting.ui.setting.kf(this), null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(0, false);
        this.f160483n = getIntent().getBooleanExtra("not_auth_setting", false);
        ((com.tencent.mm.ui.base.preference.h0) this.f160479g).t();
        if (this.f160481i == null) {
            this.f160481i = com.tencent.mm.sdk.platformtools.m2.p(getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 4), this);
        }
        java.lang.String str = this.f160481i;
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.B3(new t14.z("select_view_language", str, 4));
        }
        java.lang.String[] stringArray = com.tencent.mm.sdk.platformtools.x9.c() ? getResources().getStringArray(com.tencent.mm.R.array.f478008w) : getResources().getStringArray(com.tencent.mm.R.array.f478007v);
        this.f160482m = com.tencent.mm.sdk.platformtools.m2.p(getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 4), this);
        this.f160480h = new java.util.ArrayList();
        java.lang.String[] strArr = com.tencent.mm.sdk.platformtools.l2.f192818a;
        if (com.tencent.mm.sdk.platformtools.x9.c()) {
            strArr = com.tencent.mm.sdk.platformtools.l2.f192819b;
        }
        for (int i17 = 0; i17 < strArr.length; i17++) {
            java.lang.String str2 = strArr[i17];
            ((java.util.ArrayList) this.f160480h).add(new com.tencent.mm.plugin.account.ui.f3(stringArray[i17], "", str2, this.f160482m.equalsIgnoreCase(str2)));
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f160480h).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.account.ui.f3 f3Var = (com.tencent.mm.plugin.account.ui.f3) it.next();
            com.tencent.mm.plugin.account.ui.LanguagePreference languagePreference = new com.tencent.mm.plugin.account.ui.LanguagePreference(this, null);
            languagePreference.M(f3Var);
            ((com.tencent.mm.ui.base.preference.h0) this.f160479g).d(languagePreference, -1);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160479g).d(new com.tencent.mm.ui.base.preference.PreferenceCategory(this), -1);
        ((com.tencent.mm.ui.base.preference.h0) this.f160479g).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160479g = getPreferenceScreen();
        initView();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.account.ui.f3 f3Var;
        if (!(preference instanceof com.tencent.mm.plugin.account.ui.LanguagePreference) || (f3Var = ((com.tencent.mm.plugin.account.ui.LanguagePreference) preference).L) == null) {
            return false;
        }
        java.lang.String str = f3Var.f73838a;
        java.lang.String str2 = f3Var.f73840c;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.ui.base.preference.MMPreference.TAG, "LanguageName:%s IsoCode:%s", str, str2);
        this.f160482m = str2;
        java.util.Iterator it = ((java.util.ArrayList) this.f160480h).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.account.ui.f3) it.next()).f73841d = false;
        }
        f3Var.f73841d = true;
        enableOptionMenu(0, !android.text.TextUtils.equals(this.f160481i, this.f160482m));
        ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        return true;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(n14.m.class);
    }
}
