package y54;

/* loaded from: classes4.dex */
public final class a0 implements n54.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI f459519a;

    public a0(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI halfScreenVangoghPageUI) {
        this.f459519a = halfScreenVangoghPageUI;
    }

    @Override // n54.t
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWholeScreen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1");
        int i17 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI.f163179n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$notifyEventToFront", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        this.f459519a.Y6("onHalfScreenDidDragToTop");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$notifyEventToFront", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWholeScreen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1");
    }

    @Override // n54.t
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI halfScreenVangoghPageUI = this.f459519a;
        if (halfScreenVangoghPageUI.u4().u()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$notifyFinderVideoPercent", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        halfScreenVangoghPageUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyFinderVideoPercent", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout scrollableFrameLayout = halfScreenVangoghPageUI.f163182f;
        if (scrollableFrameLayout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyFinderVideoPercent", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        } else {
            float height = scrollableFrameLayout.getHeight() - scrollableFrameLayout.getSpaceHolderHeight();
            float f18 = 0.0f;
            if (f17 >= 0.0d) {
                if (!(height == 0.0f)) {
                    f18 = f17 / height;
                }
            }
            n54.i.c(f18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyFinderVideoPercent", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$notifyFinderVideoPercent", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1");
    }

    @Override // n54.t
    public void c(n54.o type) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1");
        kotlin.jvm.internal.o.g(type, "type");
        if (this.f459519a.u4().u()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1");
            return;
        }
        if (type == n54.o.f335147f) {
            n54.i.b(true, true);
        }
        if (type == n54.o.f335145d) {
            n54.i.b(false, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1");
    }

    @Override // n54.t
    public void d(n54.o type) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1");
        kotlin.jvm.internal.o.g(type, "type");
        n54.o oVar = n54.o.f335147f;
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI halfScreenVangoghPageUI = this.f459519a;
        if (type == oVar) {
            if (!halfScreenVangoghPageUI.u4().u()) {
                n54.i.c(0.0f);
                n54.i.b(true, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doAntiAbuseJudgementAfterOpen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAntiAbuseJudgementAfterOpen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
            if (halfScreenVangoghPageUI.u4().D().length() == 0) {
                str = "onAnimationEnd";
                str2 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1";
            } else {
                m54.a0 a0Var = m54.a0.f324243a;
                java.lang.String a17 = a54.h.a(halfScreenVangoghPageUI.u4());
                int l17 = halfScreenVangoghPageUI.u4().l();
                java.lang.String a18 = halfScreenVangoghPageUI.u4().a();
                if (a18 == null) {
                    a18 = "";
                }
                java.lang.String str3 = a18;
                java.lang.String D = halfScreenVangoghPageUI.u4().D();
                m54.l u47 = halfScreenVangoghPageUI.u4();
                u47.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalCacheTime", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
                str = "onAnimationEnd";
                str2 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1";
                long j17 = u47.N;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalCacheTime", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
                a0Var.a(a17, l17, str3, D, j17, new y54.e0(halfScreenVangoghPageUI), new y54.f0(halfScreenVangoghPageUI));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAntiAbuseJudgementAfterOpen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doAntiAbuseJudgementAfterOpen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        } else {
            str = "onAnimationEnd";
            str2 = "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$configHalfScreenContainer$1";
        }
        if (type == n54.o.f335145d) {
            if (!halfScreenVangoghPageUI.u4().u()) {
                n54.i.c(1.0f);
                n54.i.b(false, false);
            }
            halfScreenVangoghPageUI.finish();
        }
        if (type == n54.o.f335146e) {
            com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI.T6(halfScreenVangoghPageUI);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
