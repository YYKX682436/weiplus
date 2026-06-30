package uy3;

/* loaded from: classes7.dex */
public final class x implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f432000d;

    public x(yz5.a aVar) {
        this.f432000d = aVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        this.f432000d.invoke();
        return false;
    }
}
