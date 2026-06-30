package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class SettingsPersonalMoreUI extends com.tencent.mm.ui.base.preference.MMPreference implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160605d;

    /* renamed from: e, reason: collision with root package name */
    public int f160606e = -1;

    public final void V6() {
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160605d).h("settings_signature");
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
        h17.H(com.tencent.mm.pluginsdk.ui.span.c0.i(this, str));
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("SettingsPersonalMoreUI", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (12291 == o17) {
            V6();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494947cf;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iwe);
        this.f160605d = getPreferenceScreen();
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.zk(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (str.equals("settings_district")) {
            ((com.tencent.mm.app.y7) f14.g.b()).w(new android.content.Intent(), getContext());
            return true;
        }
        if (str.equals("settings_signature")) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_linkedin")) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI.class);
            intent2.putExtra("oversea_entry", true);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (!str.equals("settings_sex")) {
            return false;
        }
        android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SelectSexUI.class);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent3);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f160606e = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12290, null), 0);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160605d).h("settings_sex");
        int i17 = this.f160606e;
        if (i17 == 1) {
            h17.H(getString(com.tencent.mm.R.string.j1n));
        } else if (i17 == 2) {
            h17.H(getString(com.tencent.mm.R.string.j1m));
        }
        c01.fb a17 = c01.fb.a();
        java.lang.String d17 = a17.d();
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String c17 = a17.c();
        java.lang.String str = c17 != null ? c17 : "";
        ((com.tencent.mm.ui.base.preference.h0) this.f160605d).h("settings_district").H(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(d17) + " " + str);
        V6();
        boolean z17 = (c01.z1.n() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0;
        java.lang.String d18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LinkedinPluginClose");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.K0(d18) || com.tencent.mm.sdk.platformtools.t8.P(d18, 0) == 0;
        boolean z19 = !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) gm0.j1.u().c().l(286721, null));
        if (!z17 || !z18 || !z19) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160605d).m("settings_linkedin", true);
            return;
        }
        com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) this.f160605d).h("settings_linkedin");
        if ((c01.z1.p() & 4194304) == 0) {
            h18.H(getString(com.tencent.mm.R.string.iru));
        } else {
            h18.H(getString(com.tencent.mm.R.string.irv));
        }
    }
}
