package pq5;

/* loaded from: classes7.dex */
public class e implements lm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f357684a;

    public e(com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f357684a = n3Var;
    }

    @Override // lm5.a
    public void a() {
        this.f357684a.removeCallbacksAndMessages(null);
    }

    @Override // lm5.a
    public android.os.Looper getLooper() {
        return this.f357684a.getLooper();
    }

    @Override // lm5.a
    public void post(java.lang.Runnable runnable) {
        this.f357684a.post(runnable);
    }

    @Override // lm5.a
    public void postDelayed(java.lang.Runnable runnable, long j17) {
        this.f357684a.postDelayed(runnable, j17);
    }
}
