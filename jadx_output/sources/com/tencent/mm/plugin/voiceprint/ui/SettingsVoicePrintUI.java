package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes8.dex */
public class SettingsVoicePrintUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f176187i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f176188d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.voiceprint.ui.VoiceHeaderPreference f176190f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f176191g;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f176189e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f176192h = false;

    public final void V6() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11390, 3);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.class);
        intent.putExtra("kscene_type", 71);
        intent.putExtra("createVoicePrint", true);
        startActivityForResult(intent, 1);
        this.f176192h = false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494954cl;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(c01.d9.b().p().l(40, 0), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceSettingsUI", "plugSwitch " + o17 + " " + (o17 & 131072));
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f176188d = preferenceScreen;
        this.f176190f = (com.tencent.mm.plugin.voiceprint.ui.VoiceHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("settings_voiceprint_header");
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f176188d).h("settings_voiceprint_title")).S(true);
        ((com.tencent.mm.ui.base.preference.h0) this.f176188d).notifyDataSetChanged();
        android.app.ProgressDialog progressDialog = this.f176189e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f176189e.dismiss();
        }
        this.f176189e = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.voiceprint.ui.j(this));
        c01.d9.e().g(new fq4.p(0));
        ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_title", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_unlock", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_reset", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_create", true);
        setBackBtn(new com.tencent.mm.plugin.voiceprint.ui.k(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != 1 || intent == null) {
            return;
        }
        this.f176192h = intent.getBooleanExtra("KIsCreateSuccess", false);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.j0s);
        c01.d9.e().a(615, this);
        this.f176191g = findViewById(com.tencent.mm.R.id.jlv);
        initView();
        this.f176191g.setBackgroundResource(com.tencent.mm.R.color.aaw);
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_MORE_TAB_DOT_SHOW_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p17.x(u3Var, bool);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERFINO_VOICEPRINT_SETTING_DOT_SHOW_BOOLEAN, bool);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, bool);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_NEW_SHOW_BOOLEAN, bool);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceSettingsUI", "unset all voiceprint config");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(615, this);
        android.app.ProgressDialog progressDialog = this.f176189e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        android.content.Intent intent = new android.content.Intent();
        if (str.equals("settings_voiceprint_title")) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_voiceprint_title");
            checkBoxPreference.N();
            android.app.ProgressDialog progressDialog = this.f176189e;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f176189e.dismiss();
            }
            this.f176189e = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.voiceprint.ui.l(this));
            if (checkBoxPreference.N()) {
                c01.d9.e().g(new fq4.p(1));
            } else {
                c01.d9.e().g(new fq4.p(2));
            }
            return true;
        }
        if (!str.equals("settings_voiceprint_unlock")) {
            if (!str.equals("settings_voiceprint_reset")) {
                return false;
            }
            intent.setClass(this, com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.class);
            intent.putExtra("KvoicePrintReset", true);
            intent.putExtra("kscene_type", 73);
            startActivityForResult(intent, 1);
            return true;
        }
        intent.setClass(this, com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI.class);
        intent.putExtra("kscene_type", 73);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/SettingsVoicePrintUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/voiceprint/ui/SettingsVoicePrintUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceSettingsUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceSettingsUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 80) {
            return;
        }
        if (iArr[0] == 0) {
            V6();
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.voiceprint.ui.n(this), new com.tencent.mm.plugin.voiceprint.ui.o(this));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f176192h) {
            this.f176192h = false;
            android.app.ProgressDialog progressDialog = this.f176189e;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f176189e.dismiss();
            }
            this.f176189e = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.voiceprint.ui.i(this));
            c01.d9.e().g(new fq4.p(1));
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        m1Var.getType();
        if (i17 != 0 && i18 != 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_unlock", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_reset", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_create", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_title", false);
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f176188d).h("settings_voiceprint_title")).S(false);
            this.f176190f.N(getString(com.tencent.mm.R.string.k_e), "");
            ((com.tencent.mm.ui.base.preference.h0) this.f176188d).notifyDataSetChanged();
            android.app.ProgressDialog progressDialog = this.f176189e;
            if (progressDialog != null) {
                progressDialog.dismiss();
                return;
            }
            return;
        }
        if (m1Var.getType() == 615) {
            fq4.p pVar = (fq4.p) m1Var;
            int o17 = c01.z1.o();
            if (pVar.f265632f == 1) {
                int i27 = o17 | 65536;
                ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_unlock", false);
                ((com.tencent.mm.ui.base.preference.h0) this.f176188d).notifyDataSetChanged();
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f176188d).h("settings_voiceprint_title");
                if (pVar.f265633g > 0) {
                    checkBoxPreference.S(true);
                    ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_reset", false);
                    ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_unlock", false);
                    i19 = i27 | 131072;
                    this.f176190f.N(getString(com.tencent.mm.R.string.k_g), "");
                } else {
                    checkBoxPreference.S(false);
                    ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_reset", true);
                    ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_unlock", true);
                    i19 = i27 & (-131073);
                    this.f176190f.N(getString(com.tencent.mm.R.string.k_e), "");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceSettingsUI", "scene end plugSwitch %d", java.lang.Integer.valueOf(i19));
                ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_create", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_title", false);
                this.f176190f.M(null);
                ((com.tencent.mm.ui.base.preference.h0) this.f176188d).notifyDataSetChanged();
            } else {
                i19 = o17 & (-65537);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11390, 2);
                ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_unlock", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_reset", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_create", true);
                ((com.tencent.mm.ui.base.preference.h0) this.f176188d).m("settings_voiceprint_title", true);
                this.f176190f.N(getString(com.tencent.mm.R.string.k_i), getString(com.tencent.mm.R.string.k_h));
                this.f176190f.M(new com.tencent.mm.plugin.voiceprint.ui.m(this));
                ((com.tencent.mm.ui.base.preference.h0) this.f176188d).notifyDataSetChanged();
            }
            c01.b9.f37069c.d("last_login_use_voice", i19 + "");
            c01.d9.b().p().w(40, java.lang.Integer.valueOf(i19));
        }
        android.app.ProgressDialog progressDialog2 = this.f176189e;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
    }
}
