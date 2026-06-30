package f85;

/* loaded from: classes10.dex */
public final class d implements f85.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f260230a;

    /* renamed from: b, reason: collision with root package name */
    public long f260231b;

    public d(long j17) {
        this.f260230a = j17;
    }

    @Override // f85.e
    public boolean a() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f260231b);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            this.f260231b = uptimeMillis;
            return true;
        }
        boolean z17 = uptimeMillis - valueOf.longValue() > this.f260230a;
        if (z17) {
            this.f260231b = uptimeMillis;
        }
        return z17;
    }
}
