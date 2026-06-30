package p34;

@j95.b
/* loaded from: classes.dex */
public final class a extends i95.w {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccountInitialized", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("AdWrapperFeatureService", "onAccountInitialized, hash is " + hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccountInitialized", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccountReleased", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("AdWrapperFeatureService", "onAccountReleased, hash is " + hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccountReleased", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        p94.g0 g0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        try {
            boolean z17 = true;
            if (ca4.m0.u0(e42.c0.clicfg_sns_ad_service_created_when_wx_start, 1) != 1) {
                z17 = false;
            }
            com.tencent.mars.xlog.Log.i("AdWrapperFeatureService", "onCreate, hash is " + hashCode() + ", snsAdServiceCreatedNow is " + z17);
            if (z17 && (g0Var = (p94.g0) i95.n0.c(p94.g0.class)) != null) {
                com.tencent.mars.xlog.Log.i("AdWrapperFeatureService", "init snsAdService in adWrapperFeatureService, hash is " + g0Var.hashCode());
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdWrapperFeatureService", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
    }
}
