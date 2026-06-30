package n21;

/* loaded from: classes8.dex */
public class d implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.e f334249d;

    public d(n21.e eVar) {
        this.f334249d = eVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        n21.o b17 = n21.o.b();
        b17.f334277a.a(this.f334249d.f334250d);
        return false;
    }
}
