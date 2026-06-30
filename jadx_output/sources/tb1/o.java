package tb1;

/* loaded from: classes7.dex */
public class o implements bi3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb1.s f416916a;

    public o(tb1.s sVar) {
        this.f416916a = sVar;
    }

    @Override // bi3.j
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "onRecordFinish error %b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416916a.f416934a;
        com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = appBrandCameraView.F;
        if (mMSightRecordView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "onRecordFinish recordView is null");
            this.f416916a.i(-1, "camera is null", null, null);
            return;
        }
        appBrandCameraView.f80167J = 1;
        java.lang.String videoFilePath = mMSightRecordView.getVideoFilePath();
        if (z17) {
            this.f416916a.i(-1, "stop error", null, null);
        } else {
            tb1.s sVar = this.f416916a;
            if (sVar.f416934a.f80180r) {
                sVar.getClass();
                ((ku5.t0) ku5.t0.f312615d).g(new tb1.q(sVar, videoFilePath));
            } else {
                tb1.s.e(sVar, videoFilePath);
            }
        }
        tb1.s sVar2 = this.f416916a;
        sVar2.getClass();
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.f80166x0;
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView2 = sVar2.f416934a;
        appBrandCameraView2.o();
        appBrandCameraView2.f80182t = false;
    }
}
