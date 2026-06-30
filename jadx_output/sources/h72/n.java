package h72;

/* loaded from: classes14.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h72.r f279450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h72.s f279453g;

    public n(h72.s sVar, h72.r rVar, java.lang.String str, java.lang.String str2) {
        this.f279453g = sVar;
        this.f279450d = rVar;
        this.f279451e = str;
        this.f279452f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f279453g.f279468b) {
            h72.s sVar = this.f279453g;
            sVar.f279475i = this.f279450d;
            h72.q qVar = sVar.f279470d;
            if (qVar == h72.q.UNINITIALIZED) {
                sVar.i("MicroMsg.FaceVideoRecorder", "hy: not initialized. should not happen", new java.lang.Object[0]);
                h72.s.c(this.f279453g);
                h72.r rVar = this.f279453g.f279475i;
                if (rVar != null) {
                    rVar.a(null);
                    this.f279453g.f279475i = null;
                }
                return;
            }
            if (qVar != h72.q.CANCELLED && qVar != h72.q.INITIALIZED) {
                if (qVar == h72.q.STOPPED) {
                    sVar.j("MicroMsg.FaceVideoRecorder", "hy: already stopped", new java.lang.Object[0]);
                    h72.r rVar2 = this.f279453g.f279475i;
                    if (rVar2 != null) {
                        rVar2.a(this.f279451e);
                        this.f279453g.f279475i = null;
                    }
                    return;
                }
                h72.q qVar2 = h72.q.STOPPING;
                if (qVar == qVar2) {
                    sVar.j("MicroMsg.FaceVideoRecorder", "hy: stopping. wait", new java.lang.Object[0]);
                    return;
                }
                sVar.j("MicroMsg.FaceVideoRecorder", "hy: stop record and release" + java.lang.Thread.currentThread().getName(), new java.lang.Object[0]);
                com.tencent.mm.plugin.facedetect.model.v.b().d(this.f279453g.f279482p);
                h72.s sVar2 = this.f279453g;
                sVar2.f279470d = qVar2;
                sVar2.f279467a.g(new h72.m(this));
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceVideoRecorder", "hy: cancelled or not started capturing.");
            h72.s.c(this.f279453g);
            h72.r rVar3 = this.f279453g.f279475i;
            if (rVar3 != null) {
                rVar3.a(null);
                this.f279453g.f279475i = null;
            }
        }
    }
}
