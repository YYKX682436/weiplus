package u04;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f423480a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f423481b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f423482c = new u04.e(this);

    /* renamed from: d, reason: collision with root package name */
    public u04.g f423483d;

    public f(long j17) {
        this.f423480a = j17;
    }

    public final void a() {
        android.os.Handler handler = this.f423481b;
        java.lang.Runnable runnable = this.f423482c;
        handler.removeCallbacks(runnable);
        long j17 = this.f423480a;
        if (j17 < 0) {
            return;
        }
        this.f423480a = j17;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.f423480a);
    }
}
