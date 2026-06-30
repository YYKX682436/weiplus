package ub1;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f426030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f426032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f426033g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.qbar.QbarNative$QBarPoint f426034h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ub1.b f426035i;

    public d(ub1.b bVar, int i17, java.lang.String str, int i18, int i19, byte[] bArr, com.tencent.qbar.QbarNative$QBarPoint qbarNative$QBarPoint) {
        this.f426035i = bVar;
        this.f426030d = i17;
        this.f426031e = str;
        this.f426032f = i19;
        this.f426033g = bArr;
        this.f426034h = qbarNative$QBarPoint;
    }

    @Override // java.lang.Runnable
    public void run() {
        ub1.e eVar = this.f426035i.f426016b;
        if (eVar != null) {
            java.lang.String str = this.f426031e;
            int i17 = this.f426032f;
            byte[] bArr = this.f426033g;
            com.tencent.qbar.QbarNative$QBarPoint qbarNative$QBarPoint = this.f426034h;
            tb1.u uVar = (tb1.u) ((ub1.h) eVar).f426036a;
            if (uVar.f416937b.compareAndSet(false, true)) {
                com.tencent.mm.sdk.platformtools.u3.i(new tb1.t(uVar), uVar.f416938c);
                if (qbarNative$QBarPoint != null && uVar.f416946k % 4 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "x: %f, y: %f, w: %f, h: %f; x0:%f, x1:%f, x2:%f, x3:%f, y0:%f, y1:%f, y2:%f, y3:%f", java.lang.Float.valueOf(qbarNative$QBarPoint.f215230x0), java.lang.Float.valueOf(qbarNative$QBarPoint.f215234y0), java.lang.Float.valueOf(qbarNative$QBarPoint.f215231x1 - qbarNative$QBarPoint.f215230x0), java.lang.Float.valueOf(qbarNative$QBarPoint.f215237y3 - qbarNative$QBarPoint.f215234y0), java.lang.Float.valueOf(qbarNative$QBarPoint.f215230x0), java.lang.Float.valueOf(qbarNative$QBarPoint.f215231x1), java.lang.Float.valueOf(qbarNative$QBarPoint.f215232x2), java.lang.Float.valueOf(qbarNative$QBarPoint.f215233x3), java.lang.Float.valueOf(qbarNative$QBarPoint.f215234y0), java.lang.Float.valueOf(qbarNative$QBarPoint.f215235y1), java.lang.Float.valueOf(qbarNative$QBarPoint.f215236y2), java.lang.Float.valueOf(qbarNative$QBarPoint.f215237y3));
                    uVar.f416946k++;
                }
                int i18 = this.f426030d;
                com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = uVar.f416947l;
                if (i18 == 1) {
                    tb1.e0.u(appBrandCameraView.f80169e, appBrandCameraView.getCameraId(), "qrcode", i17, str, bArr, qbarNative$QBarPoint);
                } else if (i18 != 2) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCameraView", "resultType:%d is not support, ignore");
                } else {
                    tb1.e0.u(appBrandCameraView.f80169e, appBrandCameraView.getCameraId(), "barcode", i17, str, bArr, qbarNative$QBarPoint);
                }
            }
        }
    }
}
