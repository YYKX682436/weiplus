package i72;

/* loaded from: classes14.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.views.FaceDetectView f289433d;

    public q(com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView) {
        this.f289433d = faceDetectView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView = this.f289433d;
        if (faceDetectView.f100124i != null && !faceDetectView.f100127o) {
            ((com.tencent.mm.plugin.facedetect.ui.FaceDetectUI) this.f289433d.f100124i).V6(0, "");
        }
        this.f289433d.getClass();
    }
}
