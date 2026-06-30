package yf;

/* loaded from: classes7.dex */
public class r0 implements android.view.ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public float f461453d;

    /* renamed from: e, reason: collision with root package name */
    public float f461454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461455f;

    public r0(yf.i0 i0Var) {
        this.f461455f = i0Var;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        yf.i0 i0Var = this.f461455f;
        int maxZoom = i0Var.f461362i.getMaxZoom();
        if (maxZoom <= 0) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() - this.f461453d;
        this.f461453d = scaleGestureDetector.getScaleFactor();
        float a17 = h3.a.a(this.f461454e + scaleFactor, 0.0f, 1.0f);
        this.f461454e = a17;
        if (i0Var.f461362i != null) {
            int i17 = (int) (a17 * maxZoom);
            com.tencent.mars.xlog.Log.i(i0Var.x(), "onScale, maxZoom: %d, scaleFactor: %f, scale: %d", java.lang.Integer.valueOf(maxZoom), java.lang.Float.valueOf(this.f461454e), java.lang.Integer.valueOf(i17));
            i0Var.f461362i.setZoom(i17);
            i0Var.f461360g.e().a(i17);
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        this.f461453d = scaleGestureDetector.getScaleFactor();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
    }
}
