package m54;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.g0 f324268a = new m54.g0();

    public final void a(java.lang.String eventName, org.json.JSONObject jSONObject) {
        java.lang.Object m521constructorimpl;
        q80.g0 g0Var;
        java.lang.Long l17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishVangoghPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
        kotlin.jvm.internal.o.g(eventName, "eventName");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (g0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishVangoghPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
            return;
        }
        java.util.Iterator it = ((com.tencent.mm.feature.lite.i) g0Var).tj("wxalite0c45e912005759856ea55eb382e8c509").iterator();
        while (true) {
            if (!it.hasNext()) {
                l17 = null;
                break;
            } else {
                l17 = (java.lang.Long) it.next();
                if (l17 != null) {
                    break;
                }
            }
        }
        if (l17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishVangoghPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
            return;
        }
        long longValue = l17.longValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEvent", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppEventSender");
        try {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(longValue, eventName, jSONObject);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEvent", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppEventSender");
        com.tencent.mars.xlog.Log.i("SnsAd.VangoghPageEventPublisher", "the event name is " + eventName + ", params is " + jSONObject);
        m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishVangoghPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
    }
}
