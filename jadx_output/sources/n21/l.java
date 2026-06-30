package n21;

/* loaded from: classes8.dex */
public class l implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.m f334273d;

    public l(n21.m mVar) {
        this.f334273d = mVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        n21.o oVar = this.f334273d.f334274d;
        oVar.f334277a.a(new n21.k(this));
        return false;
    }
}
