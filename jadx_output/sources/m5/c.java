package m5;

/* loaded from: classes13.dex */
public class c implements m5.a {

    /* renamed from: a, reason: collision with root package name */
    public final k5.l f323470a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f323471b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.Executor f323472c = new m5.b(this);

    public c(java.util.concurrent.Executor executor) {
        this.f323470a = new k5.l(executor);
    }

    public void a(java.lang.Runnable runnable) {
        this.f323470a.execute(runnable);
    }
}
