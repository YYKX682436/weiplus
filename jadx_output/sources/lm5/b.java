package lm5;

/* loaded from: classes7.dex */
public class b implements lm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f319599a;

    public b(android.os.Handler handler) {
        this.f319599a = handler;
    }

    @Override // lm5.a
    public void a() {
        this.f319599a.removeCallbacksAndMessages(null);
    }

    @Override // lm5.a
    public android.os.Looper getLooper() {
        return this.f319599a.getLooper();
    }

    @Override // lm5.a
    public void post(java.lang.Runnable runnable) {
        this.f319599a.post(runnable);
    }

    @Override // lm5.a
    public void postDelayed(java.lang.Runnable runnable, long j17) {
        this.f319599a.postDelayed(runnable, j17);
    }
}
