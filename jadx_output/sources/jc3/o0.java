package jc3;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: i, reason: collision with root package name */
    public static final jc3.n0 f298964i = new jc3.n0(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f298965a;

    /* renamed from: b, reason: collision with root package name */
    public final long f298966b;

    /* renamed from: c, reason: collision with root package name */
    public final int f298967c;

    /* renamed from: d, reason: collision with root package name */
    public final int f298968d;

    /* renamed from: e, reason: collision with root package name */
    public final long f298969e;

    /* renamed from: f, reason: collision with root package name */
    public final long f298970f;

    /* renamed from: g, reason: collision with root package name */
    public final long f298971g;

    /* renamed from: h, reason: collision with root package name */
    public final long f298972h;

    public o0(long j17, long j18, int i17, int i18, long j19, long j27, long j28, long j29) {
        this.f298965a = j17;
        this.f298966b = j18;
        this.f298967c = i17;
        this.f298968d = i18;
        this.f298969e = j19;
        this.f298970f = j27;
        this.f298971g = j28;
        this.f298972h = j29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc3.o0)) {
            return false;
        }
        jc3.o0 o0Var = (jc3.o0) obj;
        return this.f298965a == o0Var.f298965a && this.f298966b == o0Var.f298966b && this.f298967c == o0Var.f298967c && this.f298968d == o0Var.f298968d && this.f298969e == o0Var.f298969e && this.f298970f == o0Var.f298970f && this.f298971g == o0Var.f298971g && this.f298972h == o0Var.f298972h;
    }

    public int hashCode() {
        return (((((((((((((java.lang.Long.hashCode(this.f298965a) * 31) + java.lang.Long.hashCode(this.f298966b)) * 31) + java.lang.Integer.hashCode(this.f298967c)) * 31) + java.lang.Integer.hashCode(this.f298968d)) * 31) + java.lang.Long.hashCode(this.f298969e)) * 31) + java.lang.Long.hashCode(this.f298970f)) * 31) + java.lang.Long.hashCode(this.f298971g)) * 31) + java.lang.Long.hashCode(this.f298972h);
    }

    public java.lang.String toString() {
        return "MBBizPermissionConfigInfo(maxStorageSize=" + this.f298965a + ", maxNetWorkFileSizeLimit=" + this.f298966b + ", maxNetWorkConcurrent=" + this.f298967c + ", defaultTimeOut=" + this.f298968d + ", maxTempFileTotalSize=" + this.f298969e + ", maxTempFileSize=" + this.f298970f + ", minTempFileSize=" + this.f298971g + ", maxUsrFileSize=" + this.f298972h + ')';
    }
}
