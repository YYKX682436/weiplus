package h9;

/* loaded from: classes15.dex */
public final class c implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f279597d;

    /* renamed from: e, reason: collision with root package name */
    public final long f279598e;

    /* renamed from: f, reason: collision with root package name */
    public final int f279599f;

    /* renamed from: g, reason: collision with root package name */
    public final long f279600g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f279601h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f279602i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f279603m;

    /* renamed from: n, reason: collision with root package name */
    public final long f279604n;

    /* renamed from: o, reason: collision with root package name */
    public final long f279605o;

    public c(java.lang.String str, long j17, int i17, long j18, boolean z17, java.lang.String str2, java.lang.String str3, long j19, long j27) {
        this.f279597d = str;
        this.f279598e = j17;
        this.f279599f = i17;
        this.f279600g = j18;
        this.f279601h = z17;
        this.f279602i = str2;
        this.f279603m = str3;
        this.f279604n = j19;
        this.f279605o = j27;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        java.lang.Long l17 = (java.lang.Long) obj;
        long longValue = l17.longValue();
        long j17 = this.f279600g;
        if (j17 > longValue) {
            return 1;
        }
        return j17 < l17.longValue() ? -1 : 0;
    }
}
