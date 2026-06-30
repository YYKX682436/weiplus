package x44;

/* loaded from: classes4.dex */
public final class h1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenProfileUI");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(dm.i4.COL_USERNAME);
        boolean optBoolean = data.optBoolean("openVideoTab");
        if (optString == null || optString.length() == 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.ProfileUI", "the username is invalid");
            b(g("the username is invalid"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenProfileUI");
            return;
        }
        int l17 = env.b().l();
        android.app.Activity a17 = env.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.ProfileUI", "the activity is null");
            b(g("the activity is null"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenProfileUI");
            return;
        }
        com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick();
        snsAdClick.f71469g = 101;
        int i17 = l17 == 0 ? 6 : 1;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", optString);
        intent.putExtra("KSnsAdTag", snsAdClick);
        intent.putExtra("Contact_Scene", 181);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", i17);
        if (optBoolean) {
            intent.putExtra("biz_profile_tab_type", 1);
        }
        j45.l.j(a17, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        a17.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        b(l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenProfileUI");
    }
}
