package tb1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView f416904d;

    public j(com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView) {
        this.f416904d = appBrandCameraView;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416904d;
        int i18 = appBrandCameraView.F.getDrawSizePoint().x;
        int i19 = appBrandCameraView.F.getDrawSizePoint().y;
        tb1.x xVar = appBrandCameraView.P;
        com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = appBrandCameraView.F;
        if (mMSightRecordView == null) {
            xVar.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.FrameDataCallbackHelper", "listenFrameChange recordView null");
            i17 = -1;
        } else {
            com.tencent.mm.plugin.appbrand.jsruntime.h0 h0Var = xVar.f416949b;
            if (h0Var == null) {
                i17 = -2;
            } else {
                int i27 = xVar.f416951d;
                if (i27 != Integer.MIN_VALUE) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FrameDataCallbackHelper", "listenFrameChange destroy last one bufferId:%d", java.lang.Integer.valueOf(i27));
                    ((com.tencent.mm.plugin.appbrand.jsruntime.n) h0Var).a0(xVar.f416951d);
                }
                com.tencent.mm.plugin.appbrand.jsruntime.n nVar = (com.tencent.mm.plugin.appbrand.jsruntime.n) h0Var;
                int T = nVar.T(i18 * i19 * 4);
                xVar.f416951d = T;
                com.tencent.mars.xlog.Log.i("MicroMsg.FrameDataCallbackHelper", "listenFrameChange bufferId:%d height:%d width:%d", java.lang.Integer.valueOf(T), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
                xVar.f416950c = true;
                mMSightRecordView.c(nVar.m0(xVar.f416951d), xVar);
                i17 = xVar.f416951d;
            }
        }
        if (i17 >= 0) {
            ((tb1.r0) appBrandCameraView.C).a(null, i17, i18, i19);
            return;
        }
        ((tb1.r0) appBrandCameraView.C).a(java.lang.String.format(java.util.Locale.US, "illegal state:%d", java.lang.Integer.valueOf(i17)), -1, -1, -1);
    }
}
