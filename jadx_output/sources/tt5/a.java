package tt5;

/* loaded from: classes14.dex */
public class a extends qt5.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qt5.l f422041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.scanlib.ui.ScanView f422042b;

    public a(com.tencent.scanlib.ui.ScanView scanView, qt5.l lVar) {
        this.f422042b = scanView;
        this.f422041a = lVar;
    }

    @Override // qt5.m, qt5.p
    public void b(long j17) {
        qt5.l lVar = this.f422041a;
        if (lVar != null) {
            lVar.b(j17);
        }
    }

    @Override // qt5.m, qt5.p
    public void c(qt5.d dVar) {
        qt5.l lVar = this.f422041a;
        if (lVar != null) {
            lVar.c(dVar);
        }
    }

    @Override // qt5.l
    public void d() {
        float f17;
        float f18;
        int i17;
        if (((qt5.c) this.f422042b.f215302e).f366657b && ((qt5.c) this.f422042b.f215302e).f366658c) {
            com.tencent.scanlib.ui.ScanView scanView = this.f422042b;
            if (scanView.f215303f != null) {
                android.view.TextureView textureView = scanView.f215301d;
                android.graphics.Point point = ((qt5.c) scanView.f215302e).f366662g;
                android.graphics.Point point2 = new android.graphics.Point(this.f422042b.f215301d.getWidth(), this.f422042b.f215301d.getHeight());
                scanView.getClass();
                com.tencent.stubs.logger.Log.i("ScanView", "from " + point + " to " + point2);
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                scanView.f215301d.getTransform(matrix);
                matrix.reset();
                com.tencent.stubs.logger.Log.i("ScanView", "before matrix " + matrix);
                if (!point.equals(point2)) {
                    qt5.c cVar = (qt5.c) scanView.f215302e;
                    int i18 = cVar.f366667l;
                    android.graphics.Point point3 = cVar.f366664i;
                    int i19 = point3.x;
                    int i27 = point2.x;
                    int i28 = (i19 - i27) / 2;
                    int i29 = point3.y;
                    int i37 = point2.y;
                    int i38 = (i29 - i37) / 2;
                    if (i18 % 180 != 0) {
                        f17 = (i27 * 1.0f) / point.y;
                        f18 = (i37 * 1.0f) / point.x;
                        i17 = (i29 - i27) / 2;
                        i38 = (i19 - i37) / 2;
                    } else {
                        f17 = (i27 * 1.0f) / point.x;
                        f18 = (i37 * 1.0f) / point.y;
                        i17 = i28;
                    }
                    float max = java.lang.Math.max(f17, f18);
                    com.tencent.stubs.logger.Log.i("ScanView", "scaleX %f, scaleY %f, scale %f, dx %d, dy %d", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(max), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i38));
                    matrix.preScale(1.0f / f17, 1.0f / f18);
                    matrix.postScale(max, max);
                    matrix.postTranslate(-i17, -i38);
                    com.tencent.stubs.logger.Log.i("ScanView", "after matrix " + matrix);
                }
                textureView.setTransform(matrix);
                qt5.l lVar = this.f422041a;
                if (lVar != null) {
                    lVar.d();
                }
            }
        }
    }

    @Override // qt5.m, qt5.p
    public void e() {
        qt5.l lVar = this.f422041a;
        if (lVar != null) {
            lVar.e();
        }
    }
}
