package j54;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j54.b f297827a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.Reference f297828b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView f297829c;

    public f(androidx.appcompat.app.AppCompatActivity c17, j54.b data) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(data, "data");
        this.f297827a = data;
        this.f297828b = new java.lang.ref.WeakReference(c17);
    }

    public final void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
        view.setTag(com.tencent.mm.R.id.kov, this);
        if (view instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView) {
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView panoramaContainerView = (com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView) view;
            j54.b bVar = this.f297827a;
            bVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewPortWidth", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewPortWidth", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewPortHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewPortHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewPortSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
            panoramaContainerView.f163038h = bVar.f297818c;
            panoramaContainerView.f163037g = bVar.f297819d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewPortSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
            panoramaContainerView.setShouldResponseTouchEvent(false);
            this.f297829c = panoramaContainerView;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageViewRes", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) this.f297828b.get();
            if (appCompatActivity == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageViewRes", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
            } else {
                com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView panoramaContainerView2 = this.f297829c;
                if (panoramaContainerView2 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageViewRes", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                } else {
                    kotlinx.coroutines.y0 b17 = v65.m.b(appCompatActivity);
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a.plus(new j54.c(kotlinx.coroutines.q0.f310567d)), null, new j54.d(this, panoramaContainerView2, bVar.f297816a, null), 2, null)).p(new j54.e(panoramaContainerView2));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageViewRes", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregister", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView panoramaContainerView = this.f297829c;
        if (panoramaContainerView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregister", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregisterSensor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        android.hardware.SensorManager sensorManager = panoramaContainerView.f163039i;
        if (sensorManager == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterSensor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        } else {
            if (panoramaContainerView.f163040m) {
                com.tencent.mars.xlog.Log.i("SnsAd.PanoramaView", "it is going to unregister sensor");
                sensorManager.unregisterListener(panoramaContainerView);
                panoramaContainerView.f163040m = false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterSensor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregister", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
    }
}
