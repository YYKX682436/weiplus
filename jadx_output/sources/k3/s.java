package k3;

/* loaded from: classes13.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Callable f303813d;

    /* renamed from: e, reason: collision with root package name */
    public final m3.a f303814e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f303815f;

    public s(android.os.Handler handler, java.util.concurrent.Callable callable, m3.a aVar) {
        this.f303813d = callable;
        this.f303814e = aVar;
        this.f303815f = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object obj;
        try {
            obj = this.f303813d.call();
        } catch (java.lang.Exception unused) {
            obj = null;
        }
        this.f303815f.post(new k3.r(this, this.f303814e, obj));
    }
}
