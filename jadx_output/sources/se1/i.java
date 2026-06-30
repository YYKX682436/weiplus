package se1;

/* loaded from: classes13.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f406772a;

    /* renamed from: b, reason: collision with root package name */
    public final long f406773b;

    /* renamed from: c, reason: collision with root package name */
    public final long f406774c;

    /* renamed from: d, reason: collision with root package name */
    public final long f406775d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f406776e;

    /* renamed from: f, reason: collision with root package name */
    public final int f406777f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f406778g;

    /* renamed from: h, reason: collision with root package name */
    public final int f406779h;

    public i(android.net.Uri uri, long j17, long j18, long j19, java.lang.String str, int i17, java.lang.String str2) {
        this(uri, j17, j17, j19, str, i17, str2, -1);
    }

    public java.lang.String toString() {
        return "DataSpec[uri=" + this.f406772a + ", absPos=" + this.f406773b + ", pos=" + this.f406774c + ", len=" + this.f406775d + ", key=" + this.f406776e + ", flags=" + this.f406777f + ", uuid=" + this.f406778g + "]";
    }

    public i(android.net.Uri uri, long j17, long j18, long j19, java.lang.String str, int i17, java.lang.String str2, int i18) {
        boolean z17 = true;
        try {
            if (!(j17 >= 0)) {
                throw new java.lang.IllegalArgumentException();
            }
            if (!(j18 >= 0)) {
                throw new java.lang.IllegalArgumentException();
            }
            if (j19 <= 0 && j19 != -1) {
                z17 = false;
            }
            if (z17) {
                this.f406772a = uri;
                this.f406773b = j17;
                this.f406774c = j18;
                this.f406775d = j19;
                this.f406776e = str;
                this.f406777f = i17;
                this.f406778g = str2;
                this.f406779h = i18;
                return;
            }
            throw new java.lang.IllegalArgumentException();
        } catch (java.lang.IllegalArgumentException e17) {
            throw new se1.z(e17);
        }
    }
}
