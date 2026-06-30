package xi;

/* loaded from: classes12.dex */
public class a implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Toast f454646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xi.b f454647e;

    public a(xi.b bVar, android.widget.Toast toast) {
        this.f454647e = bVar;
        this.f454646d = toast;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        bj.a aVar = this.f454647e.f454648d;
        aVar.f21100a.set(this.f454646d);
        aVar.f21101b.countDown();
        return false;
    }
}
