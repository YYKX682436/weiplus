package tb1;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.f4 f416908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView f416909e;

    public l(com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView, com.tencent.mm.plugin.appbrand.utils.f4 f4Var) {
        this.f416909e = appBrandCameraView;
        this.f416908d = f4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.utils.f4 f4Var = this.f416908d;
        java.lang.String obj = f4Var.toString();
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416909e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "currentOrientationRecord %s, lateOrientationState: %s", obj, appBrandCameraView.U.toString());
        long j17 = appBrandCameraView.S;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 >= 750 && appBrandCameraView.V.get() && f4Var == appBrandCameraView.U) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "reopen camera");
            com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = appBrandCameraView.F;
            appBrandCameraView.i();
            appBrandCameraView.h();
            tb1.x xVar = appBrandCameraView.P;
            if (xVar != null) {
                com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView2 = appBrandCameraView.F;
                com.tencent.mars.xlog.Log.i("MicroMsg.FrameDataCallbackHelper", "rebindRecordView, bufferId: %d", java.lang.Integer.valueOf(xVar.f416951d));
                if (!xVar.f416950c) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FrameDataCallbackHelper", "needn't callback");
                } else if (xVar.f416951d == Integer.MIN_VALUE) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FrameDataCallbackHelper", "buffer id illegal");
                } else {
                    com.tencent.mm.plugin.appbrand.jsruntime.h0 h0Var = xVar.f416949b;
                    if (h0Var == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.FrameDataCallbackHelper", "rebindRecordView mSharedBufferAddon null");
                    } else {
                        if (mMSightRecordView != null) {
                            mMSightRecordView.c(null, null);
                        }
                        if (mMSightRecordView2 != null) {
                            java.nio.ByteBuffer m07 = ((com.tencent.mm.plugin.appbrand.jsruntime.n) h0Var).m0(xVar.f416951d);
                            if (m07 != null) {
                                mMSightRecordView2.c(m07, xVar);
                            } else {
                                com.tencent.mars.xlog.Log.w("MicroMsg.FrameDataCallbackHelper", "buffer is null");
                            }
                        }
                    }
                }
            }
        }
        appBrandCameraView.T = false;
    }
}
