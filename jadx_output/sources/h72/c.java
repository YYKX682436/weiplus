package h72;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f279419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h72.d f279420e;

    public c(h72.d dVar, int i17) {
        this.f279420e = dVar;
        this.f279419d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.facedetect.model.FaceContextData faceContextData;
        com.tencent.mm.plugin.facedetect.model.FaceContextData faceContextData2;
        try {
            try {
                ei3.m mVar = this.f279420e.f279421d.f279467a;
                if (mVar != null) {
                    mVar.reset();
                }
            } catch (java.lang.Exception e17) {
                h72.s sVar = this.f279420e.f279421d;
                java.lang.Object[] objArr = {e17.getMessage()};
                h72.s sVar2 = h72.s.f279464r;
                sVar.i("MicroMsg.FaceVideoRecorder", "hy: onError, reset mediaRecorder error: %s", objArr);
            }
            h72.s.c(this.f279420e.f279421d);
            synchronized (this.f279420e.f279421d.f279468b) {
                this.f279420e.f279421d.f279470d = h72.q.INITIALIZED;
            }
            synchronized (com.tencent.mm.plugin.facedetect.model.FaceContextData.class) {
                faceContextData = com.tencent.mm.plugin.facedetect.model.FaceContextData.f99950e;
            }
            if (faceContextData != null) {
                synchronized (com.tencent.mm.plugin.facedetect.model.FaceContextData.class) {
                    faceContextData2 = com.tencent.mm.plugin.facedetect.model.FaceContextData.f99950e;
                }
                com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.d(faceContextData2.f99951d, 2, this.f279419d);
            }
        } catch (java.lang.Throwable th6) {
            h72.s.c(this.f279420e.f279421d);
            throw th6;
        }
    }
}
