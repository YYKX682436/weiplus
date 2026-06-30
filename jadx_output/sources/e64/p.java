package e64;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f249838a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f249839b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f249840c = jz5.h.b(e64.o.f249837d);

    public static final java.util.List a(android.app.Activity activity, java.lang.String mbCompId) {
        h64.a a17;
        java.util.Collection values;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        java.util.List list = null;
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("SnsAdMB", "getJsCompInfoInAdLandingMbComp: the activity is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            return null;
        }
        if (mbCompId == null || r26.n0.N(mbCompId)) {
            com.tencent.mars.xlog.Log.w("SnsAdMB", "getJsCompInfoInAdLandingMbComp: the magic component id is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            return null;
        }
        e64.e eVar = (e64.e) ((java.util.LinkedHashMap) f249838a).get(java.lang.Integer.valueOf(activity.hashCode()));
        if (eVar == null || (a17 = eVar.a()) == null) {
            com.tencent.mars.xlog.Log.e("SnsAdMB", "the ad landing page helper is null, can't obtain the js component inf ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJsComponentInformation", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        kotlin.jvm.internal.o.g(mbCompId, "mbCompId");
        java.util.Map map = (java.util.Map) ((java.util.LinkedHashMap) a17.f279310c).get(mbCompId);
        if (map == null || (values = map.values()) == null) {
            com.tencent.mars.xlog.Log.w("LandingPageMagic", "there is no js component in magic brush component: [" + mbCompId + ']');
        } else {
            list = kz5.n0.S0(values);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJsComponentInformation", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        return list;
    }
}
