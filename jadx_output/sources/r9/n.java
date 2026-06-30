package r9;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f393383a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f393384b;

    /* renamed from: c, reason: collision with root package name */
    public final long f393385c;

    /* renamed from: d, reason: collision with root package name */
    public final long f393386d;

    /* renamed from: e, reason: collision with root package name */
    public final long f393387e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f393388f;

    /* renamed from: g, reason: collision with root package name */
    public final int f393389g;

    public n(android.net.Uri uri, int i17) {
        this(uri, 0L, -1L, null, i17);
    }

    public r9.n a(long j17) {
        long j18 = this.f393387e;
        long j19 = j18 != -1 ? j18 - j17 : -1L;
        return (j17 == 0 && j18 == j19) ? this : new r9.n(this.f393383a, this.f393384b, this.f393385c + j17, this.f393386d + j17, j19, this.f393388f, this.f393389g);
    }

    public java.lang.String toString() {
        return "DataSpec[" + this.f393383a + ", " + java.util.Arrays.toString(this.f393384b) + ", " + this.f393385c + ", " + this.f393386d + ", " + this.f393387e + ", " + this.f393388f + ", " + this.f393389g + "]";
    }

    public n(android.net.Uri uri, long j17, long j18, java.lang.String str) {
        this(uri, j17, j17, j18, str, 0);
    }

    public n(android.net.Uri uri, long j17, long j18, java.lang.String str, int i17) {
        this(uri, j17, j17, j18, str, i17);
    }

    public n(android.net.Uri uri, long j17, long j18, long j19, java.lang.String str, int i17) {
        this(uri, null, j17, j18, j19, str, i17);
    }

    public n(android.net.Uri uri, byte[] bArr, long j17, long j18, long j19, java.lang.String str, int i17) {
        boolean z17 = true;
        t9.a.a(j17 >= 0);
        t9.a.a(j18 >= 0);
        if (j19 <= 0 && j19 != -1) {
            z17 = false;
        }
        t9.a.a(z17);
        this.f393383a = uri;
        this.f393384b = bArr;
        this.f393385c = j17;
        this.f393386d = j18;
        this.f393387e = j19;
        this.f393388f = str;
        this.f393389g = i17;
    }
}
