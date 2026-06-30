package mk4;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender f327144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f327145e;

    public c(com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender mMSurfaceViewRender, int[] iArr) {
        this.f327144d = mMSurfaceViewRender;
        this.f327145e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        mk4.h surfaceViewSwitchHelper = this.f327144d.getSurfaceViewSwitchHelper();
        if (surfaceViewSwitchHelper != null) {
            int[] iArr = this.f327145e;
            int i17 = iArr[0];
            int i18 = iArr[1];
            android.view.View findViewWithTag = surfaceViewSwitchHelper.f327154a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
            if (findViewWithTag != null) {
                com.tencent.mars.xlog.Log.w(surfaceViewSwitchHelper.d(), "onSurfaceViewSizeChange [" + i17 + " x " + i18 + "] captureBitmap:" + surfaceViewSwitchHelper.f327158e + '.');
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
                com.tencent.mars.xlog.Log.w(surfaceViewSwitchHelper.d(), "onSurfaceViewSizeChange ignore captureBitmap:" + surfaceViewSwitchHelper.f327158e + '.');
            }
        }
    }
}
