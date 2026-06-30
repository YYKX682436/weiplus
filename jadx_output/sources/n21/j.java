package n21;

/* loaded from: classes8.dex */
public class j implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.o f334271d;

    public j(n21.o oVar) {
        this.f334271d = oVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        if (gm0.j1.d().f70771n) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SpeexUploadCore", "skiped resume speex uploader, not foreground");
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = this.f334271d.f334277a;
        synchronized (i6Var.f192744f) {
            i6Var.f192740b = false;
            synchronized (i6Var.f192744f) {
                i6Var.f192744f.notifyAll();
            }
        }
        return false;
    }
}
