package se1;

/* loaded from: classes13.dex */
public class j implements se1.d {

    /* renamed from: a, reason: collision with root package name */
    public final se1.e f406785a = new se1.h0();

    /* renamed from: b, reason: collision with root package name */
    public final se1.g0 f406786b = new se1.g0(2000);

    /* renamed from: c, reason: collision with root package name */
    public long f406787c;

    /* renamed from: d, reason: collision with root package name */
    public long f406788d;

    /* renamed from: e, reason: collision with root package name */
    public int f406789e;

    public j(android.os.Handler handler, se1.c cVar) {
    }

    public synchronized void a(int i17) {
        this.f406787c += i17;
    }

    public synchronized void b() {
        ve1.a.a(this.f406789e > 0);
        ((se1.h0) this.f406785a).getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = (int) (elapsedRealtime - this.f406788d);
        if (i17 > 0) {
            long j17 = this.f406787c;
            this.f406786b.a((int) java.lang.Math.sqrt(j17), (float) ((8000 * j17) / i17));
            java.lang.Float.isNaN(this.f406786b.b(0.5f));
        }
        int i18 = this.f406789e - 1;
        this.f406789e = i18;
        if (i18 > 0) {
            this.f406788d = elapsedRealtime;
        }
        this.f406787c = 0L;
    }

    public synchronized void c() {
        if (this.f406789e == 0) {
            ((se1.h0) this.f406785a).getClass();
            this.f406788d = android.os.SystemClock.elapsedRealtime();
        }
        this.f406789e++;
    }
}
