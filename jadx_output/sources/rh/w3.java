package rh;

/* loaded from: classes12.dex */
public class w3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f395539a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f395540b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f395541c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f395542d;

    /* renamed from: f, reason: collision with root package name */
    public long f395544f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final long f395543e = android.os.SystemClock.uptimeMillis();

    public w3(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f395539a = i17;
        this.f395540b = str;
        this.f395541c = str2;
        this.f395542d = str3;
    }

    public long a() {
        long j17 = this.f395544f;
        long j18 = this.f395543e;
        if (!(j17 >= j18)) {
            j17 = android.os.SystemClock.uptimeMillis();
        }
        long j19 = j17 - j18;
        if (j19 > 0) {
            return j19;
        }
        return 0L;
    }

    public java.lang.String toString() {
        return "WakeLockRecord{flags=" + this.f395539a + ", tag='" + this.f395540b + "', packageName='" + this.f395541c + "', stack='" + this.f395542d + "', timeBgn=" + this.f395543e + ", timeEnd=" + this.f395544f + '}';
    }
}
