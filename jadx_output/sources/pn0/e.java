package pn0;

/* loaded from: classes14.dex */
public class e extends pn0.a {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f356950l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.Surface f356951m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.SurfaceHolder.Callback f356952n;

    public e(nn0.o oVar) {
        super(oVar);
        this.f356950l = "SurfaceView_Render_" + hashCode();
        this.f356952n = new pn0.d(this);
    }

    @Override // pn0.a, pn0.b
    public void b(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f356947k = tXCloudVideoView;
        android.view.SurfaceView f68622g = tXCloudVideoView.getF68622g();
        java.lang.String str = this.f356950l;
        if (f68622g == null) {
            com.tencent.mars.xlog.Log.e(str, "surfaceView = null");
            return;
        }
        android.view.Surface surface = tXCloudVideoView.getF68622g().getHolder().getSurface();
        if (surface == null || !surface.isValid()) {
            com.tencent.mars.xlog.Log.i(str, "onViewRenderSet no valid surface can use");
        } else {
            android.graphics.Rect surfaceFrame = tXCloudVideoView.getF68622g().getHolder().getSurfaceFrame();
            com.tencent.mars.xlog.Log.i(str, "onViewRenderSet surace valid = " + surface + " width = " + surfaceFrame.width() + " height = " + surfaceFrame.height());
            u(surfaceFrame.width(), surfaceFrame.height());
            this.f356951m = surface;
            this.f356945i = false;
        }
        tXCloudVideoView.getF68622g().getHolder().addCallback(this.f356952n);
    }

    @Override // pn0.b
    public android.view.Surface getSurface() {
        return this.f356951m;
    }

    @Override // pn0.b
    public void reset() {
        com.tencent.mars.xlog.Log.i(this.f356950l, "reset");
        android.view.SurfaceView f68622g = this.f356947k.getF68622g();
        if (f68622g != null) {
            f68622g.getHolder().removeCallback(this.f356952n);
        }
    }

    @Override // pn0.b
    public void startPlay() {
    }

    @Override // pn0.b
    public void stopPlay(boolean z17) {
    }
}
