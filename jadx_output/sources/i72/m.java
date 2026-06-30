package i72;

/* loaded from: classes14.dex */
public class m implements i72.d {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.model.n0 f289424a;

    /* renamed from: b, reason: collision with root package name */
    public final android.hardware.Camera.PreviewCallback f289425b = new i72.j(this);

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.facedetect.model.u f289426c = new i72.l(this);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView f289427d;

    public m(com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView, i72.a aVar) {
        this.f289427d = faceDetectCameraView;
        this.f289424a = null;
        this.f289424a = new com.tencent.mm.plugin.facedetect.model.n0(faceDetectCameraView.getContext());
        faceDetectCameraView.f100100n = -1L;
        faceDetectCameraView.B = false;
    }

    public int a() {
        int i17;
        synchronized (this.f289427d.f100107u) {
            i17 = this.f289424a.f100018d.y;
        }
        return i17;
    }

    public int b() {
        int i17;
        synchronized (this.f289427d.f100107u) {
            i17 = this.f289424a.f100018d.x;
        }
        return i17;
    }

    public void c(long j17) {
        synchronized (this.f289427d.f100107u) {
            if (this.f289424a == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: start capturing. tween: %d", java.lang.Long.valueOf(j17));
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView = this.f289427d;
            faceDetectCameraView.f100099m = j17;
            if (faceDetectCameraView.f100105s) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectCameraView", "hy: already scanning");
            } else {
                com.tencent.mm.plugin.facedetect.model.n0 n0Var = this.f289424a;
                if (n0Var == null || !n0Var.f100017c) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: not previewed yet. wait");
                    this.f289427d.f100103q = true;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: is previewing. directly start capture");
                    this.f289427d.f100103q = false;
                    com.tencent.mm.plugin.facedetect.model.v.b().a(this.f289426c);
                    this.f289427d.f100105s = true;
                }
            }
        }
    }
}
