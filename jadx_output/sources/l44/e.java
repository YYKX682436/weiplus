package l44;

/* loaded from: classes4.dex */
public abstract class e {
    public static final org.json.JSONObject a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaCapabilityJson", "com.tencent.mm.plugin.sns.ad.helper.AdCapabilityHelper");
        boolean Di = d11.s.Di(6);
        boolean g17 = m11.n1.g();
        boolean m17 = m44.a.m();
        boolean l17 = m44.a.l();
        boolean k17 = m44.a.k();
        int i17 = (!m44.a.o() || k17) ? 0 : 1;
        com.tencent.mars.xlog.Log.i("AdCapabilityHelper", "sdkInt=" + android.os.Build.VERSION.SDK_INT + ", isExptDeviceDisable=" + k17 + ", isExptEnableAvif=" + m17 + ", isExptEnableAdLandingPageAvif=" + l17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("supportH265", Di ? 1 : 0);
        jSONObject.put("supportWebP", g17 ? 1 : 0);
        jSONObject.put("supportAVIF", i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaCapabilityJson", "com.tencent.mm.plugin.sns.ad.helper.AdCapabilityHelper");
        return jSONObject;
    }

    public static final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaCapabilityString", "com.tencent.mm.plugin.sns.ad.helper.AdCapabilityHelper");
        java.lang.String jSONObject = a().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaCapabilityString", "com.tencent.mm.plugin.sns.ad.helper.AdCapabilityHelper");
        return jSONObject;
    }
}
