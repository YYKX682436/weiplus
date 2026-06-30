package lj0;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f318799a;

    /* renamed from: b, reason: collision with root package name */
    public final long f318800b;

    /* renamed from: c, reason: collision with root package name */
    public final long f318801c;

    /* renamed from: d, reason: collision with root package name */
    public final int f318802d;

    /* renamed from: e, reason: collision with root package name */
    public final int f318803e;

    /* renamed from: f, reason: collision with root package name */
    public final int f318804f;

    /* renamed from: g, reason: collision with root package name */
    public final int f318805g;

    /* renamed from: h, reason: collision with root package name */
    public final int f318806h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f318807i;

    public b(java.lang.String str, long j17, long j18, int i17, int i18, int i19, int i27, int i28, java.lang.String str2) {
        this.f318799a = str;
        this.f318800b = j17;
        this.f318801c = j18;
        this.f318802d = i17;
        this.f318803e = i18;
        this.f318804f = i19;
        this.f318805g = i27;
        this.f318806h = i28;
        this.f318807i = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj0.b)) {
            return false;
        }
        lj0.b bVar = (lj0.b) obj;
        return kotlin.jvm.internal.o.b(this.f318799a, bVar.f318799a) && this.f318800b == bVar.f318800b && this.f318801c == bVar.f318801c && this.f318802d == bVar.f318802d && this.f318803e == bVar.f318803e && this.f318804f == bVar.f318804f && this.f318805g == bVar.f318805g && this.f318806h == bVar.f318806h && kotlin.jvm.internal.o.b(this.f318807i, bVar.f318807i);
    }

    public int hashCode() {
        java.lang.String str = this.f318799a;
        int hashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Long.hashCode(this.f318800b)) * 31) + java.lang.Long.hashCode(this.f318801c)) * 31) + java.lang.Integer.hashCode(this.f318802d)) * 31) + java.lang.Integer.hashCode(this.f318803e)) * 31) + java.lang.Integer.hashCode(this.f318804f)) * 31) + java.lang.Integer.hashCode(this.f318805g)) * 31) + java.lang.Integer.hashCode(this.f318806h)) * 31;
        java.lang.String str2 = this.f318807i;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MiniGameVideoReportInfo(appId=" + this.f318799a + ", uiArea=" + this.f318800b + ", positionId=" + this.f318801c + ", actionId=" + this.f318802d + ", opType=" + this.f318803e + ", actionStatus=" + this.f318804f + ", miniGameVersion=" + this.f318805g + ", appState=" + this.f318806h + ", extInfo=" + this.f318807i + ')';
    }

    public /* synthetic */ b(java.lang.String str, long j17, long j18, int i17, int i18, int i19, int i27, int i28, java.lang.String str2, int i29, kotlin.jvm.internal.i iVar) {
        this((i29 & 1) != 0 ? null : str, (i29 & 2) != 0 ? 601L : j17, (i29 & 4) != 0 ? 0L : j18, (i29 & 8) != 0 ? 0 : i17, (i29 & 16) != 0 ? 0 : i18, (i29 & 32) != 0 ? 0 : i19, (i29 & 64) != 0 ? 0 : i27, (i29 & 128) == 0 ? i28 : 0, (i29 & 256) == 0 ? str2 : null);
    }
}
