package wh;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f445792a = android.os.SystemClock.uptimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f445793b;

    /* renamed from: c, reason: collision with root package name */
    public final long f445794c;

    public h(java.lang.Object obj, long j17) {
        this.f445793b = obj;
        this.f445794c = j17;
    }

    public final boolean a() {
        return android.os.SystemClock.uptimeMillis() - this.f445792a >= this.f445794c;
    }
}
