package t9;

/* loaded from: classes15.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public long f416489a;

    /* renamed from: b, reason: collision with root package name */
    public long f416490b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f416491c = -9223372036854775807L;

    public a0(long j17) {
        synchronized (this) {
            t9.a.d(this.f416491c == -9223372036854775807L);
            this.f416489a = j17;
        }
    }

    public long a(long j17) {
        if (j17 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f416491c != -9223372036854775807L) {
            this.f416491c = j17;
        } else {
            long j18 = this.f416489a;
            if (j18 != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                this.f416490b = j18 - j17;
            }
            synchronized (this) {
                this.f416491c = j17;
                notifyAll();
            }
        }
        return j17 + this.f416490b;
    }

    public long b(long j17) {
        if (j17 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f416491c != -9223372036854775807L) {
            long j18 = (this.f416491c * 90000) / 1000000;
            long j19 = (4294967296L + j18) / 8589934592L;
            long j27 = ((j19 - 1) * 8589934592L) + j17;
            j17 += j19 * 8589934592L;
            if (java.lang.Math.abs(j27 - j18) < java.lang.Math.abs(j17 - j18)) {
                j17 = j27;
            }
        }
        return a((j17 * 1000000) / 90000);
    }

    public long c() {
        if (this.f416489a == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            return 0L;
        }
        if (this.f416491c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f416490b;
    }
}
