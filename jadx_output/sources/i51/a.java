package i51;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f288460a;

    /* renamed from: b, reason: collision with root package name */
    public final long f288461b;

    /* renamed from: c, reason: collision with root package name */
    public final long f288462c;

    /* renamed from: d, reason: collision with root package name */
    public final long f288463d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f288464e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f288465f;

    /* renamed from: g, reason: collision with root package name */
    public final long f288466g;

    /* renamed from: h, reason: collision with root package name */
    public long f288467h = -1;

    public a(int i17, long j17, long j18, long j19, java.lang.String str, boolean z17, long j27) {
        this.f288460a = i17;
        this.f288461b = j17;
        this.f288462c = j18;
        this.f288463d = j19;
        this.f288464e = str;
        this.f288465f = z17;
        this.f288466g = j27;
    }

    public static java.lang.String a(byte[] bArr, boolean z17) {
        if (bArr == null) {
            return null;
        }
        java.lang.String str = z17 ? "UTF8" : "Cp437";
        try {
            return new java.lang.String(bArr, str);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.RuntimeException("System doesn't support ".concat(str), e17);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i51.a.class != obj.getClass()) {
            return false;
        }
        i51.a aVar = (i51.a) obj;
        return this.f288462c == aVar.f288462c && this.f288460a == aVar.f288460a && this.f288461b == aVar.f288461b && android.text.TextUtils.equals(this.f288464e, aVar.f288464e) && this.f288467h == aVar.f288467h && this.f288466g == aVar.f288466g && this.f288465f == aVar.f288465f && this.f288463d == aVar.f288463d;
    }

    public int hashCode() {
        long j17 = this.f288462c;
        int i17 = (((((int) (j17 ^ (j17 >>> 32))) + 31) * 31) + this.f288460a) * 31;
        long j18 = this.f288461b;
        int i18 = i17 + ((int) (j18 ^ (j18 >>> 32)));
        java.lang.String str = this.f288464e;
        if (str != null) {
            i18 = (i18 * 31) + str.hashCode();
        }
        long j19 = this.f288467h;
        int i19 = ((i18 * 31) + ((int) (j19 ^ (j19 >>> 32)))) * 31;
        long j27 = this.f288466g;
        int i27 = (((i19 + ((int) (j27 ^ (j27 >>> 32)))) * 31) + (this.f288465f ? 1231 : 1237)) * 31;
        long j28 = this.f288463d;
        return i27 + ((int) ((j28 >>> 32) ^ j28));
    }
}
