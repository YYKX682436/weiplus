package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class SettingsModifyUserAuthUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.h0 f160559d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f160560e;

    /* renamed from: f, reason: collision with root package name */
    public int f160561f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160562g;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160559d = (com.tencent.mm.ui.base.preference.h0) getPreferenceScreen();
        java.util.ArrayList<com.tencent.mm.plugin.setting.model.UserAuthItemParcelable> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("app_auth_items");
        this.f160560e = getIntent().getStringExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
        this.f160561f = getIntent().getIntExtra("modify_scene", 1);
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            for (com.tencent.mm.plugin.setting.model.UserAuthItemParcelable userAuthItemParcelable : parcelableArrayListExtra) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = new com.tencent.mm.ui.base.preference.CheckBoxPreference(this);
                checkBoxPreference.L(userAuthItemParcelable.f160055e);
                if (userAuthItemParcelable.f160054d.equals("snsapi_friend")) {
                    checkBoxPreference.G(com.tencent.mm.R.string.ipc);
                }
                checkBoxPreference.C(userAuthItemParcelable.f160054d);
                checkBoxPreference.L = userAuthItemParcelable.f160056f == 1;
                checkBoxPreference.f197785v = false;
                this.f160559d.d(checkBoxPreference, -1);
            }
        }
        setMMTitle(getIntent().getStringExtra("app_name"));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.si(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(1144, this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        k14.d0 d0Var = new k14.d0(this.f160560e, preference.f197780q, ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N() ? 1 : 2, this.f160561f);
        gm0.j1.d().g(d0Var);
        this.f160562g = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.f490552yb), false, true, new com.tencent.mm.plugin.setting.ui.setting.ti(this, d0Var));
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(1144, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyUserAuthUI", "errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f160562g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.T(this, str);
            return;
        }
        k14.d0 d0Var = (k14.d0) m1Var;
        java.lang.String str2 = d0Var.f303319f;
        int i19 = d0Var.f303320g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) this.f160559d.h(str2)).O(i19 == 1);
    }
}
