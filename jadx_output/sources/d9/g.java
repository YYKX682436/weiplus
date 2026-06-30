package d9;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f227349a;

    /* renamed from: b, reason: collision with root package name */
    public final d9.h f227350b;

    public g(android.os.Handler handler, d9.h hVar) {
        if (hVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f227349a = handler;
        this.f227350b = hVar;
    }

    public static long a(d9.g gVar, long j17) {
        gVar.getClass();
        long b17 = m8.b.b(j17);
        if (b17 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return 0 + b17;
    }

    public void b(r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
        if (this.f227350b != null) {
            this.f227349a.post(new d9.c(this, nVar, i17, i18, format, i19, obj, j17, j18, j19, j27, j28));
        }
    }

    public void c(r9.n nVar, int i17, long j17, long j18, long j19) {
        b(nVar, i17, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j17, j18, j19);
    }

    public void d(r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
        if (this.f227350b != null) {
            this.f227349a.post(new d9.b(this, nVar, i17, i18, format, i19, obj, j17, j18, j19, j27, j28));
        }
    }

    public void e(r9.n nVar, int i17, long j17, long j18, long j19) {
        d(nVar, i17, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j17, j18, j19);
    }

    public void f(r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28, java.io.IOException iOException, boolean z17) {
        if (this.f227350b != null) {
            this.f227349a.post(new d9.d(this, nVar, i17, i18, format, i19, obj, j17, j18, j19, j27, j28, iOException, z17));
        }
    }

    public void g(r9.n nVar, int i17, long j17, long j18, long j19, java.io.IOException iOException, boolean z17) {
        f(nVar, i17, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j17, j18, j19, iOException, z17);
    }
}
