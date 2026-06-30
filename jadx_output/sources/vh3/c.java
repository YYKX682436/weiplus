package vh3;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender f437043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f437044e;

    public c(com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender mMSurfaceViewRender, int[] iArr) {
        this.f437043d = mMSurfaceViewRender;
        this.f437044e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        a01.d surfaceViewSwitchHelper = this.f437043d.getSurfaceViewSwitchHelper();
        if (surfaceViewSwitchHelper != null) {
            int[] iArr = this.f437044e;
            int i17 = iArr[0];
            int i18 = iArr[1];
            android.view.View findViewWithTag = surfaceViewSwitchHelper.f369a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
            if (findViewWithTag != null) {
                com.tencent.mars.xlog.Log.w(surfaceViewSwitchHelper.b(), "onSurfaceViewSizeChange [" + i17 + " x " + i18 + "] captureBitmap:" + surfaceViewSwitchHelper.f373e + '.');
                android.view.ViewGroup.LayoutParams layoutParams = findViewWithTag.getLayoutParams();
                layoutParams.width = i17;
                layoutParams.height = i18;
                findViewWithTag.setLayoutParams(layoutParams);
                findViewWithTag.requestLayout();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w(surfaceViewSwitchHelper.b(), "onSurfaceViewSizeChange ignore captureBitmap:" + surfaceViewSwitchHelper.f373e + '.');
            }
        }
    }
}
