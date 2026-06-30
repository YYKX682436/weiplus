package zv1;

/* loaded from: classes15.dex */
public final class s {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f476367f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f476368g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f476369h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f476370i;

    /* renamed from: a, reason: collision with root package name */
    public final long f476371a;

    /* renamed from: b, reason: collision with root package name */
    public final long f476372b;

    /* renamed from: c, reason: collision with root package name */
    public final long f476373c;

    /* renamed from: d, reason: collision with root package name */
    public final int f476374d;

    /* renamed from: e, reason: collision with root package name */
    public final int f476375e;

    /* renamed from: j, reason: collision with root package name */
    public final long f476376j;

    /* renamed from: k, reason: collision with root package name */
    public final int f476377k;

    /* renamed from: l, reason: collision with root package name */
    public final int f476378l;

    static {
        int i17 = 1;
        f476367f = z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c;
        f476368g = z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c;
        f476369h = z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c;
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192975c) {
            i17 = 24;
        }
        f476370i = i17;
    }

    public s(long j17, long j18, long j19, long j27, int i17, int i18, int i19, int i27) {
        this.f476371a = j17;
        this.f476372b = j18;
        this.f476373c = j19;
        this.f476376j = j27;
        this.f476374d = i17;
        this.f476375e = i18;
        this.f476377k = i19;
        this.f476378l = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.s)) {
            return false;
        }
        zv1.s sVar = (zv1.s) obj;
        return this.f476371a == sVar.f476371a && this.f476372b == sVar.f476372b && this.f476373c == sVar.f476373c && this.f476376j == sVar.f476376j && this.f476374d == sVar.f476374d && this.f476375e == sVar.f476375e && this.f476377k == sVar.f476377k && this.f476378l == sVar.f476378l;
    }

    public int hashCode() {
        return (((((((((((((java.lang.Long.hashCode(this.f476371a) * 31) + java.lang.Long.hashCode(this.f476372b)) * 31) + java.lang.Long.hashCode(this.f476373c)) * 31) + java.lang.Long.hashCode(this.f476376j)) * 31) + java.lang.Integer.hashCode(this.f476374d)) * 31) + java.lang.Integer.hashCode(this.f476375e)) * 31) + java.lang.Integer.hashCode(this.f476377k)) * 31) + java.lang.Integer.hashCode(this.f476378l);
    }

    public java.lang.String toString() {
        return "CleanCacheExptConfig(bizThreshold=" + this.f476371a + ", totalThreshold=" + this.f476372b + ", cleanIntervalForPerfMs=" + this.f476373c + ", cleanIntervalForProdMs=" + this.f476376j + ", reportSamplingBase=" + this.f476374d + ", logExpireDays=" + this.f476375e + ", applyOtherTypeClean=" + this.f476377k + ", applyVfsExpireClean=" + this.f476378l + ')';
    }
}
