package x44;

/* loaded from: classes4.dex */
public final class g0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.HalfScreenExpandToTop");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        if (env.a() instanceof com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI) {
            ym5.a1.f(new x44.f0(env, this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.HalfScreenExpandToTop");
        } else {
            ca4.q.c("SnsAdJs.HalfScreenExpandToTop failed, activity is not HalfScreenVangoghPageUI", new java.lang.Throwable());
            b(g("SnsAdJs.HalfScreenExpandToTop failed, activity is not HalfScreenVangoghPageUI"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.HalfScreenExpandToTop");
        }
    }
}
