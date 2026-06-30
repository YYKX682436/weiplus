package v95;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f434169a;

    /* renamed from: b, reason: collision with root package name */
    public final long f434170b;

    /* renamed from: c, reason: collision with root package name */
    public final long f434171c;

    /* renamed from: d, reason: collision with root package name */
    public final long f434172d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f434173e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f434174f;

    /* renamed from: g, reason: collision with root package name */
    public final long f434175g;

    /* renamed from: h, reason: collision with root package name */
    public long f434176h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f434177i;

    public a(int i17, long j17, long j18, long j19, byte[] bArr, boolean z17, long j27, boolean z18) {
        this.f434169a = i17;
        this.f434170b = j17;
        this.f434171c = j18;
        this.f434172d = j19;
        byte[] bArr2 = bArr == null ? null : (byte[]) bArr.clone();
        this.f434173e = bArr2;
        this.f434174f = z17;
        this.f434175g = j27;
        java.lang.String str = z17 ? "UTF8" : "Cp437";
        try {
            this.f434177i = new java.lang.String(bArr2, str);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.RuntimeException("System doesn't support ".concat(str), e17);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v95.a.class != obj.getClass()) {
            return false;
        }
        v95.a aVar = (v95.a) obj;
        return this.f434171c == aVar.f434171c && this.f434169a == aVar.f434169a && this.f434170b == aVar.f434170b && java.util.Arrays.equals(this.f434173e, aVar.f434173e) && this.f434176h == aVar.f434176h && this.f434175g == aVar.f434175g && this.f434174f == aVar.f434174f && this.f434172d == aVar.f434172d;
    }

    public int hashCode() {
        long j17 = this.f434171c;
        int i17 = (((((int) (j17 ^ (j17 >>> 32))) + 31) * 31) + this.f434169a) * 31;
        long j18 = this.f434170b;
        int hashCode = (((i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31) + java.util.Arrays.hashCode(this.f434173e)) * 31;
        long j19 = this.f434176h;
        int i18 = (hashCode + ((int) (j19 ^ (j19 >>> 32)))) * 31;
        long j27 = this.f434175g;
        int i19 = (((i18 + ((int) (j27 ^ (j27 >>> 32)))) * 31) + (this.f434174f ? 1231 : 1237)) * 31;
        long j28 = this.f434172d;
        return i19 + ((int) ((j28 >>> 32) ^ j28));
    }
}
