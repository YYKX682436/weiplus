package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI;", "Lcom/tencent/mm/plugin/setting/ui/setting/report/MMReportPreference;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SettingsPermissionIndexUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160595g = "";

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f160596h = jz5.h.b(com.tencent.mm.plugin.setting.ui.setting.dk.f160952d);

    public static final void X6(com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI settingsPermissionIndexUI, java.lang.String str) {
        settingsPermissionIndexUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(settingsPermissionIndexUI.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 2;
    }

    public final void Y6(android.widget.TextView textView, yz5.l lVar) {
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        spannableString.setSpan(new com.tencent.mm.plugin.setting.ui.setting.ck(lVar), 0, spannableString.length(), 17);
        textView.setText(spannableString);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.pluginsdk.ui.span.c0.g(textView, spannableString);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public android.view.View getBottomView() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.clw, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        h0Var.f310123d = obj;
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            h0Var.f310123d = com.tencent.mm.sdk.platformtools.m2.e();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) h0Var.f310123d) && !com.tencent.mm.sdk.platformtools.t8.x0((java.lang.String) h0Var.f310123d)) {
            h0Var.f310123d = "";
        }
        if (r26.i0.p((java.lang.String) h0Var.f310123d, "cn", true)) {
            android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f486875mq5);
            kotlin.jvm.internal.o.d(textView);
            Y6(textView, new com.tencent.mm.plugin.setting.ui.setting.zj(this, h0Var));
            textView.setVisibility(0);
        }
        android.view.View findViewById = linearLayout.findViewById(com.tencent.mm.R.id.f486874mq4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        Y6((android.widget.TextView) findViewById, new com.tencent.mm.plugin.setting.ui.setting.ak(this, h0Var));
        return linearLayout;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494931bz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r26.n0.B(r7, r0, false) != false) goto L9;
     */
    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        kotlin.jvm.internal.o.d(preference);
        java.lang.String str = preference.f197780q;
        if (str != null) {
            switch (str.hashCode()) {
                case -2127957195:
                    if (str.equals("setting_privacy_personal_ad_mgr")) {
                        java.lang.String str2 = this.f160595g;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            str2 = com.tencent.mm.ui.tools.qd.a(str2, "lang=" + com.tencent.mm.sdk.platformtools.m2.f(this));
                            kotlin.jvm.internal.o.f(str2, "safelyUrlConcatParam(...)");
                        }
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("showShare", false);
                        intent.putExtra("rawUrl", str2);
                        intent.putExtra("show_feedback", false);
                        intent.putExtra("show_bottom", false);
                        intent.putExtra("needRedirect", false);
                        intent.putExtra("neverGetA8Key", false);
                        j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
                        com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct();
                        userPrivacySettingClientReportStruct.f61522d = 54L;
                        userPrivacySettingClientReportStruct.k();
                        return true;
                    }
                    break;
                case -1179310352:
                    if (str.equals("setting_wechat_personal_info_export")) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("showShare", false);
                        intent2.putExtra("rawUrl", (java.lang.String) ((jz5.n) this.f160596h).getValue());
                        intent2.putExtra("show_feedback", false);
                        intent2.putExtra("show_bottom", false);
                        intent2.putExtra("needRedirect", false);
                        intent2.putExtra("neverGetA8Key", false);
                        j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent2, null);
                        com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct();
                        userPrivacySettingClientReportStruct2.f61522d = 51L;
                        userPrivacySettingClientReportStruct2.k();
                        return true;
                    }
                    break;
                case 264218592:
                    if (str.equals("settings_privacy_app_permission")) {
                        android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI.class);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent3);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct();
                        userPrivacySettingClientReportStruct3.f61522d = 53L;
                        userPrivacySettingClientReportStruct3.k();
                        return true;
                    }
                    break;
                case 765127884:
                    if (str.equals("setting_privacy_personal_info_export")) {
                        android.content.Intent intent4 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI.class);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent4);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct4 = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct();
                        userPrivacySettingClientReportStruct4.f61522d = 51L;
                        userPrivacySettingClientReportStruct4.k();
                        return true;
                    }
                    break;
                case 1795686324:
                    if (str.equals("settings_privacy_sys_permission")) {
                        android.content.Intent intent5 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI.class);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent5);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPermissionIndexUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct5 = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct();
                        userPrivacySettingClientReportStruct5.f61522d = 52L;
                        userPrivacySettingClientReportStruct5.k();
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
