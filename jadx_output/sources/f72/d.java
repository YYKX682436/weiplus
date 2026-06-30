package f72;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.model.t0 f260040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService f260041e;

    public d(com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService faceDetectProcessService, com.tencent.mm.plugin.facedetect.model.t0 t0Var) {
        this.f260041e = faceDetectProcessService;
        this.f260040d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectProcessService", "service do release out");
        this.f260041e.f100044i.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: release out not init");
        com.tencent.mm.sdk.platformtools.u3.h(new f72.c(this, null));
    }
}
