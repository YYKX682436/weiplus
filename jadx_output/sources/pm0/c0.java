package pm0;

/* loaded from: classes.dex */
public final class c0 extends lm5.d {

    /* renamed from: d, reason: collision with root package name */
    public static final pm0.c0 f356765d = new pm0.c0();

    @Override // lm5.d
    public void a(java.lang.Runnable runnable) {
        if (runnable != null) {
            ((ku5.t0) ku5.t0.f312615d).g(runnable);
        }
    }

    @Override // lm5.d
    public void b(java.lang.Runnable runnable, long j17) {
        if (runnable != null) {
            ((ku5.t0) ku5.t0.f312615d).k(runnable, j17);
        }
    }

    @Override // lm5.d
    public void c() {
        com.tencent.mars.xlog.Log.e("ThreadScheduler", "can not support");
    }

    @Override // lm5.d
    public java.lang.String d() {
        return "ThreadScheduler";
    }
}
