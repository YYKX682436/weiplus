package k94;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f305961a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f305962b;

    /* renamed from: c, reason: collision with root package name */
    public long f305963c;

    public j(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f305961a = new java.util.HashMap();
        this.f305962b = new java.util.ArrayList();
    }

    public static /* synthetic */ void f(k94.j jVar, k94.h hVar, k94.i iVar, double d17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyListeners$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        if ((i17 & 4) != 0) {
            d17 = 0.0d;
        }
        jVar.e(hVar, iVar, d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyListeners$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
    }

    public final void a(k94.g listener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addListener", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.List list = this.f305962b;
        if (!((java.util.ArrayList) list).contains(listener)) {
            ((java.util.ArrayList) list).add(listener);
            com.tencent.mars.xlog.Log.i("WsFoldAdViewVisibilityManager", "add viewVisibilityListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addListener", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
    }

    public final double b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateExposureRatio", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        if (view.getVisibility() != 0 || view.getMeasuredHeight() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateExposureRatio", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
            return 0.0d;
        }
        view.getGlobalVisibleRect(new android.graphics.Rect());
        com.tencent.mars.xlog.Log.i("WsFoldAdViewVisibilityManager", java.lang.String.valueOf(r2.height() / view.getMeasuredHeight()));
        double height = r2.height() / view.getMeasuredHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateExposureRatio", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        return height;
    }

    public final void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAllViewsVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        if (z17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f305963c < 50) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAllViewsVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                return;
            }
            this.f305963c = currentTimeMillis;
        }
        java.util.Collection<k94.h> values = this.f305961a.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (k94.h hVar : values) {
            kotlin.jvm.internal.o.d(hVar);
            d(hVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAllViewsVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
    }

    public final void d(k94.h hVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSingleViewVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        android.view.View view = hVar.f305949b;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSingleViewVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaterialContainer", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaterialContainer", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        android.view.ViewGroup viewGroup = hVar.f305950c;
        if (viewGroup == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSingleViewVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
            return;
        }
        if (view.getParent() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            boolean z17 = hVar.f305954g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            hVar.f305954g = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            if (z17) {
                f(this, hVar, k94.i.f305956e, 0.0d, 4, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSingleViewVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
            return;
        }
        double b17 = b(view);
        double b18 = b(viewGroup);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        boolean z18 = hVar.f305954g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        boolean z19 = b17 > 0.0d;
        if (z19 != z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            hVar.f305954g = z19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            e(hVar, z19 ? k94.i.f305955d : k94.i.f305956e, b17);
        } else if (z19) {
            e(hVar, k94.i.f305957f, b17);
        }
        if (b18 > 0.0d) {
            e(hVar, k94.i.f305958g, b18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSingleViewVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
    }

    public final void e(k94.h hVar, k94.i iVar, double d17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyListeners", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        for (k94.g gVar : this.f305962b) {
            hVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewId", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewId", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            java.lang.String str = hVar.f305948a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            gVar.a(str, iVar, d17, hVar.f305951d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyListeners", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
    }
}
