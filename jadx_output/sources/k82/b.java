package k82;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f304871a;

    /* renamed from: b, reason: collision with root package name */
    public final long f304872b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304873c;

    /* renamed from: d, reason: collision with root package name */
    public final int f304874d;

    /* renamed from: e, reason: collision with root package name */
    public int f304875e;

    /* renamed from: g, reason: collision with root package name */
    public long f304877g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f304878h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f304879i;

    /* renamed from: j, reason: collision with root package name */
    public long f304880j;

    /* renamed from: k, reason: collision with root package name */
    public long f304881k;

    /* renamed from: l, reason: collision with root package name */
    public int f304882l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f304883m;

    /* renamed from: f, reason: collision with root package name */
    public final long f304876f = java.lang.System.currentTimeMillis();

    /* renamed from: n, reason: collision with root package name */
    public long f304884n = -1;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f304885o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f304886p = "";

    public b(long j17, long j18, int i17, int i18) {
        this.f304871a = j17;
        this.f304872b = j18;
        this.f304873c = i17;
        this.f304874d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k82.b)) {
            return false;
        }
        k82.b bVar = (k82.b) obj;
        return this.f304871a == bVar.f304871a && this.f304872b == bVar.f304872b && this.f304873c == bVar.f304873c && this.f304874d == bVar.f304874d;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f304871a) * 31) + java.lang.Long.hashCode(this.f304872b)) * 31) + java.lang.Integer.hashCode(this.f304873c)) * 31) + java.lang.Integer.hashCode(this.f304874d);
    }

    public java.lang.String toString() {
        return "ReportData(localId=" + this.f304871a + ", favId=" + this.f304872b + ", favType=" + this.f304873c + ", scene=" + this.f304874d + ')';
    }
}
