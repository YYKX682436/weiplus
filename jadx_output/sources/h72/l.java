package h72;

/* loaded from: classes14.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h72.s f279448d;

    public l(h72.s sVar) {
        this.f279448d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f279448d.f279468b) {
            h72.s sVar = this.f279448d;
            if (sVar.f279470d == h72.q.UNINITIALIZED) {
                sVar.i("MicroMsg.FaceVideoRecorder", "hy: not started when cancel. should not happen", new java.lang.Object[0]);
                h72.s.c(this.f279448d);
                return;
            }
            sVar.j("MicroMsg.FaceVideoRecorder", "hy: cancel record", new java.lang.Object[0]);
            this.f279448d.f279467a.cancel();
            h72.s.c(this.f279448d);
            com.tencent.mm.plugin.facedetect.model.v.b().d(this.f279448d.f279482p);
            h72.s sVar2 = this.f279448d;
            sVar2.f279470d = h72.q.CANCELLED;
            sVar2.f279480n.d();
        }
    }
}
