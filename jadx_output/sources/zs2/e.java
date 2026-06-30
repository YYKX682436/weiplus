package zs2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f475252a;

    /* renamed from: b, reason: collision with root package name */
    public final int f475253b;

    /* renamed from: c, reason: collision with root package name */
    public final int f475254c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f475255d;

    public e(long j17, int i17, int i18, boolean z17) {
        this.f475252a = j17;
        this.f475253b = i17;
        this.f475254c = i18;
        this.f475255d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs2.e)) {
            return false;
        }
        zs2.e eVar = (zs2.e) obj;
        return this.f475252a == eVar.f475252a && this.f475253b == eVar.f475253b && this.f475254c == eVar.f475254c && this.f475255d == eVar.f475255d;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f475252a) * 31) + java.lang.Integer.hashCode(this.f475253b)) * 31) + java.lang.Integer.hashCode(this.f475254c)) * 31) + java.lang.Boolean.hashCode(this.f475255d);
    }

    public java.lang.String toString() {
        return "liveId:" + this.f475252a + ", playOffset:" + this.f475253b + ",totalDuration:" + this.f475254c + ",forceReq:" + this.f475255d;
    }
}
