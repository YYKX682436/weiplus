package x44;

/* loaded from: classes4.dex */
public final class r0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        if (env.a() instanceof com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI) {
            ym5.a1.f(new x44.q0(env, this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment");
        } else {
            ca4.q.c("SnsAdJs.NotifyTimelineComment failed, activity is not HalfScreenVangoghPageUI", new java.lang.Throwable());
            b(g("SnsAdJs.NotifyTimelineComment failed, activity is not HalfScreenVangoghPageUI"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.NotifyTimelineComment");
        }
    }
}
