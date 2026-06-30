package h72;

/* loaded from: classes14.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h72.s f279447d;

    public k(h72.s sVar) {
        this.f279447d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f279447d.f279468b) {
            h72.s sVar = this.f279447d;
            h72.q qVar = sVar.f279470d;
            if (qVar == h72.q.UNINITIALIZED) {
                sVar.i("MicroMsg.FaceVideoRecorder", "hy: not started. should not happen", new java.lang.Object[0]);
                h72.s.c(this.f279447d);
                return;
            }
            h72.q qVar2 = h72.q.STARTED;
            if (qVar == qVar2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceVideoRecorder", "hy: already started or wait start");
                return;
            }
            sVar.j("MicroMsg.FaceVideoRecorder", "hy: startRecord record", new java.lang.Object[0]);
            com.tencent.mm.plugin.facedetect.model.v b17 = com.tencent.mm.plugin.facedetect.model.v.b();
            b17.getClass();
            synchronized (com.tencent.mm.plugin.facedetect.model.v.f100038c) {
                java.util.List list = b17.f100039a;
                if (list != null) {
                    list.clear();
                }
            }
            com.tencent.mm.plugin.facedetect.model.v.b().a(this.f279447d.f279482p);
            h72.s sVar2 = this.f279447d;
            sVar2.f279467a.y(sVar2.f279471e, sVar2.f279472f, sVar2.f279473g);
            this.f279447d.f279470d = qVar2;
        }
    }
}
