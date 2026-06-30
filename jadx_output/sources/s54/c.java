package s54;

/* loaded from: classes4.dex */
public class c implements r90.j {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f403183e;

    /* renamed from: f, reason: collision with root package name */
    public di3.d f403184f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f403182d = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public volatile int f403185g = 0;

    public c(s54.a aVar) {
    }

    public static s54.c a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        s54.c cVar = s54.b.f403181a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager$ScreenSwitchManagerHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager$ScreenSwitchManagerHolder");
        s54.c cVar2 = s54.b.f403181a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        return cVar2;
    }

    @Override // r90.j
    public void onOrientationChange(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        if (i17 == 0) {
            this.f403185g = 0;
        } else if (i17 == 270) {
            this.f403185g = 90;
        } else if (i17 == 90) {
            this.f403185g = -90;
        } else if (i17 == 180) {
            this.f403185g = 180;
        } else {
            this.f403185g = -1;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f403183e)) {
            com.tencent.mars.xlog.Log.i("ScreenSwitchManager", "componentId is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
            return;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) this.f403182d).get(this.f403183e);
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.i("ScreenSwitchManager", "mViewRef is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        } else {
            android.view.View view = (android.view.View) weakReference.get();
            if (view instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper) {
                ((com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper) view).w(this.f403185g);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        }
    }
}
