package com.tencent.mm.plugin.subapp.ui.openapi;

/* loaded from: classes8.dex */
public class ServiceAppUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f172407d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference f172408e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference f172409f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.PreferenceTitleCategory f172410g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.PreferenceTitleCategory f172411h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f172412i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f172413m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f172414n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f172415o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f172416p;

    public static void V6(com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI serviceAppUI, com.tencent.mm.pluginsdk.model.app.m mVar) {
        int i17;
        serviceAppUI.getClass();
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ServiceAppUI", "app is null");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10923, 13, mVar.field_appId, 1, serviceAppUI.f172416p);
        if (mVar.f238391x1 != 2 || com.tencent.mm.sdk.platformtools.t8.K0(mVar.f238381p1)) {
            int i18 = mVar.f238391x1;
            if (i18 == 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("service_app_package_name", mVar.field_packageName);
                intent.putExtra("service_app_openid", mVar.field_openId);
                intent.putExtra("service_app_appid", mVar.field_appId);
                serviceAppUI.setResult(-1, intent);
                serviceAppUI.finish();
                return;
            }
            if (i18 == 1) {
                com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
                androidx.appcompat.app.AppCompatActivity context = serviceAppUI.getContext();
                java.lang.String str = mVar.f238381p1;
                y7Var.getClass();
                ((com.tencent.mm.app.plugin.j) o25.z1.a()).c(context, str, true, null);
                serviceAppUI.finish();
                return;
            }
            return;
        }
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(serviceAppUI.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), serviceAppUI.getContext());
        if ("language_default".equalsIgnoreCase(o17) && java.util.Locale.getDefault() != null) {
            o17 = java.util.Locale.getDefault().toString();
        }
        if (com.tencent.mm.storage.z3.R4(serviceAppUI.f172416p)) {
            com.tencent.mm.storage.a3 z07 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(serviceAppUI.f172416p);
            if (z07 != null) {
                i17 = z07.A0().size();
                android.content.Intent intent2 = new android.content.Intent();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("jsapi_args_appid", mVar.field_appId);
                bundle.putBoolean("isFromService", true);
                bundle.putString("sendAppMsgToUserName", serviceAppUI.f172416p);
                intent2.putExtra("jsapiargs", bundle);
                intent2.putExtra("forceHideShare", true);
                intent2.putExtra("show_bottom", false);
                intent2.putExtra("rawUrl", java.lang.String.format("%s&wxchatmembers=%s&lang=%s", mVar.f238381p1, java.lang.Integer.valueOf(i17), o17));
                j45.l.j(serviceAppUI.getContext(), "webview", ".ui.tools.WebViewUI", intent2, null);
                serviceAppUI.finish();
            }
        }
        i17 = 1;
        android.content.Intent intent22 = new android.content.Intent();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("jsapi_args_appid", mVar.field_appId);
        bundle2.putBoolean("isFromService", true);
        bundle2.putString("sendAppMsgToUserName", serviceAppUI.f172416p);
        intent22.putExtra("jsapiargs", bundle2);
        intent22.putExtra("forceHideShare", true);
        intent22.putExtra("show_bottom", false);
        intent22.putExtra("rawUrl", java.lang.String.format("%s&wxchatmembers=%s&lang=%s", mVar.f238381p1, java.lang.Integer.valueOf(i17), o17));
        j45.l.j(serviceAppUI.getContext(), "webview", ".ui.tools.WebViewUI", intent22, null);
        serviceAppUI.finish();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494924bq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        if (r4.moveToNext() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r8 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r3.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005f, code lost:
    
        if (r4.moveToFirst() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0061, code lost:
    
        r7 = new com.tencent.mm.pluginsdk.model.app.m();
        r7.convertFrom(r4);
        r8 = r7.field_serviceAppType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006b, code lost:
    
        if (r8 != 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        r1.add(r7);
     */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI.initView():void");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference servicePreference = this.f172408e;
        if (servicePreference != null && servicePreference.M != null) {
            com.tencent.mm.pluginsdk.model.app.u5.Di().remove(servicePreference.M);
        }
        com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference servicePreference2 = this.f172409f;
        if (servicePreference2 == null || servicePreference2.M == null) {
            return;
        }
        com.tencent.mm.pluginsdk.model.app.u5.Di().remove(servicePreference2.M);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initView();
        com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference servicePreference = this.f172408e;
        if (servicePreference != null && servicePreference.M != null) {
            com.tencent.mm.pluginsdk.model.app.u5.Di().add(servicePreference.M);
        }
        com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference servicePreference2 = this.f172409f;
        if (servicePreference2 == null || servicePreference2.M == null) {
            return;
        }
        com.tencent.mm.pluginsdk.model.app.u5.Di().add(servicePreference2.M);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ServiceAppUI", "onSceneEnd, errType = " + i17 + ", errCode = " + i18);
    }
}
