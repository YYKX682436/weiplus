package com.tencent.mm.plugin.subapp.ui.openapi;

/* loaded from: classes8.dex */
public class AppProfileUI extends com.tencent.mm.ui.base.preference.MMPreference implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.m f172403d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f172404e;

    /* renamed from: f, reason: collision with root package name */
    public fg4.f f172405f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f172406g = null;

    public final void V6(com.tencent.mm.pluginsdk.model.app.m mVar, boolean z17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(mVar.field_appId);
        sb6.append(",");
        sb6.append(z17 ? "1" : "2");
        linkedList.add(new e21.p(10165, sb6.toString()));
        ((e21.z0) c01.d9.b().w()).c(new e21.q(linkedList));
    }

    public final void W6() {
        ((com.tencent.mm.ui.base.preference.h0) this.f172404e).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f172404e).g(com.tencent.mm.R.xml.f494834g);
        if (this.f172403d.field_status == 1) {
            ((com.tencent.mm.ui.base.preference.h0) this.f172404e).w("app_profile_add");
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f172404e).w("app_profile_remove");
        }
        com.tencent.mm.plugin.subapp.ui.openapi.AppHeaderPreference appHeaderPreference = (com.tencent.mm.plugin.subapp.ui.openapi.AppHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f172404e).h("app_profile_header");
        fg4.f fVar = this.f172405f;
        boolean z17 = this.f172403d.field_status == 1;
        appHeaderPreference.getClass();
        iz5.a.g(null, fVar != null);
        appHeaderPreference.Q = fVar;
        appHeaderPreference.R = z17;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494834g;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f172405f = new fg4.i(this);
        java.lang.String stringExtra = getIntent().getStringExtra("AppProfileUI_AppId");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(stringExtra);
        this.f172403d = h17;
        iz5.a.g("initView : appInfo does not exist", h17 != null);
        setMMTitle(com.tencent.mm.R.string.f490529xp);
        this.f172404e = getPreferenceScreen();
        setBackBtn(new fg4.j(this));
        W6();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (str.equals(this.f172403d.field_appId)) {
            initView();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.pluginsdk.model.app.u5.Di().remove(this);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppProfileUI", str + " item has been clicked!");
        if (str.equals("app_profile_add")) {
            com.tencent.mm.pluginsdk.model.app.m mVar = this.f172403d;
            mVar.field_status = 1;
            mVar.field_modifyTime = java.lang.System.currentTimeMillis();
            com.tencent.mm.pluginsdk.model.app.u5.Di().update(this.f172403d, new java.lang.String[0]);
            W6();
            V6(this.f172403d, true);
            fg4.k kVar = new fg4.k(this);
            this.f172406g = kVar;
            kVar.sendEmptyMessageDelayed(0, 30L);
            return true;
        }
        if (!str.equals("app_profile_remove")) {
            return false;
        }
        com.tencent.mm.pluginsdk.model.app.m mVar2 = this.f172403d;
        mVar2.field_status = 0;
        mVar2.field_modifyTime = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.model.app.u5.Di().update(this.f172403d, new java.lang.String[0]);
        W6();
        V6(this.f172403d, false);
        fg4.k kVar2 = new fg4.k(this);
        this.f172406g = kVar2;
        kVar2.sendEmptyMessageDelayed(0, 30L);
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.pluginsdk.model.app.u5.Di().add(this);
    }
}
