package lt5;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f321309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f321310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f321311g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f321312h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f321313i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ lt5.j f321314m;

    public i(lt5.j jVar, android.content.Context context, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.atomic.AtomicReference atomicReference2, java.util.concurrent.atomic.AtomicReference atomicReference3, java.util.concurrent.atomic.AtomicReference atomicReference4, java.lang.Object obj) {
        this.f321314m = jVar;
        this.f321308d = context;
        this.f321309e = atomicReference;
        this.f321310f = atomicReference2;
        this.f321311g = atomicReference3;
        this.f321312h = atomicReference4;
        this.f321313i = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = "";
        try {
            str = this.f321314m.b(this.f321308d, (android.os.IBinder) this.f321309e.get());
        } catch (java.lang.Throwable unused) {
            this.f321310f.set(-102);
        }
        this.f321311g.set(str);
        try {
            this.f321308d.unbindService((android.content.ServiceConnection) this.f321312h.get());
        } catch (java.lang.Throwable unused2) {
            this.f321310f.set(-103);
        }
        synchronized (this.f321313i) {
            try {
                this.f321313i.notifyAll();
            } catch (java.lang.Throwable unused3) {
            }
        }
    }
}
