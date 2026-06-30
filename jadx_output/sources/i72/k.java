package i72;

/* loaded from: classes14.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i72.l f289422d;

    public k(i72.l lVar) {
        this.f289422d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView = this.f289422d.f289423a.f289427d;
        long j17 = faceDetectCameraView.f100100n;
        long j18 = elapsedRealtime - j17;
        if (j17 < 0 || j18 > faceDetectCameraView.f100099m) {
            faceDetectCameraView.f100100n = elapsedRealtime;
            byte[] bArr = faceDetectCameraView.A;
            synchronized (faceDetectCameraView.f100106t) {
                if (!faceDetectCameraView.f100105s) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectCameraView", "hy: not requesting scanning. stop send msg");
                    return;
                }
                if (bArr != null && !faceDetectCameraView.B) {
                    faceDetectCameraView.B = true;
                    com.tencent.mm.plugin.facedetect.model.y yVar = com.tencent.mm.plugin.facedetect.model.y.INSTANCE;
                    ((i72.m) faceDetectCameraView.f100112z).b();
                    ((i72.m) faceDetectCameraView.f100112z).a();
                    i72.m mVar = (i72.m) faceDetectCameraView.f100112z;
                    synchronized (mVar.f289427d.f100107u) {
                        int i17 = mVar.f289424a.f100021g;
                    }
                    yVar.f100043d.f100044i.getClass();
                    com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult faceCharacteristicsResult = new com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult();
                    com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: process not init");
                    java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jip);
                    faceCharacteristicsResult.f99948d = 4;
                    faceCharacteristicsResult.f99949e = string;
                    faceDetectCameraView.B = false;
                    android.os.Message obtainMessage = com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView.C.obtainMessage();
                    obtainMessage.what = 1;
                    obtainMessage.obj = faceCharacteristicsResult;
                    obtainMessage.sendToTarget();
                }
            }
        }
    }
}
