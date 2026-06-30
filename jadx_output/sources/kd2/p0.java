package kd2;

/* loaded from: classes10.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f306783a;

    /* renamed from: b, reason: collision with root package name */
    public long f306784b;

    /* renamed from: c, reason: collision with root package name */
    public long f306785c;

    public p0(long j17, long j18, long j19) {
        this.f306783a = j17;
        this.f306784b = j18;
        this.f306785c = j19;
    }

    public final long a() {
        long b17;
        long j17;
        if (this.f306784b > 0) {
            b17 = b();
            j17 = (this.f306785c + android.os.SystemClock.elapsedRealtime()) - this.f306784b;
        } else {
            b17 = b();
            j17 = this.f306785c;
        }
        return b17 - j17;
    }

    public final long b() {
        return android.os.SystemClock.elapsedRealtime() - this.f306783a;
    }
}
