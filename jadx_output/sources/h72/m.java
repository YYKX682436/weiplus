package h72;

/* loaded from: classes14.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h72.n f279449d;

    public m(h72.n nVar) {
        this.f279449d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h72.s sVar = h72.s.f279464r;
        this.f279449d.f279453g.j("MicroMsg.FaceVideoRecorder", "mediaRecorder stop success", new java.lang.Object[0]);
        synchronized (this.f279449d.f279453g.f279468b) {
            this.f279449d.f279453g.j("MicroMsg.FaceVideoRecorder", "carson: begin to stop" + this.f279449d.f279451e, new java.lang.Object[0]);
            h72.n nVar = this.f279449d;
            nVar.f279453g.f279470d = h72.q.STOPPED;
            com.tencent.mm.vfs.w6.h(nVar.f279452f);
            h72.n nVar2 = this.f279449d;
            h72.r rVar = nVar2.f279453g.f279475i;
            if (rVar != null) {
                rVar.a(nVar2.f279451e);
                this.f279449d.f279453g.f279475i = null;
            }
        }
    }
}
