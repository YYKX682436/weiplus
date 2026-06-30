package lt5;

/* loaded from: classes8.dex */
public class h implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f321305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f321306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f321307f;

    public h(lt5.j jVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.atomic.AtomicReference atomicReference2, java.lang.Object obj) {
        this.f321305d = atomicReference;
        this.f321306e = atomicReference2;
        this.f321307f = obj;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f321305d.set(iBinder);
        this.f321306e.set(this);
        synchronized (this.f321307f) {
            try {
                this.f321307f.notifyAll();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
