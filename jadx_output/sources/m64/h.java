package m64;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final m64.h f324399a = new m64.h();

    /* renamed from: b, reason: collision with root package name */
    public static final n64.a f324400b;

    static {
        n64.a aVar = new n64.a();
        aVar.e(m64.g.f324398d);
        f324400b = aVar;
    }

    public final boolean a(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContextDestroyed", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        if (!ca4.n0.c(context)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContextDestroyed", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
            return false;
        }
        com.tencent.mars.xlog.Log.w("TimelineAdExposurePreloader", "activity maybe destroyed");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContextDestroyed", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        return true;
    }
}
