package p34;

@j95.b
/* loaded from: classes4.dex */
public class t extends i95.w implements p94.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final q80.b0 f351695d = new p34.s(this);

    public void Ai(long j17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadAdCanvas", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        try {
            com.tencent.mars.xlog.Log.i("SnsAdService", "preloadAdCanvas, canvasId=" + j17 + ", preloadInnerRes=" + z17 + ", preloadProcess=" + z18 + ", procName=" + bm5.f1.a() + ", uxInfo=" + str + ", dynamicInfo=" + str2);
            java.lang.String str3 = "";
            if (!android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
                java.lang.String B = ca4.m0.B(str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
                str3 = B;
            }
            java.lang.String a17 = n74.d2.a(str3, 0);
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                za4.o0.c(j17, z17, a17, str2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            } else {
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doPreloadAdCanvas(j17, a17, str2, z17);
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1676, 21);
            if (z18) {
                ca4.m0.A0();
                g0Var.A(1676, 22);
            }
            if (z17) {
                g0Var.A(1676, 23);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdService", "preloadAdCanvas, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadAdCanvas", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccountInitialized", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("SnsAdService", "onAccountInitialized, hash=" + hashCode());
        try {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            q80.b0 b0Var = this.f351695d;
            ((com.tencent.mm.feature.lite.i) g0Var).getClass();
            com.tencent.mm.plugin.lite.logic.m0.f144012b.add(new java.lang.ref.WeakReference(b0Var));
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_onAccountInitialized", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccountInitialized", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccountReleased", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("SnsAdService", "onAccountReleased, hash=" + hashCode());
        try {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            q80.b0 b0Var = this.f351695d;
            ((com.tencent.mm.feature.lite.i) g0Var).getClass();
            java.util.Iterator it = com.tencent.mm.plugin.lite.logic.m0.f144012b.iterator();
            while (it.hasNext()) {
                q80.b0 b0Var2 = (q80.b0) ((java.lang.ref.WeakReference) it.next()).get();
                if (b0Var2 == null || b0Var2 == b0Var) {
                    it.remove();
                }
            }
            r34.e.f368998a.e();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_onAccountReleased", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccountReleased", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("SnsAdService", "onCreate, hash=" + hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }

    public void wi(android.content.Context context, long j17, java.lang.String str, p94.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        com.tencent.mars.xlog.Log.i("SnsAdService", "openAdCanvasById, canvasId=" + j17 + ", uxInfo=" + str + ", context=" + context + ", bundle=" + v0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        java.lang.String B = ca4.m0.B(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        ca4.m0.n0(context, j17, B, v0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }
}
