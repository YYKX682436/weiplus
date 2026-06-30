package f72;

/* loaded from: classes14.dex */
public class b implements com.tencent.mm.plugin.facedetect.model.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService f260038a;

    public b(com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService faceDetectProcessService) {
        this.f260038a = faceDetectProcessService;
    }

    public void a(com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult faceResult) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(faceResult == null);
        objArr[1] = java.lang.Integer.valueOf(faceResult != null ? faceResult.result : -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectProcessService", "release out result == null:%b, result: %d", objArr);
        if (faceResult != null && faceResult.result == 0) {
            com.tencent.mm.plugin.facedetect.model.y.f100041f.postToWorker(new f72.a(this, faceResult));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectProcessService", "release out data not valid");
            this.f260038a.i(1, faceResult != null ? faceResult.result : -1);
        }
    }
}
