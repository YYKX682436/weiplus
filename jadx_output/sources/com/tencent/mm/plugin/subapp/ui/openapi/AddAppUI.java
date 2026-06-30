package com.tencent.mm.plugin.subapp.ui.openapi;

/* loaded from: classes8.dex */
public class AddAppUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f172400d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.subapp.ui.openapi.AppPreference f172401e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.subapp.ui.openapi.AppPreference f172402f;

    public static void V6(com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI addAppUI, java.lang.String str) {
        addAppUI.getClass();
        android.content.Intent intent = new android.content.Intent(addAppUI, (java.lang.Class<?>) com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI.class);
        intent.putExtra("AppProfileUI_AppId", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(addAppUI, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI", "gotoProfile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        addAppUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(addAppUI, "com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI", "gotoProfile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494830c;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f489846de);
        setBackBtn(new fg4.a(this));
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f172400d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f172400d).g(com.tencent.mm.R.xml.f494830c);
        com.tencent.mm.plugin.subapp.ui.openapi.AppPreference appPreference = (com.tencent.mm.plugin.subapp.ui.openapi.AppPreference) ((com.tencent.mm.ui.base.preference.h0) this.f172400d).h("addapp_added");
        this.f172401e = appPreference;
        appPreference.Q = 1;
        appPreference.N = new fg4.b(this);
        appPreference.P = new fg4.c(this);
        com.tencent.mm.plugin.subapp.ui.openapi.AppPreference appPreference2 = (com.tencent.mm.plugin.subapp.ui.openapi.AppPreference) ((com.tencent.mm.ui.base.preference.h0) this.f172400d).h("addapp_available");
        this.f172402f = appPreference2;
        appPreference2.Q = 0;
        appPreference2.N = new fg4.d(this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.subapp.ui.openapi.AppPreference appPreference = this.f172401e;
        if (appPreference != null && appPreference.M != null) {
            com.tencent.mm.pluginsdk.model.app.u5.Di().remove(appPreference.M);
        }
        com.tencent.mm.plugin.subapp.ui.openapi.AppPreference appPreference2 = this.f172402f;
        if (appPreference2 == null || appPreference2.M == null) {
            return;
        }
        com.tencent.mm.pluginsdk.model.app.u5.Di().remove(appPreference2.M);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (!preference.f197780q.equals("addapp_recommend")) {
            return false;
        }
        java.lang.String string = getString(com.tencent.mm.R.string.f489851dj, java.lang.Integer.valueOf(o45.wf.f343029g), com.tencent.mm.sdk.platformtools.m2.o(getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), getContext()), com.tencent.mm.sdk.platformtools.m2.e());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initView();
        com.tencent.mm.plugin.subapp.ui.openapi.AppPreference appPreference = this.f172401e;
        if (appPreference != null && appPreference.M != null) {
            com.tencent.mm.pluginsdk.model.app.u5.Di().add(appPreference.M);
        }
        com.tencent.mm.plugin.subapp.ui.openapi.AppPreference appPreference2 = this.f172402f;
        if (appPreference2 == null || appPreference2.M == null) {
            return;
        }
        com.tencent.mm.pluginsdk.model.app.u5.Di().add(appPreference2.M);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AddAppUI", "onSceneEnd, errType = " + i17 + ", errCode = " + i18);
    }
}
