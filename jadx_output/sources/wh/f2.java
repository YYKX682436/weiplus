package wh;

/* loaded from: classes12.dex */
public class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445774a;

    /* renamed from: b, reason: collision with root package name */
    public final long f445775b;

    /* renamed from: c, reason: collision with root package name */
    public final long f445776c;

    public f2(java.lang.String str) {
        this.f445774a = str;
        this.f445775b = android.os.SystemClock.uptimeMillis();
        this.f445776c = java.lang.System.currentTimeMillis();
    }

    public java.lang.String toString() {
        return "Stamp{key='" + this.f445774a + "', upTime=" + this.f445775b + ", statMillis=" + this.f445776c + '}';
    }

    public f2(java.lang.String str, long j17) {
        this.f445774a = str;
        this.f445775b = j17;
        this.f445776c = java.lang.System.currentTimeMillis();
    }
}
