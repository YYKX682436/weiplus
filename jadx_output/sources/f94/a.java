package f94;

/* loaded from: classes4.dex */
public final class a extends com.tencent.mm.plugin.sns.ui.wsfold.a {

    /* renamed from: e, reason: collision with root package name */
    public static java.util.concurrent.ConcurrentHashMap f260531e;

    /* renamed from: d, reason: collision with root package name */
    public final k94.j f260532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f260532d = new k94.j(getContext());
    }

    @Override // com.tencent.mm.plugin.sns.ui.wsfold.a
    public void O6(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 struct, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(struct, "struct");
        if (i17 == 0) {
            this.f260532d.c(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        f260531e = new java.util.concurrent.ConcurrentHashMap();
        this.f260532d.a(k94.c.f305940a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        k94.j jVar = this.f260532d;
        jVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        java.util.HashMap hashMap = jVar.f305961a;
        java.util.Collection<k94.h> values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (k94.h hVar : values) {
            kotlin.jvm.internal.o.d(hVar);
            k94.j.f(jVar, hVar, k94.i.f305959h, 0.0d, 4, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            hVar.f305952e.clear();
            hVar.f305953f.clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        }
        hashMap.clear();
        ((java.util.ArrayList) jVar.f305962b).clear();
        com.tencent.mars.xlog.Log.i("WsFoldAdViewVisibilityManager", "cleared");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        k94.c cVar = k94.c.f305940a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        k94.c.f305941b.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        k94.f fVar = k94.f.f305946a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        k94.f.f305947b.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        f260531e = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        super.onPause();
        k94.c cVar = k94.c.f305940a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        for (java.util.Map.Entry entry : k94.c.f305941b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            k94.b bVar = (k94.b) entry.getValue();
            if (bVar.a()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                bVar.f305938c += java.lang.System.currentTimeMillis() - bVar.f305937b;
                bVar.f305937b = 0L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", "onPause: viewId=" + str);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        k94.c cVar = k94.c.f305940a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", "onResume");
        for (java.util.Map.Entry entry : k94.c.f305941b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            k94.b bVar = (k94.b) entry.getValue();
            if (bVar.a()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                bVar.f305937b = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume: viewId=");
                sb6.append(str);
                sb6.append(", duration =");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                long j17 = bVar.f305938c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                sb6.append(j17);
                sb6.append("ms");
                com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", sb6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.wsfold.a
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f260532d.c(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }
}
