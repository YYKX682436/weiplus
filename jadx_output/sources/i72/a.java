package i72;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView f289410d;

    public a(com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView) {
        this.f289410d = faceDetectCameraView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView = this.f289410d;
        android.graphics.Rect rect = faceDetectCameraView.f100108v;
        long j17 = faceDetectCameraView.f100099m;
        synchronized (faceDetectCameraView) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: request clear queue");
            com.tencent.mm.plugin.facedetect.model.y.f100041f.removeCallbacksAndMessages(null);
            faceDetectCameraView.f100108v = rect;
            faceDetectCameraView.G();
            ((i72.m) faceDetectCameraView.f100112z).c(j17);
        }
        faceDetectCameraView.f100103q = false;
    }
}
