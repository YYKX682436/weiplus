package i72;

/* loaded from: classes14.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.model.t0 f289436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.views.FaceDetectView f289437e;

    public s(com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView, com.tencent.mm.plugin.facedetect.model.t0 t0Var) {
        this.f289437e = faceDetectView;
        this.f289436d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f289437e.f100119d.F();
        if (this.f289436d != null) {
            synchronized (this.f289437e.f100119d) {
                com.tencent.mm.plugin.facedetect.model.y.f100041f.removeCallbacksAndMessages(null);
                com.tencent.mm.plugin.facedetect.model.y yVar = com.tencent.mm.plugin.facedetect.model.y.INSTANCE;
                yVar.f100043d.f100044i.getClass();
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
                yVar.f100043d.f100044i.getClass();
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: release out not init");
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: motionResult: %d, finalResult: %d", -3, java.lang.Integer.valueOf(com.tencent.tinker.loader.shareutil.ShareConstants.ERROR_LOAD_GET_INTENT_FAIL));
            }
            ((f72.b) this.f289436d).a(null);
        }
    }
}
