package i72;

/* loaded from: classes14.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f289419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i72.m f289420e;

    public h(i72.m mVar, long j17) {
        this.f289420e = mVar;
        this.f289419d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f289420e.f289427d.f100107u) {
            long j17 = this.f289419d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: enter worker thread. using %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17));
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            i72.m mVar = this.f289420e;
            com.tencent.mm.plugin.facedetect.model.n0 n0Var = mVar.f289424a;
            if (n0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectCameraView", "hy: already released");
                if (this.f289420e.f289427d.f100111y != null) {
                    com.tencent.mm.sdk.platformtools.u3.h(new i72.e(this));
                }
                return;
            }
            try {
                com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView = mVar.f289427d;
                n0Var.f100019e = new android.graphics.Point(faceDetectCameraView.f100109w, faceDetectCameraView.f100110x);
                i72.m mVar2 = this.f289420e;
                com.tencent.mm.plugin.facedetect.model.n0 n0Var2 = mVar2.f289424a;
                if (!(n0Var2.f100016b != null && n0Var2.f100023i)) {
                    n0Var2.a(mVar2.f289427d.f100098i, true, 4);
                }
                i72.m mVar3 = this.f289420e;
                com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView.E(mVar3.f289427d, mVar3.f289424a.f100018d);
                i72.m mVar4 = this.f289420e;
                mVar4.f289424a.d(mVar4.f289427d.f100098i);
                i72.m mVar5 = this.f289420e;
                mVar5.f289424a.c(mVar5.f289425b);
                if (this.f289420e.f289427d.f100111y != null) {
                    com.tencent.mm.sdk.platformtools.u3.h(new i72.f(this));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: opened and start preview. use: %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView2 = this.f289420e.f289427d;
                if (faceDetectCameraView2.f100103q && faceDetectCameraView2.f100099m > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: already request scanning face and now automatically capture");
                    com.tencent.mm.sdk.platformtools.u3.h(new i72.a(faceDetectCameraView2));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceDetectCameraView", e17, "hy: exception caused", new java.lang.Object[0]);
                if (this.f289420e.f289427d.f100111y != null) {
                    com.tencent.mm.sdk.platformtools.u3.h(new i72.g(this));
                }
            }
        }
    }
}
