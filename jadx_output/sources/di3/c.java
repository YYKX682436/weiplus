package di3;

/* loaded from: classes10.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f232678a;

    /* renamed from: b, reason: collision with root package name */
    public long f232679b;

    /* renamed from: c, reason: collision with root package name */
    public long f232680c;

    /* renamed from: d, reason: collision with root package name */
    public long f232681d;

    /* renamed from: e, reason: collision with root package name */
    public long f232682e;

    public c(java.lang.String str) {
        this.f232678a = "default";
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f232679b = android.os.SystemClock.elapsedRealtime();
        this.f232680c = android.os.SystemClock.elapsedRealtime();
        this.f232681d = 0L;
        this.f232682e = 0L;
        this.f232678a = str;
    }

    public void a(long j17) {
        if (this.f232682e == 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f232679b = android.os.SystemClock.elapsedRealtime();
        }
        this.f232681d += j17;
        this.f232682e++;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f232680c = android.os.SystemClock.elapsedRealtime();
    }

    public java.lang.String b() {
        if (this.f232682e == 0) {
            return "";
        }
        double d17 = (this.f232680c - this.f232679b) / 1000.0d;
        if (d17 == 0.0d) {
            d17 = 1.0d;
        }
        return ((this.f232682e * 1.0d) / d17) + "";
    }

    public java.lang.String c() {
        long j17 = this.f232682e;
        if (j17 == 0) {
            return "";
        }
        double d17 = (this.f232680c - this.f232679b) / 1000.0d;
        if (d17 == 0.0d) {
            d17 = 1.0d;
        }
        return java.lang.String.format("CounterUtil %s tag %s count %s passed %.3f perValue %.3f/count counttime %.3f/s valuetime %.3f/s st:%s ed:%s diff%s", "", this.f232678a, java.lang.Long.valueOf(j17), java.lang.Double.valueOf(d17), java.lang.Double.valueOf((this.f232681d * 1.0d) / this.f232682e), java.lang.Double.valueOf((this.f232682e * 1.0d) / d17), java.lang.Double.valueOf((this.f232681d * 1.0d) / d17), java.lang.Long.valueOf(this.f232679b), java.lang.Long.valueOf(this.f232680c), java.lang.Long.valueOf(this.f232680c - this.f232679b));
    }

    public void d() {
        this.f232681d = 0L;
        this.f232682e = 0L;
    }
}
