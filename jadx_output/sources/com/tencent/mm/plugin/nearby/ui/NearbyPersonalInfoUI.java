package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes8.dex */
public class NearbyPersonalInfoUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f152108d;

    /* renamed from: e, reason: collision with root package name */
    public int f152109e = -1;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494905b6;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.h77);
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f152108d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.KeyValuePreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("settings_signature")).P = false;
        setBackBtn(new com.tencent.mm.plugin.nearby.ui.s0(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490502ww), new com.tencent.mm.plugin.nearby.ui.t0(this));
        ((com.tencent.mm.ui.base.preference.ChoicePreference) ((com.tencent.mm.ui.base.preference.h0) this.f152108d).h("settings_sex")).S = new com.tencent.mm.plugin.nearby.ui.u0(this);
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12290, null), 0);
        com.tencent.mm.ui.base.preference.ChoicePreference choicePreference = (com.tencent.mm.ui.base.preference.ChoicePreference) ((com.tencent.mm.ui.base.preference.h0) this.f152108d).h("settings_sex");
        choicePreference.L(android.text.Html.fromHtml(getString(com.tencent.mm.R.string.f493086iy4) + "<font color='red'>*</font>"));
        if (j17 == 1) {
            choicePreference.M("male");
        } else if (j17 != 2) {
            choicePreference.M(com.eclipsesource.mmv8.Platform.UNKNOWN);
        } else {
            choicePreference.M("female");
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if ("settings_district".equals(str)) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.w(null, this);
            return true;
        }
        if (!"settings_signature".equals(str)) {
            return false;
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.getClass();
        j45.l.j(this, "setting", ".ui.setting.EditSignatureUI", new android.content.Intent(), null);
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477856de);
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        c01.fb a17 = c01.fb.a();
        java.lang.String d17 = a17.d();
        java.lang.String c17 = a17.c();
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f152108d).h("settings_district");
        h17.H(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(d17) + " " + c17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(getString(com.tencent.mm.R.string.iqg));
        sb6.append("<font color='red'>*</font>");
        h17.L(android.text.Html.fromHtml(sb6.toString()));
        com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) this.f152108d).h("settings_signature");
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(12291, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        if (str.length() <= 0) {
            str = getString(com.tencent.mm.R.string.iy8);
        }
        ((ke0.e) xVar).getClass();
        h18.H(com.tencent.mm.pluginsdk.ui.span.c0.i(this, str));
        super.onResume();
    }
}
