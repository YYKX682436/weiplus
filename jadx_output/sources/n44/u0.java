package n44;

/* loaded from: classes4.dex */
public final class u0 implements g54.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper f335061d;

    /* renamed from: e, reason: collision with root package name */
    public final i64.z f335062e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f335063f;

    /* renamed from: g, reason: collision with root package name */
    public int f335064g;

    public u0(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper, i64.z zVar) {
        this.f335061d = adLandingGeneralVideoWrapper;
        this.f335062e = zVar;
    }

    @Override // g54.c
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
    }

    @Override // g54.c
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
    }

    @Override // g54.c
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        this.f335064g++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
    }

    public final void d(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThumb", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                ((ku5.t0) ku5.t0.f312615d).g(new n44.t0(str2, z17, str, this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumb", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("AdHalfScreenVideoHelper", "setThumb, but imageUrl or thumbPath is null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumb", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
    }

    @Override // g54.c
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.f335061d;
        if (adLandingGeneralVideoWrapper != null) {
            adLandingGeneralVideoWrapper.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
    }

    @Override // g54.c
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.f335061d;
        if (adLandingGeneralVideoWrapper != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            c01.k kVar = adLandingGeneralVideoWrapper.f163004m;
            if (kVar != null) {
                kVar.c(adLandingGeneralVideoWrapper);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
    }

    @Override // g54.c
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        return false;
    }

    @Override // g54.c
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.f335061d;
        java.lang.Object parent = adLandingGeneralVideoWrapper != null ? adLandingGeneralVideoWrapper.getParent() : null;
        android.widget.FrameLayout frameLayout = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
        if (frameLayout != null) {
            frameLayout.performClick();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        return true;
    }
}
