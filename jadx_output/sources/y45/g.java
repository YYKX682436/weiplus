package y45;

/* loaded from: classes12.dex */
public class g implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459368a;

    public g(android.content.Context context) {
        this.f459368a = context;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        d55.u.c("MicroMsg.recovery.initializer", "recovery process crash, thread = " + thread.getName(), th6, new java.lang.Object[0]);
        d55.u.a(this.f459368a);
    }
}
