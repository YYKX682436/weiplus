package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsAdLBSAuthManagerUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsAdLBSAuthManagerUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: e, reason: collision with root package name */
    public int f166675e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f166674d = "SnsAdLBSAuthManagerUI";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f166676f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f166677g = "";

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        return com.tencent.mm.R.xml.f494958co;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.j7o);
        setBackBtn(new com.tencent.mm.plugin.sns.ui.sa(this));
        this.f166675e = getIntent().getIntExtra("sns_landig_pages_from_source", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("sns_landing_pages_rawSnsId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f166676f = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("sns_landing_pages_ux_info");
        this.f166677g = stringExtra2 != null ? stringExtra2 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsid", this.f166676f);
        jSONObject.put("uxinfo", this.f166677g);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f166675e);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("action", "exposed");
        jSONObject.put("extInfo", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("location_ad_auth_ui_report", jSONObject3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        java.lang.String str = preference != null ? preference.f197780q : null;
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return false;
        }
        if (rVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f166674d, "onPreferenceTreeClick() called with: screen = " + rVar + ", pref = " + preference);
        if (kotlin.jvm.internal.o.b(str, "sns_ad_can_request_lbs")) {
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) rVar).h("sns_ad_can_request_lbs");
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
            boolean N = checkBoxPreference != null ? checkBoxPreference.N() : false;
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("sns_ad_landing_page_key");
            if (M == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
                return false;
            }
            M.putBoolean("canRequestLBS", N);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", this.f166676f);
            jSONObject.put("uxinfo", this.f166677g);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f166675e);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("action", N ? "click_to_enable" : "click_to_disable");
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "lbs_auth");
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            ca4.m0.a("location_ad_auth_ui_report", jSONObject3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return true;
        }
        if (!str.equals("sns_ad_can_auto_fill_data")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return false;
        }
        com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) rVar).h("sns_ad_can_auto_fill_data");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = h18 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h18 : null;
        boolean N2 = checkBoxPreference2 != null ? checkBoxPreference2.N() : false;
        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("sns_ad_landing_page_key");
        if (M2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return false;
        }
        M2.putBoolean("canAutoFillData", N2);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        jSONObject4.put("snsid", this.f166676f);
        jSONObject4.put("uxinfo", this.f166677g);
        jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f166675e);
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        jSONObject5.put("action", N2 ? "click_to_enable" : "click_to_disable");
        jSONObject5.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "auto_fill");
        jSONObject4.put("extInfo", jSONObject5);
        java.lang.String jSONObject6 = jSONObject4.toString();
        kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
        ca4.m0.a("location_ad_auth_ui_report", jSONObject6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        super.onResume();
        java.lang.String str = this.f166674d;
        com.tencent.mars.xlog.Log.i(str, "onResume() called");
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("sns_ad_landing_page_key");
        if (M == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return;
        }
        boolean z17 = M.getBoolean("canRequestLBS", false);
        boolean z18 = M.getBoolean("canAutoFillData", false);
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        com.tencent.mm.ui.base.preference.Preference h17 = preferenceScreen != null ? ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("sns_ad_can_request_lbs") : null;
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
        if (checkBoxPreference != null) {
            checkBoxPreference.O(z17);
        }
        java.lang.Object h18 = preferenceScreen != null ? ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("sns_ad_can_auto_fill_data") : null;
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = h18 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h18 : null;
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.O(z18);
        }
        com.tencent.mars.xlog.Log.i(str, "init data canAutoFillData= " + z18 + " canRequestLBS= " + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
    }
}
